package Videos_YT;

public class Reproducao {
    private Usuario espectador;
    private Video filme;

    public Reproducao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + 5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20.0){
            tot = 3;
        }else if (porc <= 50.0){
            tot = 5;
        }else if (porc <= 90.0){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + tot);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    public String toString() {
        return "\nReproducao - \nespectador = " + this.espectador + "\n" + this.filme;
    }
}
