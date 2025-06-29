package com.uber.ride_request_service.services;

import com.uber.ride_request_service.entities.RideRequest;

import java.util.List;

public interface RideRequestService {
    RideRequest createRequest(RideRequest request);
    RideRequest getRequestById(Long id);
    List<RideRequest> getAllRequests();
    RideRequest updateRideRequest(Long id, RideRequest updatedRideRequest);
    void deleteRideRequest(Long id);
}
