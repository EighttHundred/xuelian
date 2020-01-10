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
                                    <label class="layui-form-label">职位名称</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.name}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位简介</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.introduction}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">所在城市</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.city}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位工作</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.duty}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位需求</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.requirement}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职务待遇</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.welfare}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职位月薪</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.salary}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">招聘人数</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${position.demands}</label>
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