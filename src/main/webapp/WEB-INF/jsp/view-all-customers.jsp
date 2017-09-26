<%@ page contentType="text/html;charset=UTF-8" language="java" import="jquery.datatables.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>All Customers</title>


    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_page.css"/>" type="text/css" />
    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_table.css"/>" type="text/css" />
    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_table_jui.css"/>" type="text/css" />
    <link rel="stylesheet" href="<spring:url value="/resources/media/themes/base/jquery-ui.css"/>" type="text/css" media="all" />
    <link rel="stylesheet" href="<spring:url value="/resources/media/themes/smoothness/jquery-ui-1.7.2.custom.css"/>" type="text/css" media="all" />

    <script src="<spring:url value="/resources/js/jquery-1.4.4.min.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/js/jquery.dataTables.min.js"/>" type="text/javascript"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#customers").dataTable({
                "bPaginate": false,
                "bJQueryUI": true
            });
        });
    </script>
</head>
<body>

<%--<jsp:include page="/header.jsp"/>--%>

<div id="container">
    <table id="customers" class="display">
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
