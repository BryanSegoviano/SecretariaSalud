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

    public Habitante obtenerHabitantePorNSS(String nssHabitante) {
        Habitante habitante = null;
        String habitanteExpediente;
        try {
            String urlExpediente = this.servidor + this.peticion + nssHabitante;
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
                String nss = (String) habitanteJSON.get("nss");
                String doctor = (String) habitanteJSON.get("doctor");
                String consultorio = (String) habitanteJSON.get("consultorio");                        

                String datoBiometrico = (String) habitanteJSON.get("datoBiometrico");
                System.out.println(datoBiometrico);
                

                int idHabitante = (Integer) habitanteJSON.get("idhabitante");
                int idTutor = (Integer) habitanteJSON.get("idTutor");

                JSONObject expedienteJSON = (JSONObject) habitanteJSON.get("idExpediente");
                int idExpediente = (Integer) expedienteJSON.get("idExpediente");
                String informacionGeneral = (String) expedienteJSON.get("informacionGeneral");
                String imagenes = (String) expedienteJSON.get("imagenes");
                String documentos = (String) expedienteJSON.get("documento");
                Expediente expediente = new Expediente(idExpediente, imagenes, informacionGeneral, documentos);
                habitante = new Habitante(idHabitante, nombre, direccion, edad, idTutor, expediente, datoBiometrico, nss, doctor, consultorio);
                return habitante;
                
            } else {
                return null;
            }

        } catch (Exception ex) {

        }
        return habitante;
    }

}
