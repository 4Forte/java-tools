import java.util.Arrays;
/**
 * 01.24.23: Chroma-Lion
 * @author 4Forte
 */
public class ConsoleColors {
    // Reset
    private static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors: 0-7
    private static final String BLACK = "\033[0;30m";   // BLACK
    private static final String RED = "\033[0;31m";     // RED
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BLUE = "\033[0;34m";    // BLUE
    private static final String PURPLE = "\033[0;35m";  // PURPLE
    private static final String CYAN = "\033[0;36m";    // CYAN
    private static final String WHITE = "\033[0;37m";   // WHITE

    // Background b
    private static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    private static final String RED_BACKGROUND = "\033[41m";    // RED
    private static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    private static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    private static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    private static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    private static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    private static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    
    //prefix, defaults to &
    public static char prefix = '&';
    public static void setPrefix(char p){
        prefix = p;
    }
    
    //format color code
    public static String format(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == prefix) {
                switch (str.charAt(i + 1)) {

                    //function
                    case 'x' -> { str = str.replaceFirst(prefix + "x", RESET); }
                    
                    //foreground
                    case '0' -> { str = str.replaceFirst(prefix + "0", BLACK); }
                    case '1' -> { str = str.replaceFirst(prefix + "1", RED); }
                    case '2' -> { str = str.replaceFirst(prefix + "2", GREEN); }
                    case '3' -> { str = str.replaceFirst(prefix + "3", YELLOW); }
                    case '4' -> { str = str.replaceFirst(prefix + "4", BLUE); }
                    case '5' -> { str = str.replaceFirst(prefix + "5", PURPLE); }
                    case '6' -> { str = str.replaceFirst(prefix + "6", CYAN); }
                    case '7' -> { str = str.replaceFirst(prefix + "7", WHITE); }
                    
                    //background
                    case 'q' -> { str = str.replaceFirst(prefix + "q", BLACK_BACKGROUND); }
                    case 'w' -> { str = str.replaceFirst(prefix + "w", RED_BACKGROUND); }
                    case 'e' -> { str = str.replaceFirst(prefix + "e", GREEN_BACKGROUND); }
                    case 'r' -> { str = str.replaceFirst(prefix + "r", YELLOW_BACKGROUND); }
                    case 't' -> { str = str.replaceFirst(prefix + "t", BLUE_BACKGROUND); }
                    case 'y' -> { str = str.replaceFirst(prefix + "y", PURPLE_BACKGROUND); }
                    case 'u' -> { str = str.replaceFirst(prefix + "u", CYAN_BACKGROUND); }
                    case 'i' -> { str = str.replaceFirst(prefix + "i", WHITE_BACKGROUND); }
                   
                    default -> {/* do nothing */}
                }
            }
        }
        return (str);
    }
    
    //overloaded for blank
    public static void println(){
        System.out.println();
    }
    
    //overloaded for string
    public static void println(String str){
        //print color coded string, then reset again
        System.out.println(format(str + prefix + 'x'));
    }
    
    //overloaded for int
    public static void println(int num){
        //print color coded string, then reset again
        System.out.println(format(""+num + prefix + 'x'));
    }
    
    //overloaded for double
    public static void println(double num){
        //print color coded string, then reset again
        System.out.println(format(""+num + prefix + 'x'));
    }
    
    //overloaded for string array
    public static void println(String[] strArr){
        //print color coded string, then reset again
        System.out.println(format(Arrays.toString(strArr) + prefix + 'x'));
    }
    
    //overloaded for int array
    public static void println(int[] num){
        //print color coded string, then reset again
        System.out.println(format(Arrays.toString(num) + prefix + 'x'));
    }
    
    //overloaded for double array
    public static void println(double[] num){
        //print color coded string, then reset again
        System.out.println(format(Arrays.toString(num) + prefix + 'x'));
    }
}
