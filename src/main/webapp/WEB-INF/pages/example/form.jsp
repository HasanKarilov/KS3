<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

  <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
  <title>New Simple Form</title>
</head>
<body>
<p>Spring MVC new simple form</p>

<form:form method="post" commandName="user" action="answer">
  <form:label path="name">Name</form:label>
  <form:input path="name"/>
  <form:label path="password">Password</form:label>
  <form:input path="password"/>
  <input type="submit" value="OK">
</form:form>
</body>
</html>
