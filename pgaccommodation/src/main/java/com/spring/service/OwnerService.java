package com.spring.service;

import com.spring.entity.Owner;
import com.spring.entity.PgPlace;
import com.spring.repository.OwnerRepository;
import com.spring.repository.PgPlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OwnerService implements OwnerServiceInterface {

    @Autowired
    private OwnerRepository ownerRepo;

    @Autowired
    private PgPlaceRepository pgRepo;

    @Override
    public Owner getOwnerByPgId(Long pgId) {
        PgPlace place = pgRepo.findById(pgId).orElseThrow(() -> new RuntimeException("PG not found"));
        return place.getOwner();
    }

    @Override
    public PgPlace addPlace(Long ownerId, PgPlace place) {
        Owner owner = ownerRepo.findById(ownerId)
                .orElseThrow(() -> new RuntimeException("Owner not found"));
        place.setOwner(owner);
        return pgRepo.save(place);
    }

    @Override
    public List<PgPlace> getAllPlacesByOwner(Long ownerId) {
        Owner owner = ownerRepo.findById(ownerId)
                .orElseThrow(() -> new RuntimeException("Owner not found"));
        return owner.getPlaces();
    }

    @Override
    public PgPlace updateAvailability(Long pgId, Boolean available) {
        PgPlace place = pgRepo.findById(pgId)
                .orElseThrow(() -> new RuntimeException("PG not found"));
        place.setAvailable(available);
        return pgRepo.save(place);
    }

    @Override
    public PgPlace editPlace(Long pgId, PgPlace updatedPlace) {
        PgPlace existing = pgRepo.findById(pgId)
                .orElseThrow(() -> new RuntimeException("PG not found"));

        existing.setCity(updatedPlace.getCity());
        existing.setLocality(updatedPlace.getLocality());
        existing.setRentAmount(updatedPlace.getRentAmount());
        existing.setBuiltUpArea(updatedPlace.getBuiltUpArea());
        existing.setRegistrationNumber(updatedPlace.getRegistrationNumber());

        return pgRepo.save(existing);
    }

    @Override
    public String deletePlace(Long pgId) {
        if (!pgRepo.existsById(pgId))
            throw new RuntimeException("PG not found");
        pgRepo.deleteById(pgId);
        return "PG place deleted successfully";
    }

    @Override public Owner addOwner(Owner owner) {
    	return ownerRepo.save(owner); 
    }
}
