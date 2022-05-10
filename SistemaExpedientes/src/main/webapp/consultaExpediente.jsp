

<%@page import="org.json.JSONObject"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.entidades.Habitante"%>
<%@page import="com.example.demo.entidades.Expediente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<JSONObject> listaExpedientes = (List<JSONObject>) session.getAttribute("listaExpedientes");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Expediente</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1 id="titulo">Consultar expediente</h1>
        <div class="informaicon" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h3>Datos personales</h3>
                <div id="divDaosPersonales">
                    <%
                        for (JSONObject listaExpediente : listaExpedientes) {
                            JSONObject expediente = (JSONObject) listaExpediente.get("idExpediente");
                            out.print(
                                    
                                    "<div id=\"divIzquierda\" class=\"caja1\">"
                                    + "<h3>Expediente</h3>"
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
                                    + "<br/><label>Informacion general del habitante: "
                                    + expediente.get("informacionGeneral")
                                    + "</label><br/><br/>"
                                    + "</div></div>"
                            );
                        }
                    %>
                </div>
                </body>
                </html>
