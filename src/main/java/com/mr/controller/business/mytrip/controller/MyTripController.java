package com.mr.controller.business.mytrip.controller;

import com.mr.common.base.Response;
import com.mr.common.util.CustomerConvertUtils;
import com.mr.controller.base.BaseController;
import com.mr.controller.business.mytrip.param.MyTripPM;
import com.mr.entity.MyTrip;
import com.mr.service.api.IMyTripService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyTripController extends BaseController {
    @Resource
    private IMyTripService myTripService;

    @GetMapping("myTrip")
    public Response myTrip(MyTripPM myTripPM){
        List<MyTrip> myTripList=myTripService.getByCustomerId(CustomerConvertUtils.convertToCustomerId(myTripPM.getIdentify()));
        return result(myTripList);
    }
}
