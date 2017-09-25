<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Add New Customer</title>
</head>
<body>

<%--<jsp:include page="/header.jsp"/>--%>

<div id="addNewCustomer">
    <form action="addNewCustomer" method="post" >
        <label>Enter Name</label><input type="text" name="name"/>
        <label>Enter Patronymic</label><input type="text" name="patronymic"/>
        <label>Enter Surname</label><input type="text" name="surname"/>
        <label>Enter Phone Number</label><input type="text" name="phoneNumber"/>
        <label>Select Phone Type</label>
        <select name="phoneType">
            <option>HOME</option>
            <option>MOBILE</option>
            <option>UNDEFINED</option>
        </select>
        <label>Description</label><input type="text" name="description"/>

        <input type="submit" value="Add New Customer"/>
    </form>
</div>

<%--<jsp:include page="/footer.jsp"/>--%>

</body>

</html>
