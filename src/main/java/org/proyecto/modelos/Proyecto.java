package org.proyecto.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.proyecto.servicios.implementaciones.CategoriaService;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "proyectos")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
