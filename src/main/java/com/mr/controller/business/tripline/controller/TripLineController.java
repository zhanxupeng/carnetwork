package com.mr.controller.business.tripline.controller;

import com.mr.common.base.Response;
import com.mr.controller.base.BaseController;
import com.mr.controller.business.tripline.param.TripLinePM;
import com.mr.entity.TripLine;
import com.mr.service.api.ITripLineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TripLineController extends BaseController {
    @Resource
    private ITripLineService tripLineService;

    @GetMapping("tripLine")
    public Response tripLine(TripLinePM tripLinePM){
        List<TripLine> tripLineList=tripLineService.getByMyTripId(tripLinePM.getMyTripId());
        return result(tripLineList);
    }
}
