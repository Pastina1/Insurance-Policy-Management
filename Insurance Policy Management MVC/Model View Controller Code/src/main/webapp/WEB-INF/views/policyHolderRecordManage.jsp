<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Policy Holder Record Manager</title>
</head>
<body>
<div align="center">
  <h2>Policy Holder Record Manager</h2>
  <form method="get" action="searchPolicyHolderRecord">
    <input type="text" name="keyword" /> &nbsp;
    <input type="submit" value="Search" />
  </form>
  <h3><a href="${pageContext.request.contextPath}/newPolicyHolderRecord">New PolicyHolderRecord</a></h3>
  <table border="1" cellpadding="5">
    <tr>
      <th>ID</th>
      <th>Policy Number</th>
      <th>Customer</th>
      <th>Applied Date</th>
      <th>Status</th>
      <th>Start Date</th>
      <th>End Date</th>
      <th>Premium</th>
      <th>Other Details</th>
      <th>Agent</th>
    </tr>
    <c:forEach items="${listPolicyHolderRecord}" var="policyHolderRecord">
      <tr>
        <td>${policyHolderRecord.id}</td>
        <td>${policyHolderRecord.policyNumber}</td>
        <td>${policyHolderRecord.customer}</td>
        <td>${policyHolderRecord.appliedDate}</td>
        <td>${policyHolderRecord.status}</td>
        <td>${policyHolderRecord.startDate}</td>
        <td>${policyHolderRecord.endDate}</td>
        <td>${policyHolderRecord.premium}</td>
        <td>${policyHolderRecord.otherDetails}</td>
        <td>${policyHolderRecord.agent}</td>
        <td>
          <a href="${pageContext.request.contextPath}/editPolicyHolderRecord?id=${policyHolderRecord.id}">Edit</a>
          &nbsp;&nbsp;&nbsp;
          <a href="${pageContext.request.contextPath}/deletePolicyHolderRecord?id=${policyHolderRecord.id}">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>