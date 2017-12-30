package com.example.model;

import javax.persistence.*;

@Entity
public class Osiguranje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "broj_ugovora")
    private String brojUgovora;

    @Column(name = "broj_zelenog_kartona")
    private String brojZelenogKartona;

    @Column(name = "polisa_vazi_od_do")
    private String polisaVaziOdDo;

    @Column(name = "zeleni_karton_vazi_od_do")
    private String zeleniKartonVaziOdDo;

    @Column(name = "filijala")
    private String filijala;

    @Column(name = "materijlna_steta_osigurana_ugovorom")
    private String materijalnaStetaOsiguranaUgovorom;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public String getBrojZelenogKartona() {
        return brojZelenogKartona;
    }

    public void setBrojZelenogKartona(String brojZelenogKartona) {
        this.brojZelenogKartona = brojZelenogKartona;
    }

    public String getPolisaVaziOdDo() {
        return polisaVaziOdDo;
    }

    public void setPolisaVaziOdDo(String polisaVaziOdDo) {
        this.polisaVaziOdDo = polisaVaziOdDo;
    }

    public String getZeleniKartonVaziOdDo() {
        return zeleniKartonVaziOdDo;
    }

    public void setZeleniKartonVaziOdDo(String zeleniKartonVaziOdDo) {
        this.zeleniKartonVaziOdDo = zeleniKartonVaziOdDo;
    }

    public String getFilijala() {
        return filijala;
    }

    public void setFilijala(String filijala) {
        this.filijala = filijala;
    }

    public String getMaterijalnaStetaOsiguranaUgovorom() {
        return materijalnaStetaOsiguranaUgovorom;
    }

    public void setMaterijalnaStetaOsiguranaUgovorom(String materijalnaStetaOsiguranaUgovorom) {
        this.materijalnaStetaOsiguranaUgovorom = materijalnaStetaOsiguranaUgovorom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
