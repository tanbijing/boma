<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
</style>
<form action="create" method="post" enctype="multipart/form-data" role="form" class="form-horizontal">
	<input name="id" type="hidden" value="${company!=null ? company.id : 0}" />
	<div class="form-group">
		<label class="col-sm-2 control-label">企业名称：</label>
		<div class="col-sm-10">
			<input class="form-control" name="name" value="${company!=null ? company.name : ''}"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">负责人：</label>
		<div class="col-sm-10">
			<input class="form-control" name="leader" value="${company!=null&&company.leader!=null ? company.leader.name : ''}"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">企业简介：</label>
		<div class="col-sm-10">
			<textarea class="form-control" name="desc" rows="3">${company!=null ? company.desc : ""}</textarea>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">企业logo：</label>
		<div class="col-sm-10">
			<input name="logo" type="file"/>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<input class="btn btn-primary btn-lg btn-block" type="submit" value="提交" />
		</div>
	</div>
</form>
