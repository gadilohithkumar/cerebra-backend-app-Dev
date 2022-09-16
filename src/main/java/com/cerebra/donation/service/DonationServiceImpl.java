package com.cerebra.donation.service;

import com.cerebra.donation.model.Donation;
import com.cerebra.donation.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationServiceImpl implements DonationService{
    @Autowired
    private DonationRepository donationRepository;

    @Override
    public Donation SaveDonation(Donation donation) {
        return donationRepository.save(donation);
    }
}
