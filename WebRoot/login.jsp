<%@ page language="java" pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>学生成绩管理系统</title>
  </head>
  <body bgcolor="#D9DFAA">
  <table width="700" align="center">
  <tr>
  <td>
  <s:form action="login" method="post" validate="true">
  	<s:textfield name="login.username" label="学号" size="20"/>
  	<s:password name="login.password" label="口令" size="21"/>
  	<s:submit value="登录"/>
  </s:form>
  </td>
  </tr>
  </table>
  </body>
</html>
