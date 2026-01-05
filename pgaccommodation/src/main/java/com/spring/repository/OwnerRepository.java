package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
