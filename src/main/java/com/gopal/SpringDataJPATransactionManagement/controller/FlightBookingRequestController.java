package com.gopal.SpringDataJPATransactionManagement.controller;

import com.gopal.SpringDataJPATransactionManagement.dto.FlightBookinAcknowledgment;
import com.gopal.SpringDataJPATransactionManagement.dto.FlightBookingRequest;
import com.gopal.SpringDataJPATransactionManagement.services.FlightBookingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingRequestController {

    @Autowired
    private FlightBookingRequestService flightBookingRequestService;

    @PostMapping("flightTicketBooking")
    public FlightBookinAcknowledgment flightBookingRequest(@RequestBody FlightBookingRequest request) {
        return flightBookingRequestService.flightBookinRequest(request);
    }
}
