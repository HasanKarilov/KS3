<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="utf-8" contentType="text/html; charset=UTF-8" language="java" %>

<t:template>
    <%--<c:url var = "addEmployee" value="/customerAdd"/>--%>
    <%--<c:url var="editUrl" value="/editCustomer?id=${employee.employeeID}" />--%>
    <p> ${user.name}</p>

        <h2>     Сотрудники</h2>
        <table border="1">
            <tr>
                <th class="headline">ID сотрудника</th>
                <th class="headline">Имя</th>
                <th class="headline">Фамилия</th>
                <th class="headline">Отчество</th>
                <th class="headline">Образование</th>
                <th class="headline">Национальность</th>

            </tr>

            <c:forEach items = "${employee}" var ="employee">
                <tr>
                    <th>${employee.employeeID}</th>
                    <th>${employee.employeeName}</th>
                    <th>${employee.employeeSurname}</th>
                    <th>${employee.employeeFullname}</th>
                    <th>${employee.employeeEducation}</th>
                    <th>${employee.employeeNationality}</th>

                    <th><a href="/deleteBook/${employee.employeeID}">Delete</a> </th>
                    <%--<th><a href="${editUrl}">Edit</a></th>--%>
                </tr>

            </c:forEach>
            <tr>
                <th colspan="7"><a href="/customerAdd"><input type="submit" value="Add Book">
                </a></th>
            </tr>
        </table>



    <p> First page </p>
    <br>
    <a href="form5">Form5</a>
</t:template>