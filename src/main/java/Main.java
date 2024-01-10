import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Здравствуйте!!!\nНа какое кол-во людей необходимо разделить счет?");
        Scanner scanner = new Scanner(System.in);
        while (true){
            int numOfPeople;
            do {
                while(!scanner.hasNextInt()){
                    System.out.println("Ошибка ввода!\nВвидете целое число");
                    scanner.next();
                }
                numOfPeople = scanner.nextInt();
                if (numOfPeople>1)
                    break;
                else
                    System.out.println("Слишком мало людей, чтобы делить счет -_-\n" +
                            "Введите кол-во болше 1!");
            } while (true);
            System.out.println("Вас понял!");

            Product product = new Product();
            Calculator calculator = new Calculator(numOfPeople);

            do {
                System.out.println("Ввидите название товара:");
                String nameOfProduct = scanner.next();
                System.out.println("Ввидите цену товара в формате рубли.копейки:");
                while(!scanner.hasNextDouble()){
                    System.out.println("Ошибка ввода!\n" +
                            "Ввидете десятичное число в формате рубли.копейки (например 10.25): ");
                    scanner.next();
                }
                double price = scanner.nextDouble();
                product.addProduct(nameOfProduct,price);
                calculator.addProduct(price);
                System.out.println("Товар успешно добавлен!\n" +
                        "Желаете добавить еще один товар или завершить?");
                if ("Завершить".equalsIgnoreCase(scanner.next().trim()))
                    break;
            } while (true);
            product.showList();
            Formatter formatter = new Formatter();
            System.out.println(String.format("Общая сумма чека: %.2f %s",calculator.getSumOfPrice(),
                    formatter.formatterRub(calculator.getSumOfPrice())));
            System.out.println(String.format("Каждый человек должен заплатить: %.2f %s",calculator.splitCheck(),
                    formatter.formatterRub(calculator.splitCheck())));
            System.out.println("Чтобы посчитать новый чек введите любой символ, чтобы завершить введите \"Завершить\"" );
            if ("Завершить".equalsIgnoreCase(scanner.next().trim()))
                break;
        }
        scanner.close();
    }
}
