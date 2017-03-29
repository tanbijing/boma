<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="../layouts/_bootstrap_css.jsp" %>
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-default text-center">
			<div class="panel-body">
				<%@include file="/WEB-INF/views/layouts/_top.jsp" %>
			</div>
		</div>
		<div class="panel panel-default text-center">
	    	<div class="panel-heading">
	    		<h2>登录</h2>
	    	</div>
	    	<div class="panel-body">
	    		<div>
			     	<form action="login/in" method="post">
						<div class="input-group">
							<span class="input-group-addon">登录名</span>
							<input type="text" name="name" class="form-control"/>
						</div><br/>
						<div class="input-group">
							<span class="input-group-addon">密&nbsp;&nbsp;&nbsp;码</span>
							<input type="password" name="pwd" class="form-control"/>
						</div><br/>
						<input type="submit" value="登录" class="btn btn-primary btn-lg btn-block"/>
					</form>
				</div>
			</div>
	   	</div>
	   	<%@include file="/WEB-INF/views/layouts/_footer.jsp" %>
	</div>
</body>
</html>