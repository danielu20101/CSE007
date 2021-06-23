public class Encyclopedia extends book{
    
    @Override
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
     }
}
