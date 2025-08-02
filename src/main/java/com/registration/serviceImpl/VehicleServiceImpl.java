package com.registration.serviceImpl;

import com.registration.entity.Vehicle;
import com.registration.repository.VehicleRepository;
import com.registration.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService
{
    //inject repository in this
    @Autowired
    private VehicleRepository repository;

    @Override
    public String saveVehicle(Vehicle vehicle) {
        repository.save(vehicle);
        return "Vehicle added";
    }

    @Override
    public List<Vehicle> getAllData() {
        List<Vehicle> vehicleList = repository.findAll();
        return vehicleList;
    }

    @Override
    public Vehicle getDataById(int id) {
        Vehicle vehicleById = repository.findById(id).orElseThrow(()->new NullPointerException("Data not found"+id));
        return vehicleById;
    }
}
