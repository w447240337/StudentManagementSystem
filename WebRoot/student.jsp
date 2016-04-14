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
   <style type="text/css">
    <!--
       .c{ background-color:#c1dcff; }
    -->
    </style>
  </head>
  
  <body topmargin="60">
  <%
      request.setCharacterEncoding("utf-8");
   %>
    <table align="center" border="1" width="700" height="">
      <tr>
	     <td colspan="2"  background="images/29.jpg">
		    <form action="logout.do" name="form1" method="post">
		    <table align="center" width="800" height="100">
			   <tr>
			      <td align="center" width="600">欢迎你登陆学生请假系统！&nbsp;<%=(String)session.getAttribute("id") %>,<%=(String)session.getAttribute("name") %>.</td>
				  <td>&nbsp;</td>
				  <td align="center" width="200"><input type="submit" name="submit" value="退出" size="30" style="background-color:#669900; height:30px; width:80px"></td>
			   </tr>
			</table>
			</form>
		 </td>
	  </tr>
	  <tr>
	     <td width="400"><img src="images/a.jpg"></td>
	     <td>
		     <table align="center" border="1" width="300">
			    <tr align="center" height="50">
				    <td class="c"><a href="qingjia.jsp?id=<%=(String)session.getAttribute("id") %>">申请假期</a></td>
				</tr>
				<tr align="center" height="50">
				    <td class="c"><a href="search.do?id=<%=(String)session.getAttribute("id") %>">查看假条</a></td>
				</tr>
			 </table>
		 </td>
	  </tr>
    </table>
</body>
</html>
