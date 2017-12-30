package com.example.model;

import javax.persistence.*;

@Entity
public class Vozilo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "marka")
    String marka;

    @Column(name = "tip")
    String tip;

    @Column(name = "registarska_oznaka")
    String registarskaOznaka;

    @Column(name = "drzava_u_kojoj_je_vozilo_reg.")
    String drzavaUKojojJeVoziloRegistrovano;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public String getDrzavaUKojojJeVoziloRegistrovano() {
        return drzavaUKojojJeVoziloRegistrovano;
    }

    public void setDrzavaUKojojJeVoziloRegistrovano(String drzavaUKojojJeVoziloRegistrovano) {
        this.drzavaUKojojJeVoziloRegistrovano = drzavaUKojojJeVoziloRegistrovano;
    }
}
