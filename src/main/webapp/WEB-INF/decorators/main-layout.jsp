<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring-MVC-Showcase</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet">

<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<c:import url="/WEB-INF/views/tags/navbar.jsp" />
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<!--/span-->
			<div class="span12">
				<div class="hero-unit">
					<c:import url="/WEB-INF/views/tags/banner.jsp" />
				</div>
				<div class="row-fluid">
					<div class="span12">
						<decorator:body />
					</div>
				</div>
				<!--/span-->
			</div>
			<!--/row-->
		</div>
		<!--/span-->
	</div>
	<!--/row-->

	<hr>

	<footer>
		<c:import url="/WEB-INF/views/tags/footer.jsp" />
	</footer>

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/demo.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/json2.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/date.format.js" />"></script>
</body>
</html>