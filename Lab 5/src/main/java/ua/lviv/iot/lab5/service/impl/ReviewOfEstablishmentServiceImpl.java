package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab5.domain.ReviewOfEstablishment;
import ua.lviv.iot.lab5.repository.ReviewOfEstablishmentRepository;
import ua.lviv.iot.lab5.service.ReviewOfEstablishmentService;

import java.util.List;

@Service
public class ReviewOfEstablishmentServiceImpl implements ReviewOfEstablishmentService {
    private final ReviewOfEstablishmentRepository reviewOfEstablishmentRepository;

    @Autowired
    public ReviewOfEstablishmentServiceImpl(ReviewOfEstablishmentRepository reviewOfEstablishmentRepository) {
        this.reviewOfEstablishmentRepository = reviewOfEstablishmentRepository;
    }

    @Override
    public List<ReviewOfEstablishment> findAll() {
        return null;
    }

    @Override
    public ReviewOfEstablishment findById(Integer integer) {
        return null;
    }

    @Override
    public ReviewOfEstablishment create(ReviewOfEstablishment entity) {
        return null;
    }

    @Override
    public void update(Integer integer, ReviewOfEstablishment entity) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
