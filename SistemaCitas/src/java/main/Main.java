package main;

import dominio.Expediente;
import dominio.Habitante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {

        String habitanteExpediente = null;
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
            habitanteExpediente = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        JSONObject habitanteJSON = new JSONObject(habitanteExpediente);
        System.out.println(habitanteJSON);
        String nombre = (String) habitanteJSON.get("nombre");
        String direccion = (String) habitanteJSON.get("direccion");
        int edad = (Integer) habitanteJSON.get("edad");
        String datoBiometrico = (String) habitanteJSON.get("datoBiometrico");
        byte[] datoBiometricoConvertido = datoBiometrico.getBytes();
        System.out.println(Arrays.toString(datoBiometricoConvertido));
        
        int idHabitante = (Integer) habitanteJSON.get("idhabitante");
        int idTutor = (Integer) habitanteJSON.get("idTutor");
        
        JSONObject expedienteJSON = (JSONObject) habitanteJSON.get("idExpediente");

        int idExpediente = (Integer) expedienteJSON.get("idExpediente");
        String informacionGeneral = (String) expedienteJSON.get("informacionGeneral");
        
        Expediente expediente = new Expediente(idExpediente, datoBiometricoConvertido, informacionGeneral, datoBiometricoConvertido);
        Habitante habitante = new Habitante(idHabitante, nombre, direccion, edad, datoBiometricoConvertido, idTutor, expediente);
        System.out.println(habitante);

    }

}
