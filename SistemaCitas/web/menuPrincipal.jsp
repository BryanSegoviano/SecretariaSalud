<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Menú Principal</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body style="background-color:#F8F8F8">

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

        <div class="container">
            <h3>Sistemas de Citas</h3>
        </div>

        <div>
            <a href="https://coronavirus.gob.mx/">
                <img class=" img-responsive" src="https://www.gob.mx/cms/uploads/identity/image/36908/CARTEL-08.jpg">
            </a>
        </div>

    </body>
</html>
