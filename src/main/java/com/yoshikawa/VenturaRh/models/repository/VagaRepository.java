package com.yoshikawa.VenturaRh.models.repository;

import com.yoshikawa.VenturaRh.models.vagaentities.Vaga;
import org.springframework.data.repository.CrudRepository;

public interface VagaRepository extends CrudRepository<Vaga, Long> {
    Vaga findById(long id);
}
