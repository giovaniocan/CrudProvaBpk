package com.biopark.demo.model.Usuario;

import jakarta.validation.constraints.NotBlank;

public record DtoDadosAddUsuario(
        @NotBlank(message = "Nome não pode ser nulo")
        String nome
) {

}
