package com.inicio.api.domain.adress;

import com.inicio.api.domain.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.persistence.AllArgsConstructor;
import lombok.persistence.Getter;
import lombok.persistence.NoArgsContructor;
import lombok.persistence.Setter;

import java.util.UUID;

@Table(name = "adress")
@Entity
@Setter
@Getter
@NoArgsContructor
@AllArgsConstructor


public class Adress {
    @Id
    @GeneratedValue
    private UUID id;

    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id");
    private Event event;

}
