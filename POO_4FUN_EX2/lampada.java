package POO_4FUN_EX2;

public class lampada {
     private estado estado;
     private int qtdAcendimentos;

     public lampada( estado  estado){
    this.estado = estado;
    this.qtdAcendimentos = 0;
}

public estado checaEstado() {
        return this.estado;
    }

    public int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }
    public void click(){
  switch(this.estado){
    case apagada:
    this.estado = estado.acesa;
     this.qtdAcendimentos++; 
    System.out.println("Sua lampada foi acendida \n");
  break;
case acesa:
    this.estado = estado.apagada;
      System.out.println("Sua lampada foi apagada \n");
break;
}
}

    }

