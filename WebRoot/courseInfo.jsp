<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>
<html>
	<head>
	</head>
  <body bgcolor="#D9DFAA">
  <table border="1" cellspacing="1" cellpadding="8" width="700">
  		<tr align="center" bgcolor="silver">
  			<th>课程号</th><th>课程名</th><th>开课学期</th><th>学时</th>
  			<th>学分</th><th>操作</th><th>操作</th>
  		</tr>
  		<s:iterator value="#request.list" id="course">
  		<tr>
			<td><s:property value="#course.courseId"/></td>
			<td><s:property value="#course.courseName"/></td>
			<td><s:property value="#course.courseDate"/></td>
			<td><s:property value="#course.student"/></td>
			<td><s:property value="#course.credit"/></td>
			<td> <a href="deleteCourse.action?course.courseId=<s:property value="#course.courseId"/>" onClick="if(!confirm('确定删除该信息吗？'))return false;else return true;">删除</a> </td>
			<td> <a href="updateCourseView.action?course.courseId=<s:property value="#course.courseId"/>">修改</a> </td>
		</tr>
		</s:iterator>
		<tr>
			<s:set name="page" value="#request.page"></s:set>
  				<s:if test="#page.hasFirst">
				<s:a href="courseInfo.action?pageNow=1">首页</s:a>
				</s:if>
				<s:if test="#page.hasPre">
					<a href="courseInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
				</s:if>
				<s:if test="#page.hasNext">
					<a href="courseInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
				</s:if>
				<s:if test="#page.hasLast">
					<a href="courseInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</s:if>
		</tr>
		
  	</table>
		<s:form action="findCourse.action" method="post">
	请输入要查询课程课程号:<input type="text" name="course.courseId"/>
	<input type="submit" value="查询"/>
  	</s:form>
  </body>
</html>
			