package com.bosonit.examenJPA.customer.infrastructure.output;

import com.bosonit.examenJPA.customer.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOutputDto {

    private int id;
    private String nombre;

    public CustomerOutputDto(Customer customer){
        setId(customer.getId());
        setNombre(customer.getName());
    }
}
