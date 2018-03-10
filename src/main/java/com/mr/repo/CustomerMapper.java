package com.mr.repo;

import com.mr.common.base.BaseMapper;
import com.mr.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
}