import twitter4j.*;
import twitter4j.auth.AccessToken;

public class sample {
	private static final String consumerKey       = "hOrVbBLFmeH4kliMigAv2QinG";
	private static final String consumerSecret    = "dUYZq4WTqIlDVSDy5QpW0EXOXE3RRMLDeyShNMkrLGsMe5Vl5z";
	private static final String accessToken       = "3269512034-I8URyMsTsiRq6ESyMx1tOGiKGLdLR7kSsWdLp8z";
	private static final String accessTokenSecret = "pHuAOUZeHJxkX26GdF2TeJeBL7Qslb6Zg8fz8D35J6Kle";
	
	
	private static final String tweet = "bot";
	
	public static void main(String[] args){
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken,accessTokenSecret));
		try{
			twitter.updateStatus(tweet);
			System.out.println("ツイートしたよｗ");
		} catch(TwitterException e){
			System.err.println("ツイート失敗"+e.getMessage());
		}
		
	}
}
