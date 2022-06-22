public class Main {


    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.AumentarPuertas();
        System.out.println(miAuto.puertas);
    }





}

class Auto{
    public int puertas = 0;

    public void AumentarPuertas(){
        this.puertas++;
    }

}