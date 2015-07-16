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
			<FORM METHOD="POST" ACTION="Control">
				<TABLE class="login" border="0">
					<TR><TD><INPUT type="text" name="user_name" name="user_name" style="font-size:30px;" required size=50 minlength=1 maxlength=16 pattern="^[0-9a-zA-Z]+$" placeholder="ユーザ名" autocomplete="off" autofocus>
					<TR><TD><INPUT type="password" name="password" style="font-size:30px;"required size=50 minlength=4 maxlength=16 autocomplete="off" pattern="^[0-9a-zA-Z]+$" placeholder="パスワード" >
					<TR><TD><INPUT type="submit" value="ログイン" name="login" style="font-size:40px;color:black">
				</TABLE>
			</FORM>
			<%
			String error =(String)request.getAttribute("err");
			if (error!=null){%>
				<H3><font color=red><%=error%></font></H3>
			<%}else{%>
				<H3><br></H3>
			<%}%>
		</CENTER>	
	
	</BODY>

</HTML>