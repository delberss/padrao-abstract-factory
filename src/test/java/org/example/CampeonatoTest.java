package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {
    @Test
    void deveEmitirClassificacaoBrasileiraoA() {
        FabricaAbstrata fabrica = new FabricaAbstrataBrasileiraoA();
        Campeonato campeonato = new Campeonato(fabrica);
        assertEquals("Classsificação do brasileirão série A", campeonato.emitirClassificacao());
    }

    @Test
    void deveEmitirClassificacaoBrasileiraoB() {
        FabricaAbstrata fabrica = new FabricaAbstrataBrasileiraoB();
        Campeonato campeonato = new Campeonato(fabrica);
        assertEquals("Classsificação do brasileirão série B", campeonato.emitirClassificacao());
    }

    @Test
    void deveEmitirArtilheiroBrasileiraoA() {
        FabricaAbstrata fabrica = new FabricaAbstrataBrasileiraoA();
        Campeonato campeonato = new Campeonato(fabrica);
        assertEquals("Artilheiro do brasileirão série A", campeonato.emitirArtilheiro());
    }

    @Test
    void deveEmitirArtilheiroBrasileiraoB() {
        FabricaAbstrata fabrica = new FabricaAbstrataBrasileiraoB();
        Campeonato campeonato = new Campeonato(fabrica);
        assertEquals("Artilheiro do brasileirão série B", campeonato.emitirArtilheiro());
    }
}