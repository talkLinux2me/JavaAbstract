import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class myBook extends Book{
    void setTitle(String s){
        this.title = s;
    }
}






public class Main {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);
        String bookName = book.nextLine();

        myBook random = new myBook();
        random.setTitle(bookName);
        System.out.println("The title is: " + random.getTitle());
    }
}