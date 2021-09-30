<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fun times are Here! When Mad-Libs Appear!</title>
</head>
<body>
	<h1 style="font-family: comic sans ms;"> This is the tale of ${wonderfulWordPlay.getNoun()} and the Big ${wonderfulWordPlay.getBang()}</h1>
	<p> Our tale starts as ${wonderfulWordPlay.getNoun()} wakes up and finds their homework been eaten ${wonderfulWordPlay.getAdverb()} . <br>
	${wonderfulWordPlay.getNoun()} sets off looking for the ${wonderfulWordPlay.getAdjective()} culprit. <br>
	${wonderfulWordPlay.getNoun()} ${wonderfulWordPlay.getVerb()} after the culprit, following their ${wonderfulWordPlay.getAdjective()} footprints. <br>
	Finally, ${wonderfulWordPlay.getNoun()} finds them, when ${wonderfulWordPlay.getBang()} ! goes something so loud ${wonderfulWordPlay.getNoun()}
	runs home and hides under their bed. <p>
	<h2 style="font-Family: apple chancery;"> The End...?!</h2>
	
<a href="gather.jsp">Start another story?</a>
</body>
</html>