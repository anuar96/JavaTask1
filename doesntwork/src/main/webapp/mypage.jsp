<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devcolibri.com</title>
</head>
<body>
<h1>Servlet Parameters demo</h1>
<form action = "MainServlet" method = "GET">
    <table border = "0">
        <tr>
            <td><b>Parameter1</b></td>
            <td><input type = "text" name = "parameter1"
                       value = "http://localhost/some-test-url" size = "70"/></td>
        </tr>

        <tr>
            <td colspan = "2"><input type = "submit" value = "triple"/></td>
        </tr>
    </table>
</form>
</body>
</html>
