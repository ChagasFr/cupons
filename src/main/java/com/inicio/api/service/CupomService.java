package com.inicio.api.service;

import com.inicio.api.domain.cupom.Cupom;
import com.inicio.api.domain.cupom.CupomRequestDTO;
import com.inicio.api.domain.event.Event;
import com.inicio.api.repositories.CupomRepository;
import com.inicio.api.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CupomService {

    private final CupomRepository couponRepository;
    private final EventRepository eventRepository;

    public Cupom addCouponToEvent(UUID eventId, CupomRequestDTO cupomData) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Event not found"));

        Cupom cupom = new Cupom();
        cupom.setCode(cupomData.code());
        cupom.setDiscount(cupomData.discount());
        cupom.setValid(new Date(cupomData.valid()));
        cupom.setEvent(event);

        return cupomRepository.save(cupom);
    }

    public List<Cupom> consultCupons(UUID eventId, Date currentDate) {
        return cupomRepository.findByEventIdAndValidAfter(eventId, currentDate);
    }
}
