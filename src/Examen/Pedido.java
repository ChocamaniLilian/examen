package Examen;

public class Pedido {
    //atrivutos
    private String Plato1;
    private String Plato2;
    private String bebida;
    private String postre;

    public Pedido(String Plato1, String Plato2, String bebida, String postre) {
        this.Plato1 = Plato1;
        this.Plato2 = Plato2;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Pedido(String primerPlato, String bebida) {
        this(primerPlato, null, bebida, null);
    }

    public Pedido(String primerPlato, String segundoPlato, String bebida) {
        this(primerPlato, segundoPlato, bebida, null);
    }

    public double calcularValorPedido() {
        double valor = 0;
        if (Plato1 != null) {
            valor += 10.0; // Precio del primer plato
        }
        if (Plato2 != null) {
            valor += 15.0; // Precio del segundo plato
        }
        if (bebida != null) {
            valor += 5.0; // Precio de la bebida
        }
        if (postre != null) {
            valor += 8.0; // Precio del postre
        }
        return valor;
    }
}

