package entities;

public class Aluguel {

     private int quarto; 
     private String nome;
     private String email;
     
    public Aluguel(int quarto, String nome, String email) {
	this.quarto = quarto;
	this.nome = nome;
	this.email = email;
    }
    public int getQuarto() {
        return quarto;
    }
    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
	return  "Quarto: " + getQuarto() + ", " + 
		"Nome: "   + getNome()   + ", " + 
		"e-mail: " + getEmail();
    }

    
    
}
