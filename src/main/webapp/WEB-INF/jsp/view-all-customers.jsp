<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>All Customers</title>
    <link href="styles.css" rel="Stylesheet" type="text/css"/>
</head>
<body>

<%--<jsp:include page="/header.jsp"/>--%>

<div id="customers">
    <ul>
        <c:forEach items="${allCustomers}" var="next">

            <li>
                <p>${next.name}</p>
            </li>

        </c:forEach>

    </ul>
</div>

<%--<jsp:include page="/footer.jsp"/>--%>

</body>

</html>
