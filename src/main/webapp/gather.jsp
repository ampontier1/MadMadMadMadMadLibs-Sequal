<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is a mad-lib test program</title>
</head>
<body>
	<h1 style="font-family: comic sans ms;">It's a mad, mad, mad, mad, mad-lib! </h1>
	<form action="getWordsServlet" method="post">
	Enter a corresponding word with it's type<br> Noun
	<input type="text" name="noun" size="35">
	<p>Verb
	<input type="text" name="verb" size="35">
	<p>Adverb
	<input type="text" name="adverb" size="35">
	<p>Adjective
	<input type="text" name="adjective" size="35">
	<p>Onomatopoeia
	<input type="text" name="bang" size="35">
	<p><input type="submit" value="Submit Mad-Lib">
	</form>
</body>
</html>