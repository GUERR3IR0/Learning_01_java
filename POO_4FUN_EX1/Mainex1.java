public class Mainex1 {

    public static void main(String[] args) {
            Pessoa p1 = new Pessoa ("João", "masculino", 25, true);
     Churrasco meuChurrasco = new Churrasco(10.0);
        double consumoJoao = meuChurrasco.verificarconsumo(p1);
        System.out.println(p1.getName() + " consome " + consumoJoao + "de carne");
        }

}