<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
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
       <a href="#" class="list-group-item">도서반납
       </a>
     </div>

	<div class="col-sm-8">
		<ol class="ui breadcrumb" style="font-size:12px;">
		  <li><a href="#">Home</a></li>
		  <li class="active">도서반납</li>
		</ol>
		<div class="ui raised segment">
			
				<form class="ui form" method="post" action="/bookreturn">
					<h2 class="ui dividing header">Book Return</h2>
					
					<div class="fields">
						<!-- 대여 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >대여코드</label>
						  <input type="text" name="rentalCode" placeholder="ex 1000000">
						</div>

					</div>	
					

					 
					<!-- 버튼 -->
	                <div class="form-group">
	                  <div class="col-lg-10">
	                    <button type="reset" class="big ui grey button">reset</button>
	                    <button type="submit" class="big ui teal button">도서반납</button>
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