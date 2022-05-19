<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Registro de cita</title>
    </head>
    <body>
        <img src="img/banner.png" alt="secretariasalud" width="1200">
        <form class="formularioRegistroCita" id="formularioRegistroCita" method="post" action="GuardarCita">
            <h1>Registrar cita</h1>
            <label for="start"> <b>Elija fecha para la cita:</b></label>

            <input type="datetime-local" id="fecha"
                   name="fecha" value="2022-05-02T00:00"
                   min="2022-05-01T00:00" max="2022-12-31T00:00">
            <br>           
            <br>
            <label for="text"> <b>Doctor:</b></label>
            <input type="text" class="txt" id="identificadorDoctor" required="" name="identificadorDoctor" placeholder="Ingresa el ID del doctor" maxlength="100" pattern="^\d+$">
            <br>
            <br>
            <label for="id"><b>Habitante:</b></label>
            <input type="text" class="txt" id="identificadorHabitante" placeholder="Ingresa el NSS del habitante" name="identificadorHabitante"  required="" required pattern="^\d+$">
            <br>
            <br>
            <br>
            <br>
            <input type="submit" value="Registrar cita" class="btn" id="btnEnviarDatos">

        </form>
        <br/>
        <img src="img/bannerabajo.png" alt="gobiernomex" width="1200">

    </body>
</html>
