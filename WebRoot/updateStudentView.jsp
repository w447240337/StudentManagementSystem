<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  	 <script type="text/javascript" src="images/calendar.js"></script>
  	
  </head>
  <body bgcolor="#D9DFAA">
			<s:set name="student" value="#request.studentInfo"></s:set>
			<s:form action="updateStudent.action" method="post" enctype="multipart/form-data" >
			<table border="0" cellspacing="1" cellpadding="8" width="500">
				<tr>
					 <td  width="80">学号：</td><td><input type="text" name="student.studentId" value="<s:property value="#student.studentId"/>" readonly/></td>
				</tr>
				<tr>
					<td width="80">姓名：</td><td><input type="text" name="student.name" value="<s:property value="#student.name"/>"/></td>
				</tr>
				<tr>
					<td width="80"><s:radio list="#{1:'男',0:'女'}" value="#student.sex" label="性别" name="student.sex"></s:radio></td>
				</tr>
				<tr>
					<td width="80">专业：</td>
					<td>
						<select name="student.major.id">
							<s:iterator value="#request.majors" id="major">
								<option value="<s:property value="#major.id"/>"><s:property value="#major.majorName"/></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td width="80">出生时间：</td>
					<td><input type="text" name="student.birthDate" value="<s:date name="#student.birthDate" format="yyyy-MM-dd"/>" onclick="calendar();" readonly/></td>
				</tr>
				<tr>
					<td width="80">总学分：</td><td><input type="text" name="student.totalCredits" value="<s:property value="#student.totalCredits"/>"/></td>
				</tr>
				<tr>
					<td width="80">备注：</td><td><input type="text" name="student.other" value="<s:property value="#student.other"/>"/></td>
				</tr>
				<tr>
					<td>照片</td><td><input type="file" name="photofile" value=""/></td>
				</tr>
			</table>
					<input type="submit" value="修改"/>
					<input type="button" value="返回" onclick="javascript:history.back();"/>
			</s:form>
			<!-- 这里用JavaScript来实现根据该学生的专业ID来显示专业名 -->
			 <script type="text/javascript">
  				document.getElementById("student.major.id").value= <s:property value="#student.major.id"/>
  			</script>
  </body>

</html>
