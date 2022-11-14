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

		Customer customer =new Customer("Chuchi");
		Customer newCustomer = customerServiceImp.addCustomer(customer);

		HeaderBill headerBill = new HeaderBill(Double.parseDouble("120"),customer);
		headerBillServiceImp.addHeaderBill(headerBill);

		Line line = new Line("caca", 120.00,18.00, headerBill);
		lineServiceImp.addLine(line);

	}
}
