package CompositeDidier;

public class Main
{
    public static void main(String[] args)
    {
        // Instancio el buidler que me va a permitir fabricar las ensaladas de fruta
        FruitSaladBuilder fsb = new FruitSaladBuilder();
        // Creo una ensalada
        FruitSalad salad = fsb.addApple().addOrange().addPear().get();
        System.out.println(salad);
        // Creo otra, no hace falta almacenarla en la variable temporal salad
        System.out.println(fsb.addApple().addApple().addApple().addApple().get());
        // También se pueden invocar los métodos de manera más "tradicional"
        fsb.addPear();
        fsb.addOrange();
        salad = fsb.get();
        System.out.println(salad);
        // Ensalada vacía
        salad = fsb.get();
        System.out.println(salad);
    }
}
