package com.bosonit.examenJPA.headerBill.infraestructure.repository;

import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderBillRepository extends JpaRepository<HeaderBill, Integer> {

    HeaderBill findHeaderBillById(Integer id);
}
