package com.mr.service.api;

import com.mr.entity.MyCar;
import com.mr.service.common.IBaseDBService;

public interface IMyCarService extends IBaseDBService<MyCar> {
    MyCar getByLicensePlate(String licensePlate);
}
