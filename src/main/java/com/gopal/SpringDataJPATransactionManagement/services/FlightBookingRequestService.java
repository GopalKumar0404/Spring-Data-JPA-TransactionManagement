package com.gopal.SpringDataJPATransactionManagement.services;

import com.gopal.SpringDataJPATransactionManagement.dto.FlightBookinAcknowledgment;
import com.gopal.SpringDataJPATransactionManagement.dto.FlightBookingRequest;
import com.gopal.SpringDataJPATransactionManagement.entity.PassengerInfo;
import com.gopal.SpringDataJPATransactionManagement.entity.PaymentInfo;
import com.gopal.SpringDataJPATransactionManagement.repo.PassengerInfoRepository;
import com.gopal.SpringDataJPATransactionManagement.repo.PaymentInforRepository;
import com.gopal.SpringDataJPATransactionManagement.utils.PaymentInfoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingRequestService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInforRepository paymentInforRepository;

    @Transactional
    public FlightBookinAcknowledgment flightBookinRequest(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentInfoValidation.validate(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInfo = paymentInforRepository.save(paymentInfo);

        return new FlightBookinAcknowledgment("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }
}
