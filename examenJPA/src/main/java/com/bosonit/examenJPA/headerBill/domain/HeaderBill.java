package com.bosonit.examenJPA.headerBill.domain;

import com.bosonit.examenJPA.customer.domain.Customer;
import com.bosonit.examenJPA.line.domain.Line;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cabecera_factura")
public class HeaderBill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="numero_factura")
    private Integer id;

    @Column(name = "importe_factura")
    private Double importeFra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Customer customer;

    @OneToMany(mappedBy = "headerBill", cascade = CascadeType.ALL)
    List<Line> lineas = new ArrayList<>();

    public HeaderBill(Double importeFra, Customer customer){
        setImporteFra(importeFra);
        setCustomer(customer);
    }

}
