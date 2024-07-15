package foro.hub.api_challenge.domain.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        //@NotBlank
        //LocalDateTime fechaCreacion,
        @NotBlank
        String autor,
        @NotNull
        Curso curso
) {

}
