<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>layui在线调试</title>
    <link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css?t=1575889601624" media="all">
    <style>
        body{margin: 10px;}
        .demo-carousel{width:500px;height: 500px; line-height: 500px; text-align: center;}
    </style>
</head>
<body>

<%--<blockquote class="layui-elem-quote layui-text">--%>
<%--鉴于小伙伴的普遍反馈，先温馨提醒两个常见“问题”：1. <a href="/doc/base/faq.html#form" target="_blank">为什么select/checkbox/radio没显示？</a> 2. <a href="/doc/modules/form.html#render" target="_blank">动态添加的表单元素如何更新？</a>--%>
<%--</blockquote>--%>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>注册</legend>
</fieldset>

<form class="layui-form" action="">
    <div class="layui-form-move">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" lay-reqtext="用户名是必填项，岂能为空？" placeholder="请输入邮箱或手机号" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">验证手机</label>
            <div class="layui-input-inline">
                <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">验证邮箱</label>
            <div class="layui-input-inline">
                <input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">出生日期:</label>
        <div class="layui-input-inline">
            <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
        </div>
    </div>
</div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="name" lay-verify="name" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">身份证号</label>
            <div class="layui-input-inline">
                <input type="text" name="identity" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">单行选择框</label>
        <div class="layui-input-inline">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="0">写作</option>
                <option value="1" selected="">阅读</option>
                <option value="2">游戏</option>
                <option value="3">音乐</option>
                <option value="4">旅行</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">密保问题</label>
            <div class="layui-input-inline">
                <select name="quiz">
                    <option value="">请选择问题</option>
                    <option value="你工作的第一个城市">你工作的第一个城市</option>
                    <option value="你的工号">你的工号</option>
                    <option value="你最喜欢的老师">你最喜欢的老师</option>
                </select>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">搜索选择框</label>
            <div class="layui-input-inline">
                <select name="modules" lay-verify="required" lay-search="">
                    <option value="">直接选择或搜索选择</option>
                    <option value="1">layer</option>
                    <option value="2">form</option>
                    <option value="3">layim</option>
                    <option value="4">element</option>
                    <option value="5">laytpl</option>
                    <option value="6">upload</option>
                    <option value="7">laydate</option>
                    <option value="8">laypage</option>
                    <option value="9">flow</option>
                    <option value="10">util</option>
                    <option value="11">code</option>
                    <option value="12">tree</option>
                    <option value="13">layedit</option>
                    <option value="14">nav</option>
                    <option value="15">tab</option>
                    <option value="16">table</option>
                    <option value="17">select</option>
                    <option value="18">checkbox</option>
                    <option value="19">switch</option>
                    <option value="20">radio</option>
                </select>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">开关-默认开</label>
        <div class="layui-input-block">
            <input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" lay-text="ON|OFF">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" title="男" checked="">
            <input type="radio" name="sex" value="女" title="女">
            <input type="radio" name="sex" value="禁" title="禁用" disabled="">
        </div>
    </div>

    <!--<div class="layui-form-item layui-form-text">
      <label class="layui-form-label">编辑器</label>
      <div class="layui-input-block">
        <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="LAY_demo_editor"></textarea>
      </div>
    </div>-->
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

    <div class="layui-tab-content" style="width: 500px;float: left">
        <div class="layui-tab-item layui-show">

            <div class="layui-carousel" id="test1">
                <div carousel-item>
                    <div><p class="layui-bg-green demo-carousel">在这里，你将以最直观的形式体验 layui！</p></div>
                    <div><p class="layui-bg-red demo-carousel">在编辑器中可以执行 layui 相关的一切代码</p></div>
                    <div><p class="layui-bg-blue demo-carousel">你也可以点击左侧导航针对性地试验我们提供的示例</p></div>
                    <div><p class="layui-bg-orange demo-carousel">如果最左侧的导航的高度超出了你的屏幕</p></div>
                    <div><p class="layui-bg-cyan demo-carousel">你可以将鼠标移入导航区域，然后滑动鼠标滚轮即可</p></div>
                </div>
            </div>
        </div>
    </div>
    </div>
</form>

<!-- 示例-970 -->
<ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>
<script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
var form = layui.form
,layer = layui.layer
,layedit = layui.layedit
,laydate = layui.laydate;

//日期
laydate.render({
elem: '#date'
});
laydate.render({
elem: '#date1'
});

//创建一个编辑器
var editIndex = layedit.build('LAY_demo_editor');

//自定义验证规则
form.verify({
title: function(value){
if(value.length < 5){
return '标题至少得5个字符啊';
}
}
,pass: [
/^[\S]{6,12}$/
,'密码必须6到12位，且不能出现空格'
]
,content: function(value){
layedit.sync(editIndex);
}
});

//监听指定开关
form.on('switch(switchTest)', function(data){
layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
offset: '6px'
});
});

//监听提交
form.on('submit(demo1)', function(data){
layer.alert(JSON.stringify(data.field), {
title: '最终的提交信息'
})
return false;
});

//表单赋值
layui.$('#LAY-component-form-setval').on('click', function(){
form.val('example', {
"username": "贤心" // "name": "value"
,"password": "123456"
,"interest": 1
,"like[write]": true //复选框选中状态
,"close": true //开关状态
,"sex": "女"
,"desc": "我爱 layui"
});
});

//表单取值
layui.$('#LAY-component-form-getval').on('click', function(){
var data = form.val('example');
alert(JSON.stringify(data));
});
});
layui.config({
    version: '1575889601624' //为了更新 js 缓存，可忽略
});

layui.use(['carousel'], function() {
    var
        carousel = layui.carousel //轮播
    //执行一个轮播实例
    carousel.render({
        elem: '#test1'
        , width: '100%' //设置容器宽度
        , height: 500
        , arrow: 'none' //不显示箭头
        , anim: 'fade' //切换动画方式
    });
});
</script>
</body>
</html>