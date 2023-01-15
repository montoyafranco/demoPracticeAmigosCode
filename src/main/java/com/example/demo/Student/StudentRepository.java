package com.example.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
//    Aca es como interactuo con la base de datos el repositorio . Primero extiendo y utiolizo Student y el tipo de dato
//    del ID . responsable del acceso de DB
}
