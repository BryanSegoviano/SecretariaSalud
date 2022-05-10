package com.example.demo.controladores;
import com.example.demo.serviciosRest.HabitanteServicioRest;
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
import com.example.demo.entidades.Habitante;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/habitantes")
public class HabitanteControlador {
    @Autowired
    HabitanteServicioRest habitanteServicio;

    // Insertar un habitante (se mandan todos los datos menos el id) y Actualizar un expediente (se mandan todos los datos junto con el id para actualizar al expediente con el id que se mando)
    @PostMapping()
    public ResponseEntity<Habitante> insertarHabitante(@RequestBody Habitante habitante) {
        return new ResponseEntity<>(this.habitanteServicio.insertar(habitante), HttpStatus.CREATED);
    }

    // Borrar un habitante
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> eliminarHabitante(@PathVariable("id") int id) {
        if (this.habitanteServicio.eliminar(id)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(true, HttpStatus.NOT_FOUND);
    }

    // Consultar por id un habitante
    @GetMapping(path = "/{id}")
    public Habitante consultarPorIdHabitante(@PathVariable("id") int id) {
        return this.habitanteServicio.consultarPorId(id);
    }
    
    // Consultar todos los habitantes
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Habitante> consultarTodosUsuario() {
        return this.habitanteServicio.consultarTodos();
    }

    // Consultar por un parámetro en especifico un habitante (por su nombre)
    @GetMapping("/query")
    public ResponseEntity<ArrayList<Habitante>> consultarPorNombreHabitante(@RequestParam("nombre") String nombre) {
        ArrayList<Habitante> habitantes = this.habitanteServicio.consultarPorNombre(nombre);
        if (!habitantes.isEmpty()) {
            return new ResponseEntity<>(habitantes, HttpStatus.OK);
        }
        return new ResponseEntity<>(habitantes, HttpStatus.NOT_FOUND);
    }
}
