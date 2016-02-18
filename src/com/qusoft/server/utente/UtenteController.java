package com.qusoft.server.utente;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/utente")
public class UtenteController implements ErrorController{
    private static final String PATH_ERROR="/error";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/info1")
    public Utente getUtente1(@RequestParam(value="name", defaultValue="World") String name) throws Exception {
        if(true){
            throw new Exception("Errore");
        }
        return new Utente(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping("/info2")
    public Utente getUtente2(@RequestParam(value="name", defaultValue="Errore") String name){
        return new Utente(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = PATH_ERROR)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return PATH_ERROR;
    }
}