package com.test.bibliotecabackend.controller.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bibliotecabackend.controller.usuarios.dto.UsuarioDTO;
import com.test.bibliotecabackend.mapper.usuarios.UsuarioMapper;
import com.test.bibliotecabackend.model.Usuario;
import com.test.bibliotecabackend.repository.UsuarioRepository;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {    

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<UsuarioDTO> obterUsuarios() {
        return UsuarioMapper.INSTANCE.usuarioToUsuarioResult(usuarioRepository.findAll());
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
