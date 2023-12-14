package module7;

import java.util.Arrays;

public class Newsfeed4 {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed4(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    return topics.length;
  }
  
  public static void main(String[] args){
    Newsfeed4 sampleFeed = new Newsfeed4();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}

