package com.mr.repo;

import com.mr.common.base.BaseMapper;
import com.mr.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
    Customer getByUserName(@Param("userName") String userName);

    Customer getByUserNamePassword(@Param("userName") String userName, @Param("password") String password);
}