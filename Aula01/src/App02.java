import revisao.Aluno;
import revisao.Curso;

public class App02 {
    public static void main(String[] args) {
        
        Aluno fernando;//end 1
        
        fernando = new Aluno();//end 10

        Curso matematica;//end 13
        
        matematica = new Curso();//end 8

        fernando.curso = matematica;

    }
}
