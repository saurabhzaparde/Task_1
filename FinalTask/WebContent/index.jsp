<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    

    <%@page  errorPage="myerror.jsp"%>
     <%@page import="com.dao.CrudDaoImp"%>
     <%@page import="com.pojo.Questions"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="java.util.ArrayList"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <title>Test Page</title>
    <link rel="stylesheet" href="css/page_2.css">
    <div class="head">
        <h1>Welcome To Assessment Page</h1>
    </div>
</head>
<body>
<%@include file="messagebox/message.jsp" %>
 
    <div class="title">
        <form name="Question" action="Controller" method="post">
      <sql:setDataSource 
           var="con" driver="com.mysql.cj.jdbc.Driver" 
           url="jdbc:mysql://localhost:3308/"
           user="root"
           password="sql_me"
       />
       <sql:query var="myresultset" dataSource="${con}">
            select fullname , mob_no , marks from task.Information where marks = 5 ;
       </sql:query>
       <c:forEach var="topper" items="${myresultset.rows}">
       <h1><table border="1" cellspacing="2" cellpadding="2" align="center">
        <tr>
            <th colspan="3">Top Scorer in Assessment</th>
            </tr>
            <tr>
                <th>Full Name</th>
                <th>Mob_No.</th>
                <th>Marks</th>
            </tr>
            <tr>
            <th> ${topper.fullname }</th>
            <th>${topper.mob_no }</th>
            <th> ${topper.marks }</th>
            </tr>
       </table>
       </h1>
         </c:forEach>
      <sql:query var="myresultset" dataSource="${con}">
            select * from task.questions;
       </sql:query>
      <c:forEach var="mydata" items="${myresultset.rows}">
       <input type="text" name="qid" value="${mydata.qid}"/>
            <h4>QUE ${mydata.qid}.${mydata.question}</h4>
         <c:set var="val" value="${mydata.qid}"></c:set>
             
            <input type="hidden" name="question" value="${mydata.question}"/>
           
            <ul>
                <li><label>
                
                <c:if test="${val==1}">
                
            <input type="radio" name="Option_1" value="${mydata.answer_1}" required/> ${mydata.answer_1}
        </label>
                </li>
                <li><label>
                <input type="radio" name="Option_1" value="${mydata.answer_2}" required/> ${mydata.answer_2}
            </label>
                </li>
                <li><label>
                    <input type="radio" name="Option_1" value="${mydata.answer_3}" required/> ${mydata.answer_3}
                </label>
                </li>
                <li><label>
                        <input type="radio" name="Option_1" value="${mydata.answer_4}" required/>${mydata.answer_4}
                   </c:if>
                   <c:if test="${val==2}">
                  
                   <input type="radio" name="Option_2" value="${mydata.answer_1}" required/> ${mydata.answer_1}
        </label>
                </li>
                <li><label>
                <input type="radio" name="Option_2" value="${mydata.answer_2}" required/> ${mydata.answer_2}
            </label>
                </li>
                <li><label>
                    <input type="radio" name="Option_2" value="${mydata.answer_3}" required/> ${mydata.answer_3}
                </label>
                </li>
                <li><label>
                        <input type="radio" name="Option_2" value="${mydata.answer_4}" required/>${mydata.answer_4}
                   </c:if>
                  
                   
                   <c:if test="${val==3}">
               
                   <input type="radio" name="Option_3" value="${mydata.answer_1}" required/> ${mydata.answer_1}
        </label>
                </li>
                <li><label>
                <input type="radio" name="Option_3" value="${mydata.answer_2}" required/> ${mydata.answer_2}
            </label>
                </li>
                <li><label>
                    <input type="radio" name="Option_3" value="${mydata.answer_3}" required/> ${mydata.answer_3}
                </label>
                </li>
                <li><label>
                        <input type="radio" name="Option_3" value="${mydata.answer_4}" required/>${mydata.answer_4}
                   </c:if>
                 
                   <c:if test="${val==4}">
                 
                   <input type="radio" name="Option_4" value="${mydata.answer_1}" required/> ${mydata.answer_1}
        </label>
                </li>
                <li><label>
                <input type="radio" name="Option_4" value="${mydata.answer_2}" required/> ${mydata.answer_2}
            </label>
                </li>
                <li><label>
                    <input type="radio" name="Option_4" value="${mydata.answer_3}" required/> ${mydata.answer_3}
                </label>
                </li>
                <li><label>
                        <input type="radio" name="Option_4" value="${mydata.answer_4}" required/>${mydata.answer_4}
                   </c:if>
                   
                
                   <c:if test="${val==5}">
                   
                   <input type="radio" name="Option_5" value="${mydata.answer_1}" required/> ${mydata.answer_1}
        </label>
                </li>
                <li><label>
                <input type="radio" name="Option_5" value="${mydata.answer_2}" required/> ${mydata.answer_2}
            </label>
                </li>
                <li><label>
                    <input type="radio" name="Option_5" value="${mydata.answer_3}" required/> ${mydata.answer_3}
                </label>
                </li>
                <li><label>
                        <input type="radio" name="Option_5" value="${mydata.answer_4}" required/>${mydata.answer_4}
                   </c:if>       
                    </label>
                </li>
            </ul>
          </c:forEach>
            <div class="submit">
                <input type="submit" name="submit" value="Submit" /></div>
        </form>
    </div>
</body>
</html>