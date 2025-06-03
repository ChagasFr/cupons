package com.inicio.api.repositories;

import com.inicio.api.domain.cupom.Cupom;

import java.util.UUID;

public interface CupomRepository extends  JpaRepository <Cupom, UUID> {
}
