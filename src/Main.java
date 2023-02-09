public class Main {
    public static void main(String[] args) {
        System.out.println("Спасибо, что выбрали нашу Авиакомпанию.Ваши бонусные мили составили");
        int amount = 15000;// цена авиабилета руб
        int oneMiles = 20;// стоимость одной бонусной мили  руб
        int bonus = amount / oneMiles;
        System.out.println((bonus) + " миль ");
    }
}