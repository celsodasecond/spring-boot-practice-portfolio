package com.celso.portfolio.service;

import com.celso.portfolio.model.CareerObjective;
import com.celso.portfolio.repository.CareerObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerObjectiveServiceImpl implements  CareerObjectiveService {

    @Autowired // Inject the career objective repository into the service class
    private CareerObjectiveRepository careerObjectiveRepository;

    @Override
    public CareerObjective saveCareerObjective(CareerObjective careerObjective) {
        return careerObjectiveRepository.save(careerObjective); // to save data
    }

    @Override
    public List<CareerObjective> getAllCareerObjectives() {
        return careerObjectiveRepository.findAll();
    }
}
