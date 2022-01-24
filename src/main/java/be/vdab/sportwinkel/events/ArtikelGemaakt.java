package be.vdab.sportwinkel.events;

import be.vdab.sportwinkel.domain.Artikel;

import java.math.BigDecimal;

public class ArtikelGemaakt {
    private final long id;
    private final String naam;
    private final BigDecimal verkoopprijs;

    public ArtikelGemaakt(Artikel artikel) {
        this.id = artikel.getId();
        this.naam = artikel.getNaam();
        this.verkoopprijs = artikel.getVerkoopprijs();
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public BigDecimal getVerkoopprijs() {
        return verkoopprijs;
    }
}
