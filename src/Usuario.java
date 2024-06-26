import java.util.Date;

public class Usuario {
    /*

boolean devolverLivro(Livro): deverá fazer a devolução de um livro

boolean pegarLivro(Livro): deverá pegar um livro para empréstimo

void imprimirLivros(): deverá imprimir todos os livros que estão em empréstimo pelo usuário
 */

    protected String nome;
    protected String cpf;
    protected Date data;
    protected int id;
    protected Livro[] livros;

    Usuario(String nome, String cpf, Date data, int id){
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.id = id;

    }

    public String getCpf() {
        return cpf;
    }

    boolean devolverLivro(Livro livro){
        return true;
    }
    boolean pegarLivro(Livro livro){
        return true;
    }

    void imprimirUsuario(){
        System.out.println("Dados do Usuário:");
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("Cadastro feito em: "+ data);
        System.out.println("ID: "+ id);
        System.out.println();
    }
    void imprimirLivrosEmprestados(Livro[] vetorDeLivros){//Aqui tem que ler o vetor de livros presente nas subclasses
        System.out.println("Livros emprestados:\n");
        for (Livro livro: vetorDeLivros){
            if (livro != null) {
                livro.imprimir();
            }
        }
    }

    public Livro[] getVetor(){
        return livros;
    }

}
