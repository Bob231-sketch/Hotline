import java.util.*;


public class Hotline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        word = word.toLowerCase();
        System.out.print("1-800-");
        int count=0;
        String b = "";
        for (int i = 0; i < word.length(); i++) {
            if (count == 7) {
                break;
            }
            if(word.charAt(i)==' '){
                continue;
            }
            count++;
            if(word.charAt(i)=='0'|| word.charAt(i)=='1' || word.charAt(i)=='2' ||word.charAt(i)== '3' || word.charAt(i)=='4' ||word.charAt(i)=='5' ||word.charAt(i)== '6' ||word.charAt(i)=='7'|| word.charAt(i)=='8'||word.charAt(i)=='9'){
                System.out.print(word.charAt(i));
            }
            if (word.charAt(i) == 'a' || word.charAt(i) == 'b' || word.charAt(i) == 'c') {
                System.out.print("2");
            }

            if (word.charAt(i) == 'd' || word.charAt(i) == 'e' || word.charAt(i) == 'f') {
                System.out.print("3");
            }


            if (word.charAt(i) == 'g' || word.charAt(i) == 'h' || word.charAt(i) == 'i') {
                System.out.print("4");
            }


            if (word.charAt(i) == 'j' || word.charAt(i) == 'k' || word.charAt(i) == 'l') {
                System.out.print("5");
            }


            if (word.charAt(i) == 'm' || word.charAt(i) == 'n' || word.charAt(i) == 'o') {
                System.out.print("6");
            }


            if (word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'r' || word.charAt(i) == 's') {
                System.out.print("7");
            }


            if (word.charAt(i) == 't' || word.charAt(i) == 'u' || word.charAt(i) == 'v') {
                System.out.print("8");
            }


            if (word.charAt(i) == 'w' || word.charAt(i) == 'x' || word.charAt(i) == 'y' || word.charAt(i) == 'z') {
                System.out.print("9");
            }
            if(count==3){
                System.out.print("-");
            }

        }
        if(word.length()<7)
        {
            for(int i=word.length(); i<7; i++)
            {
                System.out.print("0");
                if(i==2){
                    System.out.print("-");
                }

            }

        }

    }


}

