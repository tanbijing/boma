<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   request.setAttribute("basePath", basePath);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="../layouts/_bootstrap_css.jsp" %>
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<title>修改企业</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-default text-center">
			<div class="panel-body">
				<%@include file="/WEB-INF/views/layouts/_top.jsp" %>
			</div>
		</div>
		<div class="panel panel-default ">
			<div class="panel-heading">
				<%@include file="./commons/_position.jsp" %>
			</div>
			<div class="panel-body">
				<%@include file="./commons/_form.jsp" %>
			</div>
		</div>
		<%@include file="/WEB-INF/views/layouts/_footer.jsp" %>
	</div>
</body>
</html>