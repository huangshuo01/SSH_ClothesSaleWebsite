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
				<div class="pad_border">
					<div class="user_con">
						<div class="subject">
							<span>商品信息</span>
						</div>
						<form name="frm" method="post">

							<table width="98%" align="center">
								<tr>
									<td class="align_right">商品编码:</td>
									<td class="align_left"><input type="text" name="Goods_Id1"
										value="" />
									</td>
								</tr>
								<tr>
									<td class="align_right">商品名字:</td>
									<td class="align_left"><input type="text"
										name="Goods_Name1" value="" />
									</td>
								</tr>
								<tr>
									<td class="align_right">商品图片:</td>
									<td class="align_left"><img name="Goods_Pic" id="pic"
										src="images/" /><input type="file" name="imgOne1" id="imgOne"
										value="" onchange="preImg(this.id,'pic');" /></td>
								</tr>
								<tr>
									<td class="align_right">商品类型:</td>
									<td valign="middle" class="align_left"><select
										name="Goods_Type1" Style="width:100px">
											<option selected="selected"></option>
									</select>
									</td>
								</tr>
								<tr>
									<td class="align_right">商品款式:</td>
									<td valign="middle" class="align_left"><select
										name="Goods_Style1" Style="width:100px">

											<option selected="selected"></option>

											<option></option>
									</select>
									</td>
								</tr>
								<tr>
									<td class="align_right">商品价格:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_Price1" type="text" value="" /><span> *</span>
									</td>
								</tr>
								<tr>
									<td class="align_right">商品数量:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_Num1" type="text" value="" /><span> *</span>
									</td>
								</tr>
								<tr>
									<td class="align_right">商品销量:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_SaleNum1" readonly type="text" value="" />
									</td>
								</tr>
								<tr>
									<td class="align_right">所属商户:</td>
									<td valign="middle" class="align_left"><input
										name="Seller_Id1" type="text" value="" />
									</td>
								</tr>
								<tr>
									<td class="align_right">商品描述:</td>
									<td valign="middle" class="align_left"><textarea
											name="Goods_Describe1" rows="10" cols="50"></textarea><span>
											*</span>
									</td>
								</tr>
								<tr>
									<td colspan="2" class="td_center"><input name="update"
										type="submit" class="bnt_blue_1" value="修改"
										onclick="updategoods()" /> <input name="delete" type="submit"
										class="bnt_blue_1" value="删除" onclick="deletegoods()" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
