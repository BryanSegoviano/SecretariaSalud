package com.example.demo.controladores;
import com.example.demo.serviciosRest.HabitanteServicioRest;
import com.example.demo.serviciosRest.ExpedienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entidades.Expediente;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/expedientes")
public class ExpedienteControlador {
    @Autowired
    ExpedienteServicio expedienteServicio;

    // Insertar un expediente (se mandan todos los datos menos el id) y Actualizar un expediente (se mandan todos los datos junto con el id para actualizar al expediente con el id que se mando)
    @PostMapping()
    public ResponseEntity<Expediente> insertarExpediente(@RequestBody Expediente expediente) {
        return new ResponseEntity<>(this.expedienteServicio.insertar(expediente), HttpStatus.CREATED);
    }

    // Borrar un expediente
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> eliminarExpediente(@PathVariable("id") int id) {
        if (this.expedienteServicio.eliminar(id)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(true, HttpStatus.NOT_FOUND);
    }

    // Consultar por id un expediente
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Expediente>> consultarPorIdExpediente(@PathVariable("id") int id) {
        Optional<Expediente> expediente = this.expedienteServicio.consultarPorId(id);
        if (!expediente.isPresent()) {
            return new ResponseEntity<>(expediente, HttpStatus.OK);
        }
        return new ResponseEntity<>(expediente, HttpStatus.NOT_FOUND);
    }
    
    // Consultar todos los expediente
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Expediente> consultarTodosExpediente() {
        return this.expedienteServicio.consultarTodos();
    }

    // Consultar por un parámetro en especifico un expediente (por su titulo)
//    @GetMapping("/query")
//    public ResponseEntity<ArrayList<Expediente>> consultarPorNombreExpediente(@RequestParam("informacionGeneral") String nombre) {
//        ArrayList<Expediente> expediente = this.expedienteServicio.consultarPorNombre(nombre);
//        if (!expediente.isEmpty()) {
//            return new ResponseEntity<>(expediente, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(expediente, HttpStatus.NOT_FOUND);
//    }
}
