<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<link rel="stylesheet" type="text/css" href="static/layui/css/layui.css">
<script type="application/javascript" src="static/jquery-3.4.1.min.js"></script>
<script src="static/layui/layui.js" charset="utf-8"></script>

<ul class="layui-nav">
  <li class="layui-nav-item">
    <a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">控制台</a>
  </li>
  <li class="layui-nav-item"><a href="">首页</a></li>
  <li class="layui-nav-item"><a href="">招聘信息</a></li>
  <li class="layui-nav-item"><a href="">直击招聘会</a></li>
  <li class="layui-nav-item"><a href="">学联论坛</a></li>

  <li class="layui-nav-item">
    <a href="javascript:;">更多</a>
    <dl class="layui-nav-child">
      <dd class="layui-this"><a href="">选项1</a></dd>
      <dd><a href="">选项2</a></dd>
      <dd><a href="">选项3</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item" lay-unselect="">
    <a href="javascript:;"><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
    <dl class="layui-nav-child">
      <dd><a href="javascript:;">修改信息</a></dd>
      <dd><a href="javascript:;">安全管理</a></dd>
      <dd><a href="javascript:;">退了</a></dd>
    </dl>
  </li>
</ul>

<script>
  layui.use('element', function(){
    var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
    //监听导航点击
    element.on('nav(demo)', function(elem){
      //console.log(elem)
      layer.msg(elem.text());
    });
  });
</script>