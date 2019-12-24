<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<form class="layui-elem-field site-demo-button" action="">
  <button type="button" class="layui-btn layui-btn-primary layui-btn-lg" lay-submit lay-filter="seekerRegist">用户注册</button>
  <button type="button" class="layui-btn layui-btn-primary layui-btn-lg" lay-submit lay-filter="enterpriseRegist">企业注册</button>
</form>
 
<script>

layui.use(['form'], function(){
  var form = layui.form;
  
  form.on('submit(seekerRegist)', function(data){
    $(location).attr('href', 'seekerRegist');
  });

  form.on('submit(enterpriseRegist)', function(data){
    $(location).attr('href', 'enterpriseRegist');
  });
  
});

</script>
