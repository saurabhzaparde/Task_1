  <%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
    <%@page  errorPage="myerror.jsp"%>
        <%@page import="com.dao.CrudDaoImp"%>
     <%@page import="com.pojo.Information"%>
    <%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>

<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="css/page_4.css">
     <%@include file="messagebox/message.jsp" %>
</head>

<body>
    <header>
        <div class="head">
            <h1>Your Assesment Result </h1>
        </div>
        <div class="hmain">
            <ul>
                <li><a href="index.html">HOME</a></li>
            </ul>
        </div>
    </header>
    <div class="box">
        <table border="1" cellspacing="2" cellpadding="3" align="center">
            <tr>
                <th colspan="5">Result Of Assesment</th>
            </tr>
            <tr>
                <th>Id</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Mob_No.</th>
                <th>Marks</th>
                <th>Time </th>
            </tr>
            <tr>
            <% String mob = (String)session.getAttribute("mob_no");
            ArrayList<Information> ai = new CrudDaoImp().readinformation(mob);
            for(Information in : ai){%>
                <th><%=in.getId(); %></th>
                <th><%=in.getName %></th>
                <th><%=in.getEmail %></th>
                <th><%=in.getMob %></th>
                <th><%=in.getMarks %></th>
                <th></th>
                <%} %>
            </tr>
        </table>
    </div>
</body>

</html>