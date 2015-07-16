package exBot;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class Tweet {
	
	private static final String consumerKey = "ujYzRQ3YtaIrgf17JIMf8ZZ2N";
	private static final String consumerSecret = "j8HtYZhy54TFlW8NY3kib3CHM0AvfIyJR3QzoeLXJXrgcaF6yq";
	private static final String accessToken = "3365196921-lgRTxV6QJbSfNvYDsYIHvsTeLIwx8ee0OY3Ua90";
	private static final String accessTokenSecret = "zaKCTGr2HmwjEPcpg0EBcmPPlyYTgyxhq7Z5v3nAjvHPJ";

	public void sendTweet(String text){
		
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken,accessTokenSecret));
		
		try{
			
			twitter.updateStatus(text);
			System.out.println("ツイート成功");
			
		} catch(TwitterException e){
			
			System.err.println("ツイート失敗"+e.getMessage());
			
		}
		
	}
}
