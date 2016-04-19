<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="utf-8"%>

<t:template>

  <h6 class="success">${success}</h6>
  <h6 class="error">${error}</h6>

  <form:form method="post" action="positionAdd" commandName="posts" accept-charset="UTF-8">
    <table>
      <tr>
        <th colspan="3"><h2>Добавить новую должность</h2></th>
      </tr>
      <tr>
        <th><form:label path="positionName">
          Название должности
        </form:label>
        </th>
        <th>
          <form:input path="positionName"/> </th>
        <th class="errors">
          <form:errors path="positionName"/>
        </th>
      </tr>

      <tr>
        <th><form:label path="positionGroup">
          Название group
        </form:label>
        </th>
        <th>
          <form:input path="positionGroup"/> </th>
      </tr>

      <tr>
        <th><form:label path="positionCategory">
          Название category
        </form:label>
        </th>
        <th>
          <form:input path="positionCategory"/> </th>
      </tr>


      <tr>
        <th colspan="3"><input type="submit" value="Добавить"/>
        </th>
      </tr>
    </table>
  </form:form>
  <br>
</t:template>
