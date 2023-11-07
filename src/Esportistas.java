public class Esportistas extends Pessoa {
    //Atributo
    private int idFederacao;
    //Construtores

    public Esportistas(int idFederacao) {
        this.idFederacao = idFederacao;
    }
//Esportista Amador
    public Esportistas() {
    }
    public String sacar(){
        return "Sacando para o jogo";
    }

}
