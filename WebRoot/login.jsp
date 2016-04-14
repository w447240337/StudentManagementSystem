<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>南航金城学院签到系统</title>
    <meta charset="utf-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style>
        .body{
            height:100%;
            margin:0px;
        }
        .navbar-glxt{
            background-color: transparent;
        }
        .navbar-header p{
            font-size: 30px;
            color: #fff;
        }
        .index-image{
            background-image: url(img/door.jpg);
            height: 100%;
            width: 100%;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .login-kuang{
            background-color: #fff;
            margin-left: auto;
            margin-right: auto;
            width: 420px;
            border: 2px solid #00cccc;
            border-radius: 8px;
            padding: 19px 34px;;
            margin-top: 9%;
            opacity: 0.9;
        }
        .login-kuang ul{
            margin-bottom: 30px;
        }
        .login-kuang ul li{
            width: 50%;
        }
        .login-kuang ul li a{
            text-align: center;
        }
        .background{
            background-image: url(img/background.jpg);
            background-size: cover;
        }
    </style>
    <script>
        $(document).ready(function(){
            var aa=$(window).height()
            $(".background").css({"height":aa});
        });
    </script>
</head>
<body>
    <div class="background">
        <nav class="navbar navbar-glxt" role="navigation">
            <div class="navbar-header">
                <p class="navbar-brand" href="#">南航金城学院学生信息管理系统</p>
            </div>
        </nav>
        <div class="container">
            <div class="login-kuang">
                <ul id="myTab" class="nav nav-tabs">
                    <li class="active">
                        <a href="#student" data-toggle="tab">
                            学生登录
                        </a>
                    </li>
                    <li>
                        <a href="#teacher" data-toggle="tab">
                            辅导员登录
                        </a>
                    </li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="student">
                        <form name="form" action="login.do" method="post">
                            <div class="form-group form-group-lg">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="text" name="id" class="form-control" placeholder="请输入用户名">
                                    <input type="hidden" name="shenfen" value="student">
                                </div>
                            </div>
                            <div class="form-group form-group-lg">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    <input type="password" name="password" class="form-control" placeholder="请输入密码">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-info" style="width:100%;margin-top:53px;">登录</button>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="teacher">
                        <form name="form" action="login.do" method="post">
                            <div class="form-group form-group-lg">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="text" name="id" class="form-control" placeholder="请输入用户名">
                                    <input type="hidden" name="shenfen" value="teacher">
                                </div>
                            </div>
                            <div class="form-group form-group-lg">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    <input type="password" name="password" class="form-control" placeholder="请输入密码">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-info" style="width:100%;margin-top:53px;">登录</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>