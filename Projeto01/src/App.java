import revisao.Aluno;
import revisao.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno joao = null; //a variável joao está no endereço 13
        
        joao = new Aluno();//aloca a partir do endereço 7
        //alocando um objeto Aluno e atribui o endredo alocado ao joao
        // (do tamanho para caber todos os atributos da classe Aluno)
        System.out.println(joao);
        
        //endereço 12
        Aluno lucas = new Aluno();//aloca a partir do endereço 2

        String cidade;//endereço 1
        cidade = "A";// cidade = new String("A"); //endereço 14

        joao.matricula = 5;
        joao.idade = 9;
        joao.peso = 10;

        Curso matematica; //endereço 15
        matematica = new Curso();//aloca a partir do endereço 16

        //return joao;
    }
}
