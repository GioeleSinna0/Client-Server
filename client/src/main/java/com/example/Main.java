package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("127.0.0.1", 8000);
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        String testo = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        do{
            System.out.println("Inserisci una stringa:");
            stringa = scanner.nextLine();
            
            out.println(stringa);
            testo = in.readLine();
            System.out.println(testo);
        }while(!(stringa.equals("exit")));

        System.out.println("programma finito");
    }
}