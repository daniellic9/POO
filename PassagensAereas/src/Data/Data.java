/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;

/**
 *
 * @author arthur
 */
public class Data  implements Serializable{
    DateTime data;

    public DateTime getData() {
        return data;
    }
    
    
    public Data(){
        try{
        data = new DateTime();
        }catch(org.joda.time.IllegalFieldValueException e){
            System.err.println(e.toString());
        }
    }
    
    public Data (int dia, int mes, int ano){
        try{    
            data = new DateTime(ano, mes, dia, 0, 1);
        }catch(org.joda.time.IllegalFieldValueException e){
            System.err.println(e.toString());
        }
        
    }
    
    public Data(String Jformatteddata){
        try{
            String num []= Jformatteddata.split("/");
            data = new DateTime(Integer.parseInt(num[2]),
                                Integer.parseInt(num[1]),
                                Integer.parseInt(num[0]),
                                0,1);
        }catch(org.joda.time.IllegalFieldValueException e){
            System.err.println(e.toString());
        }
    }
    
    public boolean dataValida(String jFormated){
        try{
            Data d = new Data(jFormated);
        }catch(org.joda.time.IllegalFieldValueException e){
            return false;
        }
        return true;
    }
    
    public boolean estanoPrazo(){
        
        DateTime dinicio = new DateTime();
        
        try{
            Interval intervalo = new Interval(dinicio, this.data);
            Duration duracao = intervalo.toDuration();
            System.out.println("Duracao em horas: "+duracao.getStandardHours());
            if(duracao.getStandardHours() > 47){
                return true;
            }
        }catch(org.joda.time.IllegalFieldValueException e){
            System.err.println(e.toString());
            return false;
        }catch(java.lang.IllegalArgumentException e){
            System.err.println(e.toString());
            return false;
        }
        
        
        return false;
        
    }


    
}
