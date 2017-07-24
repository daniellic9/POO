/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author arthur
 */
public class SocketCliente {
    private String server="127.0.0.1";
    private int porta=5001;
    private String texto="";
            
    public void run() {
	        try{
	             //while (true) { //Garente que fique sempre em execução
	 
	                // abrindo uma porta para fazer comunicação entre o cliente e o servidor
	                Socket meuSocket = new Socket(server, porta);
	 
	                // instaciando para enviarmos ao nosso servidor o que digitamos no cliente
	                ObjectOutputStream oo = new ObjectOutputStream(meuSocket.getOutputStream());
	 
	                // informando aonde estamos conectados
	                   System.out.println("\nConectado a " + server + ":" + porta);
	 
	                // enviando ao servidor a string digitada via teclado
	                oo.writeObject(texto);
                        	 
	                //Resposta Recebida do Servidor
                        ObjectInputStream entrada = new ObjectInputStream(meuSocket.getInputStream());
                        //Atribuindo a data recebida do servidor
                        String resp = (String)entrada.readObject();
                        System.out.println( "\nResposta do servidor: " + resp);
                       
                        //fechando as conexões                        
                        entrada.close();                         
	                meuSocket.close();
                     //}
	 
	        }catch(java.net.ConnectException e){
                    System.err.println("Erro: " +e.toString());
                    System.err.println("\n#ERRO: Voce nao esta conectado ao servidor#");
                }catch (Exception e) {
	            e.printStackTrace();
	       }
             }
}
