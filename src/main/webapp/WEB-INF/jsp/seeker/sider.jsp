<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <ul class="layui-nav layui-nav-tree site-demo-nav">
            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:">个人中心</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="${pageContext.request.contextPath}/seeker/resumeAdd">新建简历</a>
                    </dd>
                    <dd class="">
                        <a href="${pageContext.request.contextPath}/seeker/resumeManage">简历管理</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:">简历投递</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="${pageContext.request.contextPath}/seeker/deliveryManage">投递管理</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:">个人信息</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a class="javascript:;" href="${pageContext.request.contextPath}/seeker/seekerShow?id=${sessionScope.seeker.id}">信息展示 </a>
                    </dd>
                    <dd class="">
                        <a class="javascript:;" href="${pageContext.request.contextPath}/seeker/seekerEdit">信息编辑</a>
                    </dd>
                </dl>
            </li>

        </ul>
    </div>
</div>