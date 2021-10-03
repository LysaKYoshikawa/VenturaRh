package com.yoshikawa.VenturaRh.models.repository;

import com.yoshikawa.VenturaRh.models.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    Usuario findByLogin(String login);
}
