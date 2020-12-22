public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor); //this é uma autoreferencia (quem chamou)
        System.out.println("A caneta esta tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;

    }
}
