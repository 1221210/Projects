package apps;

public class FBuserApp {
    public static void main(String[] args) {

        FBuser user1 = new FBuser("zys06640@ucmo.edu");
        FBuser user2 = new FBuser("ijs06660@ucmo.edu");
        FBuser user3 = new FBuser("john@ucmo.edu");
        System.out.println(user1);
        System.out.println(user2);
        // user1 is in relation with user2
        user1.inRelationWith = user2;
        user2.inRelationWith = user1;

        //add users 2 and 3 to user 1's friend's list
        user1.friends.add(user3);
        user1.friends.add(user2);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        user1.showDetails();


    }
}
