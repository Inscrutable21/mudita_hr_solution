package com.example.jobPortal.repository;

import com.example.jobPortal.entity.FormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<FormData,Long> {
}
