package com.uber.ride_request_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long riderId;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDateTime requestTime;
    private String status; // e.g. REQUESTED, ACCEPTED, COMPLETED
}
