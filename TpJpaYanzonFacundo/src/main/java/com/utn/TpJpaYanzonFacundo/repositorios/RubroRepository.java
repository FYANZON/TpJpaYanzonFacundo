package com.utn.TpJpaYanzonFacundo.repositorios;

import com.utn.TpJpaYanzonFacundo.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro,Long> {
}
