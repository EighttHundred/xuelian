<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
<script type="application/javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" charset="utf-8"></script>

<div class="layui-layout layui-layout-admin">
<%@ include file="/WEB-INF/jsp/common/header.jsp"%>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>学联招聘</title>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css"  media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/moban/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/static/moban/css/bootstrap.min.css" rel="stylesheet">
  <!-- Material Design Bootstrap -->
  <link href="${pageContext.request.contextPath}/static/moban/css/mdb.min.css" rel="stylesheet">
  <!-- Your custom styles (optional) -->
  <link href="${pageContext.request.contextPath}/static/moban/css/style.min.css" rel="stylesheet">

    <div class="container">
      <section class="card wow fadeIn" style="background-image: url(${pageContext.request.contextPath}/static/moban/img/gradient1.jpg);">
        <div class="card-body text-white text-center py-5 px-5 my-5">
          <h1 class="mb-4">
            <strong>学联招聘</strong>
          </h1>
          <p class="mb-4">
            <strong>高收入 好平台 新机遇</strong>
          </p>
        </div>
      </section>
      <hr class="my-5">
      <section class="text-center">

        <div class="row mb-4 wow fadeIn">

          <div class="col-lg-4 col-md-12 mb-4">
            <div class="card">
              <div class="view overlay">
                  <img src="${pageContext.request.contextPath}/static/moban/img/p5.jpg" class="card-img-top"
                       alt="">
                <a href="#">
                  <div class="mask rgba-white-slight"></div>
                </a>
              </div>
              <div class="card-body">
                <h4 class="card-title">校园招聘</h4>
                <p class="card-text">大学生找工作的好去处</p>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card">
              <div class="view overlay">
                <img src="${pageContext.request.contextPath}/static/moban/img/p1.jpg" class="card-img-top" alt="">
                <a href="${pageContext.request.contextPath}/jobFair">
                  <div class="mask rgba-white-slight"></div>
                </a>
              </div>
              <div class="card-body">
                <h4 class="card-title">招聘会</h4>
                <p class="card-text">优质招聘会 学联招聘联合百强企业推出</p>
                <a href="${pageContext.request.contextPath}/jobFair" target="_blank"
                  class="btn btn-primary btn-md">前往
                  <i class="fas fa-play ml-2"></i>
                </a>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card">
              <div class="view overlay">
                <img src="${pageContext.request.contextPath}/static/moban/img/p2.jpg" class="card-img-top" alt="">
                <a href="${pageContext.request.contextPath}/jobFind" target="_blank">
                  <div class="mask rgba-white-slight"></div>
                </a>
              </div>
              <div class="card-body">
                <h4 class="card-title">找工作</h4>
                <p class="card-text">找到你心仪的企业</p>
                <a href="${pageContext.request.contextPath}/jobFind" target="_blank" class="btn btn-primary btn-md">前往
                  <i class="fas fa-play ml-2"></i>
                </a>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>

</div>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/moban/js/jquery-3.4.1.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/moban/js/popper.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/moban/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/moban/js/mdb.min.js"></script>
  <script type="text/javascript">
    new WOW().init();
  </script>
