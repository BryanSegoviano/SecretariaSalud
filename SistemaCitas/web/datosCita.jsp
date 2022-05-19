<%@page import="dominio.Expediente"%>
<%@page import="dominio.Habitante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Habitante habitanteCita = (Habitante) session.getAttribute("habitanteCita");
    System.out.println(habitanteCita);
//    Expediente expediente = habitante.getIdExpediente();
%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registrar Cita</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>

    <body style="background-color: #f8f8f8">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid" style="background-color:#9f2043">
                <div class="navbar-header">
                    <a class="navbar-brand" style="color:white">Secretaria de Salud</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="menuPrincipal.jsp" style="color:white">Inicio</a></li>
                    <li><a href="registrarCita.jsp" style="color:white">Registrar Cita</a></li>
                    <li><a href="verExpediente.jsp" style="color:white">Ver expediente</a></li>
                    <li><a href="consultarCitas.jsp" style="color:white">Consultar todas las citas</a></li>
                    <li><a href="http://localhost:8080/ConsultarExpedientes/consultarExpedientes" style="color:white">Consultar todos los expedientes</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.html" style="color:white"><span class="glyphicon glyphicon-log-in"></span> Cerrar Sesión</a></li>
                </ul>
            </div>
        </nav>
        <div class="text-center">
            <h2 style="margin-left:30px"><b>Registrar cita</b></h2>
            <br>
            <h3 style="margin-left:30px">Datos del habitante</h3>
            <br/>
            <form style="margin-left:30px" method="POST" action="GuardarCita">
                <div>
                    <label for="NSS">Número de Seguro Social</label>
                    <input type="text" name="numsocial" id="numsocial" value="${habitanteCita.getNss()}" readonly>
                    <br><br/>
                    <p>
                        <label for="Nombre">Nombre del Habitante:</label>
                        <input type="text" name="Nombre" id="Nombre" value="${habitanteCita.getNombre()}" readonly>    
                        <label for="Dirección">Direccion:</label>
                        <input type="text" name="Direccion" id="Direccion" value="${habitanteCita.getDireccion()}" readonly>
                        <label for="Edad">Edad:</label>
                        <input type="number" name="${habitanteCita.getEdad()}" id="Edad" value="34" readonly >
                    </p>
                    <br>
                    <br/>
                    <p>
                        <label for="doc">Doctor:</label>
                        <input type="text" name="doc" id="doc" readonly  value="${habitanteCita.getDoctor()}">
                        <label for="consultorio">Consultorio:</label>
                        <input type="text" name="consultorio" id="consultorio" readonly  value="${habitanteCita.getConsultorio()}">
                    </p>
                    <br>
                    <hr/>
                    <label>*Debe seleccionar una fecha y hora para la cita.</label>

                    <br/><br/>
                    <label for="hora y fecha">Fecha y Hora:</label>
                    <input type="datetime-local" name="fecha" id="fecha" required="Debe seleccionar la fecha y hora de la cita">
                    <br><br/>
                    <p style="text-align:center">
                        <input type="submit" name="Registrar" id="Registrar" value="Registrar cita">
                    </p>
                </div>
            </form>
        </div>
    </body>
</html>
