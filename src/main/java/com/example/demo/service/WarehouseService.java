package com.example.demo.service;

import com.example.demo.entity.Warehouse;
import com.example.demo.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseService {
    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository){this.warehouseRepository = warehouseRepository;}

    public Warehouse saveWarehouse (Warehouse warehouse) {return warehouseRepository.save(warehouse);}

    public List<Warehouse> getAll(){return warehouseRepository.findAll();}

    public Optional<Warehouse> getById(Long id){
        return warehouseRepository.findById(id);
    }
}
