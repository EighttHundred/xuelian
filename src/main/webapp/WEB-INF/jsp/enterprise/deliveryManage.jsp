<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

    <%@ include file="/WEB-INF/jsp/common/header.jsp"%>

    <table class="layui-hide" id="demo" lay-filter="test"></table>
</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看投递</a>
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="resume">查看简历</a>
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="seeker">查看投递者</a>
</script>

<script>
    layui.config({
        version: '1575889601627' //为了更新 js 缓存，可忽略
    });

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function(){
        var laydate = layui.laydate //日期
            ,laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,carousel = layui.carousel //轮播
            ,upload = layui.upload //上传
            ,element = layui.element //元素操作
            ,slider = layui.slider //滑块

        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 420
            ,url: '${pageContext.request.contextPath}/enterprise/doEnterpriseDeliveryGet?enterpriseId='+${sessionScope.enterprise.id}
            ,title: '投递表'
            ,parseData:function(res){
                return {
                    "code":0,
                    // "count":6,
                    "data":res
                }
            }
            ,page: true //开启分页
            ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,totalRow: true //开启合计行
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left', totalRowText: '合计：'}
                ,{field: 'seekerName', title: '姓名', width:100}
                ,{field:'positionName',title:'职位名',width:200}
                ,{field: 'enterpriseName', title: '公司名', width:200}
                ,{field: 'enterpriseId', title: '公司Id', width:80}
                ,{field: 'right', width: 500, align:'center', toolbar: '#barDemo'}
            ]]
        });

        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                $(location).attr('href', '${pageContext.request.contextPath}/seeker/deliveryShow?id='+data.id);
                // layer.msg("哈哈"+data.id);
            }else if(layEvent==='enterprise'){
                $(location).attr('href', '${pageContext.request.contextPath}/enterprise/enterpriseShow?id='+data.enterpriseId);
            }else if(layEvent==='resume'){
                $(location).attr('href','${pageContext.request.contextPath}/seeker/resumeShow?id='+data.resumeId);
            }else if(layEvent==='seeker'){
                $(location).attr('href','${pageContext.request.contextPath}/seeker/seekerShow?id='+data.seekerId);
            }

        });

        //分页
        laypage.render({
            elem: 'pageDemo' //分页容器的id
            ,count: 100 //总页数
            ,skin: '#1E9FFF' //自定义选中色值
            //,skip: true //开启跳页
            ,jump: function(obj, first){
                if(!first){
                    layer.msg('第'+ obj.curr +'页', {offset: 'b'});
                }
            }
        });

        //上传
        upload.render({
            elem: '#uploadDemo'
            ,url: 'doResumesGet' //上传接口
            ,done: function(res){
                console.log(res)
            }
        });

        //监听行工具事件


        //滑块
        var sliderInst = slider.render({
            elem: '#sliderDemo'
            ,input: true //输入框
        });

        //底部信息
        var footerTpl = lay('#footer')[0].innerHTML;
        lay('#footer').html(layui.laytpl(footerTpl).render({}))
            .removeClass('layui-hide');
    });
</script>