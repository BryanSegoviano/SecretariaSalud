<%@page import="java.util.Arrays"%>
<%@page import="entidades.Expediente"%>
<%@page import="entidades.Habitante"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Habitante habitante = (Habitante) session.getAttribute("habitante");
    Expediente expediente = habitante.getIdExpediente();
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Consultar Expediente</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
                    <li><a href="http://localhost:8080/ConsultarExpedientes/consultarExpedientes" style="color:white">Consultar todos los expedientes</a></li>
                </ul>
            </div>
        </nav>
        <div class="text-center">
            <div class="m-5 pb-5 bg-info">
                <h1 id="titulo">Expediente del habitante</h1>   
            </div>
            <%
                out.print(
                        "<div id=\"divIzquierda\" class=\"caja1\">"
                        + "<h2>NSS: " + habitante.getNss() + "</h2>"
                        + "<div id=\"divDaosPersonales\"><br/>"
                        + "<img src=\"data:image/png;base64," + habitante.getDatoBiometricoConversion() + "\" width=\"100\"  height=\"100\" /> <br/>"
                        + "<label><b>Nombre:</b> "
                        + habitante.getNombre()
                        + "</label><br/><br/>"
                        + "<label><b>Direccion:</b> "
                        + habitante.getDireccion()
                        + "</label><br/><br/>"
                        + "<label><b>Edad:</b> "
                        + habitante.getEdad()
                        + "</label><br/><br/>"
                        + "<label><b>Imagenes:</b></label> <br/> <br/>"
                        + "<img src=\"data:image/png;base64," + expediente.getImagenes() + "\" width=\"200\"  height=\"200\" />"
                        + "<br/><label><b>Documentos:</b></label> <br/> <br/>"
                        + "<img src=\"data:image/png;base64," + expediente.getDocumento() + "\" width=\"200\"  height=\"200\" />"
                        + "<br/><br/><label><b>Informacion general del habitante: </b>"
                        + expediente.getInformacionGeneral()
                        + "</label><br/><br/>"
                        + "</div></div>"
                );
            %>           
        </div>
        <br/>  
        <img src="img/bannerabajo.png" alt="gobiernomex" width="1900">
    </body>
</html>
