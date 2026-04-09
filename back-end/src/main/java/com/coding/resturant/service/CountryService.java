package com.coding.resturant.service;

import com.coding.resturant.model.Country;
import com.coding.resturant.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    public List<Country> getAllCountries() {
        return  countryRepository.findAll();
    }

}
