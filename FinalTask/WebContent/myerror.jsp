<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
     background-color: rgba(88, 64, 241, 0.324);
     background-size: cover;
}
h1{
text-align: center;

}
h2{
text-align: center;
}
h4{
text-align: center;
}
</style>
</head>
<body>

<h1>Something went wrong, <h1><br>
<h2>plzz wait we will get back to you soon<h2><br>
<h4><%=exception%><h4>
</body>
</html>
