package com.example.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;

	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;

	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;

	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;

	@Column(name = "adresa")
	private String adresa;

	@Column(name = "postanski_broj")
	private String postanskiBroj;

	@Column(name = "drzava")
	private String drzava;

	@Column(name = "telefon")
	private String telefon;

	@Column(name = "broj_vozacke_dozvole")
	private String brVozackeDozvole;

	@Column(name = "kategorija_dozvole")
	private String kategorijaDozvole;

	@Column(name = "vozacka_dozvola_vazi_do")
	private String vozackaDozvolaVaziDo;

	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Vozilo> vozila;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Prikolica> prikolice;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Osiguranje> osiguranja;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<UgovaracOsiguranja> ugovaracOsiguranja;

	public List<UgovaracOsiguranja> getUgovaracOsiguranja() {
		return ugovaracOsiguranja;
	}

	public void setUgovaracOsiguranja(List<UgovaracOsiguranja> ugovaracOsiguranja) {
		this.ugovaracOsiguranja = ugovaracOsiguranja;
	}

	public List<Osiguranje> getOsiguranja() {
		return osiguranja;
	}

	public void setOsiguranja(List<Osiguranje> osiguranja) {
		this.osiguranja = osiguranja;
	}

	public List<Prikolica> getPrikolice() {
		return prikolice;
	}

	public void setPrikolice(List<Prikolica> prikolice) {
		this.prikolice = prikolice;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getPostanskiBroj() {
		return postanskiBroj;
	}

	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getBrVozackeDozvole() {
		return brVozackeDozvole;
	}

	public void setBrVozackeDozvole(String brVozackeDozvole) {
		this.brVozackeDozvole = brVozackeDozvole;
	}

	public String getKategorijaDozvole() {
		return kategorijaDozvole;
	}

	public void setKategorijaDozvole(String kategorijaDozvole) {
		this.kategorijaDozvole = kategorijaDozvole;
	}

	public String getVozackaDozvolaVaziDo() {
		return vozackaDozvolaVaziDo;
	}

	public void setVozackaDozvolaVaziDo(String vozackaDozvolaVaziDo) {
		this.vozackaDozvolaVaziDo = vozackaDozvolaVaziDo;
	}

	public List<Vozilo> getVozila() {
		return vozila;
	}

	public void setVozila(List<Vozilo> vozila) {
		this.vozila = vozila;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
