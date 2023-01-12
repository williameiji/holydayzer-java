import java.util.ArrayList;
import java.util.List;

public class Holidays {
    private List<String> date = new ArrayList<>();
    private List<String> title = new ArrayList<>();

    public Holidays() {
        date.add("01/01/2023");
        date.add("21/02/2023");
        date.add("17/04/2023");
        date.add("21/04/2023");
        date.add("01/05/2023");
        date.add("08/06/2023");
        date.add("07/09/2023");
        date.add("12/10/2023");
        date.add("02/11/2023");
        date.add("15/11/2023");
        date.add("25/12/2023");

        title.add("Confraternização mundial");
        title.add("Carnaval");
        title.add("Páscoa");
        title.add("Tiradentes");
        title.add("Dia do trabalho");
        title.add("Corpus Christi");
        title.add("Independência do Brasil");
        title.add("Nossa Senhora Aparecida");
        title.add("Finados");
        title.add("Proclamação da República");
        title.add("Natal");
    }

    public void getHoliday(String holiday) {
        if ("todos".equals(holiday)) {
            this.getAllHolidays();
        } else if (this.date.contains(holiday)) {
            int index = date.indexOf(holiday);
            System.out.println(this.title.get(index));
        } else {
            System.out.println("Não tem feriado nessa data :( ");
        }
    }

    public void getAllHolidays() {
        for (int i = 0; i < this.date.size(); i++) {
            System.out.println(this.date.get(i) + ": " + this.title.get(i));
        }
    }
}
