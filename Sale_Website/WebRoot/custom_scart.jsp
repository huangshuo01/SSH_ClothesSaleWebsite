<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/user.css" />
<link type="text/css" rel="stylesheet" href="css/flow.css" />
<script type="text/javascript" src="js/common.js"></script>
</head>
<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="user_content">
			<div class="flowBox">
				<h6>
					<span>商品列表</span>
				</h6>
				<s:form id="formCart" name="formCart" method="post" action=""
					theme="simple">
					<table width="99%" align="center">
						<tr>
							<th>商品名称</th>
							<th>类型</th>
							<th>款式</th>
							<th>价格</th>
							<th>购买数量</th>
							<th>小计</th>
							<th>操作</th>
						</tr>

						<tr>
							<td><a href="#" target="#"> <img
									src="upload/<s:property value=""/>" border="0" width="90"
									height="90" /> </a><br /> <a href="#" target="#" class="f6"><s:property
										value="" />
							</a>
							</td>
							<td><s:property value="" />
							</td>
							<td><s:property value="" />
							</td>
							<td>￥<s:property value="" />
							</td>
							<td><s:textfield name="" size="6" class="inputBg"
									style="text-align:center" /></td>
							<td><s:property value=""/></td>
							<td><a href="#" class="red_a">删除</a></td>
						</tr>
					</table>
					<table width="99%" align="center" border="0" cellpadding="5"
						cellspacing="1" bgcolor="#dddddd">
						<tr>
							<td class="align_left">购物金额总额<span class="color2"></span>
							</td>
							<td class="align_right"><input name="update" type="submit"
								class="bnt_blue_1" value="更新" onclick="updatecart()" />
								</td>
						</tr>
					</table>
					<input type="hidden" name="step" value="update_cart" />
				</s:form>
				<div class="operation">
					<span class="continue_btn"><a href="#"><img
							src="images/cart_btn1.jpg" alt="continue" /> </a> </span> <span
						class="end_btn"><a href="#"><img
							src="images/cart_btn2.jpg" alt="checkout" /> </a> </span>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
