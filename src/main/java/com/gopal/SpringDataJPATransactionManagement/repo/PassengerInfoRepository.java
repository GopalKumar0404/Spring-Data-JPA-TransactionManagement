package com.gopal.SpringDataJPATransactionManagement.repo;

import com.gopal.SpringDataJPATransactionManagement.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
