<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
div{
	margin-top: 10px;
}
</style>
<form action="create" method="post" enctype="multipart/form-data">
	<input name="id" type="hidden" value="${company!=null ? company.id : 0}" />
	<div>
		<span>企业名称：</span>
		<input name="name" value="${company!=null ? company.name : ''}"/>
	</div>
	<div>
		<span>负责人：</span>
		<input name="leader" value="${company!=null&&company.leader!=null ? company.leader.name : ''}"/>
	</div>
	<div>
		<span>企业简介：</span>
		<input name="desc" value="${company!=null ? company.desc : ''}"/>
	</div>
	<div>
		<span>企业logo：</span>
		<input name="logo" type="file"/>
	</div>
	<div>
		<input type="submit" value="提交" />
	</div>
</form>
