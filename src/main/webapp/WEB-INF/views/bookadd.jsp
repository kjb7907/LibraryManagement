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
       <a href="#" class="list-group-item">도서등록
       <a href="#" class="list-group-item">도서폐기
       </a>
     </div>

	<div class="col-sm-8">
		<ol class="ui breadcrumb" style="font-size:12px;">
		  <li><a href="#">Home</a></li>
		  <li><a href="#">도서관리</a></li>
		  <li class="active">도서등록</li>
		</ol>
		<div class="ui raised segment">
			
				<form class="ui form" method="post" action="/bookadd">
					<h2 class="ui dividing header">Book Add</h2>
					
					<div class="fields">
						<!-- 도서관코드 -->
						<div class="field col-sm-4">
							  <label style= font-size:12px;" >도서관코드</label>
							  <select name =libCode>
							  	<option value="">도서관선택</option>
							  	<c:forEach var="lib" items="${list}">
							  		<option value="${lib.libCode}">${lib.libCode} ${lib.libName}</option>
							  	</c:forEach>
							  </select>
						</div>
						
						<!-- 도서명 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >도서명</label>
						  <input type="text" name="bookName" placeholder="도서명">
						</div>
					</div>	
					
					<div class="fields">
						<!-- 작가 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >작가</label>
						  <input type="text" name="writer" placeholder="작가">
						</div>
						
						<!-- 출판사 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >출판사</label>
						  <input type="text" name="publisher" placeholder="출판사">
						</div>
					</div>
					
					<div class="fields">
						<!-- 도서분류 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >도서분류</label>
						  <input type="text" name="category" placeholder="도서분류">
						</div>				
	
						<!-- 장르 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >장르</label>
						  <input type="text" name="genre" placeholder="장르">
						</div>								
					</div>
					
					<div class="fields">
						<!-- 책 위치 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >도서위치</label>
						  <input type="text" name="bookLocation" placeholder="도서위치">
						</div>	
					</div>	
					
					<!-- 버튼 -->
	                <div class="form-group">
	                  <div class="col-lg-10">
	                    <button type="reset" class="big ui grey button">reset</button>
	                    <button type="submit" class="big ui teal button">도서등록</button>
	                  </div>
	                </div>
	                
	                <div class="field"></div>	
                	 
				</form>

		</div>
	</div>
	
</div>
	</br>
	
<%@include file="./module/footer.jsp" %>
</body>
</html>