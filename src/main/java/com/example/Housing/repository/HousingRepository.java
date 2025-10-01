package com.example.Housing.repository;

import com.example.Housing.model.Housing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousingRepository extends JpaRepository<Housing, Integer> {

    @Query(value = "SELECT AVG(sale_price) FROM Housing", nativeQuery = true)
    Double findAverageSalePrice();

    @Query(value = "select location,AVG(sale_price) from Housing group by location", nativeQuery = true)
    List<Object[]> findAverageSalePriceByLocation();

    @Query(value = "select MAX(sale_price) from Housing", nativeQuery = true)
    Integer findMaxSalePrice();

    @Query(value = "select AVG(sale_price) from Housing where location=?1", nativeQuery = true)
    Double findAverageSalePriceByGivenLocation(char location);

}
