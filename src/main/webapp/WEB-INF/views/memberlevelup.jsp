<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="./module/top.jsp" %>

<div class="container">
	
	<!-- 사이드메뉴 -->
     <div class="col-sm-2" class="list-group">
       <a href="#" class="list-group-item active">
         메뉴
       </a>
       <a href="#" class="list-group-item">도서관등록
       <a href="#" class="list-group-item">회원관리
       </a>
     </div>

	<div class="col-sm-8">
		<ol class="ui breadcrumb" style="font-size:12px;">
		  <li><a href="#">Home</a></li>
		  <li><a href="#">도서관관리</a></li>
		  <li class="active">회원관리</li>
		</ol>
		<div class="ui raised segment">
			
				
			<h2 class="ui dividing header">회원비 미입금 회원 리스트</h2>
			<table class ="table">
				<thead>
					<th>아이디</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>주소</th>
					<th>입금회원승인</th>
				</thead>

				<tbody>
					<c:forEach var="list" items="${list}">
						<tr>
					  		<td>${list.id}</td>
					  		<td>${list.name}</td>
					  		<td>${list.phone}</td>
					  		<td>${list.addr}</td>
					  		<td><a href="/memberlevelupdate?id=${list.id}">회원승인</a></td>
					  	</tr>
				  	</c:forEach>
				</tbody>
			</table>
				
		</div>
	</div>
	
</div>
	</br>
	
<%@include file="./module/footer.jsp" %>
</body>
</html>