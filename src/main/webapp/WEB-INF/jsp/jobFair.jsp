<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<div class="layui-layout layui-layout-admin">
	<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>招聘会</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css"  media="all">
	<style>
		#zxd_x1{width:20px; height:20px;text-align:center;font-size:16px;color:red;position:absolute;right:0px; top:0px;cursor:pointer;}
		#zxd_x2{width:20px; height:20px;text-align:center;font-size:16px;color:red;position:absolute;right:0px; top:0px;cursor:pointer;}

	</style>
	<style type="text/css">
		*{margin:0;padding:0;list-style:none;}
		body{background:#FFFFFF;}
		a{text-decoration:none;}
		img{border:none;}

		/* accordion */
		.accordion{width:805px;height:320px;overflow:hidden;margin:80px auto;box-shadow:0 0 10px 2px rgba(0,0,0,0.4);}
		.accordion ul{width:3000px;}
		.accordion li{
			display:block;width:160px;height:320px;overflow:hidden;position:relative;float:left;border-left:1px solid #aaa;box-shadow:0 0 25px 10px rgba(0,0,0,0.4);

			-webkit-transition:all .5s;
			-moz-transition:all .5s;
			-ms-transition:all .5s;
			-o-transition:all .5s;
			transition:all .5s;
		}
		.accordion li img{display:block;}
		.accordion ul:hover li{width:40px;}
		.accordion ul li:hover{width:640px;}
		.accordion .title{position:absolute;left:0;bottom:0;width:640px;background:rgba(0,0,0,0.5);}
		.accordion .title a{display:block;color:#fff;font-size:16px;padding:20px;}
	</style>



	<div style="z-index:999;display: block; position: fixed; left: 0px; top: 200px;">
		<div id="zxd_x1">
			<a title="点击关闭"><b></b></a></div>
		<div><a href=""><img src="${pageContext.request.contextPath}/static/layui/images/a1.jpg"></a></div>
	</div>

	<div class='accordion'>
		<ul>
			<li>
				<div class='title'><a href="http://www.baidu.com">求职帮计划</a></div>
				<a href="http://www.baidu.com"><img src='${pageContext.request.contextPath}/static/layui/images/1.jpg'></a>
			</li>
			<li>
				<div class='title'><a href="http://www.baidu.com">简历优化</a></div>
				<a href="http://www.baidu.com"><img src='${pageContext.request.contextPath}/static/layui/images/2.jpg'></a>
			</li>
			<li>
				<div class='title'><a href="http://www.baidu.com">免费发布职位</a></div>
				<a href="http://www.baidu.com"><img src='${pageContext.request.contextPath}/static/layui/images/3.jpg'></a>
			</li>
			<li>
				<div class='title'><a href="http://www.baidu.com">中原逐鹿 骏耀鹰城</a></div>
				<a href="http://www.baidu.com"><img src='${pageContext.request.contextPath}/static/layui/images/4.jpg'></a>
			</li>
			<li>
				<div class='title'><a href="http://www.baidu.com">空中双选会</a></div>
				<a href="http://www.baidu.com"><img src='${pageContext.request.contextPath}/static/layui/images/5.jpg'></a>
			</li>
		</ul>
	</div>
	<div style="z-index:999;display: block; position: fixed; right: 0px; top: 200px;">
		<div id="zxd_x2">
			<a title="点击关闭"><b></b></a></div>
		<div><a href=""><img src="${pageContext.request.contextPath}/static/layui/images/a1.jpg"></a></div>
	</div>
</div>
