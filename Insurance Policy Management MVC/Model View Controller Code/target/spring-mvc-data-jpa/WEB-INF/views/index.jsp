<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to the Insurance Management System</title>
</head>
<body>
<h2>${message}</h2>
<a href="${pageContext.request.contextPath}/home">Go to Home Page for welcome message</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/policymanage">Go to Policy Manager Page</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/policyHolderRecordManage">Go to Policy Holder Record Manager Page</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/customermanage">Go to Customer Manager Page</a>
</body>
</html>
