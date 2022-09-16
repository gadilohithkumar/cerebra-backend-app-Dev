package com.cerebra.donation.service;

import com.cerebra.donation.model.Donation;
import org.springframework.stereotype.Service;

@Service
public interface DonationService {
    public Donation SaveDonation(Donation Donation);
}



