// =================================================================
// 4. MAIN.java (Interface de Usuário/Teste)
// =================================================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================================
        // 1. ALUNO
        // ================================
        AlunoDAO alunoDAO = new AlunoDAO();

        System.out.println("=== CADASTRO DE ALUNO ===");

        // --- CREATE aluno ---
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite o email do aluno: ");
        String emailAluno = sc.nextLine();

        Aluno novoAluno = new Aluno(nomeAluno, emailAluno);
        alunoDAO.inserir(novoAluno);

        // --- READ alunos ---
        System.out.println("\n--- LISTA DE ALUNOS ---");
        for (Aluno a : alunoDAO.listar()) {
            System.out.println(a.getId() + " - " + a.getNome() + " - " + a.getEmail());
        }

        // --- UPDATE aluno ---
        System.out.println("\n=== ATUALIZAR UM ALUNO ===");
        System.out.print("Digite o ID do aluno que deseja atualizar: ");
        int idAlunoAtualizar = sc.nextInt();
        sc.nextLine();

        System.out.print("Novo nome: ");
        String novoNomeAluno = sc.nextLine();

        System.out.print("Novo email: ");
        String novoEmailAluno = sc.nextLine();

        Aluno alunoAtualizado = new Aluno(idAlunoAtualizar, novoNomeAluno, novoEmailAluno);
        alunoDAO.atualizar(alunoAtualizado);

        // --- DELETE aluno ---
        System.out.println("\n=== DELETAR UM ALUNO ===");
        System.out.print("Digite o ID do aluno que deseja deletar: ");
        int idAlunoDeletar = sc.nextInt();
        sc.nextLine();

        alunoDAO.deletar(idAlunoDeletar);



        // ================================
        // 2. PROFESSOR (NOVO)
        // ================================
        ProfessorDAO professorDAO = new ProfessorDAO();

        System.out.println("\n\n=== CADASTRO DE PROFESSOR ===");

        // --- CREATE professor ---
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();

        System.out.print("Digite o email do professor: ");
        String emailProfessor = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idadeProfessor = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o CPF: ");
        String cpfProfessor = sc.nextLine();

        System.out.print("Digite o estado (UF): ");
        String estadoProfessor = sc.nextLine();

        System.out.print("Digite a cidade: ");
        String cidadeProfessor = sc.nextLine();

        Professor novoProfessor = new Professor(
                nomeProfessor, emailProfessor, idadeProfessor,
                cpfProfessor, estadoProfessor, cidadeProfessor
        );

        professorDAO.inserir(novoProfessor);

        // --- READ professores ---
        System.out.println("\n--- LISTA DE PROFESSORES ---");
        for (Professor p : professorDAO.listar()) {
            System.out.println(
                    p.getId() + " - " +
                            p.getNome() + " - " +
                            p.getEmail()
            );
        }

        // --- UPDATE professor ---
        System.out.println("\n=== ATUALIZAR UM PROFESSOR ===");
        System.out.print("Digite o ID do professor que deseja atualizar: ");
        int idProfessorAtualizar = sc.nextInt();
        sc.nextLine();

        System.out.print("Novo nome: ");
        String nomeNovoProfessor = sc.nextLine();

        System.out.print("Novo email: ");
        String emailNovoProfessor = sc.nextLine();

        System.out.print("Nova idade: ");
        int idadeNovaProfessor = sc.nextInt();
        sc.nextLine();

        System.out.print("Novo CPF: ");
        String cpfNovoProfessor = sc.nextLine();

        System.out.print("Novo estado (UF): ");
        String estadoNovoProfessor = sc.nextLine();

        System.out.print("Nova cidade: ");
        String cidadeNovaProfessor = sc.nextLine();

        Professor professorAtualizado = new Professor(
                idProfessorAtualizar,
                nomeNovoProfessor,
                emailNovoProfessor,
                idadeNovaProfessor,
                cpfNovoProfessor,
                estadoNovoProfessor,
                cidadeNovaProfessor
        );

        professorDAO.atualizar(professorAtualizado);

        // --- DELETE professor ---
        System.out.println("\n=== DELETAR UM PROFESSOR ===");
        System.out.print("Digite o ID do professor que deseja deletar: ");
        int idProfessorDeletar = sc.nextInt();

        professorDAO.deletar(idProfessorDeletar);

        sc.close();
    }
}
