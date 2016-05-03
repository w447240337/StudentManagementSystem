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
            <li><a href="#">主页</a></li>
            <li><a href="list.do?id=<%=(String)session.getAttribute("id") %>" target="right">学籍注册</a></li>
            <li><a href="check.do?id=<%=(String)session.getAttribute("id") %>" target="right">审批假条</a></li>
            <li><a href="checkover.do?id=<%=(String)session.getAttribute("id") %>" target="right">查看已批假条</a></li>
            <li><a href="#" target="right">查看学生出勤率</a></li>
        </ul>
    </div>
</body>
</html>