package com.biopark.demo.model.Usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DtoDadosAtualizarUsuario(
        @NotNull(message = "Insira um id válido")
        Long id,
        @NotBlank(message = "Nome não pode ser nulo")
        String nome
) {
}
