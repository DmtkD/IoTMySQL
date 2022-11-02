package ua.lviv.iot.lab5.controller;

import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lab5.domain.Establishment;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class EstablishmentController {
    public Establishment getEstablishment(Integer id) {
        return null;
    }

    public List<Establishment> getAllEstablishments() {
        return null;
    }
}
