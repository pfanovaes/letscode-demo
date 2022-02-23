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
    <table width="500" border=" "1px">
        <tr>
            <th>NOME</th>
            <th>SOBRENOME</th>
            <th>IDADE</th>
            <th>DATA</th>
        </tr>

    <% for (Pessoa pessoa: pessoas) { %>
        <tr>
            <td><%= pessoa.getNome() %></td>
            <td><%= pessoa.getSobrenome() %></td>
            <td><%= pessoa.getIdade() %></td>
            <td><%= pessoa.getData() %></td>
        </tr>

    <% } %>

    </table>
    <button onclick="window.location.href='/app/controlador?acao=criar-pessoas-form'">
        CADASTRAR NOVO
    </button>
</body>
</html>