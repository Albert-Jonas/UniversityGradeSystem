import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        read_in();
        calculate();
    }

//beolvasás

    static void read_in()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a black board pontszámot!");
        black_board_score = scanner.nextInt();

        System.out.println("Adja meg a laboratory pontszámot!");
        laboratory_score = scanner.nextInt();

        System.out.println("Adja meg az írott rész pontszámát!");
        written_part_score = scanner.nextInt();

    }

    static int black_board_score;
    static int laboratory_score;
    static int written_part_score;

//számítás

    static void calculate()
    {
        int result = black_board_score + laboratory_score + written_part_score;
        System.out.println("Pontszámaid összesen : " + result);

        if (black_board_score < 25 || laboratory_score <25 || written_part_score < 25)
        {
            System.out.println("Megbuktál mert egy tárgyból nem érted el a 25 pontot, hiába van  " + result+ "  pontod");
        } else if ( black_board_score + laboratory_score + written_part_score < 76)
        {
            System.out.println("Megbukott, mert az összpontszám nem érte el a 76-ot  " + result);
        } else if ( black_board_score + laboratory_score + written_part_score > 75 && black_board_score + laboratory_score + written_part_score < 100)
        {
            System.out.println("elégséges  " + result);
        } else if ( black_board_score + laboratory_score + written_part_score > 99 && black_board_score + laboratory_score + written_part_score < 125)
        {
            System.out.println("jó " + result);
        } else
        {
            System.out.println("kiváló " + result);
        }

    }

}