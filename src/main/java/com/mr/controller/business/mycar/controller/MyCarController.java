package com.mr.controller.business.mycar.controller;

import com.mr.common.base.Response;
import com.mr.common.exception.ServiceException;
import com.mr.common.util.CustomerConvertUtils;
import com.mr.controller.base.BaseController;
import com.mr.controller.business.mycar.param.CarInformationPM;
import com.mr.controller.business.mycar.view.CarInformationVM;
import com.mr.entity.MyCar;
import com.mr.service.api.IMyCarService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyCarController extends BaseController {
    @Resource
    private IMyCarService myCarService;

    @GetMapping("carInformation")
    public Response carInformation(CarInformationPM carInformationPM){
        MyCar myCar=myCarService.getByCustomerId(CustomerConvertUtils.convertToCustomerId(carInformationPM.getIdentify()));
        if(myCar==null)
            throw new ServiceException("车辆不存在");
        return result(new CarInformationVM(myCar));
    }

    @ExceptionHandler({Exception.class})
    public Response exception(Exception e) {
        e.printStackTrace();
        return fail("-1", e.getMessage());
    }
}
