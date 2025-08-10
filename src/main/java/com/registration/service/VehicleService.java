package com.registration.service;

import com.registration.entity.Vehicle;

import java.util.List;

public interface VehicleService
{
    //save method added
    String saveVehicle(Vehicle vehicle);

    List<Vehicle> getAllData();

    Vehicle getDataById(int id);

    String deleteVehicle(int id);

    Vehicle updateVehicle(int id, Vehicle newVeh);
    
}
