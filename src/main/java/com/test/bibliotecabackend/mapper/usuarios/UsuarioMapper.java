package com.test.bibliotecabackend.mapper.usuarios;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.test.bibliotecabackend.controller.usuarios.dto.UsuarioDTO;
import com.test.bibliotecabackend.model.Usuario;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper( UsuarioMapper.class );
    
    List<UsuarioDTO> usuarioToUsuarioResult(List<Usuario> usuario);

}