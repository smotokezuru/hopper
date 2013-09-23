<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="ja">
<head>
<meta charset="utf-8">
<title>Spring MVC Starter Application</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/static/resources/css/normalize.css"/>" />
<link rel="stylesheet" type="text/css" href="<c:url value="/static/resources/css/screen.css"/>" />
</head>
<body>
	<div id="container">
		<header>
			<img src="<c:url value="/static/resources/gfx/dualbrand_logo.png"/>" />
		</header>
		<article>
			<form:form commandName="newMember" id="reg">
				<h2>Member Registration</h2>
				<p>Enforces annotation-based constraints defined on the model
					class.</p>
				<table>
					<tbody>
						<tr>
							<td><form:label path="code">Name:</form:label></td>
							<td><form:input path="code" /></td>
							<td><form:errors class="invalid" path="code" /></td>
						</tr>
					</tbody>
				</table>
				<table>
					<tr>
						<td><input type="submit" value="Register" class="register" />
						</td>
					</tr>
				</table>
			</form:form>
			<h2>Members</h2>
			<c:choose>
				<c:when test="${fn:length(members)==0}">
					<em>No registered members.</em>
				</c:when>
				<c:otherwise>
					<table class="simpletablestyle">
						<thead>
							<tr>
								<th>Id</th>
								<th>Code</th>
								<th>Rest URL</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${members}" var="member">
								<tr>
									<td>${member.id}</td>
									<td>${member.code}</td>
									<td><a href="<c:url value="/rest/members/${member.id}"/>">/rest/members/${member.id}</a></td>
							</c:forEach>
						</tbody>
					</table>
					<table class="simpletablestyle">
						<tr>
							<td>REST URL for all members: <a
								href="<c:url value="/rest/members"/>">/rest/members</a>
							</td>
						</tr>
					</table>
				</c:otherwise>
			</c:choose>
		</article>
		<aside>
			<p>Learn more about JBoss Enterprise Application Platform 6.</p>
			<ul>
				<li><a href="http://red.ht/jbeap-6-docs">Documentation</a></li>
				<li><a href="http://red.ht/jbeap-6">Product Information</a></li>
			</ul>
			<p>Learn more about JBoss AS 7.</p>
			<ul>
				<li><a
					href="https://docs.jboss.org/author/display/AS7/Getting+Started+Developing+Applications+Guide">Getting
						Started Developing Applications Guide</a></li>
				<li><a href="http://jboss.org/jbossas">Community Project
						Information</a></li>
			</ul>
		</aside>
		<footer>
			<p>the footer.</p>
		</footer>
	</div>
</body>
</html>
