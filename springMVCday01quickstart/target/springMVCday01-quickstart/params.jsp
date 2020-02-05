<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/2/4
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<a href="params/testParam?username=hehe&password=123">请求参数的绑定</a>--%>
<form action="params/saveAccount" method="post">
    姓名： <input type="text" name="username"><br>
    密码： <input type="password" name="password"><br>
    金额： <input type="text" name="money"><br>
    用户姓名： <input type="text" name="user.uname"><br>
    用户年龄： <input type="text" name="user.age"><br>
          <input type="submit" value="提交"><br>
</form>

</body>
</html>
