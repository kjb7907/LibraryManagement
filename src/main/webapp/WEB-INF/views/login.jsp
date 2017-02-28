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
  <div class ="text-center" style ="width:30%;margin:0 auto;vertical-align:middle;">
    <h2 class="ui teal image header">
      <img src="/resources/public/logo.png" class="image">
      <div class="content">
        	Admin Login
      </div>
    </h2>
    <form class="ui large form" action="login" method="post">
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" class="form-control"name="AdminId" placeholder="ID">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" class="form-control" name="AdminPw" placeholder="Password">
          </div>
        </div>
       	<input type="submit" value="로그인" class="ui fluid big teal submit button">
      </div>

      <div class="ui error message"></div>

    </form>

    <button class="huge ui basic button">
      New to us? <a href="/memberadd">회원가입</a>
    </button>
  </div>
</div>
</br>
<div style="height:200px;">
</div>
<%@include file="./module/footer.jsp" %>
</body>
</html>