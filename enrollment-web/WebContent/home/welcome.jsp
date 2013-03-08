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
				<div class="right"> 
					<h2><a href="#">License and terms of use</a></h2>
					<div class="articles">
						White and Clean Rounded is a CSS template that is free and fully standards compliant. <a href="http://www.free-css-templates.com/">Free CSS templates</a> designed this template.
						This template is allowed for all uses, including commercial use, as it is released under the <strong>Creative Commons Attributions 2.5</strong> license. The only stipulation to the use of this free template is that the links appearing in the footer remain intact. Beyond that, simply enjoy and have fun with it!	 
						<br /><br />
						<img src="static/images/pic.jpg" alt="Example pic" style="border: 3px solid #ccc;" />
						<br /><br />
						Donec nulla. Aenean eu augue ac nisl tincidunt rutrum. Proin erat justo, pharetra eget, posuere at, malesuada 
						et, nulla. Donec pretium nibh sed est faucibus suscipit. Nunc nisi. Nullam vehicula. In ipsum lorem, bibendum sed, 
						consectetuer et, gravida id, erat. Ut imperdiet, leo vel condimentum faucibus, risus justo feugiat purus, vitae 
						congue nulla diam non urna.
					</div>
					<h2><a href="#">Title with a link - Example of heading 2</a></h2>
					<div class="articles">
						Donec nulla. Aenean eu augue ac nisl tincidunt rutrum. Proin erat justo, pharetra eget, posuere at, malesuada 
						et, nulla. Donec pretium nibh sed est faucibus suscipit. Nunc nisi. Nullam vehicula. In ipsum lorem, bibendum sed, 
						consectetuer et, gravida id, erat. Ut imperdiet, leo vel condimentum faucibus, risus justo feugiat purus, vitae 
						congue nulla diam non urna.
					</div>
				</div>
		
				<div class="left">
					<%@ include file="../includes/Login.jsp" %>
				</div>
				<div style="clear: both;"> </div>
			</div>
		
			<div id="footer">
				Designed by <a href="http://http://www.troy.co.in/">Troy Software India (P) Ltd</a>,
			</div>
		</div> 	
	</body>
</html>