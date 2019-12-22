<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<div style="padding: 20px; background-color: #F2F2F2;">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-header">卡片面板</div>
                <div class="layui-card-body">
                    卡片式面板面板通常用于非白色背景色的主体内<br>
                    从而映衬出边框投影
                </div>
            </div>
        </div>
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-header">卡片面板</div>
                <div class="layui-card-body">
                    结合 layui 的栅格系统<br>
                    轻松实现响应式布局
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">标题</div>
                <div class="layui-card-body">
                    内容
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>