package com.bosonit.examenJPA.customer.domain;

import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table (name="cliente")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cli_codi")
    private int id;

    @Column (name="nombre_cliente", nullable = false, length = 100)
    private String nombre;

    @OneToMany(mappedBy = "customer")
    List<HeaderBill> facturas = new ArrayList<>();

    public Customer(String nombre){
        setNombre(nombre);
    }

}
