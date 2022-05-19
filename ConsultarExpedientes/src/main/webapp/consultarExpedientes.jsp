<%@page import="org.json.JSONObject"%>
<%@page import="java.util.List"%>
<%@page import="entidades.Habitante"%>
<%@page import="entidades.Expediente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<JSONObject> listaExpedientes = (List<JSONObject>) session.getAttribute("listaExpedientes");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Expediente</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid" style="background-color:#9f2043">
                <div class="navbar-header">
                    <a class="navbar-brand" style="color:white">Secretaria de Salud</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="http://localhost:8080/SistemaCitas/menuPrincipal.jsp" style="color:white">Inicio</a></li>
                    <li><a href="http://localhost:8080/SistemaCitas/registrarCita.jsp" style="color:white">Registrar Cita</a></li>
                    <li><a href="http://localhost:8080/SistemaCitas/verExpediente.jsp" style="color:white">Ver expediente</a></li>
                    <li><a href="http://localhost:8080/SistemaCitas/consultarCitas.jsp" style="color:white">Consultar todas las citas</a></li>
                    <li><a style="color:white">Consultar todos los expedientes</a></li>
                </ul>
            </div>
        </nav>
        <div class="informaicon" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h3>EXPEDIENTES</h3>
                <div id="divDaosPersonales" class="text-center">
                    <%
                        for (JSONObject listaExpediente : listaExpedientes) {
                            JSONObject expediente = (JSONObject) listaExpediente.get("idExpediente");
                            out.print(
                                    "<div id=\"divIzquierda\" class=\"caja1\">"
                                    + "<h3>"+ listaExpediente.get("nss") +"</h3>"
                                    + "<div id=\"divDaosPersonales\">"
                                    + "<img src=\"data:image/png;base64," + listaExpediente.get("datoBiometrico") + "\" width=\"100\"  height=\"100\" /> <br/>"
                                    + "<label>Nombre: "
                                    + listaExpediente.get("nombre")
                                    + "</label><br/><br/>"
                                    + "<label>Direccion: "
                                    + listaExpediente.get("direccion")
                                    + "</label><br/><br/>"
                                    + "<label>Edad: "
                                    + listaExpediente.get("edad")
                                    + "</label><br/><br/>"
                                    + "<label>Imagenes:</label> <br/> <br/>"
                                    + "<img src=\"data:image/png;base64," + expediente.get("imagenes") + "\" width=\"200\"  height=\"200\" />"
                                    + "<br/><label>Documentos:</label> <br/> <br/>"
                                    + "<img src=\"data:image/png;base64," + expediente.get("documento") + "\" width=\"200\"  height=\"200\" />"
                                    + "<br/><br/><label>Informacion general: "
                                    + expediente.get("informacionGeneral")
                                    + "</label><br/><br/>"
                                    + "</div></div>"
                            );
                        }
                    %>
                </div>
            </div>
            <img src="img/bannerabajo.png" alt=""/>
        </div>
    </body>
</html>

