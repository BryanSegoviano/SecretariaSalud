<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar expedientes</title>
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

        <iframe src="http://localhost:8080/consultaExpediente" width="100%" height="850" style="border:none;"></iframe>

        <img src="img/bannerabajo.png" alt="gobiernomex" width="1900">
    </body>
</html>
