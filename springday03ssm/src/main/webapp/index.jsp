<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/2/5
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/testFindAll">测试</a>
<h3>测试保存</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="name">
    金额：<input type="text" name="money">
        <input type="submit" value="提交">
</form>
</body>
</html>