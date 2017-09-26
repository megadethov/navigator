<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>All Customers</title>
</head>
<body>

<%--<jsp:include page="/header.jsp"/>--%>

<div id="container">
    <table id="customers">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>PATRONYMIC</th>
            <th>SURNAME</th>
            <th>PHONE NUMBER</th>
            <th>PHONE TYPE</th>
            <th>PHONE DESCRIPTION</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allCustomers}" var="next">
            <tr>
                <td>${next.id}</td>
                <td>${next.name}</td>
                <td>${next.patronymic}</td>
                <td>${next.surname}</td>
                <td>${next.phone.number}</td>
                <td>${next.phone.phoneType}</td>
                <td>${next.phone.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%--<jsp:include page="/footer.jsp"/>--%>

</body>

</html>
