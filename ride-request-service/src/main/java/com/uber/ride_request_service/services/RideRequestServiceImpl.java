package com.uber.ride_request_service.services;

import com.uber.ride_request_service.entities.RideRequest;
import com.uber.ride_request_service.repositories.RideRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideRequestServiceImpl implements RideRequestService {

    @Autowired
    private RideRequestRepository repository;

    @Override
    public RideRequest createRequest(RideRequest request) {
        return repository.save(request);
    }

    @Override
    public RideRequest getRequestById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ride request not found: " + id));
    }

    @Override
    public List<RideRequest> getAllRequests() {
        return repository.findAll();
    }
}
