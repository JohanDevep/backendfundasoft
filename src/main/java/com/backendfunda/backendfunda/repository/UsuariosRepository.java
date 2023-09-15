package com.backendfunda.backendfunda.repository;


import com.backendfunda.backendfunda.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    //Método para buscar un usuario por su nombre en nuestra base de datos
    Optional<Usuarios> findByNombre(String nombre);

    //Metodo para poder verificar si un usuario existe en nuestra base de datos
    Boolean existsByNombre(String nombre);
}
