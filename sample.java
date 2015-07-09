import twitter4j.*;
import twitter4j.auth.AccessToken;

public class sample {
	private static final String consumerKey       = "";
	private static final String consumerSecret    = "";
	private static final String accessToken       = "";
	private static final String accessTokenSecret = "";
	
	
	private static final String tweet = "bot";
	
	public static void main(String[] args){
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken,accessTokenSecret));
		try{
			twitter.updateStatus(tweet);
			System.out.println("ツイート");
		} catch(TwitterException e){
			System.err.println("失敗"+e.getMessage());
		}
		
	}
}
