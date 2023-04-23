package com.example.commonthings.repository;

import com.example.commonthings.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientByPhoneNumber(String phoneNumber);
}
