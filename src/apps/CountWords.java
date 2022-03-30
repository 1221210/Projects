package apps;

public class CountWords {
    public static void main(String[] args) {
        String text = "hello everyone hi guys hi girls good morning guys good afternoon girls";
        String[] tokens = text.split(" "); // gives multiple strings separated by spaces
        System.out.println(tokens.length); // however, many tokens / strings
        MyLinkedList<String> words = new MyLinkedList<String>();
        for(int i =0; i<tokens.length; i++) // keeps identical words from being printed
            if(words.search(tokens[i]) == null)
            words.add(tokens[i]);
        words.printLinkedList();
    }
}
