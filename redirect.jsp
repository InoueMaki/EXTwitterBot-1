<%@page contentType="text/html; charset=UTF-8"%>

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
	
	<!-- 3秒後にlink() -->
	<BODY onload="setTimeout('link()', 3*1000)">
		<H1>
			セッションが切れています。<BR>
			3秒後にログイン画面に戻ります
		</H1>
	</BODY>
</HTML>
