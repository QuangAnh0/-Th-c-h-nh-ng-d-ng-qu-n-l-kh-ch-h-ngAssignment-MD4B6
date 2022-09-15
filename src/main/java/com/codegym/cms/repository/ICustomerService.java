package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

public interface ICustomerService extends IGeneralRepository{
    void save(Customer customer);
}
