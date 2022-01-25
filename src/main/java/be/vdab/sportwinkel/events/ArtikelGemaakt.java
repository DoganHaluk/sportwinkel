package be.vdab.sportwinkel.events;

import be.vdab.sportwinkel.domain.Artikel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "artikelsgemaakt")
public class ArtikelGemaakt {
    @Id
    private long id;
    private String naam;
    private BigDecimal verkoopprijs;

    public ArtikelGemaakt(Artikel artikel) {
        this.id = artikel.getId();
        this.naam = artikel.getNaam();
        this.verkoopprijs = artikel.getVerkoopprijs();
    }

    protected ArtikelGemaakt() {
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
