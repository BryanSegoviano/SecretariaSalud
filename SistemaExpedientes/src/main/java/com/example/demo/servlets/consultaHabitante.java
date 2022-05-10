//package com.example.demo.servlets;
//import com.example.demo.entidades.Expediente;
//import com.example.demo.entidades.Habitante;
//import com.example.demo.entidades.Tutor;
//import com.example.demo.serviciosRest.HabitanteServicioRest;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class consultaHabitante extends HttpServlet{
//    HabitanteServicioRest habitante;
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        HttpSession session = request.getSession();
//        this.habitante = new HabitanteServicioRest();   
//        Habitante hb = new Habitante();
//        hb.setNombre("Bryan Angulo");
//        hb.setDireccion("Magdalena #2352");
//        hb.setEdad(22);
//
//        //hb.setExpediente(new Expediente());
//        //hb.setTutor(new Tutor());
//        System.out.println(hb);
//        session.setAttribute("habitante", hb);
//        response.sendRedirect("consultaHabitante.jsp");
//    }
//
//    
//// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
