package com.spring.controller;

import com.spring.entity.Owner;
import com.spring.entity.PgPlace;
import com.spring.service.OwnerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/owner/places")
public class OwnerController {

    @Autowired
    private OwnerServiceInterface service;
    
    //Add owner only
    @PostMapping("/add")
    public Owner addOwner(@RequestBody Owner owner) {
        return service.addOwner(owner);
    }


    // Retrieve the owner details of a specific PG
    @GetMapping("/owner/{pgId}")
    public Owner getOwnerOfPg(@PathVariable Long pgId) {
        return service.getOwnerByPgId(pgId);
    }

    // Add a new PG place for an owner
    @PostMapping("/add/{ownerId}")
    public PgPlace addPlace(@PathVariable("ownerId") Long ownerId, @RequestBody PgPlace place) {
        return service.addPlace(ownerId, place);
    }

    // Retrieve all PG places added by the owner
    @GetMapping("/{ownerId}")
    public List<PgPlace> getAllPlacesByOwner(@PathVariable Long ownerId) {
        return service.getAllPlacesByOwner(ownerId);
    }

    // Change the status (Available/Not Available)
    @PutMapping("/{pgId}/status")
    public PgPlace updateAvailability(@PathVariable Long pgId, @RequestParam Boolean available) {
        return service.updateAvailability(pgId, available);
    }

    // Edit place details
    @PutMapping("/edit/{pgId}")
    public PgPlace editPlace(@PathVariable Long pgId, @RequestBody PgPlace place) {
        return service.editPlace(pgId, place);
    }

    // Delete place details
    @DeleteMapping("/delete/{pgId}")
    public String deletePlace(@PathVariable Long pgId) {
        return service.deletePlace(pgId);
    }
}
