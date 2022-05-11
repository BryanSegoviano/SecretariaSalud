<%-- 
    Document   : home
    Created on : 7/05/2022, 08:15:05 PM
    Author     : l3tal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form class="formularioRegistroCita" id="formularioRegistroCita" method="post" action="GuardarCita">
            <label for="start"> <b>Elija fecha para la cita:</b></label>

            <input type="date" id="fecha" name="fecha"
                   value="2022-05-01"
                   min="2022-05-01" max="2022-12-31">
            <br>           
            <br>
            <label for="text"> <b>Doctor</b></label>
            <input type="text" class="txt" id="identificadorDoctor" required="" name="identificadorDoctor" placeholder="Ingresa el ID del doctor" maxlength="100" pattern="^\d+$">
            <br>
            <br>
            <label for="id"><b>Habitante</b></label>
            <input type="text" class="txt" id="identificadorHabitante" placeholder="Ingresa el ID del Habitate" name="identificadorHabitante"  required="" required pattern="^\d+$">
            <br>
            <br>
            <br>
            <br>
            <input type="submit" value="Enviar datos" class="btn" id="btnEnviarDatos">
        </form>


    </body>
</html>