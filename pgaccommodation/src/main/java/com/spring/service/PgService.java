package com.spring.service;

import com.spring.entity.PgPlace;
import com.spring.repository.PgPlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PgService implements PgServiceInterface {

    @Autowired
    private PgPlaceRepository repo;

    @Override
    public List<PgPlace> getAvailableByCity(String city) {
        return repo.findByCityAndAvailableTrue(city);
    }

    @Override
    public List<PgPlace> getAvailableByLocality(String locality) {
        return repo.findByLocalityAndAvailableTrue(locality);
    }

    @Override
    public PgPlace getPgDetails(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public PgPlace addPgPlace(PgPlace place) {
        return repo.save(place);
    }

    @Override
    public PgPlace updateStatus(Long id, Boolean available) {
        PgPlace place = repo.findById(id).orElseThrow();
        place.setAvailable(available);
        return repo.save(place);
    }
}
