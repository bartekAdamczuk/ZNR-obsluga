package com.example.demo.repository;

import com.example.demo.entity.Devices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevicesRepository extends JpaRepository<Devices, Long> {
}
