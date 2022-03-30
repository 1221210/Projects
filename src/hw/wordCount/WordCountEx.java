package hw.wordCount;

import java.util.HashMap;

public class WordCountEx {
    static void printWordCounts(String[] words){
        HashMap<String[], Integer> wCounts = new HashMap<>();
        //ArrayList<Pair> wCounts = new ArrayList<Pair>();
        // for each word in words,
        //      if you have seen the word before, then update its count by adding 1
        //      else (you see the word for the first time), then create a new pair (w,1) add it to wCounts

        // print the words with count
        for(String w : words) {
            Integer integer = wCounts.get(words);
            if (integer == null)
                wCounts.put(words, 1);

            else {
                wCounts.put(words, integer + 1);

            }
        }
        System.out.println(wCounts);

//            if(wCounts.contains(new Pair(w,0))){
//                    // update count by adding 1
//                int idx = wCounts.indexOf(new Pair(w,0));
//                Pair p1 = wCounts.get(idx);
//                p1.val = p1.val + 1;
//            }
//            else // you see thr word for the first time
//                 // create a new pair (w,1) add it to wCounts
//                wCounts.add(new Pair(w, 1));
//        }
//        for(int i=0;i<wCounts.size();i++){
//            Pair p = wCounts.get(i);
//            System.out.print(p.key + ":" + p.val + " ");
//        }

    }
    public static void main(String[] args) {
        String[] words = "Hello World Hi Hi guys Hello ladies Hi boy".split(" ");
        printWordCounts(words); // Hello:2 World:1 Hi:3 guys:1 ladies:1 boy:1


        /*
        Links for project hints:
        Last Lecture: https://www.youtube.com/watch?v=taB36JlC_zE (poggers?)
        Lecture Notes: https://drive.google.com/file/d/1uhtNOD3zEJNsYI9Ws35ob9yPjl62IQmF/view
         */

    }
}
