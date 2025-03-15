package com.biopark.demo.model.Usuario;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity (name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "usuario_id")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario_id;

    @Valid
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void atualizar (String novoNome){
        if(novoNome != null){
            this.nome = novoNome;
        }
    }
}
