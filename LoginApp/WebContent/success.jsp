<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "org.thisApp.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Success</title>
</head>
<body>

<h3>Login successful</h3>

<%
User user = (User) request.getAttribute("user");
%>

<!--Hello <%=user.getUserName() %>! -->
Hello <%=(user !=null ? user.getUserName(): "no user assigned") %>
</body>
</html>