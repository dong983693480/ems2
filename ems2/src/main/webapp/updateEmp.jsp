<%@page pageEncoding="UTF-8" contentType="text/html; utf-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
		<script type="application/javascript" src="${path}/js/jquery-1.8.3.min.js"></script>
		<script type="application/javascript">
			$(function(){
				$.ajax({
					url:"${path}/xx.do",
					type:"get",
					dataType:"json",
					success:function(all){
						var x1="${o.department}";
						//alert(x1);
						for (var i = 0; i <all.length ; i++) {
							if (x1==all[i].department){
								var option = $("<option value="+all[i].id+" selected='selected'>" + all[i].department + "</option>");
							}
							var option1 = $("<option value="+all[i].id+">"+all[i].department+"</option>");
							if(x1==all[i].department){


							option1.text().remove();
							}
							$("#ss").append(option);
							$("#ss").append(option1);


						}
					}
				});
			})

		</script>
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2009/11/20
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						update Emp info:
					</h1>
					<form action="${path}/updateUser.do" method="post"enctype="multipart/form-data">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">				
							<tr>
								<td valign="middle" align="right">
									id:
								</td>
								<td valign="middle" align="left">
									<input type="hidden" name="id" value="${o.id}">${o.id}
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="names" value="${o.name}"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									工资:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="salary" value="${o.salary}"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									年龄:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="age" value="${o.age}"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									部门:
								</td>
								<td valign="middle" align="left">
									<select id="ss" name="did">

									</select>
								</td>

							</tr>
							<tr>
								<td valign="middle" align="right">
									头像:
								</td>
								<td valign="middle" align="left">
									<input type="file" class="inputgri" name="upload" value="${o.src}" />
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="修改" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
