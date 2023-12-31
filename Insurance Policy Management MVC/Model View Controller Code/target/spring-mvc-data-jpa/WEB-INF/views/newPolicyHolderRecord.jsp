<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>New Policy Holder Record</title>
</head>
<body>
<div align="center">
  <h2>New Policy Holder Record</h2>
  <form:form action="savePolicyHolderRecord" method="post" modelAttribute="policyHolderRecord">
    <table border="0" cellpadding="5">
      <tr>
        <td>Policy Number: </td>
        <td><form:input path="policyNumber" /></td>
      </tr>
      <tr>
        <td>Customer: </td>
        <td><form:input path="customer" /></td>
      </tr>
      <tr>
        <td>Applied Date: </td>
        <td><form:input path="appliedDate" /></td>
      </tr>
      <tr>
        <td>Status: </td>
        <td><form:input path="status" /></td>
      </tr>
      <tr>
        <td>Start Date: </td>
        <td><form:input path="startDate" /></td>
      </tr>
      <tr>
        <td>End Date: </td>
        <td><form:input path="endDate" /></td>
      </tr>
      <tr>
        <td>Premium: </td>
        <td><form:input path="premium" /></td>
      </tr>
      <tr>
        <td>Other Details: </td>
        <td><form:input path="otherDetails" /></td>
      </tr>
      <tr>
        <td>Agent: </td>
        <td><form:input path="agent" /></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" value="Save"></td>
      </tr>
    </table>
  </form:form>
</div>
</body>
</html>