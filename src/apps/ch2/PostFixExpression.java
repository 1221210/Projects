//package apps.ch2;
//
//public class PostFixExpression {
//    static Integer evalPostFix(String s){
//        // split the string into an array of words. eg) 5 17 + -> {5, 17, +
//        // for each words
//        // if the word is a integer, push it to the stack
//        // else // operator "+", "-", "*", "/"
//        //      pop two operands and perform the operation
////              the push the result back to the stack
//        // return the result.
//       String[] words = s.split(" ");
//       MyStack<Integer> st = new MyStack<Integer>();
//       Integer n1, n2;
//       for(int i=0; i<words.length; i++)
//        {
//            if(words[i].matches("-?\\d+"))
//                st.push(Integer.parseInt(words[i]));
//            else if("+-*/".indexOf(words[i]) >= 0)
//                if (words[i].equals("+")){
//               n2 = st.pop();
//               n1 = st.pop();
//               st.push(n1 + n2);
//            }
//            else if (words[i].equals("-")){
//                n2 = st.pop();
//                n1 = st.pop();
//                st.push(n1 - n2);
//            }
//            else if (words[i].equals("*")){
//                n2 = st.pop();
//                n1 = st.pop();
//                if(n1 == null || n2 == null){
//                    System.out.println("Not enough operands");
//                    return null;
//                }
//                st.push(n1 * n2);
//            }
//            else if (words[i].equals("/")) {
//                n2 = st.pop();
//                n1 = st.pop();
//                st.push(n1 / n2);
//            }
//        }
//       if(st.numElements == 1)
//           return st.pop();
//       else{
//           System.out.println("TOo many operands");
//           return null;
//       }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(evalPostFix("5 17 +")); // 22
//        System.out.println(evalPostFix("5 7 + 6 2")); // 48
//        System.out.println(evalPostFix("5 7 + 6 - *")); // null
//        System.out.println(evalPostFix("5 7 + 6 2 10 - * ")); // null
//
//
//
//    }
//}
package apps.ch2;

public class PostFixExpression {
    static Integer evalPostFix(String s){
        String[] words = s.split(" ");
        MyStack<Integer> st = new MyStack<Integer>();
        Integer pop1, pop2;
        for(int i=0; i<words.length; i++){
            if(words[i].matches("-?\\d+")){
                st.push((Integer.parseInt(words[i])));
            }
            else if("+-*/".contains(words[i])) {
                pop2 = st.pop();
                pop1 = st.pop();
                if (pop1 == null || pop2 == null) {
                    System.out.println("Not enough operands");
                    return null;
                }
                if (words[i].equals("+")) {
                    st.push(pop1 + pop2);
                } else if (words[i].equals("-")) {
                    st.push(pop1 - pop2);
                } else if (words[i].equals("*")) {
                    st.push(pop1 * pop2);
                } else if (words[i].equals("/")) {
                    st.push(pop1 / pop2);
                }
                if(pop1 == null || pop2 == null){
                    System.out.println("Not enough operands");
                    return null;
                }
            }
        }
        if(st.numElements == 1)
            return st.pop();
        else{
            System.out.println("Too many operands");
            return null;
        }


    }

    public static void main(String[] args){
        System.out.println(evalPostFix("5 17 +")); //22
        System.out.println(evalPostFix("5 7 + 6 2 - *")); //48
        System.out.println(evalPostFix("5 7 + 6 - *")); //null, too little operands
        System.out.println(evalPostFix("5 7 + 6 2 10 - *")); //null, too many operands
    }
}