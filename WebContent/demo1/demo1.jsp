<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	struts2入门<br>

	<a href="${pageContext.request.contextPath }/hello.action">struts2入门</a><br><br><br>
	
	
	struts2的Action访问<br><br>

	方式一：通过method方法<br>
	<a href="${pageContext.request.contextPath }/userFind.action">查询用户</a><br>
	<a href="${pageContext.request.contextPath }/userUpdate.action">修改用户</a><br>
	<a href="${pageContext.request.contextPath }/userDelete.action">删除用户</a><br>
	<a href="${pageContext.request.contextPath }/userSave.action">保存用户</a><br><br><br>
	
	方式二：通配符方法<br>
	<a href="${pageContext.request.contextPath }/product_find.action">查询商品</a><br>
	<a href="${pageContext.request.contextPath }/product_update.action">修改商品</a><br>
	<a href="${pageContext.request.contextPath }/product_delete.action">删除商品</a><br>
	<a href="${pageContext.request.contextPath }/product_save.action">保存商品</a><br><br><br>
	
	方式三：动态方法访问<br>
	<a href="${pageContext.request.contextPath }/product!find.action">查询商品</a><br>
	<a href="${pageContext.request.contextPath }/product!update.action">修改商品</a><br>
	<a href="${pageContext.request.contextPath }/product!delete.action">删除商品</a><br>
	<a href="${pageContext.request.contextPath }/product!save.action">保存商品</a><br>
	
	
	
</body>
</html>