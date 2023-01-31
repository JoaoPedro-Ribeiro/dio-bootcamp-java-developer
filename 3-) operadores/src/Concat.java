public class Concat {
    public static void main(String[] args) throws Exception {
        //string concatenation
        String firstName = "LINGUAGEM";
        String lastName = "JAVA";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        //concatenation with other types
        String concatenation = "?";

        concatenation = 1+1+1+"1"; //31 -> it will sum the numbers first and then concatenate the string
        System.out.println(concatenation);

        concatenation = 1+"1"+1+1; //1111 -> it will concatenate everything
        System.out.println(concatenation);

        concatenation = 1+"1"+1+"1"; //1111 -> it will concatenate everything
        System.out.println(concatenation);

        concatenation = "1"+1+1+1; //1111 -> it will concatenate everything
        System.out.println(concatenation);

        concatenation = "1"+(1+1+1); //13 -> it will sum the numbers first and then concatenate the string ->sum in evidence.
        System.out.println(concatenation);
    }
}
