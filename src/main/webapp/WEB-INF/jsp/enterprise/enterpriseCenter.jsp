<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <ul class="layui-nav layui-nav-tree site-demo-nav">
            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">企业职位</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="positionEdit">增添职位</a>
                    </dd>
                    <dd class="">
                        <a href="positionManage">职位管理</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">求职管理</a>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">企业信息</a>
            </li>
        </ul>
    </div>
</div>



