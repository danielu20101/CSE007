
public class FriendsList {
    private VWUser[] friends;
    private int numFriends;

    public FriendsList(){
        friends = new VWUser[50];
        numFriends = 0;
    }
    public FriendsList(int len){
        friends = new VWUser[len];
        numFriends=0;
    }
    public int getNumFriends(){
        return numFriends;
    }

    public int addFriend(VWUser vw){
        int returnVal=0;
        if(numFriends != friends.length){
            if(findFriend(vw)!= -1){
            returnVal=numFriends;
            friends[numFriends++]=vw;}
        } else {
            returnVal=-1;
            System.out.println("Your friend's list is full");
        }
        return returnVal;
    }
    public int findFriend(VWUser vw){
        int index = -1;
        if(numFriends>1){
            for(int i = 0; i<friends.length; i++){
                if(friends[i].equals(vw)){
                    index=i;
                    break;
                }
            }  
        }
        return index;
    }
    public void viewFriends(){ 
        //complete this method
        
    }
}
