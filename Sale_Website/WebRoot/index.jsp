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
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
	<div class="index_content">
		<jsp:include page="index-left.jsp" />
		 <div class="con_right">
		<div class="index_box_3">
			<div class="index_box_1">
				<a href="#"><img src="images/index_adver1.jpg" alt="广告图" />
				</a>
			</div>
			<div class="right_top">
				<span>热门推荐</span><a href="#" title="">查看更多热门推荐&gt;&gt;</a>
			</div>
			<div class="right_box3">
				<div class="index_banner2">
					<img src="images/index_adver2.jpg" />
				</div>
				<div class="right_con3">
					<div class="con_pic3">
						<img class="img1" src="images/index_pic10.jpg" alt="图片" /> <span><a
							href="#"><img class="img2" src="images/my_custom.gif" />
						</a>
						</span>
					</div>
				</div>
			</div>
		</div>
		<div class="index_box_3">
			<div class="right_top">
				<span>热门推荐</span><a href="#" title="">查看更多热门推荐&gt;&gt;</a>
			</div>

			<%
				for (int i = 0; i < 8; i++) {
			%>
			<div class="right_box4">
				<div class="con_pic4">
					<a href="#" title=""><img src="images/index_pic2.jpg"
						alt="图片名称" />
					</a>
				</div>
				<div class="con_txt4">
					<a href="#">杯子影像</a>
				</div>
			</div>
			<%
				}
			%>
		</div>
		<div class="index_box_3">
			<div class="right_top">
				<span>热门推荐</span><a href="#" title="">查看更多热门推荐&gt;&gt;</a>
			</div>

			<%
				for (int i = 0; i < 12; i++) {
			%>
			<div class="right_box4">
				<div class="con_pic4">
					<a href="#" title=""><img src="images/index_pic2.jpg"
						alt="图片名称" />
					</a>
				</div>
				<div class="con_txt4">
					<a href="#">杯子影像</a>
				</div>
			</div>
			<%
				}
			%>
		</div>
            </div>
</div>
</div> 
</body>
</html>
