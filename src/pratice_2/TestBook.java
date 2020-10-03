package pratice_2;

public class TestBook {
    package P2;

    public class TestBook {
        public static void main(String[] args) {
            Author RalRe = new Author("RalRe ", "RalRe@gmail.com ", 'm');
            System.out.println(RalRe );
            Book dummyBook = new Book("Java for dummies ", RalRe , 10.82, 120);
            System.out.println(dummyBook);
            dummyBook.setPrice(7.72);
            dummyBook.setPrice(77);
            System.out.println("name is: " + dummyBook.getName());
            System.out.println("price is: " + dummyBook.getPrice());
            System.out.println("qty is: " + dummyBook.getQty());
            System.out.println("author is: " + dummyBook.getAuthor());
            System.out.println("author's name is: " + dummyBook.getAuthor().getName());
            System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
            System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
            Book moreDummyBook = new Book("Java for more dummies", new Author("Farid Tchakala", "faridtchak@gmail.com", 'm'), 20, 9);
            System.out.println(moreDummyBook);
        }
    }
}
