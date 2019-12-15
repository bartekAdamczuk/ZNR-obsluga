package com.example.demo.service;

import com.example.demo.entity.Devices;
import com.example.demo.repository.DevicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DevicesService {
    private final DevicesRepository devicesRepository;

    public DevicesService(DevicesRepository devicesRepository) {
        this.devicesRepository = devicesRepository;
    }

    public Devices saveDevices(Devices devices){
        return devicesRepository.save(devices);
    }

    public List<Devices> getAll(){ return devicesRepository.findAll();}

    public Optional<Devices> getById(Long id){
        return devicesRepository.findById(id);
    }
}
