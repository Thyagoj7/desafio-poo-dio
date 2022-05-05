import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso de java");
        curso.setDescricao("Curso sobre java");
        curso.setCargaHoraria(60);
       // System.out.println(curso);

        Conteudo conteudo = new Curso();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de javaScript");
        curso1.setDescricao("Curso sobre javaScript");
        curso1.setCargaHoraria(60);
       // System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("É uma mentoria sobre Java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Um bootacamp de java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devtom = new Dev();
        devtom.setNome("Tom");
        devtom.inscreverBootcamp(bootcamp);
        System.out.println("Coteudos inscritos: Tom" + devtom.getConteudosInscritos());
        devtom.progredir();
        System.out.println("-");
        System.out.println("Coteudos inscritos: Tom" + devtom.getConteudosInscritos());
        System.out.println("Coteudos concluidos: Tom" + devtom.getConteudosConcluidos());
        System.out.println("XP:" + devtom.calcularTotalXp());

        System.out.println("*------------------------------------*");

        Dev devLuma = new Dev();
        devLuma.setNome("Luma");
        devLuma.inscreverBootcamp(bootcamp);
        System.out.println("Coteudos inscritos: Luma" + devLuma.getConteudosInscritos());
        devLuma.progredir();
        devLuma.progredir();
        //devLuma.progredir();
        System.out.println("-");
        System.out.println("Coteudos inscritos: Luma" + devLuma.getConteudosInscritos());
        System.out.println("Coteudos concluidos: Luma" + devLuma.getConteudosConcluidos());
        System.out.println("XP:" + devLuma.calcularTotalXp());



    }
}
