package com.example.Housing.controller;


import com.example.Housing.model.Housing;
import com.example.Housing.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("housing")
public class HousingController {

    @Autowired
    HousingService housingService;

    @PostMapping("saveAll")
    public void saveAll(@RequestBody List<Housing> housings) {
        housingService.saveAll(housings);
    }

    @GetMapping("averageSalePrice")
    public double averageSalePrice() {
        return housingService.averageSalePrice();
    }

    @GetMapping("averageSalePriceByLocation")
    public List<Object[]> averageSalePriceByLocation() {
        return housingService.averageSalePriceByLocation();
    }

    @GetMapping("maxSalePrice")
    public int maxSalePrice() {
        return housingService.maxSalePrice();
    }

    @GetMapping("averageSalePriceByGivenLocation/{location}")
    public double averageSalePriceByGivenLocation(@PathVariable char location) {
        return housingService.averageSalePriceByGivenLocation(location);
    }
}
