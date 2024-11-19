<%@ page import="com.azhuquq.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>所有学生信息的展示</h1>
<hr>
<table>
    <tr>
        <td><input type="checkbox" onclick="allcheck(this);"></td>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>学生密码</td>
        <td>学生权限</td>
        <td>备注信息</td>
        <td><input type="submit" value="批量删除" onclick="delcheck();"></td>
    </tr>
    <c:forEach items="${allStu}" var="onestu">
        <tr>
            <td><input type="checkbox" name="check" value="${onestu.sid}"></td>
            <td>${onestu.sid}</td>
            <td>${onestu.sname}</td>
            <td>${onestu.spassword}</td>
            <td>${onestu.sright}</td>
            <td>${onestu.sflag}</td>
            <td>
                <a href="updateStu.jsp?sid=${onestu.sid}">修改</a>
                <a href="delStu?sid=${onestu.sid}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
