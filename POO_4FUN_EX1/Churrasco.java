public class Churrasco{
    private double Qtdcarne;

public Churrasco(double Qtdcarne){
this.Qtdcarne = Qtdcarne;
}
public double verificarconsumo(int Idade){
   Idade = Persona.getIdade();
    if ( idade < 4 || Person.getVegetariana() == true){
        return 0;
    } else if (idade >= 4 && idade < 12){
        return (double) (Qtdcarne = 1);
    } else if (idade >= 12 ){
    return (double) (Qtdcarne = 2);
    }    
}
public double getQtdcarne(){
    return Qtdcarne;
}
}