package Examen;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Sopa de mani", "Pollo a al horno", "Agua mineral", "Tarta de manzana");
        Pedido  pedido2 = new Pedido("pique", "Refresco de coca cola");
        Pedido  pedido3 = new Pedido("charque", "Lasagna", "Cerveza", "Helado de chocolate");

        System.out.println("Valor del pedido 1: $" + pedido1.calcularValorPedido());
        System.out.println("Valor del pedido 2: $" + pedido2.calcularValorPedido());
        System.out.println("Valor del pedido 3: $" + pedido3.calcularValorPedido());
    }
}
