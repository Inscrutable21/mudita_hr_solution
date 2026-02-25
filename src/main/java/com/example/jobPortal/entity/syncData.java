package com.example.jobPortal.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Table(name = "sync_data")
@Data
public class syncData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_processed_row")
    private Integer lastProcessedRow;

    @Column(name = "last_sync_time_stamp")
    private LocalDateTime lastSyncTimeStamp;

    @Column(name = "status")
    private String status;
}
