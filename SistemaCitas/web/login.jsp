<%-- 
    Document   : login
    Created on : 21/04/2022, 05:48:58 PM
    Author     : l3tal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                    <h1>Iniciar Sesión</h1>
                    <link rel="stylesheet" type="text/css" href="login.css" />
                    <p>Ingresa tu usuario y contraseña para iniciar sesión.</p>
                    <hr>
                    <label for="uname"><b>Nombre de Usuario</b></label>
                    <input type="text" class="txt" id="txtUsuario" name="txtUsuario" placeholder="Nombre de Usuario">

                    <label for="psw"><b>Contraseña</b></label>
                    <input type="password" class="txt" id="txtUContrasena"  name="txtUContrasena" placeholder="Contraseña">


                </div>
            </form>
            <form method="POST" action="home.jsp">
                <input type="submit" value="Iniciar Sesion"/>
            </form>

        </div>


    </body>
</html>
