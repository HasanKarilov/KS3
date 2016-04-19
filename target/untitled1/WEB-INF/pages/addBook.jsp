<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<t:template>

  <form:form method="post" action="addBook" commandName="book" >
    <table>
      <tr>
        <th colspan="2"><h2>Employee</h2></th>
      </tr>
      <tr>
        <th><form:label path="iD">
          ID
        </form:label>
        </th>
        <th>
          <form:input path="iD"/> </th>
      </tr>

      <tr>
        <th><form:label path="name">
          Name
        </form:label></th>
        <th><form:input path="name"/></th>
      </tr>

      <tr>
        <th><form:label path="surname">
          Surname
        </form:label></th>
        <th><form:input path="surname"/></th>
      </tr>

      <tr>
        <th><form:label path="fullname">
          Fullname
        </form:label></th>
        <th><form:input path="fullname"/></th>
      </tr>

      <tr>
        <th><form:label path="education">
          Education
        </form:label></th>
        <th><form:input path="education"/></th>
      </tr>

      <tr>
        <th><form:label path="nationality">
          Nationality
        </form:label></th>
        <th><form:input path="nationality"/></th>
      </tr>



      <tr>
        <th colspan="7"><input type="submit" value="Add Book"/>
      </th>
      </tr>
    </table>
  </form:form>
<br>
</t:template>
