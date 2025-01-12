import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryAdmin {
    private List<Book> books = new ArrayList<>();
    private List<Book> rented = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(String searchTitle) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(searchTitle).collect(Collectors.toList()));
    }

    public List<Book> addBookToRentedBooks(String searchId) {
       var bookId =  books.stream().filter(book -> book.getId()).toString();
       var rentedId = books.stream().filter(book -> book.getId()).toString();

       if(bookId.equalsIgnoreCase(searchId)){
            return books.stream().filter(book -> book.getId().equalsIgnoreCase(searchId)).collect(Collecttors.toList());
       }
       else if(!bookId.equalsIgnoreCase(searchId)){
            System.out.println("No books found");
       }
       else if(rentedId.equalsIgnoreCase(searchId)){
            System.out.println("Book already rented");
       }
    }

    public List<Book> getAllBooks(String searchLibrary) {
        var library = books.stream().filter(book -> book.getLibrary()).toString();
        if(searchLibrary == library){
            return books.stream().toList();
        }
        else{
            System.out.println("No books found");
        }
    }

}
