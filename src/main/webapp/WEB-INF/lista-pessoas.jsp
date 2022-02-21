<%@ page import="br.com.letscode.letscodedemo.modelo.Pessoa" %>
<%@ page import="java.util.List" %>

<%
    //Scriplets
    //String titulo = "Lista de pesssoas";
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
<%--    <% out.println(titulo); %> = <%= titulo %>  --%>
<h3> ${ titulo } </h3>
    <% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas"); %>
    <% for (Pessoa pessoa: pessoas) { %>

    <ul>
        <li>nome: <%= pessoa.getNome() %></li>
        <li>sobrenome: <%= pessoa.getSobrenome() %></li>
        <li>idade: <%= pessoa.getIdade() %></li>
        <li>data: <%= pessoa.getData() %></li>
    </ul>
    <% } %>


</body>
</html>