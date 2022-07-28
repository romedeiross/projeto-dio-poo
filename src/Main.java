import br.com.dio.desafio.dominio.*;

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

        /*System.out.println(c1);
        System.out.println(c2);
        System.out.println( m1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Rô");
        dev1.InscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rô: " + dev1.getConteudosInscritos());
        dev1.progedir();
        dev1.progedir();
        dev1.progedir();
        System.out.println("********");
        System.out.println("Conteúdos Inscritos Rô: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rô: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());


        System.out.println("================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Pedro");
        dev2.InscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + dev2.getConteudosInscritos());
        dev2.progedir();
        System.out.println("******");
        System.out.println("Conteúdos Inscritos Pedro: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}
