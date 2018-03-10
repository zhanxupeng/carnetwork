package com.mr.service.api;

import com.mr.entity.MyTrip;
import com.mr.service.common.IBaseDBService;

import java.util.List;

public interface IMyTripService extends IBaseDBService<MyTrip> {
    List<MyTrip> getByCustomerId(Integer customerId);
}
