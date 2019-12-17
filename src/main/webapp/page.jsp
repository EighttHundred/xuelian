<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<link rel="stylesheet" type="text/css" href="static/layui/css/layui.css">
<script type="application/javascript" src="static/jquery-3.4.1.min.js"></script>
<script src="static/layui/layui.js" charset="utf-8"></script>

<div id="demo7"></div>
<script>
layui.use(['laypage', 'layer'], function(){
  var laypage = layui.laypage
  ,layer = layui.layer;

  laypage.render({
    elem: 'demo7'
    ,count: 100
    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
    ,jump: function(obj){
      console.log(obj)
    }
  });
});
</script>