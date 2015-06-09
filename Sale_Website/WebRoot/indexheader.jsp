<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/index.css" />
<link type="text/css" rel="stylesheet" href="css/product.css" />
<script type="text/javascript" src="js/common.js"></script>
<title>爱玛克首页</title>
</head>
<body >
<div id="wrap">
<div class="header">
    <ul id="QuickMenu">
        <li class="my_account">你好,欢迎光临！</span></li>
        <s:if test="#session.Type==null">
         <li class="my_account"><a href="login.jsp" id="login">登录</a></li>
         <li class="my_account"><a href="register.jsp" id="reg">注册</a></li>
         </s:if>
         <s:else>
         <li class="my_account"><s:property value="#session.Id"/></li>
         <li class="my_account"><a href="Goods!findGoodsListBySeller.action" id="reg">管理</a></li>        
         <li class="my_account"><a href="Login!exit.action" id="reg">退出</a></li>        
         </s:else>
    </ul>      
    <div id="logo" height="330px">
    </div>
    <div id="nav">
        <ul class="mian_nav">
            <li class="nav_index"><a href="indexshop.jsp" title="">首页</a></li>
            <li class=""><a href="Goods!findGoodsListAll.action?pageNo=1">所有产品</a></li>
        </ul>
    </div>
</div>
<div id="search">
    <div class="search_con">
        <div class="menu">
            <div id="product_class">
                <div class="product_class_txt">商品搜索:</div>
            </div>
        </div>
        <div class="search_form">
            <form method="post" action="">
                <div class="search_txt"><input type="text" value="" name="" /></div>
                <div class="search_sub"><input type="submit" value="" name="" /></div>
            </form>
        </div>

    </div>
</div>
</body>
</html>
