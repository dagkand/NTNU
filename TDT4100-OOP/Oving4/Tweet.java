package oving4;

public class Tweet {

    private TwitterAccount author;
    private String text;
    private Tweet original;
    private int retweetCount = 0;


    
    public Tweet(TwitterAccount author, String text){
        this.author = author;
        this.text = text;

    }

    public Tweet(TwitterAccount author, Tweet original){
        if (original.getOwner() == author){
            throw new IllegalArgumentException("Cant retweet own tweet.");
            //cant retweet when the original author and author are the same.
        }

        else{
            this.author = author;
            this.text = original.getText();
            this.original = original;
            //the retweeter gets their username but the text is the original posters.
            if(original.getOriginalTweet() != null){
                this.original = original.getOriginalTweet();
            }
            original.increaseRetweetCount();
        }
    }

    public String getText(){
        return this.text;
    }

    public TwitterAccount getOwner(){
        return this.author;
    }

    public Tweet getOriginalTweet(){
        return this.original;
    }

    public int getRetweetCount(){
        return this.retweetCount;
    }

    public void increaseRetweetCount(){
        this.retweetCount++;
    }

    public static void main(String[] args) {
        
    }
}
