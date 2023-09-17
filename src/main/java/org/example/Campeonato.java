package org.example;

public class Campeonato {
    private Classificacao classificacao;
    private Artilheiro artilheiro;

    public Campeonato (FabricaAbstrata fabrica) {
        this.classificacao = fabrica.createClassificacao();
        this.artilheiro = fabrica.createArtilheiro();
    }

    public String emitirClassificacao() {
        return this.classificacao.emitir();
    }

    public String emitirArtilheiro() {
        return this.artilheiro.emitir();
    }

}
