package ua.lviv.iot.lab5.controller;

import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lab5.domain.Country;

import java.util.List;

@RestController
public class CountryController {
    public Country getCountry(String name) {
        return null;
    }

    public List<Country> getAllCountries() {
        return null;
    }
}
