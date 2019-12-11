<%@page pageEncoding="UTF-8" contentType="text/html; utf-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
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
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								部门ID
							</td>
							<td>
								部门编号
							</td>
							<td>
								部门名称
							</td>
							<td>
								操作
							</td>
						</tr>
                        <c:forEach var="p" items="${list}">
						<tr class="row1">
							<td>
								${p.id}
							</td>
							<td>
								${p.numbers}
							</td>
							<td>
								${p.department}
							</td>
							<td>
								<a href="${path}/selectA.do?id=${p.id}">更新</a>&nbsp;&nbsp;&nbsp;<a href="${path}/selectById.do?id=${p.id}">员工列表</a>
							</td>
						</tr>
                        </c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="添加员工" onclick="location='${path}/addEmp.jsp'"/> <input type="button" class="button" value="添加部门" onclick="location='${path}/addDepartment.jsp'"/>
					</p>
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
