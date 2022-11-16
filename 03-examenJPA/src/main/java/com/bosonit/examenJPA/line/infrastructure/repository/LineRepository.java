package com.bosonit.examenJPA.line.infrastructure.repository;

import com.bosonit.examenJPA.line.domain.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineRepository extends JpaRepository<Line, Integer> {
}
