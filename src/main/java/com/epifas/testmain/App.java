package com.epifas.testmain;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!s<
 *
 */
public class App 
{
    public static void main( final String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println(isSameCharOccurrence("dog", "god"));
    }

    public static boolean isSameCharOccurrence(String char1, String char2){

        char [] chars1 = char1.toCharArray();
        char [] chars2 = char2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<> ();
        Map<Character, Integer> map2 = new HashMap<> ();

        for(final char c1 : chars1){

            if(map1.containsKey(c1)){
                Integer nb = map1.get(c1);
                map1.put(c1,++nb);
            }else {
                map1.put(c1,1);
            }
            
        }

        for(final char c2 : chars2){

            if(map2.containsKey(c2)){
                Integer nb = map2.get(c2);
                map2.put(c2,++nb);
            }else {

                map2.put(c2,1);
            }
        }
         return map1.equals(map2);
    }
}
