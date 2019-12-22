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
<form class="layui-form" action="">
    <div class="layui-form-item">
            <div class="layui-input-inline"style="width: 100px">
                <select name="quiz1">
                    <option value="">类别</option>
                        <option value="职位">职位</option>
                        <option value="公司">公司</option>
                </select>
            </div>
        <div class="layui-input-inline"style="width: 500px">
            <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入搜索内容" class="layui-input">
        </div>
            <div class="layui-input-inline">
                <button type="button" class="layui-btn" lay-submit="" lay-filter="demo">搜索</button>
                </div>
    </div>
        <div class="layui-form-item">
            <div class="layui-inline"align="left">
                <label class="layui-form-label">地区:</label>
                <div class="layui-input-inline">
                    <select name="quiz2">
                        <option value="">地区</option>
                        <option value="郑州">郑州</option>
                        <option value="上海">上海</option>
                        <option value="北京">北京</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
                <label class="layui-form-label">职位:</label>
                <div class="layui-input-inline">
                    <select name="quiz3">
                        <option value="">互联网</option>
                        <option value="Java">Java</option>
                        <option value="Python">Python</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="quiz4">
                        <option value="">金融</option>
                        <option value="保险">保险</option>
                        <option value="证券">证券</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="quiz5">
                        <option value="">制造业</option>
                        <option value="船舶">船舶</option>
                        <option value="火车">火车</option>
                    </select>
                </div>
        </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">薪酬范围:</label>
            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid">-</div>
            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" name="price_max" placeholder="￥" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
            <div class="layui-input-inline">
                <button type="button" class="layui-btn" lay-submit="" lay-filter="demo">搜索</button>
            </div>
    </div>
</form>
<script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>
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
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
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
</script>
</body>
</html>