<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		  <li class="active">도서폐기</li>
		</ol>
		<div class="ui raised segment">
			
				<form class="ui form" method="post" action="/bookdis">
					<h2 class="ui dividing header">Book Discard</h2>
					
					<div class="fields">
						<!-- 도서코드 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >도서코드</label>
						  <input type="text" name="bookCode" placeholder="도서코드 ex 800000">
						</div>
					</div>	
					

					<!-- 버튼 -->
	                <div class="form-group">
	                  <div class="col-lg-10">
	                    <button type="submit" class="big ui teal button">도서폐기</button>
	                  </div>
	                </div>
	                
	                <div class="field"></div>	
                	 
				</form>

		</div>
	</div>

	<div style="height:300px"></div>
</div>

<%@include file="./module/footer.jsp" %>
</body>
</html>