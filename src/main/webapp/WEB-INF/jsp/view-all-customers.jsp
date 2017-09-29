<%@ page contentType="text/html;charset=UTF-8" language="java" import="jquery.datatables.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>All Customers</title>
    <link rel="stylesheet" href="<spring:url value="/resources/css/style.css"/>" type="text/css"/>

    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_page.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_table.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value="/resources/media/dataTables/demo_table_jui.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value="/resources/media/themes/base/jquery-ui.css"/>" type="text/css"
          media="all"/>
    <link rel="stylesheet" href="<spring:url value="/resources/media/themes/smoothness/jquery-ui-1.7.2.custom.css"/>"
          type="text/css" media="all"/>

    <%--<script src="<spring:url value="/resources/js/jquery-1.4.4.min.js"/>" type="text/javascript"></script>--%>
    <script src="<spring:url value="http://code.jquery.com/jquery-latest.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/js/jquery.dataTables.min.js"/>" type="text/javascript"></script>

    <script src="<spring:url value="/resources/js/script.js"/>" type="text/javascript"></script>

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
            <th hidden>ID</th>
            <th>NAME</th>
            <th>PATRONYMIC</th>
            <th>SURNAME</th>
            <th hidden>PHONE ID</th>
            <th>PHONE NUMBER</th>
            <th>PHONE TYPE</th>
            <th>PHONE DESCRIPTION</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${allCustomers}" var="next">
            <tr>
                <td hidden>${next.id}</td>
                <td>${next.name}</td>
                <td>${next.patronymic}</td>
                <td>${next.surname}</td>
                <td hidden>${next.phone.id}</td>
                <td class="edit" data-id="${next.phone.id}" data-name="number"
                    contenteditable="true">${next.phone.number}</td>

                <td class="edit" data-id="${next.phone.id}" data-name="phoneType"
                    contenteditable  title="HOME, MOBILE or UNDEFINE">${next.phone.phoneType}</td>

                <td class="edit" data-id="${next.phone.id}" data-name="description"
                    contenteditable="true">${next.phone.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div align="center">
        <input id="update" type="button" value="SAVE CHANGE" style="color: #cd0a0a"/>
    </div>

    <%--Loader--%>
    <div id="loader"><span></span></div>
    <div id="mes-edit"></div>

</div>

<%--<jsp:include page="/footer.jsp"/>--%>

</body>

</html>
