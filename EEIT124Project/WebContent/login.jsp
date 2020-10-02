<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

div{		padding:20px;
			width: 350px;
            height: 350px;
            border:2px solid red
	
}
.q1{

            border-bottom: solid 1px 	#30D5C8;
            border-top: none;
            border-left: none;
            border-right: none;

}
.h31{
	color:red;
	
}

</style>





</head>
<body>
<form action="LoginRegister" method="post">



<h3>${smessage}</h3>

<div>
<center>
手機:<input type="text" class="q1" name="mobile"><br><br><br>
密碼:<input type="password" class="q1" name="password"><br><br><br>
<h3 class="h31">${message}</h3>
<input type="submit" name="submit" value="login">

<input type="button" value="註冊" onclick="location.href='register.jsp'">
</center>
</div>

</form>

</body>
</html>