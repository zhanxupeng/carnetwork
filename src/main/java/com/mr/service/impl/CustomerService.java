package com.mr.service.impl;

import com.mr.entity.Customer;
import com.mr.repo.CustomerMapper;
import com.mr.service.api.ICustomerService;
import com.mr.service.common.BaseDBService;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseDBService<CustomerMapper, Customer> implements ICustomerService {
    @Override
    public boolean existCustomer(String userName) {
        return getRepo().getByUserName(userName) != null;
    }

    @Override
    public Customer getByUserNamePassword(String userName, String password) {
        return getRepo().getByUserNamePassword(userName, password);
    }
}
