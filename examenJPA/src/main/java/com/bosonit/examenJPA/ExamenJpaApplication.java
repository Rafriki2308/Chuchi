package com.bosonit.examenJPA;

import com.bosonit.examenJPA.customer.application.CustomerServiceImp;
import com.bosonit.examenJPA.customer.domain.Customer;
import com.bosonit.examenJPA.headerBill.application.HeaderBillServiceImp;
import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.line.application.LineServiceImp;
import com.bosonit.examenJPA.line.domain.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenJpaApplication implements CommandLineRunner {

    @Autowired
    private CustomerServiceImp customerServiceImp;
    @Autowired
    private HeaderBillServiceImp headerBillServiceImp;
    @Autowired
    private LineServiceImp lineServiceImp;


    public static void main(String[] args) {
        SpringApplication.run(ExamenJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer("Chuchi");
        Customer newCustomer = customerServiceImp.addCustomer(customer);

        HeaderBill headerBill = new HeaderBill(Double.parseDouble("120"), newCustomer);
        List<Line> lines = new ArrayList<>();
        Line line1 = new Line("papel_higienico", 120.00, 18.00);
        line1.setHeaderBill(headerBill);

        lines.add(line1);
        Line line2 = new Line("papel_cocina", 120.00, 18.00);
        line2.setHeaderBill(headerBill);
        lines.add(line2);

        headerBill.setLineas(lines);

        //Solo un save
        headerBillServiceImp.addHeaderBill(headerBill);

    }
}
