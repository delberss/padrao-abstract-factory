package org.example;

public class FabricaBrasileiraoB implements FabricaAbstrata{
    @Override
    public Classificacao createClassificacao() {
        return new ClassificacaoBrasileiraoB();
    }

    @Override
    public Artilheiro createArtilheiro() {
        return new ArtilheiroBrasileiraoB();
    }
}
