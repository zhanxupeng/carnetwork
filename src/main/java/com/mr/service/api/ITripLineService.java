package com.mr.service.api;

import com.mr.entity.TripLine;
import com.mr.service.common.IBaseDBService;

import java.util.List;

public interface ITripLineService extends IBaseDBService<TripLine> {
    List<TripLine> getByMyTripId(Integer myTripId);
}
