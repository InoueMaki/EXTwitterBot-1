<%@page contentType="text/html; charset=UTF-8"%>

<%
//ブラウザのキャッシュを無効にする。
// Last-Modified(最終更新日) : 本日
// Expires(有効期限)         : 過去日(1970/01/01)
// pragma no-cache           : HTTP1.0仕様に基づく「キャッシュ無効指示」
// Cache-Control no-cache    : HTTP1.1仕様に基づく「キャッシュ無効指示」
java.util.Calendar objCal1=java.util.Calendar.getInstance();
java.util.Calendar objCal2=java.util.Calendar.getInstance();
objCal2.set(1970,0,1,0,0,0);
response.setDateHeader("Last-Modified",objCal1.getTime().getTime());
response.setDateHeader("Expires",objCal2.getTime().getTime());
response.setHeader("progma","no-cache");
response.setHeader("Cache-Control","no-cache");
%>

<html>
	<head>
	<SCRIPT type="text/javascript">
	setTimeout("link()", 3000);
	function link(){
	location.href='http://localhost:8080/ext/loginUI.jsp';
	}
	</SCRIPT>
	

	</head>
	
	
	<body>
		<h1>
			セッションが切れています。<br>
			3秒後にログイン画面に戻ります
		</h1>
	</body>
</html>