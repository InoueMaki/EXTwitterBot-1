<%@page contentType="text/html; charset=UTF-8"%>

<HTML>

	<HEAD>
		<TITLE>ログイン画面</TITLE>
		<LINK rel="stylesheet" type="text/css" href="style.css">
	</HEAD>
	
	<BODY>
		<BR><BR>
		<CENTER ID="a">
			<H1>ログイン画面</H1>
			<FORM ACTION='./Control.java'>
				<TABLE class="login" border="0">
					<TR><TD><INPUT type="text" ID="user_id" style="font-size:30px;" required size=50 minlength=1 maxlength=16 pattern="^[0-9a-zA-Z]+$" placeholder="ユーザ名" autocomplete="off" autofocus>
					<TR><TD><INPUT type="password" ID="password" style="font-size:30px;"required size=50 minlength=4 maxlength=16 autocomplete="off" pattern="^[0-9a-zA-Z]+$" placeholder="パスワード" >
					<TR><TD><INPUT type="submit" value="ログイン" style="font-size:40px;color:red">
				</TABLE>
			</FORM>
		</CENTER>	
	
	</BODY>

</HTML>