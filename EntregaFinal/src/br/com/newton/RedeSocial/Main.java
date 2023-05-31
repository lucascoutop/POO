package br.com.newton.RedeSocial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        User currentUser = null;

        while (true) {
            System.out.println("=== Mini Simulador de Rede Social ===");
            System.out.println("1. Registrar");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String password = scanner.nextLine();
                    socialNetwork.registerUser(name, email, password);
                    System.out.println("Usuário registrado com sucesso!");
                    break;
                case 2:
                    System.out.print("E-mail: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Senha: ");
                    String loginPassword = scanner.nextLine();
                    currentUser = socialNetwork.login(loginEmail, loginPassword);

                    if (currentUser != null) {
                        loggedIn = true;
                        System.out.println("Login realizado com sucesso!");
                    } else {
                        System.out.println("Credenciais inválidas. Tente novamente.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            while (loggedIn) {
                System.out.println("\n=== Menu do Usuário ===");
                System.out.println("1. Adicionar amigo");
                System.out.println("2. Remover amigo");
                System.out.println("3. Enviar mensagem");
                System.out.println("4. Logout");
                System.out.print("Escolha uma opção: ");
                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (userChoice) {
                    case 1:
                        System.out.print("E-mail do amigo: ");
                        String friendEmail = scanner.nextLine();
                        User friend = socialNetwork.findUserByEmail(friendEmail);

                        if (friend != null) {
                            socialNetwork.addFriend(currentUser, friend);
                            System.out.println("Amigo adicionado com sucesso!");
                        } else {
                            System.out.println("Amigo não encontrado.");
                        }
                        break;
                    case 2:
                        System.out.print("E-mail do amigo: ");
                        String removeEmail = scanner.nextLine();
                        User removeFriend = socialNetwork.findUserByEmail(removeEmail);

                        if (removeFriend != null) {
                            socialNetwork.removeFriend(currentUser, removeFriend);
                            System.out.println("Amigo removido com sucesso!");
                        } else {
                            System.out.println("Amigo não encontrado.");
                        }
                        break;
                    case 3:
                        System.out.print("E-mail do amigo: ");
                        String friendEmailMsg = scanner.nextLine();
                        User friendMsg = socialNetwork.findUserByEmail(friendEmailMsg);

                        if (friendMsg != null) {
                            System.out.print("Mensagem: ");
                            String message = scanner.nextLine();
                            socialNetwork.sendMessage(currentUser, friendMsg, message);
                            System.out.println("Mensagem enviada com sucesso!");
                        } else {
                            System.out.println("Amigo não encontrado.");
                        }
                        break;
                    case 4:
                        loggedIn = false;
                        currentUser = null;
                        System.out.println("Logout realizado com sucesso!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}

