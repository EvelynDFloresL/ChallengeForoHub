package foro.hub.api_challenge.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje
       // LocalDateTime fechaCreacion
) {

}
