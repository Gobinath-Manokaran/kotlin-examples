package main.java;//Is java strictly typed language?
//Its almost typed language, because its allowing null to store inside the object types

// Then How do we ensure the null safety?
// We have to ensure the object is not null every time when we want to manipulate the object.


public class NullSafety {
    public static void main(String[] args) {
        String companyName = "Thoughtworks"; // to null

        if(companyName != null) {
            System.out.println(companyName.toUpperCase());
        }
    }
}
