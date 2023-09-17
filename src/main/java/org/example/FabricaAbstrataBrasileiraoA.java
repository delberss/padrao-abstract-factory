package org.example;

public class FabricaAbstrataBrasileiraoA implements FabricaAbstrata{
    @Override
    public Classificacao createClassificacao() {
        return new ClassificacaoBrasileiraoA();
    }

    @Override
    public Artilheiro createArtilheiro() {
        return new ArtilheiroBrasileiraoA();
    }
}
