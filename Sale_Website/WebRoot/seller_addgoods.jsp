<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
						<form action="GoodsServlet?method=addgoods" method="post">
							<table width="98%" align="center">
								<tr>
									<td class="align_right">商品名字:</td>
									<td class="align_left"><input type="text"
										name="Goods_Name" value="" /></td>
								</tr>
								<tr>
									<td class="align_right">商品图片:</td>
									<td class="align_left"><img name="Goods_Pic" id="pic"
										src="/images/" /><input type="file" name="imgOne" id="imgOne"
										value="" onchange="preImg(this.id,'pic');" />
									</td>
								</tr>
								<tr>
									<td class="align_right">商品类型:</td>
									<td valign="middle" class="align_left"><select
										name="Goods_Type" Style="width:100px"><option>帽子</option>
											<option>衣服</option>
											<option>裤子</option>
											<option>鞋子</option>
									</select></td>
								</tr>
								<tr>
									<td class="align_right">商品款式:</td>
									<td valign="middle" class="align_left"><select
										name="Goods_Style" Style="width:100px"><option>新款</option>
											<option>旧款</option>
									</select></td>
								</tr>
								<tr>
									<td class="align_right">商品价格:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_Price" type="text" value="" /><span> *</span></td>
								</tr>
								<tr>
									<td class="align_right">商品数量:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_Num" type="text" value="" /><span> *</span></td>
								</tr>
								<tr>
									<td class="align_right">商品销量:</td>
									<td valign="middle" class="align_left"><input
										name="Goods_SaleNum" readonly type="text" value="0" /></td>
								</tr>
								<tr>
									<td class="align_right">所属商户:</td>
									<td valign="middle" class="align_left"><%=request.getSession().getAttribute("loginid")%></td>
								</tr>
								<tr>
									<td class="align_right">商品描述:</td>
									<td valign="middle" class="align_left"><textarea
											name="Goods_Describe" rows="10" cols="50" />
										</textarea><span> *</span></td>
								</tr>
								<tr>
									<td colspan="2" class="td_center"><input name="submit"
										type="submit" value="确认上架" onclick="insertgoods()" /> <input
										name="reset" type="reset" value="重置" />
									</td>
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
