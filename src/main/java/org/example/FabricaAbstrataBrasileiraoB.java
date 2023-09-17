package org.example;

public class FabricaAbstrataBrasileiraoB implements FabricaAbstrata{
    @Override
    public Classificacao createClassificacao() {
        return new ClassificacaoBrasileiraoB();
    }

    @Override
    public Artilheiro createArtilheiro() {
        return new ArtilheiroBrasileiraoB();
    }
}
