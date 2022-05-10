package com.example.demo.servlets;

import com.example.demo.entidades.Expediente;
import com.example.demo.entidades.Habitante;
import com.example.demo.serviciosRest.ExpedienteServicio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;

public class consultaExpediente extends HttpServlet {

    ExpedienteServicio expediente;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String listaExpedientesTexto = null;
        String uri = "http://localhost:8080/habitantes";
        try {
            URL url = new URL(uri);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Accept", "application/json");

            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            listaExpedientesTexto = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        JSONArray array = new JSONArray(listaExpedientesTexto);
        List<JSONObject> listaExpedientes = new ArrayList();
        for (int i = 0; i < array.length(); listaExpedientes.add(array.getJSONObject(i++)));

        HttpSession session = request.getSession();
        session.setAttribute("listaExpedientes", listaExpedientes);
        System.out.println(listaExpedientes);
        response.sendRedirect("consultaExpediente.jsp");
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
