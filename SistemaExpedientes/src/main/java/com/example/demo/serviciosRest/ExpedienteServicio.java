package com.example.demo.serviciosRest;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.accesodatos.ExpedienteRepository;
import com.example.demo.entidades.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpedienteServicio {
    @Autowired
    ExpedienteRepository expedienteRepository;

    //Insertar un habitante y Actualizar un habitante
    public Expediente insertar(Expediente expediente){
        return this.expedienteRepository.save(expediente);
    }

    //Borrar un habitante
    public boolean eliminar(int id){
        try {
            this.expedienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Consultar por id un habitante
    public Optional<Expediente> consultarPorId(int id){
        return this.expedienteRepository.findById(id);
    }

    //Consultar todos los habitante
    public ArrayList<Expediente> consultarTodos(){
        return (ArrayList<Expediente>) this.expedienteRepository.findAll();
    }

    //Consultar por un parámetro en especifico un habitante
//    public ArrayList<Expediente> consultarPorNombre(String nombre){
//        return (ArrayList<Expediente>) this.expedienteRepository.findByNombre(nombre);
//    }
}
