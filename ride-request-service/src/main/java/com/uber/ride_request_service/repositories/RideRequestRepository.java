package com.uber.ride_request_service.repositories;

import com.uber.ride_request_service.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
