public class Churrasco{
    private double Qtdcarne;

public Churrasco(double Qtdcarne){
this.Qtdcarne = Qtdcarne;
}
public double verificarconsumo(int Age, Pessoa pessoa){
   
    if ( Age < 4 || pessoa.getVegetariana() == true){
        return 0.0;
    } else if (Age>= 4 && Age< 12){
        return (double) 1.0;
    } else if (Age >= 12 ){
    return  2.0;
    }    
    return 0.0;
}
public double getQtdcarne(){
    return Qtdcarne;
}
}