package tema2;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precioConIva = getPriceIva(30.2);
        System.out.print(precioConIva + " $");
    }

    static double getPriceIva(double price){
        System.out.print("El precio original es de " + price + " $ \n Sumándole el IVA queda en ");
        return price + (price * 0.21);
    }
}
