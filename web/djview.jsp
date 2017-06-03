<%--
  Created by IntelliJ IDEA.
  User: Aspire
  Date: 03.06.2017
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="beatModel" scope="request" class="com.ch12Compound.djview.BeatModel"/>
<!doctype html>
<html>
<head>
    <title>DJ View</title>
</head>
<body>
<h1>DJ View</h1>
Beats per minute = <jsp:getProperty name="beatModel" property="BPM"/>
<br><hr><br>
<form method="post" action="djview">
    BPM: <input type="text" name="bpm" value="<jsp:getProperty name="beatModel" property="BPM"/>">
<input type="submit" name="set" value="set"><br>
<input type="submit" name="decrease" value="<<"><br>
<input type="submit" name="increase" value=">>"><br>
<input type="submit" name="on" value="on"><br>
<input type="submit" name="off" value="off"><br>
</form>
</body>
</html>
