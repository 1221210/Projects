package apps;

import java.util.ArrayList;

public class FBuser {
    String ID;
    public FBuser inRelationWith;
    public ArrayList<FBuser> friends;
    public FBuser(String id){
        ID = id;
        friends = new ArrayList<FBuser>();
    }
    public String toString(){return "ID:" + ID;}
    public void showDetails(){
        // display id, inRelationWith, friend
        System.out.println("ID:" + ID + ", in Relation With: " + inRelationWith + " friends: " + friends);
    }
}
