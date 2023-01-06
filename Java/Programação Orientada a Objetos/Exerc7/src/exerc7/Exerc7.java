package exerc7;

public class Exerc7
{
    public static void main(String[] args)
    {
        Bicicleta b1 = new Bicicleta();  
        b1.cor = "Verde";
        b1.tamanho = "Média";
        b1.farol = true;
        b1.freio = false;
        b1.preco = 750.60f;
        b1.status();
        b1.andar();
        b1.frear();
    }
}
