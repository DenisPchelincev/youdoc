<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<!DOCTYPE html>
<html lang="en">

<body>
	<div class="row-fluid">
		<div class="span6">
			<h3>
				<sec:authorize access="isAuthenticated()">
					Login successfull: <sec:authentication
						property="principal.username" />
				</sec:authorize>
			</h3>
		</div>
	</div>

</body>
</html>