package com.bosonit.examenJPA.customer.application;

import com.bosonit.examenJPA.customer.domain.Customer;
import com.bosonit.examenJPA.customer.infrastructure.output.CustomerOutputDto;

public interface CustomerService {

    public Customer addCustomer(Customer customer) throws Exception;

    public CustomerOutputDto getCustomerById(int id) throws Exception;
}
