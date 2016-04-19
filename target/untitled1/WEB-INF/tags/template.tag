<%@ tag description="Template Tag" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!doctype>
<html>
<head>

    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <%--  <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%--<meta charset="utf-8">--%>
    <title>Personnel Department</title>


</head>
<body>
<div id="page_align" class="b3radius">

    <div id="header_decor">
        <div id="in_header_decor"><img src="/resources/images/emblem_logo.png" width="110" height="110"></div>
        <div id="header_h1">
            <a href="#"> <h1><span style="color: #3464FF">Автоматизированная информационная система</span></h1>
                <h1>"Ведомственная статистическая отчетность"</h1></a><br>
            <span class="h1description">Кадровая Служба</span>
        </div>

    </div>



    <div id="header">
        <div id="header_nav">
            <ul>
                <li><a href="#">&nbsp;Главная&nbsp;</a></li>
                <li><a href="#">&nbsp;Отчеты&nbsp;</a></li>
                <li><a href="#">&nbsp;Справочники&nbsp;</a></li>
                <li><a href="#">&nbsp;О системе&nbsp;</a></li>
                <li><a href="#">&nbsp;Помощь&nbsp;</a></li>
                <li><a href="/form5">Form 5</a></li>
                <li><a href="/form1">Form 1-4</a></li>
                <li><a href="#"> <h5> user: ${user.name}</h5></a> </li>
            </ul>
        </div>
    </div>


    <div id="content">

        <jsp:doBody/>
        <br>




        <h1>LOREM IPSUM DOLOR</h1>
        <h2> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
            culpa qui officia deserunt mollit anim id est laborum.
        </h2>



    </div>
    <div class="slr"></div>


</div>

</body>
</html>