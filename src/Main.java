public class Main {
    public static void main(String[] args) {
        read_in();
        print_result();
    }

//beolvasás

    static void read_in()
    {
        System.out.println("Adja meg a black board pontszámot!");
        //olvassuk be a változót az osztály változóba

        System.out.println("Adja meg a laboratory pontszámot!");
        //olvassuk be a változót az osztály változóba

        System.out.println("Adja meg az írott rész pontszámát!");
        //olvassuk be a változót az osztály változóba

    }

    int black_board_score;
    int laboratory_score;
    int written_part_score;

    int result;

//számítás

    String calculate()
    {
        if (black_board_score < 25 || laboratory_score <25 || written_part_score < 25)
        {
            return "bukott";
        } else if ( black_board_score + laboratory_score + written_part_score < 76)
        {
            return "bukott";
        } else if ( black_board_score + laboratory_score + written_part_score > 75 && black_board_score + laboratory_score + written_part_score < 100)
        {
            return "elégséges";
        } else if ( black_board_score + laboratory_score + written_part_score > 99 && black_board_score + laboratory_score + written_part_score < 125)
        {
            return "jó";
        } else
        {
            return "kiváló";
        }
    }

//eredmény kiírása

    static void print_result()
    {
        //calculate() függvény meghívásával
    }

}