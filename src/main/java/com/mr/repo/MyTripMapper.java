package com.mr.repo;

import com.mr.common.base.BaseMapper;
import com.mr.entity.MyTrip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyTripMapper extends BaseMapper<MyTrip>{
    List<MyTrip> getByCustomerId(@Param("customerId") Integer customerId);
}