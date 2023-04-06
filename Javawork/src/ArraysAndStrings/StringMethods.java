package ArraysAndStrings;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s="  Devika  ";
        String s1="Dubbaka";
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(3));
        System.out.println(s.concat("Sony"));
        System.out.println(s.contains("Dev"));// checks string  containing the given name or not if yes true
        System.out.println(s.equals(s1));
        System.out.println(s.endsWith("a"));
        System.out.println(s.length());
        System.out.println(s.trim());
    }
}
