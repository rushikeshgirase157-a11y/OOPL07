
public class StringMathDemo {
    public static void main(String[]args) {

        String str1 = "Rushikesh";
        String str2 = " Girase";
        String str3 = str1.concat("" + str2);

        System.out.println("Concatenation: "+ str3);
        System.out.println("Length of str1:" + str1.length());
        System.out.println("Character at index 0:" + str1.charAt(0));
        System.out.println("Substring of str1 (0-5):" + str1.substring(0,5));
        System.out.println("Equals? str1 and str2:" + str1.equals(str2));
        System.out.println("Uppercase str3:" + str3.toUpperCase());
        System.out.println("Lowercase str1:" + str1.toLowerCase());


        double a = 15.0;
        double b = 2.5;

        System.out.println("Square root of a:" + Math.sqrt(a));
        System.out.println("a raised to b:" + Math.pow(a,b));
        System.out.println("Max of a and b:" + Math.max(a,b));
        System.out.println("Min of a and b:" + Math.min(a,b));
        System.out.println("Ramndom number (0-1)" + Math.random());
        System.out.println("Ramndom number (10-20)" + (10+Math.random()* (20-10)));
        System.out.println("Ramndom number (1-100)" + (1+Math.random()* (100-1)));
        System.out.println("Ceil of b:" + Math.ceil(b));
        System.out.println("Floor of a:" + Math.floor(b));
        System.out.println("Round of b:" + Math.round(b));
        


        }

    
    }
