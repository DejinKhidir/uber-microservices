package com.uber.ride_request_service.controllers;

import com.uber.ride_request_service.entities.RideRequest;
import com.uber.ride_request_service.services.RideRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ride-requests")
public class RideRequestController {

    @Autowired
    private RideRequestService service;

    @PostMapping
    public RideRequest createRideRequest(@RequestBody RideRequest request) {
        return service.createRequest(request);
    }

    @GetMapping("/{id}")
    public RideRequest getRideRequest(@PathVariable Long id) {
        return service.getRequestById(id);
    }

    @GetMapping
    public List<RideRequest> getAllRideRequests() {
        return service.getAllRequests();
    }

    @PutMapping("/{id}")
    public RideRequest updateRideRequest(@PathVariable Long id, @RequestBody RideRequest updatedRide) {
        return service.updateRideRequest(id, updatedRide);
    }

    @DeleteMapping("/{id}")
    public String deleteRideRequest(@PathVariable Long id) {
        service.deleteRideRequest(id);
        return "RideRequest with ID " + id + " deleted successfully.";
    }

}
