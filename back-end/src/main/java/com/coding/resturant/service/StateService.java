package com.coding.resturant.service;

import com.coding.resturant.model.State;
import com.coding.resturant.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StateService {
    private final StateRepository stateRepository;
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }
    public List<State> getStatesByCountryCode (String code) {
        return stateRepository.findByCountryCode(code);
    }
}
