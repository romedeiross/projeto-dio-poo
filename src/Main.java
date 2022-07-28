import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();

        c1.setTitulo("curso Java");
        c1.setDescricao("Projeto desenvolvido durante o Bootcamp Dio usando Orientação a Objeto");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("curso C#");
        c2.setDescricao("Bootcamp Dio usando Orientação a Objeto");
        c2.setCargaHoraria(10);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("Descrição mentoria java");
        m1.setData(LocalDate.now());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println( m1);

    }
}
