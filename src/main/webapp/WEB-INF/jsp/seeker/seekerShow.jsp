<%@ page import="ruanku.xuelian_requirement.model.User" %>
<%@ page import="ruanku.xuelian_requirement.common.enums.UserType" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>


<div class="layui-layout layui-layout-admin">
    <%@ include file="/WEB-INF/jsp/common/header.jsp"%>
    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <div class="layui-tab-item layui-show">
            <div class="layui-main">
                <div id="LAY_preview">
                    <div style="padding: 20px; background-color: #F2F2F2;">
                        <div class="layui-row layui-col-space15">
                            <div class="layui-col-md6">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">昵称</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${seeker.name}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">邮箱</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${seeker.mailAddress}</label>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">个人简介</label>
                                    <div class="layui-input-inline" style="width: 300px;height: 20px;">
                                        <label class="layui-form-label">${seeker.profile}</label>
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





<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>