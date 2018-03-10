package com.mr.repo;

import com.mr.common.base.BaseMapper;
import com.mr.entity.MyCar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MyCarMapper extends BaseMapper<MyCar> {
    MyCar getByLicensePlate(@Param("licensePlate") String licensePlate);
}