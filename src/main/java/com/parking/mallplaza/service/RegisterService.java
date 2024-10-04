package com.parking.mallplaza.service;

import com.parking.mallplaza.model.Commerce;
import com.parking.mallplaza.repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService{

    private final IVehiculeRepository iVehiculeRepository;

    @Autowired
    public RegisterService(IVehiculeRepository iVehiculeRepository) {
        this.iVehiculeRepository = iVehiculeRepository;
    }

    public void addVehicule(final Commerce commerce){
       iVehiculeRepository.saveVehicule(
               commerce.getVehicule().getLicencePlate(),
               commerce.getVehicule().getColor(),
               commerce.getVehicule().getBrand(),
               commerce.getVehicule().getModel());

       iVehiculeRepository.saveOwner(commerce.getVehicule().getOwner().getNumberIdentification(),
               commerce.getVehicule().getOwner().getName(), commerce.getVehicule().getOwner().getLastName());

       iVehiculeRepository.saveCommerce(commerce.getNameCommerce(), commerce.getTimeIngress().toString());
    }
}
