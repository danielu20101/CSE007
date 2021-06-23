/*Daniel Unhuryan
02/08/21
CSE7 week2 participation
This program is intended to list the names of your friends in lexicographical order*/

public class VWAPI {
    public static void main(String[] args) {
      String name1 = "John";
      String name2 = "Dan";
      String name3 = "Wesley";
      int numberoffreinds = 3;

      System.out.println(name1 + " " + name2 + " and " + name3 + " are your " + numberoffreinds + " friends:");
      
      if (name1.compareTo(name2) < 0) {
          System.out.println(name1);

      } else if (name1.compareTo(name2) > 0){
      System.out.println(name2);

      }else {
          System.out.println(name1); //the names are equal so either one works
      }
      //comparing to another friend 3
      if (name1.compareTo(name3) < 0) {
        System.out.println(name1);

    } else if (name1.compareTo(name3) > 0){
    System.out.println(name3);

    }else {
        System.out.println(name1); //the names are equal so either one works
    }

    if (name2.compareTo(name3) < 0) {
        System.out.println(name3);

    } else if (name2.compareTo(name3) > 0){
    System.out.println(name2);

    }else {
        System.out.println(name1); //the names are equal so either one works
    }


    }
}


