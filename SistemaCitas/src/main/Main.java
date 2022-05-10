package main;

import accesoDatos.CitaJpaController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.JSONObject;
import dominio.Cita;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory et = Persistence.createEntityManagerFactory("SistemaCitasPU");
        CitaJpaController citas = new CitaJpaController(et);
        String habitante = null;
        
        String citaid = "1";
        try {
            String urlExpediente = "http://localhost:8080/habitantes/";
            String urlConcatenada = urlExpediente.concat(citaid);
            URL url = new URL(urlConcatenada);           
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Accept", "application/json");

            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            habitante = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }    
//Acceder a la informacion del habitante
//        JSONObject habitanteJSON = new JSONObject(habitante);
//        System.out.println(habitanteJSON);
//        Integer id = habitanteJSON.getInt("idhabitante");
//        Cita cita = new Cita("Ramirez", id, new Date());
//        citas.create(cita);

//Acceder al expediente del habitante
        JSONObject habitanteJSON = new JSONObject(habitante);
        System.out.println(habitanteJSON);
        System.out.println(habitanteJSON.get("idhabitante"));
//        JSONObject expedienteJSON = (JSONObject) habitanteJSON.get("idExpediente");
//        System.out.println(expedienteJSON.get("informacionGeneral"));
    }

}
