<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>
<%@ include file="/WEB-INF/jsp/enterprise/sider.jsp"%>

<form class="layui-form" action="" >
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位名称</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="name" lay-verify="name" autocomplete="off" value="${position.name}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位简介</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="introduction" lay-verify="introduction" autocomplete="off" value="${position.introduction}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">所在城市</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="city" lay-verify="city" autocomplete="off" value="${position.city}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位工作</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="duty" lay-verify="duty" autocomplete="off" value="${position.duty}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位需求</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="requirement" lay-verify="requirement" autocomplete="off" value="${position.requirement}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职务待遇</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="welfare" lay-verify="welfare" autocomplete="off" value="${position.welfare}" class="layui-input">
                                        </label>
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位月薪</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="salary" lay-verify="salary" autocomplete="off" value="${position.salary}" class="layui-input">
                                        </label>
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">招聘人数</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="demands" lay-verify="demands" autocomplete="off" value="${position.demands}" class="layui-input">
                                        </label>
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn" lay-submit lay-filter="positionEdit">提交</button>
                                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                    </div>
                                </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>

</form>
</div>

<script>

layui.use(['form'], function(){
    var form = layui.form;


  //监听提交
  form.on('submit(positionEdit)', function(data){
    $.ajax({
      async:false,
      type:"post",
      url:"${pageContext.request.contextPath}/enterprise/doPositionUpdate?id=${position.id}&enterpriseId=${sessionScope.enterprise.id}",
      data:data.field,
      dataType:'text',
      success:function(data){
        if(data==='SUCCESS'){
            alert('修改成功');
            $(location).attr('href', 'positionManage');
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