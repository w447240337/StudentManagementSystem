<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生请假系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
     function check(){
		document.getElementById("div").style.display = "none";
		return true;
	}
	function check1(){
		document.getElementById("passwd").style.display = "none";
		return true;
	}
     function jiansuo(){
        var id=form.id.value;
        var password=form.password.value;
        if(id==""){
           document.getElementById("div").style.display = "block";
           return false;
        }
        if(password==""){
           document.getElementById("passwd").style.display = "block";
           return false;
        }
        return true;
    }
    function rec(a){
      if(a==1){
	     document.getElementById("div").style.display = "none";
	     return true;
	  }
	  if(a==2){
	     document.getElementById("passwd").style.display = "none";
	  return true;
	  }
	  return false;
   }
  </script>
  <body topmargin="70">
      <table align="center" width="900" height="450" border="1" rules="none">
         <tr>
            <td colspan="2"><img src="images/toubu.jpg" width="900" height="150"></td>
         </tr>
		 <tr>
		    <td align="left">
			 <img src="images/fengmian.jpg" width="500" height="300">
			<td align="center">
			    <form name="form" action="login.do" method="post">
                 <table width="300" height="250" border="0">
                  <tr>
                    <td align="right" width="80">身份:</td>
			        <td>
			         <select name="shenfen" size="1">
				       <option value="student" selected="selected">&nbsp;学&nbsp;生&nbsp;
					   <option value="teacher">&nbsp;老&nbsp;师&nbsp;
				     </select>
			        </td>
                 </tr>
                 <tr><td colspan="2">&nbsp;</td></tr>
                 <tr>
                   <td align="right" width="80">登录号:</td>
                   <td><input type="text" name="id" size="20" onKeyDown="return check()" onMouseDown="return rec(1)"></td>
                 </tr>
                 <tr>
                    <td>&nbsp;</td>
                    <td>
                        <div id="div" style="display:none">
                          <span><font style="color:#FF0000; font-weight:bold; font-family:Arial">* 用户名不能为空</font></span>
			           </div>
                    </td>
                 </tr>
                 <tr>
                   <td align="right" width="80">密码：</td>
                   <td><input type="password" name="password" size="20"  onKeyDown="return check1()" onMouseDown="return rec(2)"></td>
                 </tr>
                 <tr>
                    <td>&nbsp;</td>
                    <td>
                        <div id="passwd" style="display:none">
                          <span><font style="color:#FF0000; font-weight:bold; font-family:Arial">* 密码不能为空</font></span>
			           </div>
                    </td>
                 </tr>
                 <tr>
                  <td align="center" colspan="2"><input type="submit" name="submit" value="登录" style="height:25px; width:40px" onClick="return jiansuo()">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="reset" name="reset" value="重置"></td>
                 </tr>
              </table>
             </form>
			</td>
		 </tr>
	  </table>
</body>
</html>
