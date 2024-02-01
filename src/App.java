class Bola{
    // Atributo da classe
    private String cor;

    // Método construtor da classe
    Bola(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Bola minhaBola = new Bola("vermelho");
        System.out.println("Cor da bola: " + minhaBola.getCor());

        minhaBola.setCor("azul");
        System.out.println("Cor da bola: " + minhaBola.getCor());
    }
}
