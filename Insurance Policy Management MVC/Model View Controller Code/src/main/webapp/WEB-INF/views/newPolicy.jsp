<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>New Policy</title>
</head>
<body>
<div align="center">
  <h2>New Policy</h2>
  <form:form action="save" method="post" modelAttribute="policy">
    <table border="0" cellpadding="5">
      <tr>
        <td>Policy Number: </td>
        <td><form:input path="policyNumber" /></td>
      </tr>
      <tr>
        <td>Policy Type: </td>
        <td><form:input path="policyType" /></td>
      </tr>
      <tr>
        <td>Policy Description: </td>
        <td><form:input path="policyDescription" /></td>
      </tr>
      <tr>
        <td>Agent List: </td>
        <td><form:input path="agentList" /></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" value="Save"></td>
      </tr>
    </table>
  </form:form>
</div>
</body>
</html>