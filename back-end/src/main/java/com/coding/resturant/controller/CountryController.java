package com.coding.resturant.controller;

import com.coding.resturant.model.Country;
import com.coding.resturant.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class CountryController {
    private final CountryService countryService;
    @GetMapping("allcountries")
    public List<Country> getAllCountries() {
        return  countryService.getAllCountries();
    }
}
