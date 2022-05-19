package com.BrokerAutenticacion.BrokerAutenticacion.accesodatos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.BrokerAutenticacion.BrokerAutenticacion.entidades.TrabajadorSalud;

@Repository
public interface TrabajadorSaludRepository extends CrudRepository<TrabajadorSalud, Integer> {
    public abstract TrabajadorSalud findByusuario(String usuario);
}
