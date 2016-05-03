<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>南航金城学院学生管理系统</title>
    <meta charset="utf-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style>
        
    </style>
    <script>
        
    </script>
</head>
<body>
    <div class="row" style="margin-right: 0px;">
        <ul class="nav nav-pills nav-stacked">
            <li class="active"><a href="#">主页</a></li>
            <li><a href="qingjia.jsp?id=<%=(String)session.getAttribute("id") %>" target="right">请假</a></li>
            <li><a href="search.do?id=<%=(String)session.getAttribute("id") %>" target="right">查看假条</a></li>
        </ul>
    </div>
</body>
</html>