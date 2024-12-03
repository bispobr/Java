import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descrição curso js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria("mentoria de java","descrição mentoria java",LocalDate.now());
            Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devCamila = new Dev();
            devCamila.setNome("Camila");
            devCamila.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
            devCamila.progredir();
            devCamila.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
            System.out.println("XP:" + devCamila.calcularTotalXp());

            System.out.println("-------");

            Dev devJoao = new Dev();
            devJoao.setNome("Joao");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
            System.out.println("XP:" + devJoao.calcularTotalXp());

        }
}