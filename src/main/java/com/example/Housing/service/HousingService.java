package com.example.Housing.service;

import com.example.Housing.model.Housing;
import com.example.Housing.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingService {

    @Autowired
    HousingRepository housingRepository;

    public void saveAll(List<Housing> housings) {
        housingRepository.saveAll(housings);
    }

    public double averageSalePrice() {
        return housingRepository.findAverageSalePrice();
    }

    public List<Object[]> averageSalePriceByLocation() {
        return housingRepository.findAverageSalePriceByLocation();
    }

    public int maxSalePrice() {
        return housingRepository.findMaxSalePrice();
    }

    public double averageSalePriceByGivenLocation(char location) {
        return housingRepository.findAverageSalePriceByGivenLocation(location);
    }
}
