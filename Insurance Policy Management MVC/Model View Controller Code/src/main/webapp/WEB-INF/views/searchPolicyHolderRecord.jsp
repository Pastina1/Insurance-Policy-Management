<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Search Result</title>
</head>
<body>
<div align="center">
  <h2>Search Result</h2>
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
    <c:forEach items="${policyHolderRecordResult}" var="policyHolderRecord">
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
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>