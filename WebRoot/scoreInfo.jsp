<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <body bgcolor="#D9DFAA">
    		<table border="1" cellspacing="1" cellpadding="8" width="700"">
    			<tr bgcolor="silver">
    				<th>学号</th><th>姓名</th><th>课程名</th><th>成绩</th><th>学分</th><th>删除</th>
    			</tr>
    			<s:iterator value="#request.list" id="score">
    			<tr>
    				<td><a href="findScore.action?score.id.studentId=<s:property value="#score[0]"/>"><s:property value="#score[0]"/></a> </td>
    				<td><s:property value="#score[1]"/></td>
    				<td><s:property value="#score[2]"/></td>
    				<td><s:property value="#score[3]"/></td>
    				<td><s:property value="#score[4]"/></td>
    				<td><a href="deleteOneScore.action?score.id.studentId=<s:property value="#score[0]"/>&score.id.courseId=<s:property value="#score[5]"/>" onClick="if(!confirm('确定删除该信息吗？'))return false;else return true;">删除</a></td>
    			</tr>
    			</s:iterator>
    			<tr align="left">
				<s:set name="page" value="#request.page"></s:set>
  				<s:if test="#page.hasFirst">
				<s:a href="scoreInfo.action?pageNow=1">首页</s:a>
				</s:if>
				<s:if test="#page.hasPre">
					<a href="scoreInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
				</s:if>
				<s:if test="#page.hasNext">
					<a href="scoreInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
				</s:if>
				<s:if test="#page.hasLast">
					<a href="scoreInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</s:if>
		</tr>
    		</table>
    		<!--<s:form action="findScore.action" method="post">
				查询学生成绩：<input type="text" name="score.id.studentId"/>
    			<input type="submit" value="查询"/>
    		</s:form>-->
  </body>
</html>
