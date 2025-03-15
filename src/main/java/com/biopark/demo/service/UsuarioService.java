package com.biopark.demo.service;

import com.biopark.demo.model.Usuario.DtoDadosAddUsuario;
import com.biopark.demo.model.Usuario.DtoDadosAtualizarUsuario;
import com.biopark.demo.model.Usuario.Usuario;
import com.biopark.demo.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Transactional
    public Usuario criarUsuario(DtoDadosAddUsuario dados) {
        var usuario = new Usuario(dados.nome());
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuario com id " + id + " não encontrado"));
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Transactional
    public Usuario atualizar(DtoDadosAtualizarUsuario usuarioAtualizado) {
        System.out.println("Atualizando usuario: " + usuarioAtualizado);
        var usuario = usuarioRepository.getReferenceById(usuarioAtualizado.id());

        usuario.atualizar(usuarioAtualizado.nome());

        return usuario;
    }

}
