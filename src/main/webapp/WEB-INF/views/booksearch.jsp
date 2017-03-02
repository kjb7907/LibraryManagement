<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	$(document).on('click','#btn1',function(){
        $.ajax({
            url:'booksearch',
            type:'post',
            data:$('form').serialize(),
    		dataType : "json",
            success:function(data){
                console.log('success');
                var list = data
                $("#result1").css("display","");
	                
    			$.each(list, function(i) {
    				$("#searchList").html('') //검색초기화
    				console.log(list[i]);
    				$("#searchList").append("<tr>");
    				$("#searchList").append("<td>" + list[i].bookName + "</td>");
    				$("#searchList").append("<td>" + list[i].writer + "</td>");
    				$("#searchList").append("<td>" + list[i].publisher + "</td>");
    				$("#searchList").append("<td>" + list[i].category + "</td>");
    				$("#searchList").append("<td>" + list[i].genre + "</td>");
    				$("#searchList").append("<td>" + list[i].lib.libName + "</td>");
    				$("#searchList").append("<td>" + list[i].bookLocation + "</td>");
    				$("#searchList").append("<td>" + list[i].currentStatus + "</td>");
    				$("#searchList").append("</tr>");
   				});     
            },
        	error:function(request,status,error){
        		alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
        	}
        });
    });
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
       <a href="#" class="list-group-item">도서조회
       </a>
     </div>

	<div class="col-sm-8">
		<ol class="ui breadcrumb" style="font-size:12px;">
		  <li><a href="#">Home</a></li>
		  <li class="active">도서조회</li>
		</ol>
		<div class="ui raised segment">
			
				<form class="ui form" method="post" action="/bookreturn">
					<h2 class="ui dividing header">Book Search</h2>
					
					<div class="fields">
						<!-- 도서검색 -->
						<div class="field">
							<select class="ui dropdown" style="width:80px" id="searchOption" name="searchOption">
							  <option value="">검색조건</option>
							  <option value="BOOKNAME">도서명</option>
							  <option value="WRITER">작가</option>
							</select>
							<div class="ui large icon input">
								<input type="text" placeholder="Search" id="searchValue" name="searchValue">
								<button type="button" class="big ui primary button" id="btn1"><i class="search icon"></i>검색</button>
							</div>
						</div>
					</div>	
					
						
					<div id="result1" style="display:none">
						<table class="table">
						
							<thead>
								<tr>
									<th>도서명</th>
									<th>작가</th>
									<th>출판사</th>
									<th>카테고리</th>
									<th>장르</th>
									<th>소장도서관</th>
									<th>위치</th>
									<th>현재대여가능여부</th>
								</tr>
							</thead>
							
							<tbody id ="searchList">

							</tbody>
							
						</table>
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