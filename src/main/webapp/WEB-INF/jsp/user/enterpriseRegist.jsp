<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>企业注册</legend>
</fieldset>

<form class="layui-form" action="">

  <div class="layui-form-item">
    <label class="layui-form-label">企业名</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">手机号</label>
    <div class="layui-input-block">
      <input type="text" name="phone"  autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-block">
      <input type="password" name="passWord"  autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>

    <div class="layui-form-item">
    <label class="layui-form-label">重复输入密码</label>
    <div class="layui-input-block">
      <input type="password" name="passWordCheck" lay-verify="passWordCheck" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" lay-submit lay-filter="enterpriseRegist">提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
</div>
<script>

layui.use(['form'], function(){
  var form = layui.form;
  
  form.verify({
    passWord: [
      /^[\S]{6,}$/
      ,'密码必须大于6位'
    ],
    passWordCheck: function(){
      if($("input[name='passWord'").val()!=$("input[name='passWordCheck'").val()){
        return '两次密码输入不一致';
      }
    }
  });
  
  //监听提交
  form.on('submit(enterpriseRegist)', function(data){
    $.ajax({
      async:false,
      type:"post",
      url:"doEnterpriseRegist",
      data:data.field,
      dataType:'text',
      success:function(data){
        if(data==='SUCCESS'){
          alert('注册成功');
          $(location).attr('href', 'login');
        }else if(data==='FAIL'){
          alert('该手机号已存在');
        }else{
          alert('注册失败'+data);
        }
      },
      error:function(){
        alert("error");
      }
    });
    
  });
  
});
</script>
