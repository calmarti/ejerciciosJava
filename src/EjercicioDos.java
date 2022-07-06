public class EjercicioDos {
    public static void main(String[] args) {
        System.out.println(getPriceWithVAT(250,21));
    }
    public static double getPriceWithVAT(double price, double vat_rate){
        return price*(1+vat_rate/100);
    }
}
