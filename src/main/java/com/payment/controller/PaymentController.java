package com.payment.controller;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

  @GetMapping("/payments")
  public String getPaymentDeatils() {

    //return new Random().nextBoolean()? "Success":"Failure";
    //return "Failure";
    return "Success";
  }
}
