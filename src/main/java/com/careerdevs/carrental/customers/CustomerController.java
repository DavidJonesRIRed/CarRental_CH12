package com.careerdevs.carrental.customers;

import com.careerdevs.carrental.customers.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/Customers")
public class CustomerController {
    private Map<Long, Customer> cars = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    public CustomerController() {
        Long id = idCounter.incrementAndGet();
        //cars.put(id, new Customer());
    }

    @GetMapping
    public List<Customer> all() {
        return new ArrayList<Customer>(cars.values());
    }

    @PostMapping
    public Customer newCustomer(@RequestBody Customer newCustomer) {
        Long id = idCounter.incrementAndGet();
        newCustomer.setId(id);
        cars.put(id, newCustomer);
        return newCustomer;
    }

    @GetMapping("/{id}")
    public Customer car(@PathVariable Long id) {
        return cars.get(id);

    }
}
