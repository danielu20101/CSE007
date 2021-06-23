public class VWUser extends Person {
    private String username;
    private String password;
    private double balance;
    private FriendsList friends;
    private static int users=0;

    public VWUser(){
        balance = 0.0;
        friends = new FriendsList();
        users++;
    }
    public VWUser(String username,String password, double balance){
        this.username=username;
        this.password=password;
        this.balance = balance;
        friends = new FriendsList();
        users++;
    }
    public VWUser(String username,String password, String name){
        super(name,null,null);
        this.username=username;
        this.password=password;
        balance = 0.0;
        friends = new FriendsList();
        users++;
    }
    public VWUser(String username,String password, String name, String address, String birthdate){
        super(name,address,birthdate);
        this.username=username;
        this.password=password;
        balance = 0.0;
        friends = new FriendsList();
        users++;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance >= 0){
            this.balance = balance;
        }
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public static int getUsers(){
        return users;
    }
    public void sendMoney(double amount, VWUser friend){
        if(friends.findFriend(friend)!=-1){
            if(amount <=balance){
                balance-=amount;
                System.out.println("You sent $"+ amount +" to "+ friend.getUsername());
            } else {
                System.out.println("You do not have enough money in your balance to send");
            }
        } else {
            if(friends.addFriend(friend)!=-1){
                if(amount <=balance){
                    balance-=amount;
                    System.out.println("You sent $"+ amount +" to "+ friend.getUsername());
                } else {
                    System.out.println("You do not have enough money in your balance to send");
                }
            } else {
                System.out.println("Your transaction could not be completed");
            }
        }
    }
    public void requestMoney(double amount, VWUser friend){
        if(friends.findFriend(friend)!=-1){
            balance+=amount;
            System.out.println("You received $"+ amount +" to "+ friend.getUsername());
        } else {
            if(friends.addFriend(friend) != -1){
                balance+=amount;
                System.out.println("You received $"+ amount +" to "+ friend.getUsername());
            }else {
                System.out.println("Your transaction could not be completed");
            }
        }
    }
    public FriendsList getFriendsList(){
        return friends;
    }
    @Override
    public String toString() {
        return String.format(re + " + i" + im);
    }

}
