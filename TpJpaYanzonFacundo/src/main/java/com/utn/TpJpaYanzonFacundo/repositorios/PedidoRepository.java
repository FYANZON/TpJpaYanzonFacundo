package com.utn.TpJpaYanzonFacundo.repositorios;

import com.utn.TpJpaYanzonFacundo.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
