/**
 * Created by cemserit on 2019-06-15.
 */
public class StringInSwitchStatement {
    public static void main(String[] args) {
        String javaVersion = "JAVA7";

        System.out.println("Java version is ");
        switch (javaVersion) {
            case "JAVA6":
                System.out.println("6");
                break;
            case "JAVA7":
                System.out.println("7");
                break;
            default:
                System.out.println("unknown version");
        }
    }
}
