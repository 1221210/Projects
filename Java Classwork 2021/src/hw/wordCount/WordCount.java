package hw.wordCount;

import java.util.HashMap;

public class WordCount {

        public static void main(String[] args)
        {
            String[] words = "Hello World Hi Hi guys Hello ladies Hi boy".split(" "); // splits the string's words
            printWordCounts(words); // prints the resulting words and their occurrence counts
        }


        static void printWordCounts(String[] words){          // declaration of function for printing wordCount

            // Initialize hashmap
            HashMap<String, Integer> wCounts = new HashMap<>();

            for (String w : words) {
                // checks if the hashMap has the key
                Integer counter = wCounts.get(w);

                if (counter == null)
                    // Store key and occurrence in hash if count n/a
                    wCounts.put(w, 1);

                else {
                    // Increment the count if already existing in the hash
                    wCounts.put(w, counter + 1);
                }
            }
            System.out.println(wCounts); // prints hashmap

        }
    }
