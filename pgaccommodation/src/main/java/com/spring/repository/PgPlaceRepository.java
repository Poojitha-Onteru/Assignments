package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.*;

import java.util.List;

public interface PgPlaceRepository extends JpaRepository<PgPlace, Long> {
    List<PgPlace> findByCityAndAvailableTrue(String city);
    List<PgPlace> findByLocalityAndAvailableTrue(String locality);
}
