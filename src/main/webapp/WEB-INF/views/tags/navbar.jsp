<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<a class="btn btn-navbar" data-toggle="collapse"
	data-target=".nav-collapse"> <span class="icon-bar"></span> <span
	class="icon-bar"></span> <span class="icon-bar"></span>
</a>
<a class="brand" href="/">youdoc</a>
<div class="nav-collapse collapse">
	<ul class="nav">
		<li class="active"><a href="<c:url value="/" />">Главная</a></li>
		<li><a href="<c:url value="/welcome" />">Начать</a></li>
		<li><a href="<c:url value="/errors-validations" />">Каталог</a></li>
		<li><a href="<c:url value="/form" />">Описание</a></li>
		<li><a href="<c:url value="/fileupload" />">Оплата</a></li>
		<li><a href="<c:url value="/misc" />">О проекте</a></li>

		<sec:authorize access="isAnonymous()">
			<li><a href="<c:url value="/login" />">Войти</a></li>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
			<li><a href="<c:url value="/j_spring_security_logout"/>">Выйти</a></li>
		</sec:authorize>
	</ul>
</div>
