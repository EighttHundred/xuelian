<%@ page import="ruanku.xuelian_requirement.model.User" %>
<%@ page import="ruanku.xuelian_requirement.common.enums.UserType" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/group3.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

    <div class="layui-header">
    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}">首页</a></li>
        <li class="layui-nav-item "><a href="${pageContext.request.contextPath}/jobFind">找工作</a></li>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/jobFair">招聘会</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">
        <%
            request.setCharacterEncoding("utf-8");
            Object obj=session.getAttribute("user");
            if(obj!=null){
                User user=(User)obj;
                if(user.getType().equals(UserType.SEEKER.name())){
        %>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/seeker/center">个人中心</a></li>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/doLogout">注销</a></li>
        <%
        }else{
        %>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/enterprise/center">企业中心</a></li>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/doLogout">注销</a></li>
        <%
            }
        }else{
        %>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/login">登陆</a></li>
        <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/choose">注册</a></li>
        <%
            }
        %>
    </ul>
    </div>

