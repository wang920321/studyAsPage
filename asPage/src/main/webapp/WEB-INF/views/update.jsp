<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="update" enctype="multipart/form-data">
        <input type="hidden" name="sId" value="${student.sId}">
        姓名：<input type="text" name="studentName" value="${student.studentName}"/>
        年龄：<input type="text" name="age" value="${student.age }"/>
        <input type="submit" value="确定"/>
    </form>
</body>
</html>