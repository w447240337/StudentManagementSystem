<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>填写请假信息</title>
    
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
     String id=request.getParameter("id");
   %>
  <body topmargin="60">
    <form name="form" action="qingjia.do" method="post">
    <TABLE align="center" border="1" cellSpacing="0" borderColorLight="#c0c0c0" 
      borderColorDark="#ffffff" width="600" bgColor="#f0f5fd"  cellPadding="4">
        <TBODY>
        <TR>
          <TD bgColor=#c1dcff colSpan=7><FONT style="FONT-SIZE: 9pt">请填写您的</FONT>
          <FONT style="FONT-SIZE: 9pt" color=#ff0000>请假信息：</FONT>
          </TD>
        </TR>
        <TR>
          <TD width="150" align="center"><FONT style="FONT-SIZE: 9pt">学科:</FONT></TD>
          <TD width="126"><input name="teachclass" size="27"></TD>
          <td colspan="2"><input name="xuehao" type="hidden"  value="<%=id%>"></td>
          <td colspan="2"><input name="name" type="hidden"  value="<%=(String)session.getAttribute("name") %>"></td>
        </TR>
         <TR>
          <td align="center" colspan="4">
                         <FONT style="FONT-SIZE: 9pt" color=#ff0000>*****时间请按格式YYYY.MM.DD填写*****</FONT></td>
        </TR>
        <TR>
          <td width="150" align="center"><FONT style="FONT-SIZE: 9pt">开始时间:</FONT></td>
          <td width="100"><input name="begintime" size="27"></td>
          <td width="150" align="center"><FONT style="FONT-SIZE: 9pt">结束时间:</FONT></td>
          <td width="100"><input name="overtime" size="27"></td>
        </TR>
        <TR>
          <td width="150"><FONT style="FONT-SIZE: 9pt">请假原因:</FONT></td>
          <TD align="left" colSpan="3"><textarea style="HEIGHT: 100px" rows="3" cols="58" name="reason"></textarea>
          </TD>
        </TR>
        <tr>
          <td align="center" colspan="4"><input type="submit" name="submit" value="提交" size="15" style="background-color:#669900; height:30px; width:80px"></td>
          </tr>
        </TBODY>
     </TABLE>
     </form>
  </body>
</html>
