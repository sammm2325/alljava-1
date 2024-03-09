package intermediate.RegularExpressions.Pattern.Matcher_Class.ALternation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
//ab|cd	Match ab OR cd
public class Example {
  
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("grey|gray");
    Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
    int count=0;
    while(matcher.find())count++;
    System.out.println(count);
  }
}
