

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Secretaria de Salud</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <img src="img/secretaria_salud.jpg" alt="secretaria_salud">
        <h1>Sistema de Expedientes</h1>
        <img src="img/logo_imss.png" alt="logo_imss">
        <h2>Ingrese su usuario y contraseña</h2>
        <div id="container">
            <form action="autenticarSesion" method="POST">
                
                <label for="name">Usuario:</label>
                <input type="text" name="usuario">

                <p><label for="username">Contraseña:</label>
                    <input type="password" name="contrasenia">

                    <br/><br/>
                    <button id="btnAceptar">Acceder</button>
            </form>       
            <button id="btnCancelar">Cancelar</button>
        </div>

    </body>
</html>
