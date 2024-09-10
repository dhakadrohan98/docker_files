import java.util.Properties;

public class Test {

    private static void printSystemProperties() {
        System.out.println("Printing system properties using Java program");
        System.out.println();
        Properties props = System.getProperties();
        System.out.println(props);

    }
    
    public static void main(String[] args) {
        System.out.println("Java program started...");
        printSystemProperties();
    }

}