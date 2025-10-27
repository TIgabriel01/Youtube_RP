package Videos_YT;

public class Usuario extends Videos_YT.Pessoa {
    private String login;
    private int totAssistidos;

    public Usuario(String nome, int idade, char sexo, String login, int assistidos) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistidos = 1;
    }

public void viuMaisUm(){
        this.totAssistidos++;
}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAssistidos() {
        return totAssistidos;
    }

    public void setAssistidos(int assistidos) {
        this.totAssistidos = assistidos;
    }

    public String toString() {
        return "{login = '" + this.login + '\'' + " - totAssistido = " + this.totAssistidos;
    }

}
