package POO_4FUN_EX3;

private class complexo {
private double a, b;
 public complexo(double a, double b){
 this.a = a;
 this.b = b;
 }
    public Complexo soma(Complexo outro) {
        double real = this.a + outro.a;
        double imaginario = this.b + outro.b;
        return new Complexo(real, imaginario);
    }
        public Complexo multiplica(Complexo outro) {
        double real = this.a * outro.a - this.b * outro.b;
        double imaginario = this.a * outro.b + this.b * outro.a;
        return new Complexo(real, imaginario);
    }
   public double modulo() {
        return Math.sqrt(a * a + b * b);
    }

    public double argumentoPrincipal() {
        return Math.atan2(b, a); // Retorna em radianos
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + (-b) + "i";
        }
    }
}