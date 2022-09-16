package com.cerebra.donation.repository;

import com.cerebra.donation.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Integer> {
}
