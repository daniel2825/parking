package com.parking.mallplaza.controller;

import com.parking.mallplaza.model.Commerce;
import com.parking.mallplaza.model.Vehicule;
import com.parking.mallplaza.service.DeleteService;
import com.parking.mallplaza.service.FilterService;
import com.parking.mallplaza.service.RegisterService;
import com.parking.mallplaza.service.UpdateService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParkingController {

    private final FilterService filterService;
    private final DeleteService deleteService;
    private final RegisterService registerService;
    private final UpdateService updateService;

    @Autowired
    public ParkingController(FilterService filterService, DeleteService deleteService, RegisterService registerService, UpdateService updateService) {
        this.filterService = filterService;
        this.deleteService = deleteService;
        this.registerService = registerService;
        this.updateService = updateService;
    }

    @PostMapping(value = "/save")
    @Transactional
    @ResponseBody
    public void registerVehicleInCommerce(@RequestBody final Commerce commerce){
        registerService.addVehicule(commerce);
    }

    @DeleteMapping(value = "/delete")
    @ResponseBody
    public void deleteVehicleInCommerce(@RequestBody final String licencePlate){

    }

    @PutMapping(value = "/update")
    @ResponseBody
    public void updateVehicleInCommerce(@RequestBody final Vehicule vehicule){

    }

    @GetMapping(value = "/list")
    @ResponseBody
    public Vehicule listVehicleInCommerce(){
        return new Vehicule();

    }

    @GetMapping(value = "/get_by_licence_plate")
    @ResponseBody
    public Vehicule getVehicleByLicenceInCommerce(){
        return new Vehicule();

    }

}
