<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<div class="layui-layout layui-layout-admin">
    <%@ include file="/WEB-INF/jsp/common/header.jsp"%>

    <form class="layui-form layui-form-pane" action="">


        <div class = "layui-form-item">
            <div class="layui-col-md3">
                <label class="layui-form-label">职位名称</label>
                <div class="layui-input-block">
                    <label>
                        <input type = "text" name="name" lay-verify="name" autocomplete="off" placeholder="请输入搜索内容" class="layui-input">
                    </label>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">所在地</label>
                <div class="layui-input-inline">
                    <label>
                        <select name="place"  >
                            <option value="beijing">北京</option>
                            <option value="shanghai">上海</option>
                            <option value="hangzhou">杭州</option>
                            <option value="shenzhen">深圳</option>
                            <option value="guangzhou">广州</option>
                            <option value="xiamen">厦门</option>
                            <option value="zhengzhou">郑州</option>
                        </select>
                    </label>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">职位月薪</label>
            <div class="layui-input-block">
                <input type="radio" name="salary" value="all" title="全部" checked="">
                <input type="radio" name="salary" value="s3" title="3k以下">
                <input type="radio" name="salary" value="s35" title="3-5k" >
                <input type="radio" name="salary" value="s510" title="5-10k">
                <input type="radio" name="salary" value="s1015" title="10-15k">
                <input type="radio" name="salary" value="s15" title="15k以上">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">行业类别</label>
            <div class="layui-input-block">
                <input type="checkbox" name="profession[hardware]" title="计算机软件/硬件">
                <input type="checkbox" name="profession[repair]" title="计算机系统/维修">
                <input type="checkbox" name="profession[serve]" title="通信(设备/运营/服务)">
                <input type="checkbox" name="profession[business]" title="互联网/电子商务">
                <input type="checkbox" name="profession[game]" title="网络游戏">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="button" class="layui-btn" lay-submit lay-filter="jobFind">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>

    </form>
    <table class="layui-hide" id="demo" lay-filter="test"></table>
</div>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <%
        if(session.getAttribute("seeker")!=null){
            %>
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="delivery">投递</a>

    <%
        }
    %>
</script>

<script>
    layui.config({
        version: '1575889601627' //为了更新 js 缓存，可忽略
    });

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider','layedit','form'], function(){


        var laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,slider = layui.slider //滑块
            ,layedit = layui.layedit
            ,form=layui.form


        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 420
            ,url: '${pageContext.request.contextPath}/enterprise/doPositionsGet?key=selectAll&value=' //数据接口
            ,title: '职位表'
            ,id:'positionTable'
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
                {type: 'checkbox', fixed: 'right' }
                ,{field: 'id', title: 'ID', width:80, sort: true, fixed: 'left', totalRowText: '合计：'}
                ,{field: 'name', title: '职位名', width:180}
                ,{field: 'salary', title: '薪金', width:150}
                ,{field: 'demands', title: '需求人数', width:150}
                ,{field: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]]
        });

        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                $(location).attr('href', '${pageContext.request.contextPath}/enterprise/positionShow?id='+data.id);
                // layer.msg("哈哈"+data.positionId);
            }else if(layEvent==='delivery'){
                $(location).attr('href', '${pageContext.request.contextPath}/seeker/deliveryResume?positionId='+data.id);
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

        //滑块
        var sliderInst = slider.render({
            elem: '#sliderDemo'
            ,input: true //输入框
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //监听提交
        form.on('submit(jobFind)', function(data){

            table.reload('positionTable', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,url: '${pageContext.request.contextPath}/enterprise/doPositionsGet?key=name&value='+data.field.name //数据接口
                , method: 'post'
            });
        });
    });
</script>

<%-- <%@ include file="/WEB-INF/jsp/common/footer.jsp"%> --%>
