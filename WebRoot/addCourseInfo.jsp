<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
  </head>
  <body bgcolor="#D9DFAA">
			<h3>请填写课程信息</h3>
			<hr width="700" align="left">
			<s:form action="addCourse.action" method="post">
				 <table border="0" cellspacing="1" cellpadding="8" width="300">
				<tr>
					<s:textfield name="course.courseId" label="课程号"></s:textfield>
				</tr>
				<tr>
					<s:textfield name="course.courseName" label="课程名"></s:textfield>
				</tr>
				<tr>
					<s:textfield name="course.courseDate" label="开课学期"></s:textfield>
				</tr>
				<tr>
					<s:textfield name="course.student" label="学时"></s:textfield>
				</tr>
				<tr>
					<s:textfield name="course.credit" label="学分"></s:textfield>
				</tr>
			</table> 
			<p>
					<input type="submit" value="添加"/>
					<input type="reset" value="重置"/>
			</s:form>
  </body>
</html>
