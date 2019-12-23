<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>


<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <ul class="layui-nav">
            <li class="layui-nav-item"><a href="">首页</a></li>
            <li class="layui-nav-item layui-this"><a href="">找工作</a></li>
            <li class="layui-nav-item"><a href="">招聘会</a></li>
            <li class="layui-nav-item"><a href="">社区</a></li>
            <li class="layui-nav-item"><a href="">个人中心</a></li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>
</div>


<script>
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script>
