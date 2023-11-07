
public class Main {
    public static void main(String[] args){
        //Encapusulamento
    Pessoa qualquer = new Pessoa();
    qualquer.setNome("Raissa leal");//Atribuição
        System.out.println(qualquer.getNome());// saída de dados
      Esportistas jogadora = new Esportistas();
      Esportistas surfista = new Esportistas(345);
      jogadora.setNome("Tasisa");
        System.out.println(jogadora.getNome());

        //Polimorfismo
        qualquer = new Esportistas();

        String resultado = qualquer.sacar();
        System.out.println(resultado);
    }
}

