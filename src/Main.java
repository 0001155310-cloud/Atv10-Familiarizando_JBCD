import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================================
        // 1. ALUNO
        // ================================
        AlunoDAO alunoDAO = new AlunoDAO();

        System.out.println("\n====================================");
        System.out.println("        CADASTRO DE ALUNO");
        System.out.println("====================================");

        // --- CREATE aluno ---
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite o email do aluno: ");
        String emailAluno = sc.nextLine();

        Aluno novoAluno = new Aluno(nomeAluno, emailAluno);
        alunoDAO.inserir(novoAluno);

        System.out.println("\nAluno cadastrado com sucesso!");

        // --- READ alunos ---
        System.out.println("\n----------- LISTA DE ALUNOS -----------");
        for (Aluno a : alunoDAO.listar()) {
            System.out.println(
                    "ID: " + a.getId() +
                            " | Nome: " + a.getNome() +
                            " | Email: " + a.getEmail()
            );
        }

        // --- UPDATE aluno ---
        System.out.println("\n====================================");
        System.out.println("        ATUALIZAR UM ALUNO");
        System.out.println("====================================");

        System.out.print("Digite o ID do aluno que deseja atualizar: ");
        int idAlunoAtualizar = sc.nextInt();
        sc.nextLine();

        System.out.print("Novo nome: ");
        String novoNomeAluno = sc.nextLine();

        System.out.print("Novo email: ");
        String novoEmailAluno = sc.nextLine();

        Aluno alunoAtualizado = new Aluno(idAlunoAtualizar, novoNomeAluno, novoEmailAluno);
        alunoDAO.atualizar(alunoAtualizado);

        System.out.println("\nAluno atualizado com sucesso!");

        // --- DELETE aluno ---
        System.out.println("\n====================================");
        System.out.println("        DELETAR UM ALUNO");
        System.out.println("====================================");

        System.out.print("Digite o ID do aluno que deseja deletar: ");
        int idAlunoDeletar = sc.nextInt();
        sc.nextLine();

        alunoDAO.deletar(idAlunoDeletar);
        System.out.println("\nAluno deletado com sucesso!");


        // ================================
        // 2. PROFESSOR
        // ================================
        ProfessorDAO professorDAO = new ProfessorDAO();

        System.out.println("\n\n====================================");
        System.out.println("       CADASTRO DE PROFESSOR");
        System.out.println("====================================");

        // --- CREATE professor ---
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();

        System.out.print("Digite o email do professor: ");
        String emailProfessor = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idadeProfessor = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o CPF (somente números): ");
        String cpfProfessor = sc.nextLine();

        while (cpfProfessor.length() != 11 || !cpfProfessor.matches("\\d+")) {
            System.out.println("[ERRO] CPF inválido! Digite exatamente 11 números.");
            System.out.print("CPF: ");
            cpfProfessor = sc.nextLine();
        }

        System.out.print("Digite o estado (UF): ");
        String estadoProfessor = sc.nextLine();

        System.out.print("Digite a cidade: ");
        String cidadeProfessor = sc.nextLine();

        Professor novoProfessor = new Professor(
                nomeProfessor, emailProfessor, idadeProfessor,
                cpfProfessor, estadoProfessor, cidadeProfessor
        );

        professorDAO.inserir(novoProfessor);
        System.out.println("\nProfessor cadastrado com sucesso!");

        // --- READ professores ---
        System.out.println("\n----------- LISTA DE PROFESSORES -----------");
        for (Professor p : professorDAO.listar()) {
            System.out.println(
                    "ID: " + p.getId() +
                            " | Nome: " + p.getNome() +
                            " | Email: " + p.getEmail()
            );
        }

        // --- UPDATE professor ---
        System.out.println("\n====================================");
        System.out.println("       ATUALIZAR UM PROFESSOR");
        System.out.println("====================================");

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

        System.out.print("Novo CPF (somente números): ");
        String cpfNovoProfessor = sc.nextLine();

        while (cpfNovoProfessor.length() != 11) {
            System.out.println("[ERRO] CPF inválido! Digite exatamente 11 números, não utilize símbolos!.");
            System.out.print("CPF: ");
            cpfNovoProfessor = sc.nextLine();
        }

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

        System.out.println("\nProfessor atualizado com sucesso!");

        // --- DELETE professor ---
        System.out.println("\n====================================");
        System.out.println("        DELETAR UM PROFESSOR");
        System.out.println("====================================");

        System.out.print("Digite o ID do professor que deseja deletar: ");
        int idProfessorDeletar = sc.nextInt();

        professorDAO.deletar(idProfessorDeletar);
        System.out.println("\nProfessor deletado com sucesso!");


        System.out.println("\n ================================ Programa Finalizado ====================================");
        sc.close();
    }
}
