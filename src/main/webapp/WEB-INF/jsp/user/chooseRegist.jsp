<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
<style>
  #zxd_x1{width:800px; height:500px;text-align:center;font-size:16px;color:red;position:absolute;right:0; top:0;cursor:pointer;}
</style>


<div class="layui-row">
  <div class="layui-col-xs6">
    <div class="grid-demo grid-demo-bg1">
      <form class="layui-elem-field site-demo-button" action="">
        <button type="button" class="layui-btn" lay-submit lay-filter="seekerRegist">用户注册</button>
      </form>
    </div>
  </div>
  <div class="layui-col-xs6">
    <div class="grid-demo">
      <form class="layui-elem-field site-demo-button" action="">
        <button type="button" class="layui-btn" lay-submit lay-filter="enterpriseRegist">企业注册</button>
      </form>
    </div>
  </div>
</div>
</div>
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