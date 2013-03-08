
		<spring:hasBindErrors name="userDetails">
			<div class="error">
				<spring:bind path="userDetails.*">
					<c:forEach items="${status.errorMessages}" var="error">
						<c:out value="${error}"/><br/>
					</c:forEach>
				</spring:bind>
			</div>
		</spring:hasBindErrors>
<c:choose>
	<c:when test="${(userDetails.invalidUser) or (empty userDetails.username)}">
		<h2>Login </h2>					
		<form:form modelAttribute="userDetails">
		
			<div>
				<div class="span-3">
					<label for="userDetails.username">UserName</label>
				</div>
				<div class="span-7 last">
					<p><form:input path="username"/></p>
				</div>
			</div>
			<div>
				<div class="span-3">
					<label for="userDetails.password">Password</label>
				</div>
				<div class="span-7 last">
					<p><form:input path="password"/></p>
				</div>
			</div>

			<p>&nbsp;</p>
			<p>
				<label>
					<button type="submit" name="userDetails" id="_userDetails">Login</button>			
				</label>
			</p><p>&nbsp;</p>
			<p><a href="register">Register As New User?</a></p>
		</form:form>
	</c:when>
	<c:otherwise>
		<h2>User Details </h2>
		<label>FirtName:</label> ${userDetails.firstName}
		<label>LastName:</label> ${userDetails.lastName}
		<lable>RollNumber:</lable>${userDetails.rollNumber}
		<label>DateOfBirth:</label> ${userDetails.dateOfBirth}
		<label>College:</label> ${userDetails.college}
		<label>Department:</label> ${userDetails.departMent}
		<label>Year Of Join:</label> ${userDetails.yearOfJoin}
		<label>Email Id:</label> ${userDetails.emailId}
		<a href="userDetailsEdit/${userDetails.rollNumber}">Edit Details</a>
	</c:otherwise>
</c:choose>


