public class BookProcessor{
    private BookHandler bookHandler;

    public BookProcessor(BookHandler bookHandler){
        this.bookHandler = bookHandler;
    }

    public String borrow(Book book){
        return bookHandler.handle(book.getType(), book.getName());
    }
}
