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
<form action="params/saveUser" method="post">
    用户姓名： <input type="text" name="uname"><br>
    用户年龄： <input type="text" name="age"><br>
     日期：  <input   type="text" name="date">
          <input type="submit" value="提交"><br>
</form>

</body>
</html>
