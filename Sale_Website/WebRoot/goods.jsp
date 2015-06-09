<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="index_content">
			<jsp:include page="index-left.jsp" />
			<div id="pro_box" class="box_3">
				<div class="index_box_3">
					<div class="right_top">
						<span>商品浏览</span><a href="#" title=""></a>
					</div>
					<s:iterator value="list" status="status">
						<div class="pro_con1">
							<table>
								<tr class="pro_img">
									<td><a href="#" title=""><img
											Style="width:150px; height:160px;"
											src="upload/<s:property value="goodsPic"/>" alt="产品图片" /> </a>
									</td>
								</tr>
								<tr class="pro_name">
									<td><a href="#" title="">商品名:<s:property
												value="goodsName" /> <s:hidden name="goodsId" /> </a>
									</td>
								</tr>
								<tr class="pro_price">
									<td>单价: <span>￥</span> <s:property value="goodsPrice" />
									</td>
								</tr>
								<tr class="pro_custom">
									<td><a
										href="ShopCart!addShopCart.action?goods.goodsId=<s:property value="goodsId"/>">
											<img style="text-align:center;:130px;height:30px;"
											src="images/incart.png" /> </a>
									</td>
								</tr>
							</table>
						</div>
					</s:iterator>
				</div>
				<table border="0" align="left" cellpadding="0" cellspacing="0">
					<span Style="font-size:5px;">&nbsp;&nbsp;当前第<s:property
							value="pageNo" /> / <s:property value="pageCount" />页</span>
				</table>
				<table border="1" align="right" cellpadding="0" cellspacing="0">
					<tr>
						<td width="40"><a href="Goods!findGoodsListAll?pageNo=1">首页</a>
						</td>
						<td width="45"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageNo-1"/>">上页</a>
						</td>
						<td width="45"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageNo+1"/>">下页</a>
						</td>
						<td width="40"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageCount"/>">尾页</a>
						</td>
					</tr>
				</table>

			</div>
		</div>
	</div>
</body>
</html>
