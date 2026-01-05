package com.spring.service;

import java.util.List;
import com.spring.entity.Owner;
import com.spring.entity.PgPlace;

public interface OwnerServiceInterface {
    Owner getOwnerByPgId(Long pgId);               
    PgPlace addPlace(Long ownerId, PgPlace place); 
    List<PgPlace> getAllPlacesByOwner(Long ownerId); 
    PgPlace updateAvailability(Long pgId, Boolean available);
    PgPlace editPlace(Long pgId, PgPlace updatedPlace); 
    String deletePlace(Long pgId);
	Owner addOwner(Owner owner);
}
