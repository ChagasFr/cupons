package com.inicio.api.domain.cupom;
import com.inicio.api.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.persistence.AllArgsConstructor;
import lombok.persistence.Getter;
import lombok.persistence.NoArgsContructor;
import lombok.persistence.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "cupom")
@Entity
@Setter
@Getter
@NoArgsContructor
@AllArgsConstructor

public class Cupom {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "")
    private Event event;
}
