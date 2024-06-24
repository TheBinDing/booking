package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.dto.Customer;
import com.booking.dto.DiningTable;
import com.booking.service.BookingService;

@CrossOrigin
@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService customerService;

    // Customer
    @GetMapping("/getCustomerList")
    public ResponseEntity<Object> getCustomerList() {
        return customerService.getCustomerList();
    }

    @PutMapping("/upgradeCustomer")
    public ResponseEntity<Object> upgradeCustomer(@RequestBody Customer customer) {
        return customerService.upgradeCustomer(customer);
    }

    // Dining Table
    @GetMapping("/getDiningTable")
    public ResponseEntity<Object> getDiningTable() {
        return customerService.getDiningTable();
    }

    @PutMapping("/upgradeDiningTable")
    public ResponseEntity<Object> upgradeDiningTable(@RequestBody DiningTable diningTable) {
        return customerService.upgradeDiningTable(diningTable);
    }
}
