<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="accesoDatos.CitaJpaController"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="dominio.Cita"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>
<%
    EntityManagerFactory et = Persistence.createEntityManagerFactory("SistemaCitasPU");
    CitaJpaController citasDao = new CitaJpaController(et);
    List<Cita> listaCitas = citasDao.findCitaEntities();
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Consultar citas</title>
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
                    <li><a href="index.html" style="color:white"><span class="glyphicon glyphicon-log-in"></span> Cerrar sesión</a></li>                  
                </ul>
            </div>
        </nav>

        <div class="col-sm-8 table table-responsive">
            <table class="table table-hover table-bordered table-striped text-center" >
                <thead>
                    <tr>
                        <th class="text-center">Nombre del doctor</th>
                        <th class="text-center">NSS del habitante</th>
                        <th class="text-center">Fecha de la cita</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Cita listaCita : listaCitas) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                            String fechaConversion = sdf.format(listaCita.getFecha());
                            out.print(
                                    "<tr>"
                                    + "<td>" + listaCita.getDoctor() + "</td>"
                                    + "<td>" + listaCita.getNsshabitante() + "</td>"
                                    + "<td>" + fechaConversion + "</td>"
                                    + "</tr>"
                            );
                        }

                    %>
                </tbody>
            </table>
        </div>   

    </div>




    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>


</body>
</html>
