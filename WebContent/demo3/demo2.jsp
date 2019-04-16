<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>查看值栈结构</h5>
	<s:debug></s:debug><br><br>
	
	<h5>获取值栈中对象的属性方式一：利用Action本身在值栈中的特性</h5><br>
	<s:property value="user.name"/>&nbsp;
	<s:property value="user.password"/>&nbsp;
	<br><br>
	
	<h5>获取值栈中对象的属性方式二：调用值栈中的方法实现</h5><br>
	name:<s:property value="name"/><br>
	password:<s:property value="password"/><br>
	my:<s:property value="my"/><br><br>
	
	<h5>获取值栈中对象列表</h5><br>
	<s:property value="list[0].name"/>&nbsp;&nbsp;
	<s:property value="list[0].password"/><br>
	<s:property value="list[1].name"/>&nbsp;&nbsp;
	<s:property value="list[1].password"/><br>
	<s:property value="list[2].name"/>&nbsp;&nbsp;
	<s:property value="list[2].password"/><br>
	<br><br>
	
	<h5>获取context中的数据</h5><br>
	<s:property value="#request.name"/><br>
	<s:property value="#session.name"/><br>
	<s:property value="#application.name"/><br>
	<!-- attr从request、session、application中依次找 -->
	<s:property value="#attr.name"/><br>
	<!-- parameters接收url?后的参数 action?id=1 -->
	<s:property value="#parameters.id"/><br>
	
	
</body>
</html>