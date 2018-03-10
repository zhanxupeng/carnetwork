package com.mr.service.impl;

import com.mr.entity.TripLine;
import com.mr.repo.TripLineMapper;
import com.mr.service.api.ITripLineService;
import com.mr.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripLineService extends BaseDBService<TripLineMapper,TripLine> implements ITripLineService {
    @Override
    public List<TripLine> getByMyTripId(Integer myTripId) {
        return getRepo().getByMyTripId(myTripId);
    }
}
