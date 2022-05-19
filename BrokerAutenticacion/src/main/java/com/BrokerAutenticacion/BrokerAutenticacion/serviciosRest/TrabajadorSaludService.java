package com.BrokerAutenticacion.BrokerAutenticacion.serviciosRest;

import java.util.ArrayList;

import com.BrokerAutenticacion.BrokerAutenticacion.accesodatos.TrabajadorSaludRepository;
import com.BrokerAutenticacion.BrokerAutenticacion.entidades.TrabajadorSalud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajadorSaludService {
    @Autowired
    TrabajadorSaludRepository trabajadorSaludRepository;

    public ArrayList<TrabajadorSalud> obtenerTrabajadores(){
        return (ArrayList<TrabajadorSalud>) trabajadorSaludRepository.findAll();
    }

    public TrabajadorSalud obtenerTrabajadorPorUsuario(String usuario){
        return this.trabajadorSaludRepository.findByusuario(usuario);
    }
}
