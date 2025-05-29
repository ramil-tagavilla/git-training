public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        System.out.println(library.searchBook("The Great Gatsby"));
        System.out.println(library.searchBook("1984"));
    }
}
