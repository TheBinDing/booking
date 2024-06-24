package com.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.booking.model.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, String> {
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO customer (cus_code, cus_name, cus_lname, age, birthday, create_date, create_by, update_date, update_by)VALUES(?1, ?2, ?3, ?4, ?5, now(), ?6, now(), ?7);", nativeQuery = true)
    public int insertCustomer(String uuid, String name, String lName, int age, String hbd, String createBy, String updateBy);    
}
