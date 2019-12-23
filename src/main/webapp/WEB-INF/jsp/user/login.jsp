<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>



<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>用户登录</legend>
</fieldset>

<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">账号</label>
    <div class="layui-input-block">
      <input type="text" name="userName" lay-verify="title" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  

  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-block">
      <input type="password" name="passWord" lay-verify="pass" autocomplete="off" placeholder="" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" lay-submit="" lay-filter="demo1">登录</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
 
<script>
layui.use(['form'], function(){
  var form = layui.form；
  
  form.verify({
    pass: [
      /^[\S]{6}$/
      ,'密码必须大于6位'
    ]
  });
  
  form.on('submit(demo1)', function(data){

    $.ajax({
      async:false,
      type:"post",
      url:"seekerRegist",
      data:data.field,
      success:function(data){
        if(data='true'){
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
