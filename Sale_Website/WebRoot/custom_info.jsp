<%@ page language="java" import="java.util.*"
	pageEncoding="utf-8"%>
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
<jsp:include page="indexheader.jsp"/>
	<div class="main">
    <div class="user_content">
    <jsp:include page="custom_left.jsp"/>
    <div class="con_right">
	<div class="pad_border">
		<div class="user_con">
			<div class="subject">
				<span>基本信息</span>
			</div>
			<form
				action="UserServlet?method=updateInfo&username="
				method="post" name="theForm" id="theForm">
				<table width="98%" align="center">
					<tr>
						<td class="align_right">ID</td>
						<td class="align_left"></td>
					</tr>
					<tr>
						<td class="align_right">姓名：</td>
						<td valign="middle" class="align_left"><input name="name"
							type="text" value="" size="25" /></td>
					</tr>
					<tr>
						<td class="align_right">性 别：</td>
						<td class="align_left"><span><input type="radio"
								name="sex" value="男" checked />男 <input type="radio" name="sex"
								value="女"/>女</span>
						</td>
					</tr>
					<tr>
						<td class="align_right">生日</td>
						<td valign="middle" class="align_left"><input name="born"
							type="text" value="" size="25" /></td>
					</tr>
					<tr>
						<td class="align_right">电子邮箱</td>
						<td valign="middle" class="align_left"><input name="email"
							type="text" value="" /></td>
					</tr>
					<tr>
						<td class="align_right">MSN</td>
						<td valign="middle" class="align_left"><input name="msn"
							type="text" value="" /></td>
					</tr>
					<tr>
						<td class="align_right">QQ</td>
						<td valign="middle" class="align_left"><input name="qq"
							type="text" value="" /></td>
					</tr>
					<tr>
						<td class="align_right">办公电话</td>
						<td valign="middle" class="align_left"><input
							name="officerphone" type="text" value="" /></td>
					</tr>
					<tr>
						<td class="align_right">家庭电话</td>
						<td valign="middle" class="align_left"><input
							name="homephone" type="text" value="" /></td>
					</tr>
					<tr>
						<td class="align_right">移动电话</td>
						<td valign="middle" class="align_left"><input
							name="mobilephone" type="text" value="" /></td>
					</tr>
					<tr>
						<td colspan="2" class="td_center"><input name="submit"
							type="submit" value="确认修改" onclick="updateinfo()" />
						</td>
					</tr>
				</table>
			</form>
			<form id="formPassword" name="formPassword"
				action="UserServlet?method=updatePsd&username=" method="post">
				<table width="98%" align="center">
					<tr>
						<td width="32%" class="align_right">原密码：</td>
						<td class="align_left"><input name="old_password"
							type="password" size="24" /></td>
					</tr>
					<tr>
						<td class="align_right">新密码：</td>
						<td class="align_left"><input name="new_password"
							type="password" size="24" /></td>
					</tr>
					<tr>
						<td class="align_right">确认密码：</td>
						<td class="align_left"><input name="renew_password"
							type="password" size="24" /></td>
					</tr>
					<tr>
						<td colspan="2" class="td_center td_center1"><input
							name="submit" type="submit" value="确认修改" />
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
