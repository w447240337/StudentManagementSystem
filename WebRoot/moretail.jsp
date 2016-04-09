<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
  </head>
  
  <body bgcolor="#D9DFAA">
  		<h3>该学生信息如下：</h3>
  		<s:set name="student" value="#request.student"></s:set>
  		<s:form action="studentInfo.action" method="post">
  			<table border="0" cellpadding="5">
  				<tr>
  					<td>学号：</td>
  					<td width="100"><s:property value="#student.studentId"/></td>
  					<td rowspan="7"><img src="getImage.action?student.studentId=<s:property value="#student.studentId"/>" width="120"height="150"></td>
  				</tr>
  				<tr>
  					<td>姓名：</td>
  					<td width="100"><s:property value="#student.name"/></td>
  				</tr>
  				<tr>
  					<td>性别：</td>
  					<td width="100">
						<s:if test="#student.sex==1">
								男
						</s:if>
						<s:else>
							女
						</s:else>		
					</td>
				</tr>
				<tr>
					<td>专业：</td>
  					<td width="100"><s:property value="#student.major.majorName"/></td>
  				</tr>
  				<tr>
  					<td>出生时间：</td>
  					<td width="100"><s:date name="#student.birthDate" format="yyyy-MM-dd"/></td>
  				</tr>
  				<tr>
  					<td>总学分</td>
  					<td width="100"><s:property value="#student.totalCredits"/></td>
  				</tr>
  				<tr>
  					<td>备注</td>
  					<td width="100"><s:property value="#student.other"/></td>
  				</tr>
  				
  			</table>
  			<input type="submit" value="返回"/>
  		</s:form>
  </body>
</html>
