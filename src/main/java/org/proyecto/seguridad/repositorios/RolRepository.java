package org.proyecto.seguridad.repositorios;

import org.proyecto.seguridad.modelos.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}
