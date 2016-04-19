<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<t:template>
    <c:if test = "${!empty employee}">

        <h2>     Employee</h2>
        <table border="1">
            <tr>
                <th class="headline">ID</th>
                <th class="headline">Name</th>
                <th class="headline">Surname</th>
                <th class="headline">Fullname</th>
                <th class="headline">Education</th>
                <th class="headline">Nationality</th>

            </tr>

            <c:forEach items = "${employee}" var = "book">
                <tr>
                    <th>${book.iD}</th>
                    <th>${book.name}</th>
                    <th>${book.surname}</th>
                    <th>${book.fullname}</th>
                    <th>${book.education}</th>
                    <th>${book.nationality}</th>

                    <th><a href="/deleteBook/${book.iD}">Delete</a> </th>
                </tr>

            </c:forEach>
            <tr>
                <th colspan="7"><a href="addBook"><input type="submit" value="Add Book">
                </a></th>
            </tr>
        </table>
    </c:if>



    <p> First page </p>
    <br>
    <a href="form5">Form5</a>
</t:template>