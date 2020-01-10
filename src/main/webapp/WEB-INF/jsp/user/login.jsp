<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquerysession.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>用户登录</legend>
</fieldset>

<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">账号</label>
    <div class="layui-input-block">
      <label>
        <input type="text" name="phone" lay-verify="phone" autocomplete="off" placeholder="" class="layui-input">
      </label>
    </div>
  </div>
  

  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-block">
      <label>
        <input type="password" name="passWord" lay-verify="passWord" autocomplete="off" placeholder="" class="layui-input">
      </label>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" lay-submit lay-filter="login1">登录</button>
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
    phone: [
      /[\S]{1,}/
      ,'账号不能为空'
    ]
  });
  
  form.on('submit(login1)', function(data){

    $.ajax({
      async:false,
      type:"post",
      url:"doLogin",
      data:data.field,
      dataType:'text',
      success:function(data){
        if(data==='SUCCESS'){
          alert('登陆成功');
          var userType="${sessionScope.user.userType}";
          $(location).attr('href', "../index");
        }else if(data==='WRONG'){
          alert('密码错误');
        }else if(data==='NONE'){
          alert('没有这个用户');
        }else{
          alert('登陆失败 '+data);
        }
      },
      error:function(){
        alert("error");
      }
    });

  });

});
</script>
