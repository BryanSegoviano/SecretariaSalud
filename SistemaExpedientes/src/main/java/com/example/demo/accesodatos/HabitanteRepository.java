package com.example.demo.accesodatos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Habitante;
import java.util.ArrayList;


 @Repository
public interface HabitanteRepository extends CrudRepository<Habitante, Integer> {
    public abstract ArrayList<Habitante> findByNombre(String nombre);
    public abstract Habitante findByIdhabitante (Integer id);
}

