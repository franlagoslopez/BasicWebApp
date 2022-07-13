package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "francisca";
        } else if (query.contains("plus")) {
            String[] words = query.split(" ");
            int sum = 0;
            for (String word:words){
                try {
                    int number = Integer.parseInt(word);
                    sum += number ;
                }catch(Exception e){
                    //
                }
            }
            return String.valueOf(sum);

        } else if (query.contains("largest")) {

        }return "";
    }
}


