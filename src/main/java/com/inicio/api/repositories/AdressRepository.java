package com.inicio.api.repositories;

import com.inicio.api.domain.adress.Adress;

import java.util.UUID;

public interface AdressRepository  extends  JpaRepository <Adress, UUID>{
}
