package com.mr.service.impl;

import com.mr.entity.MyTrip;
import com.mr.repo.MyTripMapper;
import com.mr.service.api.IMyTripService;
import com.mr.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTripService extends BaseDBService<MyTripMapper,MyTrip> implements IMyTripService {
    @Override
    public List<MyTrip> getByCustomerId(Integer customerId) {
        return getRepo().getByCustomerId(customerId);
    }
}
