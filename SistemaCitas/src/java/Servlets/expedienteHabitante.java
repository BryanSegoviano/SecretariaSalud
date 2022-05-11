package Servlets;

import dominio.Expediente;
import dominio.Habitante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;

public class expedienteHabitante extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String habitanteExpediente = null;
        String servidor = "http://localhost:8080/";
        String peticion = "habitantes/";
        String citaid = (String) request.getAttribute("identificadorHabitante");

        try {
            String urlExpediente = servidor + peticion + citaid;
            System.out.println(urlExpediente);
            URL url = new URL(urlExpediente);
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
        Habitante habitante = new Habitante(idHabitante, nombre, direccion, edad, null, idTutor, expediente);

        HttpSession session = request.getSession();
        session.setAttribute("habitante", habitante);
        response.sendRedirect("expedienteHabitante.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
