package oving5;

import java.util.*;

public class TwitterAccount{

    String userName;
    ArrayList<TwitterAccount> follows = new ArrayList<TwitterAccount>();
    int tweetCount;
    int retweetCount;
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public TwitterAccount(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void follow(TwitterAccount account) {
        if(this == account){
            throw new IllegalArgumentException("You cannot follow yourself");
        }
        if(!this.follows.contains(account)){
            this.follows.add(account);
        }
    }

    public void unfollow(TwitterAccount account) {
        if(this.follows.contains(account)){
            this.follows.remove(account);
        }
        else{
            throw new IllegalArgumentException("You cannot unnfollow someone you do not follow.");
        }
    }

    public boolean isFollowing(TwitterAccount account) {
        if(this.follows.contains(account)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFollowedBy(TwitterAccount account) {
        if (account.follows.contains(this)){
            return true;
        }
        else{
            return false;
        }
    }

    public void tweet(String text) {
        Tweet newTweet = new Tweet(this, text);
        this.tweetCount++;
        this.tweets.add(0,newTweet);
    }

    public void retweet(Tweet tweet) {
        Tweet newTweet = new Tweet(this, tweet);
        newTweet.getOriginalTweet().getOwner().increaseRetweetCount();
        this.tweets.add(0, newTweet);
        this.tweetCount++;
    }

    public Tweet getTweet(int i){
        return this.tweets.get(i-1);
    }

    public int getTweetCount(){
        return this.tweetCount;
    }

    public int getRetweetCount(){
        return this.retweetCount;
    }

    public void increaseRetweetCount(){
        this.retweetCount++;
    }

    public int getFollowerCount(){
		return follows.size();
	}
	public List<TwitterAccount> getFollowers(Comparator<TwitterAccount> comparator){
		if(comparator == null){
			throw new IllegalArgumentException();
		}
		
		List<TwitterAccount> followsCopy = new ArrayList<TwitterAccount>(follows);
		Collections.sort(followsCopy, comparator);
		return followsCopy;
	}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.userName;
    }
    


    public static void main(String[] args) {
        TwitterAccount emillio = new TwitterAccount("Emillio");
        TwitterAccount dag = new TwitterAccount("Dag");
        TwitterAccount lenart = new TwitterAccount("Lenart");
        emillio.follow(dag);
        System.out.println(emillio.isFollowedBy(dag));
        dag.follow(emillio);
        System.out.println(emillio.isFollowedBy(dag));
        emillio.tweet("Jeg elsker snus, jeg elsker schnii");
        System.out.println(emillio.tweets);
        System.out.println(emillio.getTweetCount());
        dag.retweet(emillio.getTweet(1));
        System.out.println(emillio.getRetweetCount());
        lenart.retweet(dag.getTweet(1));
        System.out.println(emillio.getRetweetCount());
    }
    
}
