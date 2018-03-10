package com.mr.service.impl;

import com.mr.entity.MyCar;
import com.mr.repo.MyCarMapper;
import com.mr.service.api.IMyCarService;
import com.mr.service.common.BaseDBService;
import org.springframework.stereotype.Service;

@Service
public class MyCarService extends BaseDBService<MyCarMapper, MyCar> implements IMyCarService {
    @Override
    public MyCar getByLicensePlate(String licensePlate) {
        return getRepo().getByLicensePlate(licensePlate);
    }
}
