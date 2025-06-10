package com.inicio.api.service;

import com.inicio.api.domain.adress.Adress;
import com.inicio.api.domain.event.Event;
import com.inicio.api.domain.event.EventRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRespository addressRespository;

    public Adress createAdress(EventRequestDTO data, Event event) {
        Adress adress = new Adress();
        adress.setCity(data.city());
        adress.setUf(data.uf());
        adress.setEvent(event);

        return addressRespository.save(adress);
    }
}
