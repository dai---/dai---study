<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP!</title>
</head>
<body>
ようこそ！JSP＆サーブレットの世界へ！<br><br><br>


<%
	Calendar calendar = new GregorianCalendar();
	out.println( calendar.get( GregorianCalendar.HOUR_OF_DAY ));
	out.println(":");
	out.println( calendar.get( GregorianCalendar.MINUTE ));
%>
です<br />
<!-- 午前と午後の判定結果 -->
現在は

<%
	// Calendarの日時が午前であるかを判定する;
	int ampm = calendar.get(GregorianCalendar.AM_PM) ;

	String value = "";
	if (ampm == GregorianCalendar.AM) {
		value = "午前中";
	} else if ( ampm == GregorianCalendar.PM) {
		value = "午後";
	}
	out.println(value);
%>
ですね<br />
<%@ include file="include.jsp" %>
</body>
</html>

