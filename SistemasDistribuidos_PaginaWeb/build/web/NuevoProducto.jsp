<%-- 
    Document   : NuevoProducto
    Created on : 25 may. 2024, 17:05:49
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/26a3cc7edf.js" crossorigin="anonymous"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Jaro:opsz@6..72&display=swap" rel="stylesheet">
    </head>

    <style>
        * {
            margin: 0;
        }

        .VerLista{
            background-color: white;
            text-decoration: none;
            font-size: 3vh;
            color: black;
            text-align: center;
            border-radius: 5vh;
            border: 1px solid black;

            padding: 1vh 3vh;
            margin-right: 30vh
        }

        .VerLista:hover{
            background-color: black;
            color: white;
        }

        .sesion:hover {
            background-color: red;
        }

        .cerrarSesion {
            width: 100%;
            display: flex;
            justify-content: space-between;
            position: absolute;
            margin: 3vh 0 0 0;
        }
        .sesion {
            background-color: white;
            border-radius: 20%;
            padding: 1vh;
            text-decoration: none;
            color: black;

            margin: 0 4vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .regresar {
            background-color: white;
            border-radius: 20%;
            padding: 1vh;
            text-decoration: none;
            color: black;

            margin: 0 4vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .regresar:hover{
            background-color: greenyellow;
        }


        .titulo {
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 8vh;
            font-family: "Bebas Neue", sans-serif;
            font-weight: 400;
            font-style: normal;
        }

        .form-main{
            min-height: 60vh;
            padding:  40px 15px;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .form-content{
            backdrop-filter: blur(20px);
            width: 100%;
            max-width: 500px;
            position: relative;
            z-index: 1;
            box-shadow: 0 0 30px #000;
        }

        .form-content .boxy{
            border-color: #004a8c;
            padding: 40px 50px;
            box-shadow: 0 4px 9.4px 0.6px rgba(3,39,61,.1);
            -webkit-box-shadow: 0 4px 9.4px 0.6px rgba(3,39,61,.1);

            .form-nu .input-box{
                margin: 25px;
            }

            .form-nu .input-control{
                display: block;
                height: 45px;
                width: 100%;
                border-bottom: 1px solid #004a8c;
                color: inherit;
                font-weight: inherit;
                font-family: inherit;
                font-size: 16px;
                color: #888;
            }

            .form-nu .input-control:focus{
                outline: none;
            }

            .form-nu .btn{
                height: 45px;
                width: 100%;
                font-size: 16px;
                font-weight: 500;
                text-transform: capitalize;
                font-family: inherit;
                cursor: pointer;
                border-radius: 25px;
                user-select: none;
                background: #004a8c;
                border: none;
                color: #f6f6f6;
                position: relative;
                overflow: hidden;
                display: inline-block;
                min-width: 9.375em;
            }


        </style>

        <%  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if (session.getAttribute("user") == null) {
                response.sendRedirect("Login.jsp");
            }
        %>

        <body style="position: relative;
            justify-content: center;
            background-image: url(https://img.freepik.com/vector-premium/mosaico-poligonal-fondo-repetitivo-abstracto-ilustracion-vectorial_676179-405.jpg)">
                <div class="cerrarSesion">
                    <a href="MenuProducto.jsp" class="regresar"><i class="fa-solid fa-circle-left" style="font-size: 6vh;
                padding: 2vh 0;"></i>Regresar Pagina</a>
                <a href="CerrarSesion" class="sesion"><i class="fa-solid fa-power-off" style="font-size: 6vh;
                padding: 2vh 0;"></i>Cerrar Sesión</a>
            </div>

            <div class="cerrarSesion" style="justify-content: end;
                margin: 40vh 0vh 0vh 0vh; ">
                <a class="VerLista" href="ControlerProducto?Op=Listar">ListaProducto</a>
            </div>

            <section class="form-main">
                <div class="form-content">
                    <div class="boxy">
                        <h3 class="titulo">NUEVO PRODUCTO</h3>

                        <form class="form-nu" action="ControlerProducto" method="POST">
                            <div class="input-box">
                                <input type="text" name="Descripcion" placeholder="Descripción" class="input-control" maxlength="50" required/>
                            </div>
                            <div class="input-box">
                                <input type="number" step="0.01" name="costo" placeholder="Costo" class="input-control"/>
                            </div>
                            <div class="input-box">
                                <input type="number" step="0.01" name="precio" placeholder="Precio" class="input-control"/>
                            </div>
                            <div class="input-box">
                                <input type="number" step="1" name="cantidad" placeholder="Cantidad" class="input-control"/>
                            </div>
                            <input type="hidden" name="Op" value="NuevoProducto" />
                            <button type="submit" class="btn"><i class="fa-solid fa-plus"></i> Agregar</button>
                        </form>

                    </div>
                </div>
            </section>

        </body>

        <%@ include file="ModalSesionExpirada.jsp" %>
    </html>
