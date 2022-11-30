package com.celso.portfolio.controller;

import com.celso.portfolio.model.CareerObjective;
import com.celso.portfolio.service.CareerObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // To get the response body and controller at the same time.
@RequestMapping("/careerobjective") // We need to give the careerobjective path anytime.

public class CareerObjectiveController {
    @Autowired
    private CareerObjectiveService careerObjectiveService;

    // Code to save the data
    @PostMapping("/add")
    public String add(@RequestBody CareerObjective careerObjective){
        careerObjectiveService.saveCareerObjective(careerObjective);
        return "New Career Objective/Goal is Added";
    }

    @GetMapping("/getAll")
    public List<CareerObjective> getAllCareerObjectives(){
        return careerObjectiveService.getAllCareerObjectives();
    }
}
