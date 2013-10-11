/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sreview;

import java.text.DecimalFormat;

/**
 *
 * @author Side
 */
public class Word {
    
    private  String p;
    public Word(String phrase) //default constractor
    {
    	p=phrase;
    }

    public   int Counter(String p) //Word Counter

            {

                boolean word=false;
                int counter=0;
                int endOfString = p.length()-1;

                for(int i=0; i<p.length(); i++)
                     {
                        if(Character.isLetter(p.charAt(i)) == true && i != endOfString) //Checks If  Character Is Letter
                            {
                               word=true;
                            }
                        else
                            if(Character.isLetter(p.charAt(i))==false && word==true) // checks if character is not letter but word
                            {
                            counter++;
                            word=false;
                             }
                            else
                                if(Character.isLetter(p.charAt(i)) && i== endOfString) //last string check
                                {
                                 counter++;
                                   }
                     }
                 return counter;

            }
    public int CharCounter(String p) //Character Counter
        {
            
            int counter=0;
            String c;
            
            for(int i=0;i<p.length();i++)
                {
                   
                    if(Character.isLetter(p.charAt(i))) //Chechs if character is letter
                    {
                        counter++;
                    }
                }
            return counter;
        }
       public  int NoCharCounter(String p) //Non Chracter counter
        {
            boolean nochar=false;
            int counter=0;
            char noalp;
            String nospace = null; // if there is space
            String c;
            
            for(int i=0;i<p.length();i++)
                {
                   
                    if(Character.isLetter(p.charAt(i))==false) //if character is not leter
                    {
                        noalp = p.charAt(i);
                      if(Character.isWhitespace(noalp)==false) // and if character is not space
                      {
                           if(noalp<='A' || noalp>='Z') // if character is  not uppercase
                            {
                                counter++;
                            } 
                      }
                            
                        
                    }
                }
            return counter;
        }
     public  int TheChecker(String p) //Checks for the
        {
         int x=0;  
         int counter = 0;
         if(p.contains("The ")) // if string has the
         {
            String[] the = p.split("The "); // splits the into array elements
            counter=the.length-1;  //counter is equal to index quantity of the
         }
         if(p.equals("The")) // if string is THE
         {
          counter++;
         }
         return counter;
        }
     public double PercentCounter(String p) //calculator for percent
     {
     
    	//ALPAFET
    	String upper=p.toUpperCase(); //Tempreroty uppercase maker
       //  System.out.println(upper); //debuger 
         int a=0;
         int i=0;
         int x=0;
        
         char Ualfa='A';
         char Lalfa='a';
         
         char[] Ualpafet; //upercase character array
         char[] Lalpafet; // lowercase character array
         char[] Galpafet;
         Ualpafet = new char[26];
         Lalpafet = new char[26];
         Galpafet = new char[53];
         
         for(i=0; i<26;i++) //assigns all uppercase letters
         {
            Ualpafet[i]=Ualfa;
            Ualfa++;
         
         }
         /*
         for(i=0; i<26;i++) //assigns all lowercase letters
         {
            Lalpafet[i]=Lalfa;
            Lalfa++;
         
         }
          */
         /*
         for(i=0;i<52;i+=2)//Genera Alpfa is assigned Uppercase To Even Numbers
         {
            Galpafet[i]=Ualfa;
            Ualfa++;
         }   
       
         for(x=1;x<52;x+=2)  //General Alpafet Is Assigned Lower Aplafets on Odd Numbers
         {
             Galpafet[x]=Lalfa;
              Lalfa++;
         }
           
        
          */
         //********************DEBUG SECTION*********************/
         /*
            for(i=0;i<52;i++)
         {
            System.out.println(Galpafet[i]);
         } 
//         for(i=0;i<26;i++)
//         {
//         	System.out.println("Character " + Ualpafet[i]);
//         	
//         }
//          for(i=0;i<26;i++)
//         {
//         
//         	System.out.println("Character " + Lalpafet[i]);	
//         }
 */    
        
         //END ALPAFET
         
          int counter=0;
          double result=0.0;
          char CurrentChar;
          for(int z=0;z<=upper.length()-1;z++)
                {
                     CurrentChar=upper.charAt(z); // assigns current character to its variable
                     for(int y=0;y<26;y++)
                        {
                            if(CurrentChar==Ualpafet[y]) //Only uppercase checker
                            {
                                counter++;
                                Ualpafet[y]='*'; //sets that letter to * so no double will be counted
                            }
                            
                    //        if(CurrentChar==Galpafet[y]) // checks if current character matches any upercase letter
                    //           {
                    //                counter++;
                    // 
                   //                 Galpafet[y]='*';
                   //                 Galpafet[y+1]='*'; //WARNING ONLY FOR THIS PROGRAM PURPOSES. COMMAND MUST BE REPLACED MY CHECKER METHOD
                                    
                       //         *************OLD VERSION****************
                         //           if(CurrentChar==Lalpafet[y]) //checks if current char is also lowercase inside word
                       //                 {
                       //                     Lalpafet[y]='*';
                       //                 }
                                   
                   //             }
                  //          if(CurrentChar==Lalpafet[y]) // checks if current char matches lowercase letters
                  //              {
                  //                  counter++;
                  //                  Lalpafet[y]='*';
                   //             }
                        }
                }
            result=counter; //Counter assigns to double result variable
            result /= 26.0;
            result *= 100.0; // calculating %
            if(result>100) {
             result=100;
         }
            
           return result;
     }
     
     public  void displayData() //display method
	{
                DecimalFormat output = new DecimalFormat("0");
		System.out.println();
		System.out.println("Your Word Contains:             " + Counter(p)+ " words");
                System.out.println("Your Word Contains:             " + CharCounter(p)+ " characters");
                System.out.println("Your Word Contains:             " + NoCharCounter(p)+ " Non characters");
                System.out.println("Your Word Contains:             " + TheChecker(p)+ "'The' articles");
                System.out.println("Your Word Uses:                 " +output.format(PercentCounter(p))+ "% of alpaphet");
                
	}
    
}
