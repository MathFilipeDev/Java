public class Song {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Heavy is the Crown";
        minhaMusica.artista = "Linkin Park";
        minhaMusica.anoLancamento = 2024;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(8);
        minhaMusica.avalia(9);
        minhaMusica.avalia(10);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Media das avaliações: " + mediaAvaliacoes);

    }
}
