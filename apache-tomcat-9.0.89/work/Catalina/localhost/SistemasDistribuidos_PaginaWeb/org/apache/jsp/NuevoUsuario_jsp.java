/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-25 23:35:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ModalSesionExpirada.jsp", Long.valueOf(1716674816459L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/26a3cc7edf.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Jaro:opsz@6..72&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .VerLista{\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("                font-size: 3vh;\r\n");
      out.write("                color: black;            \r\n");
      out.write("                text-align: center;\r\n");
      out.write("                border-radius: 5vh;\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("                \r\n");
      out.write("                padding: 1vh 3vh;\r\n");
      out.write("                margin-right: 30vh\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .VerLista:hover{\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .sesion:hover {\r\n");
      out.write("            background-color: red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cerrarSesion {\r\n");
      out.write("            width: 100%;    \r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            margin: 3vh 0 0 0;\r\n");
      out.write("        }\r\n");
      out.write("        .sesion {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 20%;\r\n");
      out.write("            padding: 1vh;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            \r\n");
      out.write("            margin: 0 4vh;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .regresar {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 20%;\r\n");
      out.write("            padding: 1vh;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            \r\n");
      out.write("            margin: 0 4vh;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        .regresar:hover{\r\n");
      out.write("            background-color: greenyellow;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        .titulo {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            font-size: 8vh;\r\n");
      out.write("            font-family: \"Bebas Neue\", sans-serif;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .form-main{\r\n");
      out.write("            min-height: 60vh;\r\n");
      out.write("            padding:  40px 15px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .form-content{  \r\n");
      out.write("            backdrop-filter: blur(20px);\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            max-width: 500px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            box-shadow: 0 0 30px #000;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .form-content .boxy{\r\n");
      out.write("            border-color: #004a8c;\r\n");
      out.write("            padding: 40px 50px;\r\n");
      out.write("            box-shadow: 0 4px 9.4px 0.6px rgba(3,39,61,.1);\r\n");
      out.write("            -webkit-box-shadow: 0 4px 9.4px 0.6px rgba(3,39,61,.1);\r\n");
      out.write("            \r\n");
      out.write("        .form-nu .input-box{\r\n");
      out.write("            margin: 25px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .form-nu .input-control{\r\n");
      out.write("            display: block;\r\n");
      out.write("            height: 45px;\r\n");
      out.write("            width: 100%;   \r\n");
      out.write("            border-bottom: 1px solid #004a8c;\r\n");
      out.write("            color: inherit;\r\n");
      out.write("            font-weight: inherit;\r\n");
      out.write("            font-family: inherit;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            color: #888;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-nu .input-control:focus{\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .form-nu .btn{\r\n");
      out.write("            height: 45px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            text-transform: capitalize;\r\n");
      out.write("            font-family: inherit;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            background: #004a8c;\r\n");
      out.write("            border: none;\r\n");
      out.write("            color: #f6f6f6;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            min-width: 9.375em;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("    ");
  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");  
            if (session.getAttribute("user")==null){
                response.sendRedirect("Login.jsp");
            }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <body style=\"position: relative; justify-content: center; background-image: url(https://img.freepik.com/vector-premium/mosaico-poligonal-fondo-repetitivo-abstracto-ilustracion-vectorial_676179-405.jpg)\">\r\n");
      out.write("        <div class=\"cerrarSesion\">\r\n");
      out.write("            <a href=\"MenuUsuario.jsp\" class=\"regresar\"><i class=\"fa-solid fa-circle-left\" style=\"font-size: 6vh; padding: 2vh 0;\"></i>Regresar Pagina</a>\r\n");
      out.write("            <a href=\"CerrarSesion\" class=\"sesion\"><i class=\"fa-solid fa-power-off\" style=\"font-size: 6vh; padding: 2vh 0;\"></i>Cerrar Sesión</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"cerrarSesion\" style=\"justify-content: end; margin: 40vh 0vh 0vh 0vh;\">\r\n");
      out.write("            <a class=\"VerLista\" href=\"ControlerUsuario?Op=Listar\">ListaUsuario</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"form-main\">\r\n");
      out.write("            <div class=\"form-content\">\r\n");
      out.write("                <div class=\"boxy\">\r\n");
      out.write("                    <h3 class=\"titulo\">NUEVO USUARIO</h3>\r\n");
      out.write("\r\n");
      out.write("                    <form class=\"form-nu\" action=\"NuevoUsuario\" method=\"POST\">\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"text\" name=\"apellidos\" placeholder=\"Apellidos\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"text\" name=\"nombres\" placeholder=\"Nombres\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"text\" name=\"direccion\" placeholder=\"Dirección\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"text\" name=\"dni\" placeholder=\"DNI\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"phone\" name=\"telefono\" placeholder=\"Telefono\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"phone\" name=\"movil\" placeholder=\"Movil\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"text\" name=\"idUsuario\" placeholder=\"USUARIO\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Contraseña\" class=\"input-control\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn\"><i class=\"fa-solid fa-user-plus\"></i> Agregar</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"myModal\" class=\"modal\">\r\n");
      out.write("<div class=\"modal-content\">\r\n");
      out.write("    <p>Tu sesión expirará en <span id=\"countdown\"></span> segundos.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .modal {\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            overflow: auto;\r\n");
      out.write("            background-color: rgb(0,0,0);\r\n");
      out.write("            background-color: rgba(0,0,0,0.4);\r\n");
      out.write("            padding-top: 60px;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-content {\r\n");
      out.write("            background-color: #fefefe;\r\n");
      out.write("            margin: 5% auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border: 1px solid #888;\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        span{\r\n");
      out.write("            font-size: 3.5vh;\r\n");
      out.write("            margin: 0.5vh;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    /* \r\n");
      out.write(" * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license\r\n");
      out.write(" * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template\r\n");
      out.write(" */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var totalInactiveTime = 10; // 10 segundos\r\n");
      out.write("        var warningTime = 5; // 5 segundos antes del logout\r\n");
      out.write("        var time, warningTimer;\r\n");
      out.write("\r\n");
      out.write("        window.onload = function() {\r\n");
      out.write("            resetTimer();\r\n");
      out.write("            document.addEventListener('mousemove', resetTimer, false);\r\n");
      out.write("            document.addEventListener('keypress', resetTimer, false);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function startLogoutWarning() {\r\n");
      out.write("            var countdown = warningTime;\r\n");
      out.write("            var modal = document.getElementById(\"myModal\");\r\n");
      out.write("            var countdownElement = document.getElementById(\"countdown\");\r\n");
      out.write("            modal.style.display = \"block\";\r\n");
      out.write("            countdownElement.innerText = countdown;\r\n");
      out.write("\r\n");
      out.write("            warningTimer = setInterval(function() {\r\n");
      out.write("                countdown--;\r\n");
      out.write("                countdownElement.innerText = countdown;\r\n");
      out.write("                if (countdown < 0) {\r\n");
      out.write("                    clearInterval(warningTimer);\r\n");
      out.write("                    logout();\r\n");
      out.write("                }\r\n");
      out.write("            }, 1000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function logout() {\r\n");
      out.write("            alert(\"Tu sesión ha expirado.\");\r\n");
      out.write("            window.location.href = 'CerrarSesion'; /*Es el controlador que hice para que se cierre */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function resetTimer() {\r\n");
      out.write("            clearTimeout(time);\r\n");
      out.write("            clearInterval(warningTimer); // Detener el contador de advertencia si está en curso\r\n");
      out.write("            var modal = document.getElementById(\"myModal\");\r\n");
      out.write("            modal.style.display = \"none\"; // Ocultar el modal si se muestra\r\n");
      out.write("            time = setTimeout(startLogoutWarning, (totalInactiveTime - warningTime) * 1000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
      out.write("      ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}