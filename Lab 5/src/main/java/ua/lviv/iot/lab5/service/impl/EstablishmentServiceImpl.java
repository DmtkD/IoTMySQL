package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab5.domain.Establishment;
import ua.lviv.iot.lab5.repository.EstablishmentRepository;
import ua.lviv.iot.lab5.service.EstablishmentService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {
    private final EstablishmentRepository establishmentRepository;

    @Autowired
    public EstablishmentServiceImpl(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }

    @Override
    public List<Establishment> findAll() {
        return null;
    }

    @Override
    public Establishment findById(Integer integer) {
        return null;
    }

    @Override
    @Transactional
    public Establishment create(Establishment entity) {
        return null;
    }

    @Override
    @Transactional
    public void update(Integer integer, Establishment entity) {

    }

    @Override
    @Transactional
    public void delete(Integer integer) {

    }
}
