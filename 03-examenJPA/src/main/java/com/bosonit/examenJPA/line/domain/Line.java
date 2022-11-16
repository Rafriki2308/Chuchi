package com.bosonit.examenJPA.line.domain;

import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.line.infrastructure.controller.input.LineInputDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "linea_factura")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_linea")
    private int idLine;

    @Column(name = "nombre_producto", nullable = false)
    private String prodName;

    @Column(name = "cantidad")
    private Double amountProduct;

    @Column(name = "precio")
    private double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private HeaderBill headerBill;


    public Line(LineInputDto lineOutputDto, HeaderBill headerBill) {
        setProdName(lineOutputDto.getProducto());
        setPrice(lineOutputDto.getCantidad());
        setAmountProduct(lineOutputDto.getImporte());
        setHeaderBill(headerBill);
    }

    public Line(String prodName, double amountProduct, double price) {
        setProdName(prodName);
        setAmountProduct(amountProduct);
        setPrice(price);
    }

}
