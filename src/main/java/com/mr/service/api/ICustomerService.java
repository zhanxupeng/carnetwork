package com.mr.service.api;

import com.mr.entity.Customer;
import com.mr.service.common.IBaseDBService;

public interface ICustomerService extends IBaseDBService<Customer> {
    boolean existCustomer(String userName);

    Customer getByUserNamePassword(String userName, String password);
}
