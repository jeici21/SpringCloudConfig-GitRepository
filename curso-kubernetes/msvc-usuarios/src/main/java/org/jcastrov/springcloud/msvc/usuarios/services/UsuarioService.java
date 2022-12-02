package org.jcastrov.springcloud.msvc.usuarios.services;

import java.util.List;
import java.util.Optional;

import org.jcastrov.springcloud.msvc.usuarios.models.entity.Usuario;

public interface UsuarioService {
    List<Usuario> listar();// devolviendo lista del tipo usuario

    Optional<Usuario> porId(Long id);// para evitar errores si no hay registros

    Usuario guardar(Usuario usuario);// para guardar o editar registros

    void eliminar(Long id);// para eliminar
}
