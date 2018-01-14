<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="sample.Player"%>
<% Player p = (Player)request.getAttribute("person"); %>
{"id":<%=p.getId() %>,
"name":"<%=p.getName() %>",
"level":<%=p.getLevel() %>,
"lastLogin":"<%=p.getLastLogin() %>",
"message":"<%=p.getMessage() %>",
"loginURL":"<%=p.getLoginUrl() %>",
"present":"<%=p.hasPresent() %>"
}
    