package com.BrokerAutenticacion.BrokerAutenticacion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.BrokerAutenticacion.BrokerAutenticacion.entidades.TrabajadorSalud;
import com.BrokerAutenticacion.BrokerAutenticacion.serviciosRest.TrabajadorSaludService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/trabajadoressalud")
public class TrabajadorSaludControlador {
    @Autowired
    TrabajadorSaludService trabajadorSaludService;

    @GetMapping()
    public ArrayList<TrabajadorSalud> obtenerTrabajador(){
        return trabajadorSaludService.obtenerTrabajadores();
    }

    @GetMapping(path = "/{usuario}")
    public TrabajadorSalud consultarPorUsuarioTrabajadorSalud(@PathVariable("usuario") String usuario) {
        return this.trabajadorSaludService.obtenerTrabajadorPorUsuario(usuario);
    }


}
