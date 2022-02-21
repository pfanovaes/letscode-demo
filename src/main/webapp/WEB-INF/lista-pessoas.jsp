<%@ page import="br.com.letscode.letscodedemo.modelo.Pessoa" %>
<%@ page import="java.util.List" %>

<%
    String titulo = "Lista de pesssoas";
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Lista de pessoas</title>
</head>
<body>
    <% out.println(titulo); %>
    <% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas"); %>
    <ul>
        <li>nome: </li>
        <li>sobrenome: </li>
        <li>idade: </li>
        <li>data: </li>
    </ul>

</body>
</html>