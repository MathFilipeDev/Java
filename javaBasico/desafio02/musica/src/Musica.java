public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacaoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música:  " + titulo);
        System.out.println("Artista:  " + artista);
        System.out.println("Ano de lançamento:  " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacaoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacaoes;
    }
}
