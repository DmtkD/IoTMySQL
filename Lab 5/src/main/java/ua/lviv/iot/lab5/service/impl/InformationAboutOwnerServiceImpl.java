package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab5.domain.InformationAboutOwner;
import ua.lviv.iot.lab5.repository.InformationAboutOwnerRepository;
import ua.lviv.iot.lab5.service.InformationAboutOwnerService;

import java.util.List;

@Service
public class InformationAboutOwnerServiceImpl implements InformationAboutOwnerService {
    private final InformationAboutOwnerRepository informationAboutOwnerRepository;

    @Autowired
    public InformationAboutOwnerServiceImpl(InformationAboutOwnerRepository informationAboutOwnerRepository) {
        this.informationAboutOwnerRepository = informationAboutOwnerRepository;
    }

    @Override
    public List<InformationAboutOwner> findAll() {
        return null;
    }

    @Override
    public InformationAboutOwner findById(Integer integer) {
        return null;
    }

    @Override
    public InformationAboutOwner create(InformationAboutOwner entity) {
        return null;
    }

    @Override
    public void update(Integer integer, InformationAboutOwner entity) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
