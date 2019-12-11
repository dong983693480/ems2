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
								ID
							</td>
							<td>
								头像
							</td>

							<td>
								姓名
							</td>
							<td>
								工资
							</td>
							<td>
								年龄
							</td>
							<td>
								部门名称
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${users}" var="u">
							<tr class="row1">
								<td>
									${u.id}
								</td>
								<td>
									<img width="45px" height="45px" src="${path}/img/${u.src}">
								</td>

								<td>
									${u.name}
								</td>
								<td>
									${u.salary}
								</td>
								<td>
									${u.age}
								</td>
								<td>
									${u.department}
								</td>
								<td>
									<a href="${path}/deleteUser.do?id=${u.id}">delete emp</a>&nbsp;<a href="${path}/selectOne.do?id=${u.id}">update emp</a>

								</td>
							</tr>
						</c:forEach>
					</table>
					<p>
                        <a href="${path}/all.do"><button>返回部门</button></a>
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
