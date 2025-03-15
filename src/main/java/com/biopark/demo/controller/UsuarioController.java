package com.biopark.demo.controller;

import com.biopark.demo.model.Usuario.DtoDadosAddUsuario;
import com.biopark.demo.model.Usuario.DtoDadosAtualizarUsuario;
import com.biopark.demo.model.Usuario.Usuario;
import com.biopark.demo.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody @Valid  DtoDadosAddUsuario dados) {
        var usuario = usuarioService.criarUsuario(dados);

        return ResponseEntity.created(null).body(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUm(@PathVariable Long id) {
        var usuario = usuarioService.buscarUsuario(id);
        System.out.println(id);

        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos() {
            var usuarios = usuarioService.buscarTodos();

        return ResponseEntity.ok(usuarios);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(@RequestBody @Valid DtoDadosAtualizarUsuario usuario) {
        var usuarioAtualizado = usuarioService.atualizar(usuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }
}
