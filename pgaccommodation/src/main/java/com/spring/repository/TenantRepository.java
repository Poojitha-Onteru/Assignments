package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
