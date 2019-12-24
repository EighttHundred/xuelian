<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>用户注册</legend>
</fieldset>

<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-block">
      <input type="text" name="mailAddress" lay-verify="title" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">手机号</label>
    <div class="layui-input-block">
      <input type="text" name="phoneNumber" lay-verify="title" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-block">
      <input type="password" name="passWord" lay-verify="pass" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>

    <div class="layui-form-item">
    <label class="layui-form-label">重复输入密码</label>
    <div class="layui-input-block">
      <input type="password" name="passWordCheck" lay-verify="passCheck" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" lay-submit lay-filter="registUser">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
 
<script>

layui.use(['form'], function(){
  var form = layui.form;
  
  form.verify({
    pass: [
      /^[\S]{6,}$/
      ,'密码必须大于6位'
    ],
    passCheck: function(){
      if($("input[name='passWord'").val()!=$("input[name='passWordCheck'").val()){
        return '两次密码输入不一致';
      }
    }
  });
  
  //监听提交
  form.on('submit(registUser)', function(data){
    $.ajax({
      async:false,
      type:"post",
      url:"seekerRegist",
      data:data.field,
      success:function(data){
        if(data=='true'){
          $(location).attr('href', 'login');
        }else{
          alert('登陆失败');
        }
      },
      error:function(){
        alert("error");
      }
    });
    
  });
  
});
</script>
