package com.utn.TpJpaYanzonFacundo.repositorios;

import com.utn.TpJpaYanzonFacundo.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
