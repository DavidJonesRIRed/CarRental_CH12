package com.careerdevs.carrental.cars;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/Cars")
public class CarController {

    private Map<Long, Car> cars = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    public CarController(){
        Long id = idCounter.incrementAndGet();
        //cars.put(id, new Car());
    }

    @GetMapping
    public List<Car> all(){
        return new ArrayList<Car>(cars.values());
    }

    @PostMapping
    public Car newCar(@RequestBody Car newCar){
        Long id = idCounter.incrementAndGet();
        newCar.setId(id);
        cars.put(id, newCar);
        return newCar;
    }

    @GetMapping("/{id}")
    public Car employee(@PathVariable Long id){
        return cars.get(id);
    }
}
