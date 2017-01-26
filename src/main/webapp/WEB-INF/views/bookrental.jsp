<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#btn").click(function(){
			console.log("버튼클릭");
			if($("#rentalPrice").val() == ""){
				console.log("가격비어있다");
				var now_Date = new Date();
				// var nowDate = now_Date.getFullYear()+'-'+now_Date.getMonth()+1+'-'+now_Date.getDate();
				console.log('now_date getTime : '+now_Date.getTime());
				
				var returnExpectDay = new Date($("#returnExpectDay").val());
				console.log('returnExpectDay getTime : '+returnExpectDay.getTime());

			    var btMs = returnExpectDay.getTime() - now_Date.getTime() ;
			    var btDay = btMs / (1000*60*60*24) ;
			    var btDayResult = Math.floor(btDay);
			    
			    console.log(btDayResult);
			    
			    var price = btDayResult*100;
			    $("#rentalPrice").val(price);

			}
				//$("#memberlogin").submit();
			})
		})
</script>
</head>
<body>
<%@include file="./module/top.jsp" %>

<div class="container">
	
	<!-- 사이드메뉴 -->
     <div class="col-sm-2" class="list-group">
       <a href="#" class="list-group-item active">
         메뉴
       </a>
       <a href="#" class="list-group-item">도서대출
       </a>
     </div>

	<div class="col-sm-8">
		<ol class="ui breadcrumb" style="font-size:12px;">
		  <li><a href="#">Home</a></li>
		  <li class="active">도서대여</li>
		</ol>
		<div class="ui raised segment">
			
				<form class="ui form" method="post" action="/bookadd">
					<h2 class="ui dividing header">Book Rental</h2>
					
					<div class="fields">
						<!-- 도서코드 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >도서코드</label>
						  <input type="text" name="libCode" placeholder="ex 100">
						</div>
						
						<!-- 대여자ID -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >대여자ID</label>
						  <input type="text" name="bookName" placeholder="도서명">
						</div>
											
						<!-- 반납예정일 -->
						<div class="field col-sm-4">
						  <label style= font-size:12px;" >반납예정일</label>
						  <input type="date" name="returnExpectDay" id="returnExpectDay" placeholder="출판사">
						</div>
					</div>	
					
					<!-- 대여료 -->
					<div class="fields">
						<div class="field col-sm-4">
						 <input type="text" name="rentalPrice" placeholder="대여료" id="rentalPrice">
						</div>
					
					 	<span id="rentalPriceHelper"></span>
					 	<button type="button" class="big ui primary button" id="btn" style="height:50%">대여료계산</button>
					 </div>
					 
					<!-- 버튼 -->
	                <div class="form-group">
	                  <div class="col-lg-10">
	                    <button type="reset" class="big ui grey button">reset</button>
	                    <button type="submit" class="big ui teal button">도서대여</button>
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