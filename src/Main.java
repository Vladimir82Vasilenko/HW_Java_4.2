public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int myBmi = service.calculate(1.80, 86);
        if (myBmi <= 25) {
            System.out.println("Ваш Индекс Массы Тела (ИМТ) равен: " + myBmi + " У Вас все в порядке");
        } else {
            System.out.println("Ваш Индекс Массы Тела (ИМТ) равен: " + myBmi + " Вам необходимо похудеть");
        }
    }

}

