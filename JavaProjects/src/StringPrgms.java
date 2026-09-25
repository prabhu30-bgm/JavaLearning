import java.util.Locale;

public class StringPrgms {
    public static void main(String[] args)
    {
        String str1 = "Prbhu";
        String str2 = "Kudenatti";
        System.out.println(str2.length());
        String str3 = str1.concat(" Kudenatti");
        System.out.println(str3);

        System.out.println(str3.substring(5, 15));
        System.out.println(str3.toUpperCase());
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.contains(str1));
        System.out.println(str3.startsWith(str1));
        System.out.println(str3.endsWith(str2));
        System.out.println(str2.trim());
    }
}
