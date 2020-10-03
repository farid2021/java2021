package pratice_2;

public class TestAuthor {
    public static void main(String[] args){
        Author RalRe = new Author( "RalRe ", "RalRe@gmail.com ", 'm');
        System.out.println(RalRe);
        RalRe.setEmail("RalRe@gmail.com");
        System.out.println( RalRe);
        System.out.println( "name is: " + RalRe.getName());
        System.out.println("gender is: " + RalRe.getGender());
        System.out.println("email is: " + RalRe.getEmail());
    }
}


