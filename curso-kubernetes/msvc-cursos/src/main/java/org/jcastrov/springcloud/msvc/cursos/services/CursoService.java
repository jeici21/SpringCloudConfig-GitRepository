package org.jcastrov.springcloud.msvc.cursos.services;

import java.util.List;
import java.util.Optional;

import org.jcastrov.springcloud.msvc.cursos.entity.Curso;

public interface CursoService {
    List<Curso> listar();

    Optional<Curso> porId(Long id);

    Curso guardar(Curso curso);

    void eliminar(Long id);
}
