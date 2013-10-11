/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sreview;

import java.util.Scanner;

/**
 *
 * @author Side
 * New Methods Used:
 * Character.isLetter();
 * Character.whiteSpace();
 * String.split();
 * String.contains();
 * JavaDoc: 
 * http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/String.html
 * http://docs.oracle.com/javase/tutorial/essential/regex/matcher.html
 * http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/String.html#trim%28%29
 * http://docs.oracle.com/javase/1.4.2/docs/api/java/lang/String.html#length%28%29
 * http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 * http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * http://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
 * http://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Character.html
 * 
 * Tutorial Point:
 * http://www.tutorialspoint.com/java/java_string_matches.htm
 * http://www.tutorialspoint.com/java/java_string_matches.htm
 * http://www.tutorialspoint.com/java/character_isletter.htm
 * http://www.tutorialspoint.com/java/java_string_charat.htm
 * http://www.tutorialspoint.com/java/java_methods.htm
 * http://www.tutorialspoint.com/java/lang/character_iswhitespace.htm
 */
public class Sreview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner st = new Scanner (System.in);
        System.out.println("Please Input Your Phrase Here>>");
        String p= st.nextLine();


		Word w= new Word(p); 
		w.displayData(); 
        
    }
}
