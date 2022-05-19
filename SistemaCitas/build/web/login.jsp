<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Secretaria de Salud</title>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate ");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
        %>
    </head>
    <body>
        <div class="cuerpoFormulario" id="cuerpoFormulario">
            <form class="formulariologin" id="formulariologin" method="post" >

                <div class="container" id="cuerpoFormulario">
                    <img src="img/banner.png" alt="secretariasalud" width="1200">
                    <h1>Sistema de Expedientes</h1>
                    <h1>Iniciar Sesión</h1>
                    <img src="img/imss.png" alt="IMSS">
                    <link rel="stylesheet" type="text/css" href="login.css" />
                    <p>Ingresa tu usuario y contraseña para iniciar sesión.</p>
                    <hr>
                    <label for="uname"><b>Nombre de Usuario</b></label>
                    <input type="text" class="txt" id="txtUsuario" name="txtUsuario" placeholder="Nombre de Usuario" required="">
                    <br/><br/>
                    <label for="psw"><b>Contraseña</b></label>
                    <input type="password" class="txt" id="txtUContrasena"  name="txtUContrasena" placeholder="Contraseña" required="">

                </div>
            </form>
            <br/>
            <form method="POST" action="menuPrincipal.jsp">
                <input type="submit" value="Iniciar Sesion" id="boton"/> 
            </form>
            <br/>
            <img src="img/bannerabajo.png" alt="gobiernomex" width="1200">
        </div>


    </body>
</html>
