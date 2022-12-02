package org.jcastrov.springcloud.msvc.usuarios.repositories;

import org.jcastrov.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

//creando interface entre la aplicación y la bd
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
