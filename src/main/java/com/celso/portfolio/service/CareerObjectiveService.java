package com.celso.portfolio.service;

import com.celso.portfolio.model.CareerObjective;

import java.util.List;

public interface CareerObjectiveService {
    public CareerObjective saveCareerObjective(CareerObjective careerObjective);
    public List<CareerObjective> getAllCareerObjectives();
}
