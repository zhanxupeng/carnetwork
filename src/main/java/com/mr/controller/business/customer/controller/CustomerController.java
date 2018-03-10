package com.mr.controller.business.customer.controller;

import com.mr.common.base.Response;
import com.mr.common.exception.ServiceException;
import com.mr.controller.base.BaseController;
import com.mr.controller.business.customer.param.LoginPM;
import com.mr.controller.business.customer.param.MyInformationPM;
import com.mr.controller.business.customer.param.RegisterPM;
import com.mr.controller.business.customer.view.MyInformationVM;
import com.mr.entity.Customer;
import com.mr.entity.MyCar;
import com.mr.service.api.ICustomerService;
import com.mr.service.api.IMyCarService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController extends BaseController {

    @Resource
    private ICustomerService customerService;
    @Resource
    private IMyCarService myCarService;

    @PostMapping("register")
    public Response register(RegisterPM registerPM) {
        //校验用户名是否唯一
        if (customerService.existCustomer(registerPM.getUserName())) {
            throw new ServiceException("用户名已存在");
        }
        //校验车牌是否存在
        MyCar myCar = myCarService.getByLicensePlate(registerPM.getLicensePlate());
        if (myCar == null) {
            throw new ServiceException("车牌不存在");
        }
        //保存信息
        saveCustomer(registerPM, myCar.getId());
        return success();
    }

    @PostMapping("login")
    public Response register(LoginPM loginPM) {
        Customer customer = customerService.getByUserNamePassword(loginPM.getUserName(), loginPM.getPassword());
        if (customer == null)
            throw new ServiceException("账号或密码错误");
        return result(convertCustomerId(customer.getId()));
    }

    @GetMapping("myInformation")
    public Response myInformation(MyInformationPM myInformationPM) {
        Customer customer = customerService.selectById(convertToCustomerId(myInformationPM.getIdentify()));
        if (customer == null)
            throw new ServiceException("非法请求");
        return result(new MyInformationVM(customer));
    }

    private void saveCustomer(RegisterPM registerPM, Integer myCarId) {
        Customer customer = new Customer();
        customer.init();
        customer.setUserName(registerPM.getUserName());
        customer.setNickName(registerPM.getNickName());
        customer.setPassword(registerPM.getPassword());
        customer.setSex(registerPM.getSex());
        customer.setMyCarId(myCarId);
        customerService.insert(customer);
    }

    private String convertCustomerId(Integer customerId) {
        return customerId + "11";
    }

    private Integer convertToCustomerId(String identify) {
        return Integer.parseInt(identify.substring(0, identify.length() - 2));
    }

    @ExceptionHandler({Exception.class})
    public Response exception(Exception e) {
        e.printStackTrace();
        return fail("-1", e.getMessage());
    }
}
