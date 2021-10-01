<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ page import="com.yoshikawa.VenturaRh.models.login" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/styleHome.css">
    <title>CheckUp Exames</title>
</head>
<body>

<div class="wrapper">

    <%
        String msgAlerta = (String) request.getAttribute("mensagemAlerta");
    %>

    <% if(msgAlerta != null) {%>
    <div class="alert alert-danger">
        <strong>Problema!!!</strong> <%=msgAlerta%>

    </div>

    <%}%>

    <div class="container" >






        <form action="loginUsuarioController" method="post" class="formulario">
            <h2>Tela de Login</h2>


            <div class="form-group">
                <label>Login:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>

            <div class="form-group">
                <label>Senha:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Insira sua senha" name="senha">
            </div>


            <button type="submit" class="btn btn-default">Entrar</button>
        </form>
    </div>
</div>
</body>
</html>