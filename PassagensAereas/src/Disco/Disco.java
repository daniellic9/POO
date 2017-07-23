/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import passagensaereas.Passagem;
import passagensaereas.Voos;
import static passagensaereas.PassagensAereas.*;

/**
 *
 * @author danie
 */
public class Disco implements InterfaceDisco{

     

    
    
    @Override
    public void salvarVoos(){
        File arquivo=new File("agendaVoos.txt");
        try{
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos =new ObjectOutputStream(fout);
            oos.writeObject(agendaVoos);
            oos.flush();
            fout.close();
        }catch(Exception ex){
            System.err.println("Erro: "+ ex.toString());
        }
    }

    @Override
    public ArrayList<Voos> carregarVoos() {
        File arquivo=new File("agendaVoos.txt");
        try{
            ArrayList<Voos> b = new ArrayList<Voos>();
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin =new ObjectInputStream(fin);
            agendaVoos =(ArrayList<Voos>)oin.readObject();
            for(Voos p: agendaVoos){
                p.imprimir();
            }
            oin.close();
            fin.close();
        }catch(Exception ex){
            System.err.println("Erro: "+ ex.toString());
        }
        return agendaVoos;
    }

    @Override
    public void salvarPassagem() {
        File arquivo=new File("agendaPassagem.txt");
        try{
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos =new ObjectOutputStream(fout);
            oos.writeObject(agendaPassagem);
            oos.flush();
            fout.close();
        }catch(Exception ex){
            System.err.println("Erro: "+ ex.toString());
        }
    }

    @Override
    public ArrayList<Passagem> carregarPassagens() {
        File arquivo=new File("agendaPassagem.txt");
        try{
            ArrayList<Passagem> b = new ArrayList<Passagem>();
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin =new ObjectInputStream(fin);
            agendaPassagem =(ArrayList<Passagem>)oin.readObject();
            for(Passagem p: agendaPassagem){
                p.imprimir();
            }
            oin.close();
            fin.close();
        }catch(Exception ex){
            System.err.println("Erro: "+ ex.toString());
        }
        return agendaPassagem;
    }


    
    
}