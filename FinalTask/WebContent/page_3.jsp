<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    

    <%@page  errorPage="myerror.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/page_3.css">
    <h1>Welcome To Information Form Page</h1>
    <%@include file="messagebox/message.jsp" %>
</head>
<body>
<form  action="Controller_1" method="post">
        <div class="information">
            <div class="logo">
                <i class="fa fa-user" aria-hidden="true"></i>
            </div>
            <div class="info">
                <h2 align="center">Information</h2>
            </div>
            <div class="field_1">
                <div id="username_error"></div>
                <input type="text" name="fname" placeholder="Full Name" required/>
            </div>
            <div class="field_2">
                <div id="password_error"></div>
                <input type="email" name="email" placeholder="Email." minlength="10" required/>
            </div>
            <div class="field_3">
                <div id="password_error"></div>
                <input type="number" name="mob_no" placeholder="Mob_No." minlength="10" required/>
            </div>
            <div class="login">
            <% String marks = (String)session.getAttribute("marks");%>
            <input type="hidden" name="marks" value=<%=marks %> />
                <input type="submit" name="submit" value="Submit" />
            </div>
        </div>
    </form>
</body>
</html>