<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>doD</title>
</head>
<body>
	<h1>Model return test</h1>

	<P>The time on the server is ${serverTime}.</P>
	<%-- <P>  product's name is ${productVO.name}. </P> --%>
	<%-- <P>  product's price is ${productVO.price}. </P> --%>
	<P>product's name is ${product.name}.</P>
	<P>product's price is ${product.price}.</P>
</body>
</html>
