package com.example.jobPortal.repository;

import com.example.jobPortal.entity.syncData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncDataRepository extends JpaRepository<syncData,Long> {
}
