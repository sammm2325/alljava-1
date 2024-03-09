package intermediate.RegularExpressions.Pattern.Matcher_Class.CharacterClasses;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
[abc]	Includes any of the contained characters
[^abc]	Excludes all of the contained characters
[a-z]	Includes any of the contained characters across a range
.	Any character except newline
\w	Any word character (alphanumeric and underscore)
\d	Any digit [0-9]
\s	Whitespace (spaces, tabs, line breaks)
*/
public class Example {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("gr[ae]y");
    Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
    int count=0;
    while(matcher.find())count++;
    System.out.println(count);
  }
}