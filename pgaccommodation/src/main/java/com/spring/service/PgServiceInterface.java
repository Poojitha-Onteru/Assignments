package com.spring.service;

import java.util.List;

import com.spring.entity.PgPlace;

public interface PgServiceInterface {
    List<PgPlace> getAvailableByCity(String city);
    List<PgPlace> getAvailableByLocality(String locality);
    PgPlace getPgDetails(Long id);
    PgPlace addPgPlace(PgPlace place);
    PgPlace updateStatus(Long id, Boolean available);
}
