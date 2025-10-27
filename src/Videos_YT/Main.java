package Videos_YT;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("'Java POO - aula 1 (introdução)'");
        v[1] = new Video("'Java POO - aula 7 (Vetores)'");
        v[2] = new Video("'Java Poo - aula 15 (Final)1'");

        Usuario[] us = new Usuario[2];

        us[0] = new Usuario("Gabriel", 21, 'M', "Dev.Gabriel", 0);
        us[1] = new Usuario("Aline", 22, 'F', "AlineDev", 0);

        Reproducao r1 = new Reproducao(us[0], v[0]);
        v[0].play();
        us[0].viuMaisUm();
        v[0].like();
        r1.avaliar();
        System.out.println(r1);

        Reproducao r2 = new Reproducao(us[1], v[0]);
        v[0].play();
        us[1].viuMaisUm();
        v[0].like();
        r2.avaliar(50.0f);
        v[0].pause();
        System.out.println(r2);
    }
}