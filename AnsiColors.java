package CAP02;

public class AnsiColors {
    public static final String RED = "\033[0;31m";     // RED
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE  
    public static void main(String[] args){
        System.out.println("                            "+RED_BACKGROUND_BRIGHT+"  ");
        System.out.println(RED+"     APRENDE JAVA         "+RED_BACKGROUND_BRIGHT+"  ");
        System.out.println(RED+"    CON EJERCICIOS          "+RED_BACKGROUND_BRIGHT+"  ");
        System.out.println(BLACK+"                                  ");
        System.out.println(YELLOW+"  LUIS JOSE SANCHEZ      "+BLUE_BACKGROUND_BRIGHT+"             ");
        System.out.println(BLACK+"                         "+BLUE_BACKGROUND_BRIGHT+"         "+BLACK+"  "+BLUE_BACKGROUND_BRIGHT+"  ");
        System.out.println(BLACK+"                         "+BLUE_BACKGROUND_BRIGHT+"             ");
        System.out.println(BLACK+"                         "+BLUE_BACKGROUND_BRIGHT+"         ");
        System.out.println(PURPLE_BACKGROUND+"                         "+BLUE_BACKGROUND_BRIGHT+"         "+PURPLE_BACKGROUND+"        ");
        System.out.println(PURPLE_BACKGROUND+"                                          ");
        System.out.println(PURPLE_BACKGROUND+"                                          ");
    }
}
