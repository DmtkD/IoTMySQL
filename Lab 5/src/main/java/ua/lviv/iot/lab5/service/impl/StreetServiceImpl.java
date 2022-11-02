package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab5.domain.Street;
import ua.lviv.iot.lab5.repository.StreetRepository;
import ua.lviv.iot.lab5.service.StreetService;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    private final StreetRepository streetRepository;

    @Autowired
    public StreetServiceImpl(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }

    @Override
    public List<Street> findAll() {
        return null;
    }

    @Override
    public Street findById(Integer integer) {
        return null;
    }

    @Override
    public Street create(Street entity) {
        return null;
    }

    @Override
    public void update(Integer integer, Street entity) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
