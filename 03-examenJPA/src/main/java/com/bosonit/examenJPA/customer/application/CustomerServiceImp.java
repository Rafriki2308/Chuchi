package com.bosonit.examenJPA.customer.application;

import com.bosonit.examenJPA.customer.domain.Customer;
import com.bosonit.examenJPA.customer.infrastructure.output.CustomerOutputDto;
import com.bosonit.examenJPA.customer.infrastructure.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    /*Método que toma un objeto de tipo Customer y lo hace persistente en la BD*/
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
