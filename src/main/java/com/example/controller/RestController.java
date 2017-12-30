package com.example.controller;

import com.example.model.*;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/admin/proba")
    public String proba(){
        User u = new User();
        Vozilo vozilo = new Vozilo();
        Prikolica prikolica = new Prikolica();
        Osiguranje osiguranje = new Osiguranje();
        UgovaracOsiguranja ugovaracOsiguranja = new UgovaracOsiguranja();

        ugovaracOsiguranja.setAdresa("sumadijska");
        ugovaracOsiguranja.setIme("milos");
        ugovaracOsiguranja.setPostanskiBroj("1515");
        ugovaracOsiguranja.setPrezime("simoca");

        osiguranje.setBrojUgovora("21314");
        osiguranje.setMaterijalnaStetaOsiguranaUgovorom("666000");
        osiguranje.setPolisaVaziOdDo("26.2.2548");

        prikolica.setDrzavaUKojojJeRegistrovana("Francuska");
        prikolica.setRegistarskaOznaka("5588-555");


        vozilo.setMarka("Ferari");
        vozilo.setDrzavaUKojojJeVoziloRegistrovano("Srbija");
        vozilo.setRegistarskaOznaka("Bg212id");

        List<Vozilo> v = new ArrayList<>();
        List<Prikolica> prikolice = new ArrayList<>();
        List<Osiguranje> osiguranja = new ArrayList<>();
        List<UgovaracOsiguranja> ugovaracOsiguranja1 = new ArrayList<>();
        v.add(vozilo);
        prikolice.add(prikolica);
        osiguranja.add(osiguranje);
        ugovaracOsiguranja1.add(ugovaracOsiguranja);

        System.out.println("POGODAK 1");
        u.setName("marko11");
        u.setLastName("uljarevic11");
        u.setEmail("marko11@marko.com");
        u.setActive(1);
        u.setPassword("marko123");
        u.setBrVozackeDozvole("2512525");
        u.setDrzava("Srbija");

        vozilo.setUser(u);
        prikolica.setUser(u);
        osiguranje.setUser(u);
        ugovaracOsiguranja.setUser(u);

        u.setVozila(v);
        u.setPrikolice(prikolice);
        u.setOsiguranja(osiguranja);
        u.setUgovaracOsiguranja(ugovaracOsiguranja1);

        System.out.println("POGODAK2");
        userService.saveUser(u);

        return "ok";
    }

    @GetMapping("/admin/ispis")
    public String proba2(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        if (!user.getVozila().isEmpty()){
            System.out.println("ULAZIM U IF");
            return "USER je " + user.getLastName() + user.getVozila().get(0).getMarka() ;
        }

        return "NEMA VOZILA ";

    }

}
