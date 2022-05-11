//package Servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class IniciarSesion extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        
//        HttpSession sesion = request.getSession();
//        CitasDAO metodos = new CitasDAO();
//        String txtUsuario = request.getParameter("txtUsuario");
//        String  txtUContrasena = request.getParameter("txtUContrasena");
//        
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<script type=\"text/javascript\">");
//        
//        boolean iniciarSesion = metodos.buscarUsuarioInicioSesion(txtUsuario, txtUContrasena);
//        if (iniciarSesion == true) {
//            out.println("alert ('Bienvenido \\n" + txtUsuario + "')");
//            out.println("location = 'PaginaHome.jsp'");
//            String nombre = metodos.buscarNombre(txtUsuario);
//            sesion.setAttribute("nombre", nombre);
//            sesion.setAttribute("txtUsuario", txtUsuario);
//        } else {
//            out.println("alert ('Datos incorrectos, verifique credenciales')");
//            out.println("location = 'index.html'");
//        }
//        
//        out.println("</script>");
//        out.println("</body>");
//        out.println("</html>");
//
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
