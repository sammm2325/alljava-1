package intermediate.RegularExpressions.Pattern.Matcher_Class.Quantifiers;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
// a*	0 or more
// a+	1 or more
// a?	0 or 1
// a{5}	Exactly five
// a{3,}	Three or more
// a{1,3}	Between one and three
// a+?	Match as few as possible
// a{2,}?	Match as few as possible with a lower bound
public class Example {

  public static void main(String[] args){
    String[] strings = {"CCQQ", "QQCC", "CQQ", "QUACK", "CCQ", "CQC", "CQQQ", "CCCQQ"};

    Pattern pattern = Pattern.compile("C+Q{2}");

    for(String s: strings){
      Matcher matcher = pattern.matcher(s);
      System.out.println(matcher.matches());
    }
  }
}