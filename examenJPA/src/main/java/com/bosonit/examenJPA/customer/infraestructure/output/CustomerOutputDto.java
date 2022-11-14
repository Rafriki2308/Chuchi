package com.bosonit.examenJPA.customer.infraestructure.output;

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
        setNombre(customer.getNombre());
    }
}
