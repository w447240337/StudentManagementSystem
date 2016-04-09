<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<html>
	<body bgcolor="#D9DFAA">
		<h3>
			请填写要修改或增加的学生成绩信息
		</h3>
		<hr>
		<s:form action="addorupdateScore.action" method="post">
			<table border="1" cellspacing="1" cellpadding="8" width="400">
				<tr>
					<td width="100">
						请选择学生：
					</td>
					<td>
						<select name="score.id.studentId">
							<s:iterator id="student" value="#request.list1">
								<option value="<s:property value="#student.studentId"/>">
									<s:property value="#student.name" />
								</option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td width="100">
						请选择课程：
					</td>
					<td>
						<select name="score.id.courseId">
							<s:iterator id="course" value="#request.list2">
								<option value="<s:property value="#course.courseId"/>">
									<s:property value="#course.courseName" />
								</option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<s:textfield label="成绩" name="score.score" value="" size="15"></s:textfield>
				</tr>
			</table>
			<input type="submit" value="确定" />
			<input type="reset" value="重置" />
		</s:form>
	</body>
</html>
