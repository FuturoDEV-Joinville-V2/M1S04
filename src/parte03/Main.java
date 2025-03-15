package parte03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
                Collections
                ArrayList: Estrutura de dados em lista
                HashSet: Informações únicas
                HashMap: informações em pares chave-valor
         */

        Scanner scan = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>(100);


        Escola escola = new Escola();

        Aluno aluno1 = new Aluno("Carlos", escola);
        Aluno aluno2 = new Aluno("Ana", escola);
        alunos.add(aluno1);
        alunos.add(aluno2);

        System.out.print("Quantos alunos deseja cadastrar: ");
        int quantidadeAlunos = scan.nextInt();
        scan.nextLine();

        System.out.println("CADASTRO DE ALUNOS");
        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.print("Nome do aluno: ");
            String nome = scan.nextLine();

            Aluno aluno = new Aluno(nome, escola);

            alunos.add(aluno);
        }

        Turma turmaDev = new Turma("Desenvolvimento Mobile", alunos);

        System.out.println(turmaDev.alunos);

        //Métodos Avançados ArrayList
        //replaceAll
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        values.replaceAll(value -> value * 2);

        System.out.println(values);

        ArrayList<Double> valuesProducts = new ArrayList<>();

        valuesProducts.add(189.99);
        valuesProducts.add(9.99);
        valuesProducts.add(18.99);

        valuesProducts.replaceAll(valueProduct -> valueProduct * 0.9);

        System.out.println(valuesProducts);

        values.removeIf(value -> value >= 4);

        System.out.println(values);

        ArrayList<String> products = new ArrayList<>();
        products.add("Maçã");
        products.add("Laranja");
        products.add("Abacate");
        products.add("Manga");

        //Exibir os valores com for each convencional
        for(String product : products){
            System.out.println("Fruta: " + product);
        }

        //Exibir os valores com o método forEach
        products.forEach(product -> {
            if (product.contains("e")){
                System.out.println(product);
            }
        });
    }
}
