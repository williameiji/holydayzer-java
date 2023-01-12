import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Holidays holidaysList = new Holidays();

        Scanner in = new Scanner(System.in);

        System.out
                .println("Digite uma data para saber se é feriado: Ex. 01/01/2023 ou 'todos' para um lista completa.");
        String s = in.nextLine();
        System.out.println();

        holidaysList.getHoliday(s);
    }
}
