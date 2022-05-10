

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <img src="img\secretaria_salud.jpg" alt="secretaria">
        <h1>Sistema de acceso dactilar - Habitantes</h1>
        <h2>Ingrese su huella en el dispositivo para obtener acceso</h2>
        <p>Carla Morrison</p>
        <img src="imagenes/km.jpg" alt="foto_Carla" id="km">
        <br>

        <form action="consultaExpediente" method="POST">
            <button type="submit">Solicitar Acceso</button>
        </form>
    </body>
</html>
