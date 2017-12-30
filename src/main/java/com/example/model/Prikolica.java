package com.example.model;

import javax.persistence.*;

@Entity
public class Prikolica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "registarska_oznaka")
    private String registarskaOznaka;

    @Column(name = "drzava_u_kojoj_je_registrovana")
    private String drzavaUKojojJeRegistrovana;

    @Column(name = "maksimalna_dozvoljena_tezina")
    private String maksimalnaDozvoljenaTezina;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public String getDrzavaUKojojJeRegistrovana() {
        return drzavaUKojojJeRegistrovana;
    }

    public void setDrzavaUKojojJeRegistrovana(String drzavaUKojojJeRegistrovana) {
        this.drzavaUKojojJeRegistrovana = drzavaUKojojJeRegistrovana;
    }

    public String getMaksimalnaDozvoljenaTezina() {
        return maksimalnaDozvoljenaTezina;
    }

    public void setMaksimalnaDozvoljenaTezina(String maksimalnaDozvoljenaTezina) {
        this.maksimalnaDozvoljenaTezina = maksimalnaDozvoljenaTezina;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
