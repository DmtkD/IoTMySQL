package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab5.domain.TypeOfEstablishment;
import ua.lviv.iot.lab5.repository.TypeOfEstablishmentRepository;
import ua.lviv.iot.lab5.service.TypeOfEstablishmentService;

import java.util.List;

@Service
public class TypeOfEstablishmentServiceImpl implements TypeOfEstablishmentService {
    private final TypeOfEstablishmentRepository typeOfEstablishmentRepository;

    @Autowired
    public TypeOfEstablishmentServiceImpl(TypeOfEstablishmentRepository typeOfEstablishmentRepository) {
        this.typeOfEstablishmentRepository = typeOfEstablishmentRepository;
    }

    @Override
    public List<TypeOfEstablishment> findAll() {
        return null;
    }

    @Override
    public TypeOfEstablishment findById(Integer integer) {
        return null;
    }

    @Override
    public TypeOfEstablishment create(TypeOfEstablishment entity) {
        return null;
    }

    @Override
    public void update(Integer integer, TypeOfEstablishment entity) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
