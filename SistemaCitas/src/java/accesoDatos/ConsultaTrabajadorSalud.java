/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import dominio.Expediente;
import dominio.Habitante;
import dominio.TrabajadorSalud;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author bryan
 */
public class ConsultaTrabajadorSalud {

    private String servidor = "http://localhost:8081/";
    private String peticion = "trabajadoressalud/";

    public TrabajadorSalud obtenerTrabajadorPorUsuario(String usuario) {
        TrabajadorSalud trabajadorSalud = null;
        String trabajadorsalud;
        try {
            String urlExpediente = this.servidor + this.peticion + usuario;
            System.out.println(urlExpediente);
            URL url = new URL(urlExpediente);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Accept", "application/json");

            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            trabajadorsalud = br.readLine();
            if (trabajadorsalud != null) {
                JSONObject trabajadorJSON = new JSONObject(trabajadorsalud);

                int id = (Integer) trabajadorJSON.get("idtrabajadoressalud");
                String nombreUsuario = (String) trabajadorJSON.get("usuario");
                String direccion = (String) trabajadorJSON.get("contrasenia");
                
                
                trabajadorSalud = new TrabajadorSalud(id, nombreUsuario, direccion);
                return trabajadorSalud;
            } else {
                return null;
            }

        } catch (Exception ex) {

        }
        return trabajadorSalud;
    }

}
