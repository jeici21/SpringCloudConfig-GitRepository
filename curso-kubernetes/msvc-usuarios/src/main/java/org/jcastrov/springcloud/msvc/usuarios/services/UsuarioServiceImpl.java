package org.jcastrov.springcloud.msvc.usuarios.services;

import java.util.List;
import java.util.Optional;

import org.jcastrov.springcloud.msvc.usuarios.models.entity.Usuario;
import org.jcastrov.springcloud.msvc.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    // inyectando el componente
    @Autowired
    private UsuarioRepository repository;

    // implementando los métodos de UsuarioService
    // volviéndolos un método transaccional para consultas
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return (List<Usuario>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> porId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
