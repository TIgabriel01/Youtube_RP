package Videos_YT;

public class Video implements Videos_YT.AcoesVideo {
    private String titulo;
    private int curtidas, visualizacoes, avaliacoes;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.visualizacoes = 0;
        this.curtidas = 0;
        this.avaliacoes = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        this.visualizacoes++;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String toString() {
        return " ============ Video ============\ntitulo = '" + this.titulo + '\'' + "\nviws = " + this.visualizacoes + "\ncurtidas = " + this.curtidas + "\navaliacao = " + this.avaliacoes + "\nreproduzindo = " + this.reproduzindo;
    }
}
