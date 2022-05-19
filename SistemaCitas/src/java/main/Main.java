package main;

import accesoDatos.CitaJpaController;
import accesoDatos.ConsultaTrabajadorSalud;
import dominio.Cita;
import dominio.Expediente;
import dominio.Habitante;
import dominio.TrabajadorSalud;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {

           ConsultaTrabajadorSalud trabajadores = new ConsultaTrabajadorSalud();
           TrabajadorSalud trabajador = trabajadores.obtenerTrabajadorPorUsuario("54758421");
           System.out.println(trabajador);
    }

}
