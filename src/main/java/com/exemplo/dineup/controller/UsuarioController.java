package com.exemplo.dineup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exemplo.dineup.model.Usuario;
import com.exemplo.dineup.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/register")
    public Usuario registerUser(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    public Usuario loginUser(@RequestBody Usuario usuario) {
        Usuario foundUser = usuarioRepository.findByNomeUsuario(usuario.getNomeUsuario());
        if (foundUser != null && foundUser.getSenha().equals(usuario.getSenha())) {
            return foundUser;
        }
        return null;
    }
}
