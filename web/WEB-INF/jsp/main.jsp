<%--
  Created by IntelliJ IDEA.
  User: azhu
  Date: 2024/11/11
  Time: 下午5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/layui/css/layui.css" rel="stylesheet"/>
</head>
<body>
<h1>欢迎您来到计算机与智能教育学院学生管理系统</h1><br>
欢迎您：${username}先生/女士<br>
<hr>
<ul class="layui-nav layui-bg-green" lay-bar="disabled">
    <li class="layui-nav-item"><a href="/stu/queryall">查询所有学生记录</a></li>
    <li class="layui-nav-item"><a href="">查询所有课程记录</a></li>
    <li class="layui-nav-item"><a href="">查询所有分数记录</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">更多</a>
        <dl class="layui-nav-child">
            <dd><a href="">选项1</a></dd>
            <dd><a href="">选项2</a></dd>
            <dd><a href="">选项3</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="">菜单3</a></li>
</ul>
<br>
</body>
</html>
