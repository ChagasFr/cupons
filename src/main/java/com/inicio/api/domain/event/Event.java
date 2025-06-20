package com.inicio.api.domain.event;

import jakarta.persistence.*;
import lombok.persistence.AllArgsConstructor;
import lombok.persistence.Getter;
import lombok.persistence.NoArgsContructor;
import lombok.persistence.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsContructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;

    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL)
    private Addres addres;
}
