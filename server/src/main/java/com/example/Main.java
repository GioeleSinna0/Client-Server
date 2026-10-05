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
        ServerSocket ss = new ServerSocket(8000);
        Socket s = ss.accept();
        String testo = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        do{
            testo = in.readLine();
            out.println(testo.toUpperCase());
        }while(!(testo.equals("exit")));

        System.out.println("programma finito");
    }
}