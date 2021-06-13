<%--
  Created by IntelliJ IDEA.
  User: Edu
  Date: 17.01.2021
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>tab1</title>
</head>
<body>
    <table border="1">
        <c:forEach begin="1" end="${size}" var="i">
            <tr>
            <c:forEach begin="1" end="${size}" var="j">
                <td>${i*j}</td>
            </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
