package com.gopal.SpringDataJPATransactionManagement.dto;

import com.gopal.SpringDataJPATransactionManagement.entity.PassengerInfo;
import com.gopal.SpringDataJPATransactionManagement.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

    private PaymentInfo paymentInfo;
    private PassengerInfo passengerInfo;
}
