package com.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.booking.model.DiningTableModel;

public interface DiningTableRepository extends JpaRepository<DiningTableModel, Object> {
    @Query(value = "select count(*) from dining_table", nativeQuery = true)
    int countTable();
}
