package be.vdab.sportwinkel.services;

import be.vdab.sportwinkel.domain.Artikel;
import be.vdab.sportwinkel.events.ArtikelGemaakt;
import be.vdab.sportwinkel.repositories.ArtikelRepository;
import be.vdab.sportwinkel.repositories.ArtikelGemaaktRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DefaultArtikelService implements ArtikelService {
    private final ArtikelRepository artikelRepository;
    private final ArtikelGemaaktRepository artikelsGemaaktRepository;

    public DefaultArtikelService(ArtikelRepository artikelRepository, ArtikelGemaaktRepository artikelsGemaaktRepository) {
        this.artikelRepository = artikelRepository;
        this.artikelsGemaaktRepository = artikelsGemaaktRepository;
    }

    @Override
    public void create(Artikel artikel) {
        artikelRepository.save(artikel);
        artikelsGemaaktRepository.save(new ArtikelGemaakt(artikel));
    }
}
