<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.f1{
width:300px;
border:1px solid red;
padding:20px;

}

</style>

<script>
 $(document).ready(function(){
    $("#mobile").click(function(){
        if($("#mobile").val()==""){
            alert("你尚未填寫姓名");
            eval("document.form1['mobile'].focus()");       
        }else if($("#password").val()==""){
            alert("你尚未填寫電話");
            eval("document.form1['password'].focus()");    
        }else if($("#address").val()==""){
            alert("你尚未填寫地址");
            eval("document.form1['address'].focus()");       
        }else{
            document.form1.submit();
        }
    })
 })
</script>


</head>
<body>

<div class="h1">
        <h2>註冊帳號</h2>
    </div>
    <div class="f1">
<form name="form1" action="LoginRegister" method="post">


    
    手機:<input type="text" name="mobile" ><br><br><br>

    密碼:<input type="password" name="password"> <br><br><br> 
    
    姓名:<input type="text" name="name" maxlength="10"><br><br><br>

    別名:<input type="text" name="nickname" ><br><br><br>

    性別:<input type="radio" id="gender" name="gender" value="male">男
       <input type="radio" name="gender" value="female">女<br><br><br>
    
    生日:<input type="date" name="birthday" ><br><br><br>

   E-mail:<input type="text" name="email" ><br><br><br>
  
     地址:<input type="text" name="address" ><br><br><br>

   <input type="submit" name="submit" value="register">

</form> 

    </div>


</body>
</html>