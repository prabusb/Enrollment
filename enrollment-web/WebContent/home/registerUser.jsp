<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	
	<head>
		<title>White and Clean</title>
		<meta http-equiv="Content-Language" content="English" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="<c:url value="/static/css/style.css" />" type="text/css" media="screen" />
	</head>
	<body>
	
		<div id="wrap">
			<%@ include file="../includes/Menu.jsp" %>
		
			<div id="content">
				<div class="center"> 
					<form:form modelAttribute="userDetails">
						<fieldset>
							<legend>Register User</legend>
								<spring:hasBindErrors name="userDetails">
									<div class="error">
										<spring:bind path="userDetails.*">
											<c:forEach items="${status.errorMessages}" var="error">
												<c:out value="${error}"/><br/>
											</c:forEach>
										</spring:bind>
									</div>
								</spring:hasBindErrors>
					        <div>
								<div class="span-3">
									<label for="title">Username:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="username"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="author.name">Password:</label>
								</div>
								<div class="span-7 last">
									<p><form:password path="password"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="isbn">ConfirmPassword:</label>
								</div>
								<div class="span-7 last">
									<p><form:password path="confirmPassword"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="isbn">RollNumber:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="rollNumber"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">FirstName:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="firstName"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">LastName:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="lastName"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">DateOfBirth:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="dateOfBirth"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">College:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="college"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">DepartMent:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="departMent"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">EmailId:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="emailId"/></p>
								</div>
							</div>
							<div>
								<div class="span-3">
									<label for="price">YearOfJoin:</label>
								</div>
								<div class="span-7 last">
									<p><form:input path="yearOfJoin"/></p>
								</div>
							</div>																													
							<div>
								<p>
								<button type="submit" id="proceed" name="_proceed">Add</button>
								<button type="submit" name="_cancel" >Cancel</button>
								</p>
							</div>
						</fieldset>
					</form:form>
				</div>				
				<div style="clear: both;"> </div>
			</div>
		
			<div id="footer">
				Designed by <a href="http://http://www.troy.co.in/">Troy Software India (P) Ltd</a>,
			</div>
		</div> 	
	</body>
</html>