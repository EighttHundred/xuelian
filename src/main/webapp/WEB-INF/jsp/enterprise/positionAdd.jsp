<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<form class="layui-form" action="" >
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位名称</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="name" lay-verify="name" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位简介</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="introduction" lay-verify="introduction" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">所在城市</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="city" lay-verify="city" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位工作</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="duty" lay-verify="duty" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位需求</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="requirement" lay-verify="requirement" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职务待遇</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="welfare" lay-verify="welfare" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位月薪</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="salary" lay-verify="salary" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">招聘人数</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <input type="text" name="demands" lay-verify="demands" autocomplete="off" placeholder="" class="layui-input">
                                    </div>
                                </div>
                            </div>
                            <div class="layui-col-md6">
                            </div>
                        </div>
                    </div>
                    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                    <div class="site-tree-mobile layui-hide">
                        <i class="layui-icon">&#xe602;</i>
                    </div>
                    <div class="site-mobile-shade"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" lay-submit lay-filter="positionAdd">提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>


<script>

layui.use(['form'], function(){
  var form = layui.form;
  
  form.verify({

  });
  
  //监听提交
  form.on('submit(positionAdd)', function(data){
    $.ajax({
      async:false,
      type:"post",
      url:"doPositionAdd",
      data:data.field,
      dataType:'text',
      success:function(data){
        if(data=='SUCCESS'){
            alert('添加成功');
        }else if(data=='FAIL'){
            alert('添加失败')
        }else{
            alert('出错了');
        }
      },
      error:function(msg){
        alert("error");
      }
    });
    
  });
  
});
</script>