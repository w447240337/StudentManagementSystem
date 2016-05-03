<%@ page language="java" import="java.util.*" import="com.absence.hibernate.beans.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>审核假条</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body  topmargin="60">
   <% 
      request.setCharacterEncoding("utf-8");   
      ArrayList<Examine> list=(ArrayList<Examine>)request.getAttribute("list"); 
       
    %>
    <table align="center"width="600" border="1" cellSpacing="0" borderColorLight="#c0c0c0" 
      borderColorDark="#ffffff" width="600" bgColor="#f0f5fd"  cellPadding="4">
       <tr height="50">
          <td colspan="4" align="center"><FONT style="FONT-SIZE: 15pt" color=#ff0000>审核学生的请假情况</FONT></td>
       </tr>
       <tr>
          <td align="center">假条编号</td><td align="center">审核</td>
       </tr>
        <%
        for(int i=0;i<list.size();i++){
              Examine cation = (Examine)list.get(i);
         %>
       
       <tr>
          <td align="center"><a href="examine.do?account=<%=(String)session.getAttribute("account") %>&id=<%=cation.getId() %>"><%=cation.getId() %></a></td>
          <td align="center"><%=cation.getPermit()%></td>
       </tr>
       <%
          }
        %>
    </table>
  </body>
</html>
