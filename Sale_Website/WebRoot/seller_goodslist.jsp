<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/index.css" />
<link type="text/css" rel="stylesheet" href="css/product.css" />
<link type="text/css" rel="stylesheet" href="css/user.css" />
<script type="text/javascript" src="js/common.js"></script>
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="user_content">
			<jsp:include page="seller_left.jsp" />
			<div class="con_right">
				<div class="user_con">
					<div class="user_pub">
						<a href="" onClick="product_style(2)">商品浏览</a> <select
							name="goodsType">
							<option>查看全部</option>
							<option>类型</option>
							<option>款式</option>
						</select>
					</div>
					<div id="pro_box" class="box_3_list">
						<form id="formCart" name="formCart" method="post" action="">
							<table width="99%" align="center">
								<tr>
									<td>商品图片</td>
									<td>商品名字</td>
									<td>商品价格</td>
									<td>商品销量</td>
									<td>商品数量</td>
									<td>操作</td>
								</tr>
								<tr>
									<td><a href="#" title=""><img
											style="width:80px;heigtht:80px;" src="" alt="产品图片"> </a></td>
									<td></td>
									<td><span class="font_2">￥</span></td>
									<td><span class="font_2"></span>
									</td>
									<td><span class="font_2"></span></td>
									<td><a href="GoodsServlet?method=selectgoods&id="
										Style="color:red;font-weight:bold;">商品详情</a><br> <a
										href="GoodsServlet?method=deletegoods&id="
										Style="color:red; font-weight:bold;">删除商品</a></td>
								<tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
