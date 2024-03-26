package com.mpp.mppbackend.Controller;

import com.mpp.mppbackend.Model.Car;
import com.mpp.mppbackend.Service.CarService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {
    private final CarService carService;

    public Controller(CarService carService) {
        this.carService = carService;
    }


    @PostMapping("/addCar")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @PutMapping("/updateCar")
    public void updateCar(@RequestParam int id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@RequestParam int id) {
        carService.deleteCar(id);
    }

    @GetMapping("/getAllCars")
    public Iterable<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/getCar")
    public Car getCar(@RequestParam int id) {
        return carService.getCar(id);
    }
}
