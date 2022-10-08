/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucaldas.liskov;

/**
 *
 * @author DERLY
 */
public class Bird {
    
    private String eat;
    private String tweet;

    public Bird(String eat, String tweet) {
        this.eat = eat;
        this.tweet = tweet;
    }

    public String getEat() {
        return eat;
    }

    public String getTweet() {
        return tweet;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }  
    
    
}
