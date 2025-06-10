package com.inicio.api.controller;

import com.inicio.api.domain.cupom.Cupom;
import com.inicio.api.domain.cupom.CupomRequestDTO;
import com.inicio.api.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/cupom")
public class CupomController {

    @Autowired
    private CupomService cupomService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Cupom> addCuponsToEvent(@PathVariable UUID eventId, @RequestBody CupomRequestDTO data) {
        Cupom cupom = cupomService.addCupomToEvent(eventId, data);
        return ResponseEntity.ok(cupom);
    }
}