package com.directi.training.srp.exercise_refactored;

import java.util.List;

public interface CarRepository
{
    Car findById(String id);

    List<Car> findAll();
}
