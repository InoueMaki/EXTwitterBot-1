package exTwitter;

public class Snipet {
	public static String snipet(String text){
		String snipet = text;
		int strlength = 7;
		if (text.length()>strlength){
			snipet = text.substring(0,strlength) + "…";
		}
		return snipet;
	}

	public static void main(String[] args) {
		String text = "http://www.excite-software.co.jp \n";
		String snipet =snipet(text);
		System.out.println(text+"\t"+text.length()+"文字");
		System.out.println(snipet+"\t"+snipet.length()+"文字");
		
		
	}
}
