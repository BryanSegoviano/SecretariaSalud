package main;

import accesoDatos.CitaJpaController;
import dominio.Cita;
import dominio.Expediente;
import dominio.Habitante;
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

//        String habitanteExpediente = null;
//        String citaid = "1";
//        try {
//            String urlExpediente = "http://localhost:8080/habitantes/";
//            String urlConcatenada = urlExpediente.concat(citaid);
//            URL url = new URL(urlConcatenada);
//            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
//            conexion.setRequestMethod("GET");
//            conexion.setRequestProperty("Accept", "application/json");
//
//            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
//            BufferedReader br = new BufferedReader(isr);
//            habitanteExpediente = br.readLine();
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//
//                JSONObject habitanteJSON = new JSONObject(habitanteExpediente);
//
//                String nombre = (String) habitanteJSON.get("nombre");
//                String direccion = (String) habitanteJSON.get("direccion");
//                int edad = (Integer) habitanteJSON.get("edad");
//                String datoBiometrico = (String) habitanteJSON.get("datoBiometrico");
//                System.out.println(datoBiometrico);               
//                int idHabitante = (Integer) habitanteJSON.get("idhabitante");
//                int idTutor = (Integer) habitanteJSON.get("idTutor");
//
//                JSONObject expedienteJSON = (JSONObject) habitanteJSON.get("idExpediente");
//                int idExpediente = (Integer) expedienteJSON.get("idExpediente");
//                String informacionGeneral = (String) expedienteJSON.get("informacionGeneral");
//                String imagenes = (String) expedienteJSON.get("imagenes");
//                String documentos = (String) expedienteJSON.get("documento");
//                Expediente expediente = new Expediente(idExpediente, imagenes, informacionGeneral, documentos);
//                Habitante habitante = new Habitante(idHabitante, nombre, direccion, edad, idTutor, expediente, datoBiometrico);
    }

}
