<%@ page language="java" import="java.util.*" import="com.absence.hibernate.beans.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看学生请假信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
     request.setCharacterEncoding("utf-8");
     Application cation=(Application)request.getAttribute("user");
   %>
  <body topmargin="60">
    <form name="form" action="shenhe.do?id=<%=cation.getId()%>&account=<%=(String)session.getAttribute("account")%>" method="post">
    <TABLE align="center" border="1" cellSpacing="0" borderColorLight="#c0c0c0" 
      borderColorDark="#ffffff" width="576" bgColor="#f0f5fd"  cellPadding="4">
        <TBODY>
        <TR>
          <TD bgColor=#c1dcff colSpan=7><FONT style="FONT-SIZE: 9pt">学生的</FONT>
          <FONT style="FONT-SIZE: 9pt" color=#ff0000>请假信息：</FONT>
          </TD>
        </TR>
        <TR>
          <TD width="100" align="center"><FONT style="FONT-SIZE: 9pt">学科:</FONT></TD>
          <TD width="126"><%=cation.getTeachclass()%></TD>
          <td colspan="2">&nbsp;</td>
        </TR>
        <TR>
          <td width="100" align="center"><FONT style="FONT-SIZE: 9pt">开始时间:</FONT></td>
          <td width="100"><%=cation.getBegintime()%></td>
          <td width="100" align="center"><FONT style="FONT-SIZE: 9pt">结束时间:</FONT></td>
          <td width="100"><%=cation.getOvertime() %></td>
        </TR>
        <TR>
          <TD height="80" width="100" align="center"><FONT style="FONT-SIZE: 9pt">请假原因:</FONT></TD>
          <TD align="left" colSpan="3"><%=cation.getReason() %>
        </TR>
        <tr>
          <td align="center" colspan="4"><input type="submit" name="submit" value="批准" size="15" style="background-color:#669900; height:30px; width:80px"></td>
          </tr>
        </TBODY>
     </TABLE>
     </form>
  </body>
</html>
