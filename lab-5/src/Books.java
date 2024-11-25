
import java.util.LinkedList;
import java.util.Queue;

public class Books {
    private Queue<String> books;

    public Books() {
        this.books = new LinkedList<>();
    }

    public void addBook(String book){
        books.offer(book);
    }

    public void removeBook(){
        books.poll();
    }

    public static void main(String[] args) {
        Books bookshelf = new Books();

        bookshelf.addBook("Book 1");
        bookshelf.addBook("Book 2");
        bookshelf.addBook("Book 3");
        bookshelf.removeBook();
    }
}
