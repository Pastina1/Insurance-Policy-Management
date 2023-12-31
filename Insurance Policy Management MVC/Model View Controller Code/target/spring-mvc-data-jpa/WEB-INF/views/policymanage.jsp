<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Policy Manager</title>
</head>
<body>
<div align="center">
  <h2>Policy Manager</h2>
  <form method="get" action="search">
    <input type="text" name="keyword" /> &nbsp;
    <input type="submit" value="Search" />
  </form>
  <h3><a href="${pageContext.request.contextPath}/new">New Policy</a></h3>
  <table border="1" cellpadding="5">
    <tr>
      <th>ID</th>
      <th>Policy Number</th>
      <th>Policy Type</th>
      <th>Policy Description</th>
      <th>Agent List</th>
    </tr>
    <c:forEach items="${listPolicy}" var="policy">
      <tr>
        <td>${policy.id}</td>
        <td>${policy.policyNumber}</td>
        <td>${policy.policyType}</td>
        <td>${policy.policyDescription}</td>
        <td>${policy.agentList}</td>
        <td>
          <a href="${pageContext.request.contextPath}/edit?id=${policy.id}">Edit</a>
          &nbsp;&nbsp;&nbsp;
          <a href="${pageContext.request.contextPath}/delete?id=${policy.id}">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>