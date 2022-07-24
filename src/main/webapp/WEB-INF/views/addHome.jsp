<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="../../resources/style.css">
<script src="../../resources/script.js"></script>
</head>
<body>
	<div class="container">
		<div class="h_oc">
			<div class="h_ic">
				<a href="#" class="logo"><img
					src="../../resources/img/bk_Logo.gif"></a>
				<div class="btn_wrap">
					<ul>
						<li><button>
								<span>메뉴소개</span>
							</button></li>
						<li><button>
								<span>매장소개</span>
							</button></li>
						<li><button>
								<span>이벤트</span>
							</button></li>
						<li><button>
								<span>브랜드스토리</span>
							</button></li>
					</ul>
				</div>
				<div>
					<a href="#" class="delivery_btn"><span>딜리버리 주문</span></a>
				</div>
			</div>
		</div>

		<div class="black_line">
			<div class="line_text">
				<a href="#">HOME</a> <span> > 메뉴소개</span> <a href="menuForm"
					class="menuadd">메뉴 추가</a>
			</div>
		</div>
		<div class="row main">
			<div class="col content">
				<div class="menu_bar">
					<div class="menu_text">
						메뉴 소개
						<div class="menu">
							<ul>
								<li><button type="button">
										<span class="type on" onclick="chooseType(1)">스페셜&할인팩</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(2)">프리미엄</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(3)">와퍼</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(4)">주니어&버거</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(5)">올데이킹&치킨버거</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(6)">사이드</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(7)">음료&디저트</span>
									</button></li>
								<li><button type="button">
										<span class="type" onclick="chooseType(8)">독퍼</span>
									</button></li>
							</ul>
						</div>
					</div>

				</div>

				<a href="viewMenu">View Menu</a>
				<table border="2" width="70%" cellpadding="2">
					<tr>
						<th>Id</th>
						<th>Type</th>
						<th>Photo</th>
						<th>Name</th>
						<th>Description</th>
						<th>Delete</th>
					</tr>
					<c:forEach var="menu" items="${list}">
						<tr>
							<td>${menu.id}</td>
							<td>${menu.type}</td>
							<td>${menu.photo}</td>
							<td>${menu.name}</td>
							<td>${menu.des}</td>
							<td><a href="editMenu/${menu.id}">Edit</a></td>
							<td><a href="deleteMenu/${menu.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
				<br />
			</div>
		</div>
		<div class="footer"></div>
	</div>
</body>
</html>