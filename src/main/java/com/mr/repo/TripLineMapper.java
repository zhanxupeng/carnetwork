package com.mr.repo;

import com.mr.common.base.BaseMapper;
import com.mr.entity.TripLine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TripLineMapper extends BaseMapper<TripLine>{
    List<TripLine> getByMyTripId(@Param("myTripId") Integer myTripId);
}