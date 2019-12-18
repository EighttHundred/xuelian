<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ include file="/WEB-INF/jsp/common.jsp"%>

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