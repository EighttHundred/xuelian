<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--引入CSS--%>
<link rel="stylesheet" href="/static/lib/layui/css/layui.css"  media="all">
<body>
<%--HTML 代码--%>
<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input class="layui-input" name="id" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
    <button class="layui-btn" id="tanBtn">弹窗</button>
</div>
<%--创建一个表单--%>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


<script src="/static/lib/layui/layui.js" charset="utf-8"></script>
<script src="/static/js/dept/list.js" charset="UTF-8"></script>

</body>
</html>
