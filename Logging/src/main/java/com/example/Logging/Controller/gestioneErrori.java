package com.example.Logging.Controller;

public class gestioneErrori extends RuntimeException{
    public gestioneErrori(String messaggio){
        super(messaggio);
        System.out.println("L'errore è stato causato da..");
    }
}
