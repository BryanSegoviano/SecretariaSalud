package accesoDatos;

import dominio.Expediente;
import dominio.Habitante;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ConsultaHabitante {

    private String servidor = "http://localhost:8080/";
    private String peticion = "habitantes/";

    public Habitante obtenerHabitantePorID(String id) {
        Habitante habitante = null;
        String habitanteExpediente;
        try {
            String urlExpediente = this.servidor + this.peticion + id;
            System.out.println(urlExpediente);
            URL url = new URL(urlExpediente);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Accept", "application/json");
            
            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            habitanteExpediente = br.readLine();
            if (habitanteExpediente != null) {
                JSONObject habitanteJSON = new JSONObject(habitanteExpediente);
                
                String nombre = (String) habitanteJSON.get("nombre");
                String direccion = (String) habitanteJSON.get("direccion");
                int edad = (Integer) habitanteJSON.get("edad");

//        String datoBiometrico = (String) habitanteJSON.get("datoBiometrico");
//        System.out.println(datoBiometrico);
//        byte[] datoBiometricoConvertido = datoBiometrico.getBytes();
//        System.out.println(datoBiometricoConvertido);

                int idHabitante = (Integer) habitanteJSON.get("idhabitante");
                int idTutor = (Integer) habitanteJSON.get("idTutor");

                JSONObject expedienteJSON = (JSONObject) habitanteJSON.get("idExpediente");
                int idExpediente = (Integer) expedienteJSON.get("idExpediente");
                String informacionGeneral = (String) expedienteJSON.get("informacionGeneral");

                Expediente expediente = new Expediente(idExpediente, null, informacionGeneral, null);
                habitante = new Habitante(idHabitante, nombre, direccion, edad, null, idTutor, expediente);
                
                return habitante;
            }else{
                return null;
            }

        } catch (Exception ex) {

        }
        return habitante;
    }

}
