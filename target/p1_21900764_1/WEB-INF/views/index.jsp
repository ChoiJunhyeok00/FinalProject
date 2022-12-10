<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>한동 중고 마켓</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">

    <style>
        #div{
            font-family:'Do Hyeon',serif;
        }
        #list {
            /*font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;*/
            font-family:'Do Hyeon',serif;
            border-collapse: collapse;
            width: 100%;
        }
        #list td, #list th {
            border: 1px solid #ddd;
            padding: 8px;
            text-align:center;
        }
        #list tr:nth-child(even){background-color: #f2f2f2;}
        #list tr:hover {background-color: #ddd;}
        #list th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color:black;
            color: white;
        }
    </style>

</head>
<body>
<%--<img src="../../resources/img/1.jpeg" height="250">--%>
<div style='width:100%; text-align:center; padding-top:100px'>
    <h2>한동인을 위한 중고거래 게시판</h2>
    <button type="button" onclick="location.href='./login/login'">로그인하기</button>
</div>
</body>
</html>
