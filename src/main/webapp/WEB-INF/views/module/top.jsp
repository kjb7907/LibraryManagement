<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    
    <!-- semantic ui -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.6/semantic.min.css">
    <script src="https://cdn.jsdelivr.net/semantic-ui/2.2.6/semantic.min.js"></script>
   
    <!-- bootstrap -->
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    

</head>
<body>
    <!-- 상단바 시작 -->
    <div class="ui secondary  menu">
      <div class="container">
        <a class="item">
          <h6>Home</h6>
        </a>
        <a class="item">
          <h6>Messages</h6>
        </a>
        <a class="item">
          <h6>Friends</h6>
        </a>
        <div class="right menu">
          <div class="item">
            <div class="ui icon input">
              <input type="text" placeholder="Search...">
              <i class="search link icon"></i>
            </div>
          </div>
          <a class="ui item">
            <h6>사이트맵</h6>
          </a>
          <a href="/memberadd" class="ui item">
            <h6>회원가입</h6>
          </a>
          <a href="login" class="ui item">
            <h6>로그인</h6>
          </a>
        </div>
      </div>
    </div>
    <!-- 상단바 끝 -->

    <!-- 타이틀이미지 -->
    <div class="container">
      <center>
        <a href="/main"><img src= "/resources/public/logo_kyobo.png"></a>
        <table style = "height:50px;"></table>
      </center>
    </div>
    <!-- 타이틀이미지 -->

    <!-- 네비게이션바 시작 -->
    <nav class="navbar navbar-inverse">
      <div class="container">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>

          </div>

          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
            <ul class="nav navbar-nav navbar-center">

                <!-- 드롭다운 1 도서관관리 -->
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">도서관 관리 <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="#">지점등록</a></li>
                    <li><a href="#">회원관리</a></li>
                  </ul>
                </li>

                <!-- 드롭다운 2 도서관리 -->
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">도서 관리 <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="/bookadd">도서등록</a></li>
                    <li><a href="#">도서폐기</a></li>
                  </ul>
                </li>
                
                <!-- 도서조회 -->
                <li>
                  <li><a href="/booksearch">도서조회</a></li>
                </li>
                
                <!-- 대출 -->
                <li>
                  <li><a href="/bookrental">도서대출</a></li>
                </li>
                <!-- 반납 -->
                <li>
                  <li><a href="/bookreturn">도서반납</a></li>
                </li>

          </ul>


          </div>
        </div>
      </div>
    </nav>
    <!-- 네비게이션 바 끝 -->

</body>
</html>