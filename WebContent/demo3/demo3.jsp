<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("name", "朱俊伟");
	%>
	
	<h4>#号的用法</h4>
	<h5>获取context的值</h5>	
	<s:property value="#request.name"/><br><br>
	
	<h5>构建List、Map集合</h5>
	
	<!-- List集合 -->
	List集合<br>
	<s:iterator var="i" value="{'a','b','c'}">
		<s:property value="i"/>--<s:property value="#i"/><br>
	</s:iterator><br>
	Map集合<br>
	<s:iterator var="entry" value="#{'a':'111','b':'222','c':'333'}">
		<s:property value="key"/>--<s:property value="value"/><br>
		<!-- 两种方法都可以 -->
		<%-- <s:property value="#entry.key"/>--<s:property value="#entry.value"/><br> --%>
	</s:iterator><br>
	
	<h5>表单写法</h5>
	传统写法：<br>
	性别：<input type="radio" name="sex1" value="男">男
	<input type="radio" name="sex1" value="女">女<br>
	struts2 s:radio写法：<br>
	<!-- list写法 -->
	<s:radio list="{'男','女'}" name="sex2" label="性别"></s:radio><br>
	<!-- map写法 -->
	<s:radio list="#{'1':'男','2':'女'}" name="sex3" label="性别"></s:radio>
	
	
	<h4>%号的用法</h4>
	<h5>强制解析成OGNL表达式</h5>
	姓名：<s:textfield name="name" value="%{#request.name}" />
	
	<h5>不解析成OGNL表达式</h5>
	<s:property value="%{'#request.name'}"/>
	
</body>
</html>