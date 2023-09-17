package org.example;

public class FabricaBrasileiraoA implements FabricaAbstrata{
    @Override
    public Classificacao createClassificacao() {
        return new ClassificacaoBrasileiraoA();
    }

    @Override
    public Artilheiro createArtilheiro() {
        return new ArtilheiroBrasileiraoA();
    }
}
