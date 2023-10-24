<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer Search Result</title>
</head>
<body>
<div align="center">
    <h2>Customer Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Contact Number</th>
            <th>Email Address</th>
            <th>Sex</th>
            <th>Date of Birth</th>
            <th>Employment Status</th>
            <th>Risk Rate</th>
            <th>Agent</th>
        </tr>
        <c:forEach items="${customerResult}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>${customer.contactNumber}</td>
                <td>${customer.emailAddress}</td>
                <td>${customer.sex}</td>
                <td>${customer.dateOfBirth}</td>
                <td>${customer.employmentStatus}</td>
                <td>${customer.riskRate}</td>
                <td>${customer.agent}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>