<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>

  <link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">

  <title>Home</title>
</head>
<body>


<form:form method = "post" commandName="user" action="customerStart" class="box login">
  <div id="img">
    <img src="/resources/images/emblem_logo.png" width="110" height="110" align="center">
    <h1><span style="color: #3464FF">АИС:</span>ВСО</h1>
  </div>
  <fieldset class="boxBody">
    <form:label path="name">Пользователь</form:label>
    <form:input path="name"  tabindex="1" placeholder="имя пользователя" required="please"/>
    <form:errors path="name"/>
    <label>
      <a href="#" class="rLink" tabindex="5">Забыли пароль?</a>
      Пароль
    </label>
    <form:input path="password" type="password" tabindex="2"  placeholder="ваш пароль" required="please" />
    <form:errors path="password"/>
  </fieldset>
  <footer>
    <label><input type="checkbox" tabindex="3">Запомнить меня</label>
    <input type="submit" class="btnLogin" value="Login" tabindex="4">
  </footer>
  <div id="author">
    <h1>Manas Programmers</h1>
  </div>
</form:form>


</body>
</html>
