<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
	</head>
  <body bgcolor="#D9DFAA">
  <table border="1" cellspacing="1" cellpadding="8" width="700">
  		<tr align="center" bgcolor="silver" >
  			<th>学号</th><th>姓名</th><th>性别</th><th>专业</th>
  			<th>出生时间</th><th>总学分</th><th>详细信息</th>
  			<th>操作</th><th>操作</th>
  		</tr>
  		<s:iterator value="#request.list" id="student">
  		<tr>
			<td><s:property value="#student.studentId"/></td>
			<td><s:property value="#student.name"/></td>
			<td>
				<s:if test="#student.sex==1">
					男
				</s:if>
				<s:else>
					女
				</s:else>		
			</td>
			<td><s:property value="#student.major.majorName"/></td>
			<td><s:date name="#student.birthDate" format="yyyy-MM-dd"/> </td>
			<td><s:property value="#student.totalCredits"/></td>
			<td><a href="findStudent.action?student.studentId=<s:property value="#student.studentId"/>">详细信息</a> </td>
			<td> <a href="deleteStudent.action?student.studentId=<s:property value="#student.studentId"/>" onClick="if(!confirm('确定删除该信息吗？'))return false;else return true;">删除</a> </td>
			<td> <a href="updateStudentView.action?student.studentId=<s:property value="#student.studentId"/>">修改</a> </td>
		</tr>
		</s:iterator>
		<tr>
			<s:set name="page" value="#request.page"></s:set>
  				<s:if test="#page.hasFirst">
				<s:a href="studentInfo.action?pageNow=1">首页</s:a>
				</s:if>
				<s:if test="#page.hasPre">
					<a href="studentInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
				</s:if>
				<s:if test="#page.hasNext">
					<a href="studentInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
				</s:if>
				<s:if test="#page.hasLast">
					<a href="studentInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</s:if>
		</tr>
		
  	</table>
  </body>
</html>
			