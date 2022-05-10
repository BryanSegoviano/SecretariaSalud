package com.example.demo.serviciosRest;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.accesodatos.HabitanteRepository;
import com.example.demo.entidades.Habitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitanteServicioRest {
    @Autowired
    HabitanteRepository habitanteRepository;

    //Insertar un habitante y Actualizar un habitante
    public Habitante insertar(Habitante habitante){
        return this.habitanteRepository.save(habitante);
    }

    //Borrar un habitante
    public boolean eliminar(int id){
        try {
            this.habitanteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Consultar por id un habitante
    public Habitante consultarPorId(int id){
        return this.habitanteRepository.findByIdhabitante(id);
    }

    //Consultar todos los habitante
    public ArrayList<Habitante> consultarTodos(){
        return (ArrayList<Habitante>) this.habitanteRepository.findAll();
    }

    //Consultar por un parámetro en especifico un habitante
    public ArrayList<Habitante> consultarPorNombre(String nombre){
        return (ArrayList<Habitante>) this.habitanteRepository.findByNombre(nombre);
    }
}