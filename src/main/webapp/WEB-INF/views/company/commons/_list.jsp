<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- <img src="images/mybatis.png"/> -->
<table class="table table-striped table-bordered table-hover">
<thead>
	<tr>
		<th width="25%"> 名称</th>
	    <th width="10%"> 负责人</th>
	    <th width="45%"> 简介</th>
	    <th width="20%"> 操作</th>
	</tr>
</thead>
<c:if test="${companies.size()<=0}"> 
	<tr>
	    <td colspan="4" align="center">暂无数据</td>
	</tr>
</c:if>
<c:if test="${companies.size()>0}"> 
	<c:forEach var="company" items="${companies}">
		<tr>
		    <td align="center">${company.name }</td>
		    <td align="center">${company.leader.name }</td>
		    <td align="center">${company.desc }</td>
		    <td align="center">
		    	<a href="">修改</a> | 
		    	<a href="company/${company.id}" class="a_delete">删除</a> | 
		    	<a href="">查看</a> | 
		    </td>
		</tr>
	</c:forEach>
</c:if>
</table>
<script type="text/javascript">
	$(".a_delete").click(function(event){
		event.preventDefault();
		current = $(this).parents("tr");
		root = $(this).parents("tbody");
		if(confirm("确认删除？")){
			$.ajax({
				url:$(this).attr("href"),
				type:'post',
				success:(function(data){
					current.remove();
					if(root.children().length<=0){
						root.append("<tr><td colspan='4' align='center'>暂无数据</td></tr>")
					}
				})
			})
		}
	});
</script>

