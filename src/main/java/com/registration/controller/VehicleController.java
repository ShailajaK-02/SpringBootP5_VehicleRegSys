package com.registration.controller;

import com.registration.entity.Vehicle;
import com.registration.service.VehicleService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController
{
    //inject service in this
    @Autowired
    private VehicleService vehicleService;

    //add data
    @PostMapping("/addVehicle")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle){
        System.err.println(vehicle);
        vehicleService.saveVehicle(vehicle);
        return new ResponseEntity<>("Vehicle added", HttpStatus.CREATED);
    }

    //get all data
    @GetMapping("/getAllData")
    public ResponseEntity<List<Vehicle>> getAllData(){
        List<Vehicle> vehicleList = vehicleService.getAllData();
        return new ResponseEntity<>(vehicleList, HttpStatus.OK);
    }

    //get data by id
    @GetMapping("/getById/{id}")
    public ResponseEntity<Vehicle> getDataById(@PathVariable("id") int id){
        Vehicle vehicle = vehicleService.getDataById(id);
        return new ResponseEntity<>(vehicle,HttpStatus.OK);
    }
}
