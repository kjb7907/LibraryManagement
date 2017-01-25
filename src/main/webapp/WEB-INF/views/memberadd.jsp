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


    <div class= "container">
      <div class="col-sm-2" class="list-group">
        <a href="#" class="list-group-item active">
          메뉴
        </a>
        <a href="#" class="list-group-item">회원 가입
        </a>
      </div>

      <div class="col-sm-8">
        <div class="panel panel-primary">
          <div class="panel-heading">
            <h3 class="panel-title">회원가입</h3>
          </div>
          <div class="panel-body">
            <form class="form-horizontal">
              <fieldset>

                <!-- 아이디 -->
                <div class="form-group">
                  <label for="inputEmail" class="col-lg-2 control-label">ID</label>
                  <div class="col-lg-4">
                    <input type="text" class="form-control" id="inputEmail" placeholder="ID">
                  </div>
                </div>

                <!-- 비밀번호 -->
                <form class="form-horizontal">
                  <fieldset>
                    <div class="form-group">
                      <label for="inputEmail" class="col-lg-2 control-label">Password</label>
                      <div class="col-lg-4">
                        <input type="password" class="form-control" id="inputEmail" placeholder="password">
                      </div>
                    </div>

                <!-- 비밀번호 확인 -->
                <div class="form-group">
                  <label for="inputPassword" class="col-lg-2 control-label">PasswordCheck</label>
                  <div class="col-lg-4">
                    <input type="password" class="form-control" id="inputPassword" placeholder="PasswordCheck">
                  </div>
                </div>

                <!-- 생년월일 -->
                <div class="form-group">
                  <label for="inputEmail" class="col-lg-2 control-label">생년월일</label>
                  <div class="col-lg-6">
                    <input type="text" class="form-control" id="inputEmail" placeholder="생년월일">
                  </div>
                </div>

                <!-- 주소  -->
                <div class="form-group">
                  <label for="inputEmail" class="col-lg-2 control-label">주소</label>
                  <div class="col-lg-8">
                    <input type="text" class="form-control" id="inputEmail" placeholder="주소">
                  </div>
                </div>

                <!--회원가입 버튼 -->
                <div class="form-group">
                  <div class="col-lg-10 col-lg-offset-2">
                    <button type="reset" class="big ui grey button">reset</button>
                    <button type="submit" class="big ui teal button">회원가입</button>
                  </div>
                </div>


            </form>
          </div>
        </div>
      </div>

    </div>


<%@include file="./module/footer.jsp" %>
</body>
</html>