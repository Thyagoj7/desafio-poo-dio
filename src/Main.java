import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso de java");
        curso.setDescricao("Curso sobre java");
        curso.setCargaHoraria(200);
        System.out.println(curso);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de javaScript");
        curso1.setDescricao("Curso sobre javaScript");
        curso1.setCargaHoraria(200);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("É uma mentoria sobre Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }
}
