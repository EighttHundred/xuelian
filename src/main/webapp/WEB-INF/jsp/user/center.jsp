<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>个人中心</title>
    <link rel="stylesheet" href="../src/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-form-main">
<div class="layui-layout layui-layout-admin">
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">个人信息</a></li>
                <li class="layui-nav-item"><a href="javascript:;">我的消息</a></li>
                <li class="layui-nav-item"><a href="">信息修改</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">内容主体区域</div>
    </div>

</div>
</div>
<script src="../src/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
        
    });
</script>
</body>
</html>
