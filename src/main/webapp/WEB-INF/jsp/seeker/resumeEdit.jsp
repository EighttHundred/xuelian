<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>
<%@ include file="/WEB-INF/jsp/seeker/sider.jsp"%>

<form class="layui-form" action="" >
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">姓名</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="name" lay-verify="name" autocomplete="off" value="${resume.name}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">年龄</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="age" lay-verify="age" autocomplete="off" value="${resume.age}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">手机号</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="phoneNumber" lay-verify="phoneNumber" autocomplete="off" value="${resume.phoneNumber}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">邮箱</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="email" lay-verify="" autocomplete="off" value="${resume.email}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">意向</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="intention" lay-verify="intention" autocomplete="off" value="${resume.intention}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">教育经历</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="educationExperience" lay-verify="educationExperience" autocomplete="off" value="${resume.educationExperience}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">在校经历</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="campusExperience" lay-verify="campusExperience" autocomplete="off" value="${resume.campusExperience}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作经历</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="workExperience" lay-verify="workExperience" autocomplete="off" value="${resume.workExperience}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">项目经历</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="projectExperience" lay-verify="projectExperience" autocomplete="off" value="${resume.projectExperience}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">论文发表</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="paperPublication" lay-verify="paperPublication" autocomplete="off" value="${resume.paperPublication}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">获奖情况</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="awards" lay-verify="awards" autocomplete="off" value="${resume.awards}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">个人技能</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="skills" lay-verify="skills" autocomplete="off" value="${resume.skills}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">自我评价</label>
                                    <div class="layui-input-inline"style="width: 300px;height: 20px;">
                                        <label>
                                            <input type="text" name="selfEvaluation" lay-verify="selfEvaluation" autocomplete="off" value="${resume.selfEvaluation}" class="layui-input">
                                        </label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn" lay-submit lay-filter="resumeUpdate">提交</button>
                                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                    </div>
                                </div>
                            </div>
                            <div class="layui-col-md6">
                            </div>
                        </div>
                    </div>
                    <div class="site-tree-mobile layui-hide">
                        <i class="layui-icon">&#xe602;</i>
                    </div>
                    <div class="site-mobile-shade"></div>
                </div>
            </div>
        </div>
    </div>

</form>

</div>
<script>

    layui.use(['form'], function(){
        var form = layui.form;

        form.verify({

        });

        //监听提交
        form.on('submit(resumeUpdate)', function(data){
            $.ajax({
                async:false,
                type:"post",
                url:"doResumeUpdate?id=${resume.id}&seekerId=${resume.seekerId}",
                data:data.field,
                dataType:'text',
                success:function(data){
                    if(data==='SUCCESS'){
                        alert('修改成功');
                    }else if(data==='FAIL'){
                        alert('修改失败')
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