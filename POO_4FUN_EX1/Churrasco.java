public class Churrasco{
    private double Qtdcarne;

public Churrasco(double Qtdcarne){
this.Qtdcarne = Qtdcarne;
}
 public double verificarconsumo(Pessoa pessoa) {
        if (pessoa.getAge() < 4 || pessoa.getVegetariana() == true) {
            return 0.0;
        } else if (pessoa.getAge() >= 4 && pessoa.getAge() < 12) {
            return 1.0;
        } else if (pessoa.getAge() >= 12) {
            return 2.0;
        }
        return 0.0;
    }
public double getQtdcarne(){
    return Qtdcarne;
}
}