<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/2/4
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
   <script>
       $(function () {
           $("#btn").click(function () {
              $.ajax({
                  //编写json
                  url:"user/testAjax",
                  contentType:"application/json;charset=UTF-8",
                  data:'{"username":hehe,"password":"1234","age":12}',
                  dataType:"json",
                  type:"post",
                  success:function () {

                  }
              });
           });
       });
   </script>
</head>
<body>
<a href="user/testString">测试test</a><br>
<a href="user/testVoid">测试Void</a><br>
<a href="user/ModeAndView">测试ModeAndView</a><br><br>
<a href="user/testForwardOrRediction">测试testForwardOrRediction</a><br>
<button id="btn">发送ajax请求</button>

</body>
</html>
