<%-- 面试信息 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>企业中心</title>
    <style>
        #table{border: 1px solid black;
            float: left;
            padding: 3px;
            font-size: 16px;}
        .head{
            width: 49%;
            float: left;
        }
    </style>
</head>
<body>
<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">

        <ul class="layui-nav layui-nav-tree site-demo-nav">

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">创建职务</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="Jobedit.jsp">职务编辑</a>
                    </dd>
                    <dd>
                        <a href="Jobpreview.jsp">职务预览</a>
                    </dd>
                    <dd>
                        <a href="Jobsend.jsp">职务上传</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">求职管理</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="Apply.jsp">申请面试</a>
                    </dd>
                    <dd class="">
                        <a href="follow.jsp">谁在关注我</a>
                    </dd>
                    <dd class="">
                        <a href="invite.jsp">邀请外发记录</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">账号管理</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="Cominformation.jsp">基本资料</a>
                    </dd>
                    <dd class="">
                        <a href="">账号安全</a>
                    </dd>
                    <dd class="">
                        <a href="message.jsp">我的消息</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/tab.html">安全退出</a>
                </dl>
            </li>
        </ul>
    </div>
</div>
<div class="layui-body layui-tab-content site-demo site-demo-body">

    <div class="layui-tab-item layui-show">
        <div class="layui-main">
            <div id="LAY_preview">
                <div id="table">
                    <div class="head">姓名</div>
                    <div class="head">联系方式</div><br/>

                </div>
                        </div>
                    </div>
                </div>
                <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                <div class="site-tree-mobile layui-hide">
                    <i class="layui-icon">&#xe602;</i>
                </div>
                <div class="site-mobile-shade"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
