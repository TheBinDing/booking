package com.booking.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.booking.dto.Customer;
import com.booking.dto.DiningTable;
import com.booking.model.CustomerModel;
import com.booking.model.DiningTableModel;
import com.booking.repositories.CustomerRepository;
import com.booking.repositories.DiningTableRepository;

@Service
public class BookingService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DiningTableRepository diningTableRepository;

    UUID uuid = UUID.randomUUID();

    public ResponseEntity<Object> getCustomerList() {
        try {
            List<CustomerModel> data = customerRepository.findAll();
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<Object> upgradeCustomer(Customer customer) {
        try {
            String userBy = customer.getCustomer().isEmpty() ? "Admin" : customer.getCustomer();

            // customer.getCusCode() isEmpty to create
            CustomerModel bean = new CustomerModel();
            bean.setCusCode(String.valueOf(uuid));
            bean.setCusName(customer.getCusName());
            bean.setCusLname(customer.getCusLname());
            bean.setAge(18);
            bean.setBirthday(customer.getBirthday());
            bean.setCreateBy(userBy);
            bean.setUpdateBy(userBy);

            customerRepository.save(bean);

            return new ResponseEntity<Object>(bean, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<Object> getDiningTable() {
        try {
            List<DiningTableModel> data = diningTableRepository.findAll();
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<Object> upgradeDiningTable(DiningTable diningTable) {
        try {
            String userBy = diningTable.getUser().isEmpty() ? "Admin" : diningTable.getUser();

            int n = diningTableRepository.countTable();

            DiningTableModel bean = new DiningTableModel();
            bean.setDinCode(String.valueOf(uuid));
            bean.setDinPosition(n);
            bean.setQty(diningTable.getQty());
            bean.setTotal(diningTable.getTotal());
            bean.setStatus(diningTable.getStatus());
            bean.setCreateBy(userBy);
            bean.setUpdateBy(userBy);

            diningTableRepository.save(bean);

            return new ResponseEntity<Object>(bean, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

}
