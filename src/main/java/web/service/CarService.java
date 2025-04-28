package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> cars = new ArrayList<Car>();

    public CarService() {
        cars.add(new Car("toyota", "white", 2024));
        cars.add(new Car("ford", "black", 2023));
        cars.add(new Car("kia", "silver", 2022));
        cars.add(new Car("honda", "blue", 2021));
        cars.add(new Car("bmw", "red", 2020));
    }

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
