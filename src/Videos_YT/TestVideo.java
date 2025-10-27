package Videos_YT;

public class TestVideo {

        public static void main(String[] args) {
            // Criando um usuário
            Usuario u1 = new Usuario("Biel", 22, 'M', "biel123", 0);

            // Criando vídeos
            Video v1 = new Video("Curso Java Básico");
            Video v2 = new Video("Tutorial GitHub");

            // Criando reproduções
            Reproducao r1 = new Reproducao(u1, v1);
            Reproducao r2 = new Reproducao(u1, v2);

            // Testando métodos de Video
            v1.play();
            v1.like();
            v2.play();
            v2.like();
            v2.like();
            v2.pause();

            // Testando métodos de Usuario
            u1.viuMaisUm();

            // Testando métodos de Reproducao
            r1.avaliar();
            r2.avaliar(8);
            r2.avaliar(75f);

            // Mostrar estado dos objetos
            System.out.println(u1);
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(r1);
            System.out.println(r2);
        }
}
