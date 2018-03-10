package com.mr.mapper.customer;

import com.mr.CarnetworkApplicationTests;
import com.mr.entity.Customer;
import com.mr.repo.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CarnetworkApplicationTests.class)
public class CustomerRepoTest {
    @Autowired
    private CustomerMapper customerMapper;

    @Test
    @Transactional
    public void testInsert_SelectById_Update_Delete() {
        //arrange

        //act
        Customer customer=customerMapper.selectById(1);
        //assert
        assertEquals("楼芳婷",customer.getUserName());
    }
}
