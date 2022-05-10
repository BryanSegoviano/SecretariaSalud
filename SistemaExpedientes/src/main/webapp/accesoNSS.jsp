

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
        <img src="img/secretaria_salud.jpg" alt="">
        <h1>Sistema de acceso dactilar - Habitantes</h1>
        <h2>Ingrese el número de seguro social del <br>habitante, para consultar su expediente</h2>
        <img src="img/logo_imss.png" alt="logo_imss">
        
        
        <form action="autenticarNSS" method="POST">
            <div>
                <br>
                <label for="name">NSS:</label>
                <input type="text" name="nss">
            </div>
            <button id="btnAceptar">Acceder</button>
        </form>
        <button id="btnCancelar">Cancelar</button>
    </body>

</html>
