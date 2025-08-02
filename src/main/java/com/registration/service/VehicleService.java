package com.registration.service;

import com.registration.entity.Vehicle;

import java.util.List;

public interface VehicleService
{
    String saveVehicle(Vehicle vehicle);

    List<Vehicle> getAllData();

    Vehicle getDataById(int id);
}
