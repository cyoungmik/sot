<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Test</title>
</head>
<body>
    <h1>Test</h1>
 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.user_id}</td>
                    <td>${user.user_pw}</td>
                    <td>${user.user_nm}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

