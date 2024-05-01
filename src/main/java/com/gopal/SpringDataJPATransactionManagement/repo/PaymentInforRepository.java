package com.gopal.SpringDataJPATransactionManagement.repo;

import com.gopal.SpringDataJPATransactionManagement.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInforRepository extends JpaRepository<PaymentInfo,String> {
}
