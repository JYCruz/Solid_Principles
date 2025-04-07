public class NeuLibrary {
    public static void main(String[] args) {
        Student stud1 = new Student("Jus Crus", "21-13735-787");

        Book book1 = new Book("Book1", "Tiktok");
        Book book2 = new Book("Book2", "Facebook");
        Book book3 = new Book("Book3", "Instagram");

        BookProcessor processPB = new BookProcessor(new PBHandler());
        BookProcessor processAB = new BookProcessor(new ABHandler());
        BookProcessor processJB = new BookProcessor(new JHandler());
      
        System.out.println(stud1.getName() + processPB.borrow(book1));
        System.out.println(stud1.getName() + processAB.borrow(book2));
        System.out.println(stud1.getName() + processJB.borrow(book3));
 
        System.out.println(stud1.getName() + processJB.borrow(book2));
    }
}
