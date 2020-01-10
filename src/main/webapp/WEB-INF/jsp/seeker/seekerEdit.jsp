<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>
<%@ include file="/WEB-INF/jsp/seeker/sider.jsp"%>

<form class="layui-form" action="" >
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">昵称</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="name"  autocomplete="off" value="${sessionScope.seeker.name}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">邮箱</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="mailAddress" lay-verify="mailAddress" autocomplete="off" value="${sessionScope.seeker.mailAddress}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">个人简介</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="profile" lay-verify="profile" autocomplete="off" value="${sessionScope.seeker.profile}" class="layui-input">
                                        </label>
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn" lay-submit lay-filter="seekerUpdate">提交</button>
                                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                    </div>
                                </div>
                            </div>
                            <div class="layui-col-md6">
                            </div>
                        </div>
                    </div>
                    <div class="site-tree-mobile layui-hide">
                        <i class="layui-icon">&#xe602;</i>
                    </div>
                    <div class="site-mobile-shade"></div>
                </div>
            </div>
        </div>
    </div>

</form>
</div>

<script>

    layui.use(['form'], function(){
        var form = layui.form;

        form.verify({

        });

        //监听提交
        form.on('submit(seekerUpdate)', function(data){
            $.ajax({
                async:false,
                type:"post",
                url:"doSeekerUpdate?id=${sessionScope.seeker.id}&userId=${sessionScope.user.id}",
                data:data.field,
                dataType:'text',
                success:function(data){
                    if(data==='SUCCESS'){
                        alert('修改成功');
                    }else if(data==='FAIL'){
                        alert('修改失败')
                    }else{
                        alert('出错了');
                    }
                },
                error:function(msg){
                    alert("error");
                }
            });

        });

    });
</script>