<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  </head>
  <body bgcolor="#D9DFAA">
			<s:set name="course" value="#request.courseInfo"></s:set>
			<s:form action="updateCourse.action" method="post">
			<table border="0" cellspacing="1" cellpadding="8" width="400">
				<tr>
					<td>课程号：</td><td><input type="text" name="course.courseId" value="<s:property value="#course.courseId"/>" readonly/></td>
				</tr>
				<tr>
					<td>课程名：</td><td><input type="text" name="course.courseName" value="<s:property value="#course.courseName"/>"/></td>
				</tr>
				<tr>
					<td>开课学期：</td><td><input type="text" name="course.courseDate" value="<s:property value="#course.courseDate"/>"/></td>
				</tr>
				<tr>
					<td>学分：</td><td><input type="text" name="course.credit" value="<s:property value="#course.credit"/>"/></td>
				</tr>
				<tr>
					<td>学时：</td><td><input type="text" name="course.student" value="<s:property value="#course.student"/>"/></td>
				</tr>
			</table>
			<p>
					<input type="submit" value="修改"/>
					<input type="button" value="返回" onclick="javascript:history.back();"/>
			</s:form>
  </body>
</html>
