package com.utn.TpJpaYanzonFacundo.repositorios;

import com.utn.TpJpaYanzonFacundo.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
