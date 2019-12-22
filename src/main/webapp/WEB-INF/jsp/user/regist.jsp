<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>


<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">单行输入框</label>
    <div class="layui-input-block">
      <input type="text" name="name" lay-verify="title" autocomplete="off" placeholder="用户名" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">单行输入框</label>
    <div class="layui-input-block">
      <input type="text" name="password" lay-verify="title" autocomplete="off" placeholder="密码" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
 
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //日期
  laydate.render({
    elem: '#date'
  });
  laydate.render({
    elem: '#date1'
  });
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    // title: function(value){
    //   if(value.length < 5){
    //     return '标题至少得5个字符啊';
    //   }
    // }
    // ,pass: [
    //   /^[\S]{6,12}$/
    //   ,'密码必须6到12位，且不能出现空格'
    // ]
    // ,content: function(value){
    //   layedit.sync(editIndex);
    // }
  });
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    // data.field.shstate = 1;
    // $.ajax({
    //   url:"../BBS/get",async:false，
    //   data:data.field
    // });
          $.ajax({
            "type":"post",
            "url":"show",
            "data":data.field,
            "success":function(data){
                alert(data);
            }
          });
  });

  //表单取值
  layui.$('#LAY-component-form-getval').on('click', function(){
    var data = form.val('example');
    alert(JSON.stringify(data));
  });
  
});
</script>
