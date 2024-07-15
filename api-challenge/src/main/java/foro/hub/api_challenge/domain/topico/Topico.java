package foro.hub.api_challenge.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name= "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime fechaCreacion;
    private String autor;
    private Boolean activo;
    @Enumerated (EnumType.STRING)
    private Curso curso;

    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.activo = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
       // this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }

    public void desactivarMedico() {
        this.activo = false;
    }
}
