package com.bosonit.examenJPA.customer.application;

import com.bosonit.examenJPA.customer.domain.Customer;
import com.bosonit.examenJPA.customer.infraestructure.output.CustomerOutputDto;
import com.bosonit.examenJPA.customer.infraestructure.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public CustomerOutputDto getCustomerById(int id) throws Exception{
        Integer idObject = Integer.valueOf(id);
        return new CustomerOutputDto(customerRepository.findCustomerById(idObject));
    };
}
