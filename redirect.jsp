<%@page contentType="text/html; charset=UTF-8"%>

<<<<<<< HEAD
<HTML>
	<HEAD>
		<SCRIPT type="text/javascript">
			// 画面遷移コントローラに移動
			function link(){
			location.href="Control";
			}
		</SCRIPT>
		<TITLE>Session TimeOut</TITLE>
	</HEAD>
=======
<html>
	<head>
	<SCRIPT type="text/javascript">
	setTimeout("link()", 3000);
	function link(){
	location.href='http://localhost:8080/ext/loginUI.jsp';
	}
	</SCRIPT>
	

	</head>
	
>>>>>>> origin/master
	
	<!-- 3秒後にlink() -->
	<BODY onload="setTimeout('link()', 3*1000)">
		<H1>
			セッションが切れています。<BR>
			3秒後にログイン画面に戻ります
<<<<<<< HEAD
		</H1>
	</BODY>
</HTML>
=======
		</h1>
	</body>
</html>
>>>>>>> origin/master
