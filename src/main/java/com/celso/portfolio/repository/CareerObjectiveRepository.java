package com.celso.portfolio.repository;

import com.celso.portfolio.model.CareerObjective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerObjectiveRepository extends JpaRepository<CareerObjective, Integer> {
}
