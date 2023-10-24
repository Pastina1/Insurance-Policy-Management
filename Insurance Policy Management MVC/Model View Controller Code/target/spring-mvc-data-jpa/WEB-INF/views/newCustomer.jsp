<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Customer</title>
</head>
<body>
<div align="center">
    <h2>New Customer</h2>
    <form:form action="saveCustomer" method="post" modelAttribute="customer">
        <table border="0" cellpadding="5">
            <tr>
                <td>Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Contact Number: </td>
                <td><form:input path="contactNumber" /></td>
                <td th:if="${fields.hasErrors('contactNumber')}" th:errors="*{contactNumber}">Contact Number Error</td>
            </tr>
            <tr>
                <td>Email Address: </td>
                <td><form:input path="emailAddress" /></td>
            </tr>
            <tr>
                <td>Sex: </td>
                <td><form:input path="sex" /></td>
            </tr>
            <tr>
                <td>Date of Birth: </td>
                <td><form:input path="dateOfBirth" /></td>
            </tr>
            <tr>
                <td>Employment Status </td>
                <td><form:input path="employmentStatus" /></td>
            </tr>
            <tr>
                <td>Risk Rate: </td>
                <td><form:input path="riskRate" /></td>
            </tr>
            <tr>
                <td>Agent: </td>
                <td><form:input path="agent" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>