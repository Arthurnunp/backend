package com.exemplo.dineup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.dineup.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNomeUsuario(String nomeUsuario);
}
