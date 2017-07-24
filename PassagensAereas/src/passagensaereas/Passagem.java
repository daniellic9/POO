package passagensaereas;

import static Disco.Disco.agendaPassagem;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Passagem extends InformacoesViagem {
private int idpassagem;
private Document pdf;
private int idvoo;
public Passageiro passageiro;

    public Passagem(int idpassagem, Voos voo, String nomePessoa, String cpf) {
        this.idpassagem = idpassagem;
        this.idvoo = voo.getIdvoo();
        this.data = voo.data;
        this.destino = voo.destino;
        this.horarioChegada = voo.horarioChegada;
        this.horarioSaida = voo.horarioSaida;
        this.origem = voo.origem;
        this.valor = voo.valor;
        this.passageiro = new Passageiro(nomePessoa, cpf);
    }

    public int getIdpassagem() {
        return idpassagem;
    }

    public void getPdf() throws DocumentException {
        
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        
        //gera segunda via é o mesmo método pra gerar o check-in
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("passagem.pdf"));
            document.open();
            TabelaVendas a = new TabelaVendas();
            Font f = new Font(Font.FontFamily.COURIER, 20, Font.ITALIC);
            document.add(new Paragraph("Passagem", f));
            
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(0).toString() + ":\t " + idvoo)));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( "idPassagem: \t " + idpassagem )));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(1).toString() + ":\t " + passageiro.getNomePessoa() )));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(2).toString() + ":\t " + horarioSaida)));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(3).toString() + ":\t " + origem)));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(4).toString() + ":\t " + destino)));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(5).toString() + ":\t " + valor)));
                
            document.add(new Paragraph(" "));
            PdfContentByte cb = writer.getDirectContent();
            BarcodeEAN codeEAN = new BarcodeEAN();
            document.add(new Paragraph(" "));
            codeEAN.setCodeType(codeEAN.EAN13);
            //codeEAN.setCode("9070802124510"); // fazer random para cada pessoa
            String codigo = Integer.toString((int)Math.floor(Math.random()*1000000000));
            codeEAN.setCode(codigo+"4510"); 
            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
            document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
        } finally {
            document.close();
        }
        
        //abre o pdf gerado
        try {
            Desktop.getDesktop().open(new File("passagem.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
        
    }

    public int getIdvoo() {
        return idvoo;
    }

    


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String getOrigem() {
        return this.origem;
    }

    @Override
    public void setOrigem(String origem) {
       this.origem=origem;
    }

    @Override
    public String getDestino() {
       return this.destino;
    }

    @Override
    public void setDestino(String destino) {
        this.destino=destino;
    }


    @Override
    public String getHorarioSaida() {
        return this.horarioSaida;
    }

    @Override
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida=horarioSaida;
    }

    @Override
    public String getHorarioChegada() {
        return this.horarioChegada;
    }

    @Override
    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada=horarioChegada;
    }
      public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    
}
