<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>
<div class="layui-layout layui-layout-admin">

<%@ include file="/WEB-INF/jsp/common/header.jsp"%>
<div>
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">姓名</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.name}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">年龄</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.age}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">手机号</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.phoneNumber}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">邮箱</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.email}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">意向</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.intention}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">教育经历</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.educationExperience}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">在校经历</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.campusExperience}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作经历</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.workExperience}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">项目经历</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.projectExperience}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">论文发表</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.paperPublication}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">获奖情况</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.awards}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">个人技能</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.skills}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">自我评价</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${resume.selfEvaluation}</label>
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

</div>
</div>