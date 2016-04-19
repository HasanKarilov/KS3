<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="utf-8"%>

<t:template>

  <h6 class="success">${success}</h6>
  <h6 class="error">${error}</h6>
  <form:form method="post" action="customerAdd" commandName="book" accept-charset="UTF-8">
    <table>
      <tr>
        <th colspan="3"><h2>Добавить нового сотрудника</h2></th>
      </tr>
      <tr>
        <th><form:label path="employeeID">
          ID сотрудника
        </form:label>
        </th>
        <th>
          <form:input path="employeeID"/> </th>
        <th class="errors">
          <form:errors path="employeeID"/>
        </th>
      </tr>

      <tr>
        <th><form:label path="employeeName">
          Имя
        </form:label></th>
        <th><form:input path="employeeName"/></th>
        <th class="errors">
          <form:errors path="employeeName"/>
        </th>
      </tr>

      <tr>
        <th><form:label path="employeeSurname">
          Фамилия
        </form:label></th>
        <th><form:input path="employeeSurname"/></th>
        <th class="errors">
          <form:errors path="employeeSurname"/>
        </th>
      </tr>

      <tr>
        <th><form:label path="employeeFullname">
          Отчество
        </form:label></th>
        <th><form:input path="employeeFullname"/></th>

      </tr>

      <tr>
        <th><form:label path="employeeEducation">
          Образование
        </form:label></th>
        <th><form:input path="employeeEducation"/></th>
        <th>
          <form:errors path="employeeEducation"/>
        </th>
      </tr>

      <tr>
        <th><form:label path="employeeNationality">
          Национальность
        </form:label></th>
        <th><form:input path="employeeNationality"/></th>
        <th>
          <form:errors path="employeeNationality"/>
        </th>
      </tr>



      <tr>
        <th colspan="7"><input type="submit" value="Add Book"/>
      </th>
      </tr>
    </table>
  </form:form>
<br>
</t:template>
