package com.cerebra.donation.controller;
import com.cerebra.donation.model.Donation;
import com.cerebra.donation.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin // For Intigration of FrontEnd And BackEnd
@RequestMapping("/donations")
public class DonationController {
    @Autowired
    private DonationService donationService;


 @PostMapping("/add")
        public ResponseEntity add(@RequestBody @Valid Donation donation)
        {
         donationService.SaveDonation(donation);
         return new ResponseEntity("User Is Added", HttpStatus.CREATED);
         }

    @GetMapping("/adds")
    public String adds()
    {
       System.out.println("Hello world");
        return "Hello Dev Team";
    }
}
