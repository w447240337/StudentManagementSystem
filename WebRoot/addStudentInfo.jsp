<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
	</head>
	 <script type="text/javascript" src="images/calendar.js">
	 </script>
	<body bgcolor="#D9DFAA">
		<h3>
			请填写学生信息
		</h3>
		<hr width="700" align="left">
		<s:form action="addStudent" method="post"
			enctype="multipart/form-data" validate="true">
			<table border="0" cellspacing="0" cellpadding="1">
				<tr>
					<td>
						<s:textfield name="student.studentId" label="学号" value=""></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="student.name" label="姓名" value=""></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:radio name="student.sex" value="1" list="#{1:'男',0:'女'}" label="性别" />
					</td>
				</tr>
				<tr>
					<s:select  name="student.major.id" list="list" listKey="id" listValue="majorName"
					 headerKey="0" headerValue="--请选择专业--" label="专业"></s:select>
				</tr>
				<tr>
				<!-- 调用JS写的时间控件，非常方便时间的选择，而且输入框设为只读，防止输入错误的格式 -->
					<s:textfield name="student.birthDate" label="出生时间" onclick="calendar()" readonly="true"></s:textfield>
				</tr>
				<tr>
					<td>
						<s:textfield name="student.totalCredits" label="总学分" value=""></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="student.other" label="备注" value=""></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:file name="photofile" label="照片" value=""></s:file>
					</td>
				</tr>
			</table>
			<p>
				<input type="submit" value="添加" />
				<input type="reset" value="重置" />
		</s:form>
		
	</body>
</html>
