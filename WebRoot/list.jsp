<%@ page language="java" import="com.absence.hibernate.beans.*" import="java.util.*" import="com.absence.struts.forms.*" pageEncoding="utf-8"%>
<%@ page import="com.absence.struts.dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看请假信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body topmargin="60">
   <% 
      request.setCharacterEncoding("utf-8");   
      String xuehao1=(String)request.getAttribute("xuehao");
      ArrayList<Application> list=(ArrayList<Application>)request.getAttribute("list"); 
       
    %>
    <table align="center" border="1" width="700" cellSpacing="0" borderColorLight="#c0c0c0" 
      borderColorDark="#ffffff" width="600" bgColor="#f0f5fd"  cellPadding="4">
       <tr>
          <td align="center">假条编号</td><td align="center">请假课程</td><td align="center">起始时间</td><td align="center">结束时间</td><td align="center">备注</td>
       </tr>
        <%
        for(int i=0;i<list.size();i++){
              Application cation = (Application)list.get(i);
              QingjiaDAO qingjia=new QingjiaDAO();
              Examine exam=qingjia.Select_P(cation.getId());
              String permit=exam.getPermit();
              String a=null;
              String b=null;
              if(permit.equals("未审核")){
                   a="block";
                   b="none";
              }
              else{
                   a="none";
                   b="block";
              }
         %>
       
       <tr>
          <td align="center"><%=cation.getId() %></td>
          <td align="center"><%=cation.getTeachclass()%></td>
          <td align="center"><%=cation.getBegintime() %></td>
          <td align="center"><%=cation.getOvertime() %></td>
          <td rowspan="2">
             <div  id="beizhu" style="display:<%=a%>">
             <table align="center">
                <tr>
                 　　　　　　<td><a href="update.do?id=<%=cation.getId() %>&xuehao=<%=cation.getStudent().getId() %>">修改</a></td>
                 <td><a href="delect.do?id=<%=cation.getId() %>&xuehao=<%=cation.getStudent().getId() %>">删除</a></td>
                </tr>
             </table>
             </div>
             <div  id="beizhu1" style="display:<%=b%>">
             <table align="center">
                <tr>
                 　　　　　　<td>已审核</td>
                </tr>
             </table>
             </div>
          </td>
       </tr>
       <tr height="80">
          <td align="center">请假理由</td>
          <td colspan="3" align="center"><%=cation.getReason() %></td>
       </tr>
       <%
          }
        %>
    </table>
  </body>
</html>
