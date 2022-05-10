package com.example.demo.accesodatos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Expediente;
import java.util.ArrayList;


 @Repository
public interface ExpedienteRepository extends CrudRepository<Expediente, Integer> {
//    public abstract ArrayList<Expediente> findByNombre(String nombre);
}