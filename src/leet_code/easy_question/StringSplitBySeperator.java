package leet_code.easy_question;

import leet_code.MinCostClimbing;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:- 13-Oct-2023
 *2788. Split Strings by Separator
 * Given an array of strings words and a character separator, split each string in words by separator.
 *
 * Return an array of strings containing the new strings formed after the splits, excluding empty strings.
 *
 * Notes
 *
 * separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
 * A split may result in more than two strings.
 * The resulting strings must maintain the same order as they were initially given.
 *
 */

public class StringSplitBySeperator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> newArray = new ArrayList<String>();


        for(int i=0;i<words.size();i++){
            String singleWords = words.get(i);
            String data="";
            for(int j=0;j<singleWords.length();j++){
                if(singleWords.charAt(j)!=separator){
                    data = data+singleWords.charAt(j);
                }else{
                    if(!data.isEmpty()) {
                        newArray.add(data);
                    }
                    data = "";
                }

            }
            if(!data.isEmpty()) {
                newArray.add(data);
            }

        }
        return  newArray;

    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<String> words = new ArrayList<String>();
        words.add("$easy$");
                words.add("$problem$");
      //  words.add("one.two.three");
       // words.add("four.five");
      //  words.add("six");

        //char separator = '.';
       char separator = '$';

        List<String> updatedArray = new ArrayList<String>(new StringSplitBySeperator().splitWordsBySeparator(words, separator));
        for(int i =0; i<updatedArray.size();i++){
            System.out.println(updatedArray.get(i));
        }


//        System.out.println(MountainArray.findInMountainArray(1, new int[]{4,1,5,1,7,1}));
    }
}
