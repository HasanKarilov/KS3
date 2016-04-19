<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="utf-8" contentType="text/html; charset=UTF-8" language="java" %>

<t:template>
  <p> ${user.name}</p>

  <h2>     Должности</h2>
  <table border="1">
    <tr>
      <th class="headline">ID должности</th>
      <th class="headline">Название должности</th>
      <th class="headline">Группа</th>
      <th class="headline">Категории</th>

    </tr>

    <c:forEach items = "${position}" var="post">
      <tr>
        <th>${post.positionId}</th>
        <th>${post.positionName}</th>
        <th>${post.positionGroup}</th>
        <th>${post.positionCategory}</th>

        <th><a href="/deletePosition/${post.positionId}">Delete</a> </th>
          <%--<th><a href="${editUrl}">Edit</a></th>--%>
      </tr>

    </c:forEach>
    <tr>

      <th colspan="7">
        <label for="dob"> Добавить новую должность</label>
        <a href="/positionAdd"><input type="submit" value="Добавить" id="dob">
      </a></th>
    </tr>
  </table>



  <p> First page </p>
  <br>
  <a href="form5">Form5</a>
</t:template>
