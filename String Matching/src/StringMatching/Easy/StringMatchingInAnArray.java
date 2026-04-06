package StringMatching.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words){
        List<String> result = new ArrayList<>();

        for (int i=0;i<words.length;i++){
            for (int j=0;j<words.length;j++){
                if (i != j && words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    static void main(String[] args) {
       StringMatchingInAnArray obj = new StringMatchingInAnArray();
       String[] words = {"mass","as","hero","Superhero"};
       List<String> result = obj.stringMatching(words);
        System.out.println(result);
    }
}
