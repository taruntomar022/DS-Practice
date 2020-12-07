import java.io.*;
import java.util.*;

public class keypadCombination {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList < String > words = getKPC(str);
        System.out.println(words);

    }
    // static String[] codes = {
    //     ".?",
    //     "abc",
    //     "def",
    //     "ghi",
    //     "jkl",
    //     "mnop",
    //     "pqrs",
    //     "tu",
    //     "vwx",
    //     "yz"
    // };
    static String[] codes = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };


    public static ArrayList < String > getKPC(String str) {
        if(str==null){
            ArrayList < String > n = new ArrayList < > ();
            // n.add("");
            return n;
        }
        if (str.length() == 0) {
            ArrayList < String > nOut = new ArrayList < > ();
            nOut.add("");
            return nOut;
        }


        char ch = str.charAt(0);
        String rem = str.substring(1);

        ArrayList < String > res = getKPC(rem);

        ArrayList < String > tres = new ArrayList < > ();
        String aCodes = codes[ch - '0'];
        for (int i = 0; i < aCodes.length(); i++) {
            char eleCodes = aCodes.charAt(i);
            for (String r: res) {
                tres.add(eleCodes + r);
            }
        }

        return tres;
    }

}