package com.company.rsvpservice.repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RsvpRepositoryTest {

    @Autowired
    private RsvpRepository repo;

    @BeforeEach
    void setUp() {
        repo.findAll().stream()
    }
}