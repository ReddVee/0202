import java.util.Scanner;

class Practicum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода при помощи scanner.nextDouble()
        double Amount = scanner.nextDouble();
        boolean isValid = TransactionValidator.isValidAmount(Amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + Amount + " р. успешно выполнен.");
    }

}
 class TransactionValidator {
    // объявите константы
    static final double MIN_AMOUNT = 1;
    static final double MAX_AMOUNT = 5000;
    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    static boolean isValidAmount(Double amount) {
        if( amount <=MIN_AMOUNT ) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT +" р. Попробуйте ещё раз!");
            return false;
        } else if ( amount>=MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT +" р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}

