<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ include file="/WEB-INF/jsp/util/dependency.jsp"%>

<table class="layui-hide" id="demo"></table>
<%-- <div id="myDiv"><h2>通过 AJAX 改变文本</h2></div>
<button id="b01" type="button">改变内容</button> --%>

<script>
$(document).ready(function(){
  $("#b01").click(function(){
  
  // htmlobj=$.ajax({url:"../BBS/get",async:false});
  // json=JSON.parse(htmlobj.responseText);
  // alert(json.userId);
  // $("#myDiv").html(json.userId);

    // $.get("/city",{cmd:"city",provinceId:provinceId},function(result){
		// 	//json字符串转换json对象
    //   result = JSON.parse(result);
		// 	for(var i=0;i<result.length;i++){
		// 		var json = result[i];
		// 		$("#citySelect").append("<option value='"+json.id+"'>"+json.name+"</option>")
		// 	}
		// })

  });
});
		

layui.use(['jquery','table'], function(){
  var table = layui.table
  ,$ = layui.$;

  table.render({
    elem: '#demo'
    ,height: 420
    ,url: 'get' //数据接口
    ,title: '用户表'
    ,page: true //开启分页
    ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
    ,totalRow: true //开启合计行
    ,parseData:function(res){
      return{
        "code":0
        ,"msg":""
        ,"count":1000
        ,"data":res
      }
    }
    ,cols: [[ //表头
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'userId', title: 'ID', width:80, sort: true, fixed: 'left', totalRowText: '合计：'}
      ,{field: 'mailAddress', title: '邮箱', width:80}
      ,{field: 'experience', title: '积分', width: 90, sort: true, totalRow: true}
      ,{field: 'sex', title: '性别', width:80, sort: true}
      ,{field: 'score', title: '评分', width: 80, sort: true, totalRow: true}
      ,{field: 'city', title: '城市', width:150} 
      ,{field: 'sign', title: '签名', width: 200}
      ,{field: 'classify', title: '职业', width: 100}
      ,{field: 'wealth', title: '财富', width: 135, sort: true, totalRow: true}
      ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
    ]]
  });

});
</script>
