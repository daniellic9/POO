/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;


import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;


/**
 *
 * @author arthur
 */
public class AppInicio extends javax.swing.JFrame {
  ArrayList<Voos> agendaVoos= new ArrayList<Voos>();
  ArrayList<Passagem> agendaPassagens= new ArrayList<Passagem>();
    public AppInicio() {
agendaVoos.add(new Voos("São Paulo", "Rio de Janeiro"));
agendaVoos.add(new Voos("São Paulo","Vitória"));
agendaVoos.add(new Voos("São Paulo","Porto Alegre"));
agendaVoos.add(new Voos("São Paulo","Brasília"));
agendaVoos.add(new Voos("São Paulo","Belo Horizonte"));
agendaVoos.add(new Voos("São Paulo","Manaus"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("São Paulo","Fortaleza"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("São Paulo","Natal"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Brasília","São Paulo"));
agendaVoos.add(new Voos("Brasília","Rio de Janeiro"));
agendaVoos.add(new Voos("Brasília","Vitória"));
agendaVoos.add(new Voos("Brasília","Porto Alegre"));
agendaVoos.add(new Voos("Brasília","Manaus"));
agendaVoos.add(new Voos("Brasília","Fortaleza"));
agendaVoos.add(new Voos("Brasília","Belo Horizonte"));
agendaVoos.add(new Voos("Brasília","Natal"));
agendaVoos.add(new Voos("Rio de Janeiro","São Paulo"));
agendaVoos.add(new Voos("Rio de Janeiro","Vitória"));
agendaVoos.add(new Voos("Rio de Janeiro","Porto Alegre"));
agendaVoos.add(new Voos("Rio de Janeiro","Belo Horizonte"));
agendaVoos.add(new Voos("Rio de Janeiro","Brasília"));
agendaVoos.add(new Voos("Rio de Janeiro","Manaus"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Rio de Janeiro","Fortaleza"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Rio de Janeiro","Natal"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Vitória","Rio de Janeiro"));
agendaVoos.add(new Voos("Vitória","São Paulo"));
agendaVoos.add(new Voos("Vitória","Porto Alegre"));
agendaVoos.add(new Voos("Vitória","Belo Horizonte"));
agendaVoos.add(new Voos("Vitória","Brasília"));
agendaVoos.add(new Voos("Vitória","Manaus"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Vitória","Fortaleza"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Vitória","Natal"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Manaus","Natal"));
agendaVoos.add(new Voos("Manaus","Fortaleza"));
agendaVoos.add(new Voos("Manaus","Brasília"));
agendaVoos.add(new Voos("Manaus","São Paulo"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Manaus","Rio de Janeiro"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Manaus","Vitória"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Manaus","Porto Alegre"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Manaus","Belo Horizonte"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Natal","Manaus"));
agendaVoos.add(new Voos("Natal","Fortaleza"));
agendaVoos.add(new Voos("Natal","Brasília"));
agendaVoos.add(new Voos("Natal","São Paulo"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Natal","Rio de Janeiro"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Natal","Vitória"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Natal","Porto Alegre"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Natal","Belo Horizonte"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Fortaleza","Manaus"));
agendaVoos.add(new Voos("Fortaleza","Natal"));
agendaVoos.add(new Voos("Fortaleza","Brasília"));
agendaVoos.add(new Voos("Fortaleza","São Paulo"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Fortaleza","Rio de Janeiro"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Fortaleza","Vitória"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Fortaleza","Porto Alegre"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Fortaleza","Belo Horizonte"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Porto Alegre","São Paulo"));
agendaVoos.add(new Voos("Porto Alegre","Rio de Janeiro"));
agendaVoos.add(new Voos("Porto Alegre","Vitória"));
agendaVoos.add(new Voos("Porto Alegre","Natal"));
agendaVoos.add(new Voos("Porto Alegre","Brasília"));
agendaVoos.add(new Voos("Porto Alegre","Manaus"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Porto Alegre","Fortaleza"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Porto Alegre","Natal"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Belo Horizonte","São Paulo"));
agendaVoos.add(new Voos("Belo Horizonte","Rio de Janeiro"));
agendaVoos.add(new Voos("Belo Horizonte","Vitória"));
agendaVoos.add(new Voos("Belo Horizonte","Porto Alegre"));
agendaVoos.add(new Voos("Belo Horizonte","Manaus"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Belo Horizonte","Fortaleza"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
agendaVoos.add(new Voos("Belo Horizonte","Brasilia"));
agendaVoos.add(new Voos("Belo Horizonte","Natal"));
agendaVoos.get(agendaVoos.size()-1).setConexao("Brasília");
    /**
     * Creates new form NewJFrame
     */
        initComponents();
        setIconImage(new ImageIcon("Icons/Whale.png").getImage());
        
//        Toolkit tool = Toolkit.getDefaultToolkit();
//        Dimension dim = new Dimension(tool.getScreenSize());
//        int height = (int) dim.getHeight();
//        int width = (int) dim.getWidth();
//        setSize(width, height);
//        setLocation(width/2 - getWidth() / 2, height / 2 - getHeight() / 2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTOTAL = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSubtitulo = new javax.swing.JLabel();
        pConta = new javax.swing.JPanel();
        JIconConta = new javax.swing.JLabel();
        jlblConta = new javax.swing.JLabel();
        pCheckIn = new javax.swing.JPanel();
        jIconCheckIn = new javax.swing.JLabel();
        jlblCheckIn = new javax.swing.JLabel();
        pNovidade = new javax.swing.JPanel();
        jIconNovidades = new javax.swing.JLabel();
        jlblNovidades = new javax.swing.JLabel();
        pVender = new javax.swing.JPanel();
        jIconVender = new javax.swing.JLabel();
        jlblVender = new javax.swing.JLabel();
        pRepresentante = new javax.swing.JPanel();
        jIconRepresentante = new javax.swing.JLabel();
        jlblRepresentante = new javax.swing.JLabel();
        PainelTelas = new javax.swing.JPanel();
        PainelBoasVindas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        jlblExit = new javax.swing.JLabel();
        PainelRepresentante = new javax.swing.JPanel();
        btnExit5 = new javax.swing.JPanel();
        jlblExit5 = new javax.swing.JLabel();
        jlblEquipeAzul = new javax.swing.JLabel();
        lblArthur = new javax.swing.JLabel();
        lblDanielli = new javax.swing.JLabel();
        lblThayza = new javax.swing.JLabel();
        PainelNovidades = new javax.swing.JPanel();
        btnExit4 = new javax.swing.JPanel();
        jlblExit4 = new javax.swing.JLabel();
        painelNovidades = new javax.swing.JPanel();
        pNovidadesEsq = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pNovidadesDir = new javax.swing.JPanel();
        lblNovidades = new javax.swing.JLabel();
        PainelVenderPassagem = new javax.swing.JPanel();
        btnExit3 = new javax.swing.JPanel();
        jlblExit3 = new javax.swing.JLabel();
        painelVenderPassagem = new javax.swing.JPanel();
        pVenderPassagemEsq = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pVenderPassagemDir = new javax.swing.JPanel();
        pSelecaoPassagem = new javax.swing.JPanel();
        txtOrigem = new javax.swing.JTextField();
        lblOrigem = new javax.swing.JLabel();
        jSepOrigem = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        jSepData = new javax.swing.JSeparator();
        txtDestino = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        jSepDestino = new javax.swing.JSeparator();
        jFormattedData = new javax.swing.JFormattedTextField();
        pCompradePassagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PainelCheckIn = new javax.swing.JPanel();
        btnExit2 = new javax.swing.JPanel();
        jlblExit2 = new javax.swing.JLabel();
        painelCheckIn = new javax.swing.JPanel();
        pCheckInEsq = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pCheckInDir = new javax.swing.JPanel();
        txtIDVoo = new javax.swing.JTextField();
        lblIdDoVoo = new javax.swing.JLabel();
        jSepIdDoVoo = new javax.swing.JSeparator();
        btnCarregar = new javax.swing.JButton();
        PainelConta = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        jlblExit1 = new javax.swing.JLabel();
        painelConta = new javax.swing.JPanel();
        pContaEsq = new javax.swing.JPanel();
        lblIconLogin = new javax.swing.JLabel();
        lblImagemLogin = new javax.swing.JLabel();
        pContaDir = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        lblBemvindo = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnverVendas = new javax.swing.JPanel();
        iconeVendas = new javax.swing.JLabel();
        nomevendas = new javax.swing.JLabel();
        btnSai = new javax.swing.JPanel();
        nomesai = new javax.swing.JLabel();
        iconesai = new javax.swing.JLabel();
        btnGerar2Via = new javax.swing.JPanel();
        nomeGerar = new javax.swing.JLabel();
        iconeGerar = new javax.swing.JLabel();
        pLogin = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelTOTAL.setBackground(PainelTOTAL.getBackground());
        PainelTOTAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(30, 153, 219));
        SidePanel.setForeground(new java.awt.Color(123, 84, 167));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(SidePanel.getBackground());
        Titulo.setToolTipText("");
        Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Universalis ADF Std", 1, 52)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 250, 250));
        jTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/LogoBaleia.png"))); // NOI18N
        jTitulo.setText("Orca");
        Titulo.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 90));

        jSubtitulo.setForeground(new java.awt.Color(254, 254, 254));
        jSubtitulo.setText("Linhas Aereas.");
        Titulo.add(jSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        SidePanel.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 100));

        pConta.setBackground(SidePanel.getBackground());
        pConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pContaMousePressed(evt);
            }
        });
        pConta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        JIconConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Conta.png"))); // NOI18N
        JIconConta.setText(" ");
        pConta.add(JIconConta);

        jlblConta.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblConta.setForeground(new java.awt.Color(254, 254, 254));
        jlblConta.setText("Conta");
        pConta.add(jlblConta);

        SidePanel.add(pConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 50));

        pCheckIn.setBackground(SidePanel.getBackground());
        pCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCheckInMousePressed(evt);
            }
        });
        pCheckIn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Checkin.png"))); // NOI18N
        pCheckIn.add(jIconCheckIn);

        jlblCheckIn.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblCheckIn.setForeground(new java.awt.Color(254, 254, 254));
        jlblCheckIn.setText("Check-in");
        pCheckIn.add(jlblCheckIn);

        SidePanel.add(pCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 290, 50));

        pNovidade.setBackground(SidePanel.getBackground());
        pNovidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pNovidadeMousePressed(evt);
            }
        });
        pNovidade.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconNovidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Novidades.png"))); // NOI18N
        jIconNovidades.setText(" ");
        pNovidade.add(jIconNovidades);

        jlblNovidades.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblNovidades.setForeground(new java.awt.Color(254, 254, 254));
        jlblNovidades.setText("Novidades");
        pNovidade.add(jlblNovidades);

        SidePanel.add(pNovidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 50));

        pVender.setBackground(SidePanel.getBackground());
        pVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pVenderMousePressed(evt);
            }
        });
        pVender.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/VendaPassagem.png"))); // NOI18N
        pVender.add(jIconVender);

        jlblVender.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblVender.setForeground(new java.awt.Color(254, 254, 254));
        jlblVender.setText("Vender passagem");
        pVender.add(jlblVender);

        SidePanel.add(pVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 290, 50));

        pRepresentante.setBackground(SidePanel.getBackground());
        pRepresentante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pRepresentanteMousePressed(evt);
            }
        });
        pRepresentante.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconRepresentante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Representantes.png"))); // NOI18N
        pRepresentante.add(jIconRepresentante);

        jlblRepresentante.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblRepresentante.setForeground(new java.awt.Color(254, 254, 254));
        jlblRepresentante.setText("Representante");
        pRepresentante.add(jlblRepresentante);

        SidePanel.add(pRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 50));

        PainelTOTAL.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 647));

        PainelTelas.setBackground(new java.awt.Color(254, 254, 254));
        PainelTelas.setLayout(new java.awt.CardLayout());

        PainelBoasVindas.setBackground(new java.awt.Color(254, 254, 254));
        PainelBoasVindas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 153, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Janelinha.png"))); // NOI18N
        jLabel1.setText("Seja bem vindo a linha aerea Orca");
        PainelBoasVindas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 620));

        btnExit.setBackground(PainelBoasVindas.getBackground());
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        jlblExit.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit.setText("X");

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelBoasVindas.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        PainelTelas.add(PainelBoasVindas, "card7");

        PainelRepresentante.setBackground(new java.awt.Color(0, 77, 128));
        PainelRepresentante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit5.setBackground(PainelBoasVindas.getBackground());
        btnExit5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit5MouseClicked(evt);
            }
        });

        jlblExit5.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit5.setText("X");

        javax.swing.GroupLayout btnExit5Layout = new javax.swing.GroupLayout(btnExit5);
        btnExit5.setLayout(btnExit5Layout);
        btnExit5Layout.setHorizontalGroup(
            btnExit5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnExit5Layout.setVerticalGroup(
            btnExit5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelRepresentante.add(btnExit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        jlblEquipeAzul.setFont(new java.awt.Font("TeX Gyre DejaVu Math", 0, 48)); // NOI18N
        jlblEquipeAzul.setForeground(new java.awt.Color(254, 254, 254));
        jlblEquipeAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Equipe.png"))); // NOI18N
        jlblEquipeAzul.setText("Equipe ");
        PainelRepresentante.add(jlblEquipeAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 90));

        lblArthur.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblArthur.setForeground(new java.awt.Color(254, 254, 254));
        lblArthur.setText("Arthur Costa de Novais");
        PainelRepresentante.add(lblArthur, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblDanielli.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblDanielli.setForeground(new java.awt.Color(254, 254, 254));
        lblDanielli.setText("Danielli dos Reis Costa");
        PainelRepresentante.add(lblDanielli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lblThayza.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblThayza.setForeground(new java.awt.Color(254, 254, 254));
        lblThayza.setText("Thayza Sacconi Guarnier");
        PainelRepresentante.add(lblThayza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        PainelTelas.add(PainelRepresentante, "card2");

        PainelNovidades.setBackground(new java.awt.Color(0, 77, 128));
        PainelNovidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit4.setBackground(PainelBoasVindas.getBackground());
        btnExit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit4MouseClicked(evt);
            }
        });

        jlblExit4.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit4.setText("X");

        javax.swing.GroupLayout btnExit4Layout = new javax.swing.GroupLayout(btnExit4);
        btnExit4.setLayout(btnExit4Layout);
        btnExit4Layout.setHorizontalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit4Layout.setVerticalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelNovidades.add(btnExit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelNovidades.setBackground(new java.awt.Color(0, 77, 128));
        painelNovidades.setLayout(new java.awt.GridLayout(1, 0));

        pNovidadesEsq.setBackground(new java.awt.Color(24, 116, 210));
        pNovidadesEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load5.gif"))); // NOI18N
        pNovidadesEsq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 410, 530));

        painelNovidades.add(pNovidadesEsq);

        pNovidadesDir.setBackground(new java.awt.Color(27, 62, 111));
        pNovidadesDir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNovidades.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lblNovidades.setForeground(new java.awt.Color(254, 254, 254));
        lblNovidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovidades.setText("NOVIDADES EM BREVE!!");
        pNovidadesDir.add(lblNovidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 530));

        painelNovidades.add(pNovidadesDir);

        PainelNovidades.add(painelNovidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelNovidades, "card2");

        PainelVenderPassagem.setBackground(new java.awt.Color(0, 77, 128));
        PainelVenderPassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit3.setBackground(PainelBoasVindas.getBackground());
        btnExit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit3MouseClicked(evt);
            }
        });

        jlblExit3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit3.setText("X");

        javax.swing.GroupLayout btnExit3Layout = new javax.swing.GroupLayout(btnExit3);
        btnExit3.setLayout(btnExit3Layout);
        btnExit3Layout.setHorizontalGroup(
            btnExit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit3Layout.setVerticalGroup(
            btnExit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelVenderPassagem.add(btnExit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelVenderPassagem.setBackground(new java.awt.Color(0, 77, 128));
        painelVenderPassagem.setLayout(new java.awt.GridLayout(1, 0));

        jPanel9.setBackground(new java.awt.Color(24, 116, 210));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load2.gif"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 280));

        javax.swing.GroupLayout pVenderPassagemEsqLayout = new javax.swing.GroupLayout(pVenderPassagemEsq);
        pVenderPassagemEsq.setLayout(pVenderPassagemEsqLayout);
        pVenderPassagemEsqLayout.setHorizontalGroup(
            pVenderPassagemEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pVenderPassagemEsqLayout.setVerticalGroup(
            pVenderPassagemEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVenderPassagemEsqLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelVenderPassagem.add(pVenderPassagemEsq);

        pVenderPassagemDir.setLayout(new java.awt.CardLayout());

        pSelecaoPassagem.setBackground(new java.awt.Color(27, 62, 111));
        pSelecaoPassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigem.setBackground(new java.awt.Color(27, 62, 111));
        txtOrigem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtOrigem.setForeground(new java.awt.Color(254, 254, 254));
        txtOrigem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtOrigem.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigemActionPerformed(evt);
            }
        });
        pSelecaoPassagem.add(txtOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));

        lblOrigem.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblOrigem.setForeground(new java.awt.Color(254, 254, 254));
        lblOrigem.setText("ORIGEM");
        pSelecaoPassagem.add(lblOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 30));

        jSepOrigem.setBackground(new java.awt.Color(254, 254, 254));
        jSepOrigem.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 10));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pSelecaoPassagem.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 110, -1));

        lblData.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(254, 254, 254));
        lblData.setText("DATA");
        pSelecaoPassagem.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jSepData.setBackground(new java.awt.Color(254, 254, 254));
        jSepData.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 10));

        txtDestino.setBackground(new java.awt.Color(27, 62, 111));
        txtDestino.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(254, 254, 254));
        txtDestino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDestino.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 30));

        lblDestino.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(254, 254, 254));
        lblDestino.setText("DESTINO");
        pSelecaoPassagem.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jSepDestino.setBackground(new java.awt.Color(254, 254, 254));
        jSepDestino.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 10));

        jFormattedData.setBackground(new java.awt.Color(27, 62, 111));
        jFormattedData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jFormattedData.setForeground(new java.awt.Color(254, 254, 254));
        try {
            jFormattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedData.setText("  /        /    ");
        pSelecaoPassagem.add(jFormattedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        pVenderPassagemDir.add(pSelecaoPassagem, "card2");

        pCompradePassagem.setBackground(new java.awt.Color(27, 62, 111));
        pCompradePassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pCompradePassagem.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 400));

        pVenderPassagemDir.add(pCompradePassagem, "card3");

        painelVenderPassagem.add(pVenderPassagemDir);

        PainelVenderPassagem.add(painelVenderPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelVenderPassagem, "card2");

        PainelCheckIn.setBackground(new java.awt.Color(0, 77, 128));
        PainelCheckIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit2.setBackground(PainelBoasVindas.getBackground());
        btnExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit2MouseClicked(evt);
            }
        });

        jlblExit2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit2.setText("X");

        javax.swing.GroupLayout btnExit2Layout = new javax.swing.GroupLayout(btnExit2);
        btnExit2.setLayout(btnExit2Layout);
        btnExit2Layout.setHorizontalGroup(
            btnExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit2Layout.setVerticalGroup(
            btnExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelCheckIn.add(btnExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelCheckIn.setBackground(new java.awt.Color(0, 77, 128));
        painelCheckIn.setLayout(new java.awt.GridLayout(1, 0));

        pCheckInEsq.setBackground(new java.awt.Color(254, 254, 254));
        pCheckInEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load4.gif"))); // NOI18N
        pCheckInEsq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -40, -1, -1));

        painelCheckIn.add(pCheckInEsq);

        pCheckInDir.setBackground(new java.awt.Color(27, 62, 111));
        pCheckInDir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDVoo.setBackground(new java.awt.Color(27, 62, 111));
        txtIDVoo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtIDVoo.setForeground(new java.awt.Color(254, 254, 254));
        txtIDVoo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIDVoo.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pCheckInDir.add(txtIDVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 129, 290, 30));

        lblIdDoVoo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblIdDoVoo.setForeground(new java.awt.Color(254, 254, 254));
        lblIdDoVoo.setText("ID DO VOO");
        pCheckInDir.add(lblIdDoVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 30));

        jSepIdDoVoo.setBackground(new java.awt.Color(254, 254, 254));
        jSepIdDoVoo.setForeground(new java.awt.Color(254, 254, 254));
        pCheckInDir.add(jSepIdDoVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        btnCarregar.setText("Carregar");
        pCheckInDir.add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 80, -1));

        painelCheckIn.add(pCheckInDir);

        PainelCheckIn.add(painelCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelCheckIn, "card2");

        PainelConta.setBackground(new java.awt.Color(0, 77, 128));
        PainelConta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit1.setBackground(PainelBoasVindas.getBackground());
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
        });

        jlblExit1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit1.setText("X");

        javax.swing.GroupLayout btnExit1Layout = new javax.swing.GroupLayout(btnExit1);
        btnExit1.setLayout(btnExit1Layout);
        btnExit1Layout.setHorizontalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit1Layout.setVerticalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelConta.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelConta.setBackground(new java.awt.Color(0, 77, 128));
        painelConta.setLayout(new java.awt.GridLayout(1, 0));

        pContaEsq.setBackground(new java.awt.Color(254, 254, 254));
        pContaEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/LoginConta.png"))); // NOI18N
        pContaEsq.add(lblIconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        lblImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load3.gif"))); // NOI18N
        lblImagemLogin.setText("jLabel5");
        pContaEsq.add(lblImagemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -10, 650, -1));

        painelConta.add(pContaEsq);

        pContaDir.setLayout(new java.awt.CardLayout());

        pMenu.setBackground(new java.awt.Color(254, 254, 254));
        pMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemvindo.setFont(new java.awt.Font("Universalis ADF Std", 0, 30)); // NOI18N
        lblBemvindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemvindo.setText("Bem vindo a sua conta,");
        pMenu.add(lblBemvindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, -1));

        lblNomeUsuario.setFont(new java.awt.Font("Universalis ADF Std", 0, 30)); // NOI18N
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pMenu.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 50));

        btnverVendas.setBackground(new java.awt.Color(30, 153, 219));
        btnverVendas.setBorder(null);
        btnverVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnverVendasMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnverVendasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnverVendasMouseEntered(evt);
            }
        });

        iconeVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Vendas.png"))); // NOI18N

        nomevendas.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomevendas.setForeground(new java.awt.Color(254, 254, 254));
        nomevendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomevendas.setText("Vendas");

        javax.swing.GroupLayout btnverVendasLayout = new javax.swing.GroupLayout(btnverVendas);
        btnverVendas.setLayout(btnverVendasLayout);
        btnverVendasLayout.setHorizontalGroup(
            btnverVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomevendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnverVendasLayout.setVerticalGroup(
            btnverVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnverVendasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomevendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pMenu.add(btnverVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 110, 110));

        btnSai.setBackground(new java.awt.Color(30, 153, 219));
        btnSai.setBorder(null);
        btnSai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaiMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaiMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaiMouseEntered(evt);
            }
        });

        nomesai.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomesai.setForeground(new java.awt.Color(254, 254, 254));
        nomesai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomesai.setText("Sair");

        iconesai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/SairConta.png"))); // NOI18N

        javax.swing.GroupLayout btnSaiLayout = new javax.swing.GroupLayout(btnSai);
        btnSai.setLayout(btnSaiLayout);
        btnSaiLayout.setHorizontalGroup(
            btnSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomesai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconesai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnSaiLayout.setVerticalGroup(
            btnSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaiLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomesai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconesai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pMenu.add(btnSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, 110));

        btnGerar2Via.setBackground(new java.awt.Color(30, 153, 219));
        btnGerar2Via.setBorder(null);
        btnGerar2Via.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMouseEntered(evt);
            }
        });

        nomeGerar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomeGerar.setForeground(new java.awt.Color(254, 254, 254));
        nomeGerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeGerar.setText("Gerar 2 via");

        iconeGerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/SegundaVia.png"))); // NOI18N

        javax.swing.GroupLayout btnGerar2ViaLayout = new javax.swing.GroupLayout(btnGerar2Via);
        btnGerar2Via.setLayout(btnGerar2ViaLayout);
        btnGerar2ViaLayout.setHorizontalGroup(
            btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerar2ViaLayout.createSequentialGroup()
                .addGroup(btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        btnGerar2ViaLayout.setVerticalGroup(
            btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerar2ViaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );

        pMenu.add(btnGerar2Via, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 110));

        pContaDir.add(pMenu, "card3");

        pLogin.setBackground(new java.awt.Color(27, 62, 111));
        pLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenha.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(254, 254, 254));
        lblSenha.setText("SENHA");
        pLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

        txtLogin.setBackground(new java.awt.Color(27, 62, 111));
        txtLogin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(254, 254, 254));
        txtLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLogin.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 129, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));
        pLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 10));

        lblLogin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(254, 254, 254));
        lblLogin.setText("LOGIN");
        pLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 30));

        jSeparator2.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator2.setForeground(new java.awt.Color(254, 254, 254));
        pLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        txtSenha.setBackground(new java.awt.Color(27, 62, 111));
        txtSenha.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(254, 254, 254));
        txtSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        pLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 30));

        btnEntrarLogin.setText("ENTRAR");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });
        pLogin.add(btnEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, -1));

        pContaDir.add(pLogin, "card3");

        painelConta.add(pContaDir);

        PainelConta.add(painelConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelConta, "card2");

        PainelTOTAL.add(PainelTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 930, 620));

        getContentPane().add(PainelTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xy,xx;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void pRepresentanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRepresentanteMousePressed
        setColor(pRepresentante);
        resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        //resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelRepresentante);
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
    }//GEN-LAST:event_pRepresentanteMousePressed

    private void pVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVenderMousePressed
        setColor(pVender);
        resetColor(pConta);
        //resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelVenderPassagem);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pVenderMousePressed

    private void pNovidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNovidadeMousePressed
        setColor(pNovidade);
        resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        //resetColor(pNovidade);
        resetColor(pRepresentante);

        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelNovidades);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pNovidadeMousePressed

    private void pCheckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCheckInMousePressed
        setColor(pCheckIn);
        resetColor(pConta);
        resetColor(pVender);
        //resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        PainelTelas.add(PainelCheckIn);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pCheckInMousePressed

    private void pContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pContaMousePressed
        setColor(pConta);
        //resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelConta);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pContaMousePressed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit2MouseClicked

    private void btnExit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit3MouseClicked

    private void btnExit5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit5MouseClicked

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        if(txtLogin.getText().equals("Arthur") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
        else if(txtLogin.getText().equals("Dani") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
        else if(txtLogin.getText().equals("Thayza") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnEntrarLogin.doClick();
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnGerar2ViaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMousePressed

        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("2via.pdf"));
            document.open();
            TabelaVendas a = new TabelaVendas();
            for (int i = 0; i < 4; i++) {
            document.add(new Phrase(new Chunk( a.getColumnName(i) )));
                
            }
            
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
            //Logger.getLogger(ViewGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        
        try {
            Desktop.getDesktop().open(new File("2via.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
            //Logger.getLogger(ViewGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerar2ViaMousePressed

    private void btnverVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMousePressed

        Document vendas = new Document();
        try {
            PdfWriter.getInstance(vendas, new FileOutputStream("Vendas.pdf"));
            vendas.open();
            vendas.add(new Paragraph("Quantas vendas foram feitas no dia .. / .. / .... "));
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
            //Logger.getLogger(ViewGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            vendas.close();
        }
        
        try {
            Desktop.getDesktop().open(new File("Vendas.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
            //Logger.getLogger(ViewGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnverVendasMousePressed

    private void btnSaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMousePressed
        pLogin.setVisible(true);
        lblIconLogin.setIcon(new ImageIcon("Icons/Usuario100.png"));
        pMenu.setVisible(false);
        txtLogin.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnSaiMousePressed
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pCompradePassagem.setVisible(true);
        pSelecaoPassagem.setVisible(false);
        int i=0,j=0;
        Passagem p  = new Passagem();
        TabelaHorarios tab= new TabelaHorarios();
        for(;i<agendaVoos.size();i++){
            if((txtOrigem.getText().equals(agendaVoos.get(i).getOrigem()))&&(txtDestino.getText().equals(agendaVoos.get(i).getDestino()))){
                jTable1.setModel(tab);
                int a=(int)Math.floor(Math.random()*22);
                p.setDestino(agendaVoos.get(i).getDestino());
                p.setOrigem(agendaVoos.get(i).getOrigem());
                p.setData(null);
                p.setHorarioSaida(a+":00");
                p.setHorarioChegada((a+2)+":00");
                tab.addRow(p);
                agendaPassagens.add(p);
                j=i;
            }
            else{
                //Se não existir passagem, sumir com a tabela
                //Botar mensagem na tela que n exite passagem
                        
            }

        }
     for(int k=0;k<6;k++){   
       Passagem p1= new Passagem();
       int a=(int)Math.floor(Math.random()*22);
       p1.setDestino(agendaVoos.get(j).getDestino());
       p1.setOrigem(agendaVoos.get(j).getOrigem());
        p1.setHorarioSaida(a+":00");
        p1.setHorarioChegada((a+2)+":00");
        tab.addRow(p1);
        agendaPassagens.add(p1);
     }
     for(int b=0;b<agendaPassagens.size();b++){
        if(agendaPassagens.get(b).getOrigem().equals("São Paulo")||agendaPassagens.get(b).getDestino().equals("São Paulo")){
            if(agendaPassagens.get(b).getOrigem().equals("Rio de Janeiro")||agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
                agendaPassagens.get(b).setValor(239);
                if(agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(312);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                agendaPassagens.get(b).setValor(365);
                if(agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Brasília")||agendaPassagens.get(b).getDestino().equals("Brasília")){
                agendaPassagens.get(b).setValor(408);
                if(agendaPassagens.get(b).getDestino().equals("Brasília")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Manaus")||agendaPassagens.get(b).getDestino().equals("Manaus")){
                agendaPassagens.get(b).setValor(1560);
                if(agendaPassagens.get(b).getDestino().equals("Manaus")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(795);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(320);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(429);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Brasília")||agendaPassagens.get(b).getDestino().equals("Brasíia")){
            if(agendaPassagens.get(b).getOrigem().equals("Rio de Janeiro")||agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
                agendaPassagens.get(b).setValor(336);
                if(agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(818);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                agendaPassagens.get(b).setValor(896);
                if(agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Manaus")||agendaPassagens.get(b).getDestino().equals("Manaus")){
                agendaPassagens.get(b).setValor(987);
                if(agendaPassagens.get(b).getDestino().equals("Manaus")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(1131);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(340);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(825);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Rio de Janeiro")||agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
            if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(289);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                agendaPassagens.get(b).setValor(558);
                if(agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Manaus")||agendaPassagens.get(b).getDestino().equals("Manaus")){
                agendaPassagens.get(b).setValor(1152);
                if(agendaPassagens.get(b).getDestino().equals("Manaus")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(696);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(226);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(1037);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Manaus")||agendaPassagens.get(b).getDestino().equals("Manaus")){
            if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(1230);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                agendaPassagens.get(b).setValor(1169);
                if(agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(884);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(1184);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(1214);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Rio de Janeiro")||agendaPassagens.get(b).getDestino().equals("Rio de Janeiro")){
            if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(289);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                agendaPassagens.get(b).setValor(558);
                if(agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Manaus")||agendaPassagens.get(b).getDestino().equals("Manaus")){
                agendaPassagens.get(b).setValor(1152);
                if(agendaPassagens.get(b).getDestino().equals("Manaus")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(696);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(226);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(1037);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Porto Alegre")||agendaPassagens.get(b).getDestino().equals("Porto Alegre")){
            if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(558);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(1035);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                agendaPassagens.get(b).setValor(365);
                if(agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(1026);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Belo Horizonte")||agendaPassagens.get(b).getDestino().equals("Belo Horizonte")){
            if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
                agendaPassagens.get(b).setValor(312);
                if(agendaPassagens.get(b).getDestino().equals("Vitória")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(795);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(429);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Vitória")||agendaPassagens.get(b).getDestino().equals("Vitória")){
            if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(696);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
                agendaPassagens.get(b).setValor(1037);
                if(agendaPassagens.get(b).getDestino().equals("Natal")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }else if(agendaPassagens.get(b).getOrigem().equals("Natal")||agendaPassagens.get(b).getDestino().equals("Natal")){
            if(agendaPassagens.get(b).getOrigem().equals("Fortaleza")||agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                agendaPassagens.get(b).setValor(884);
                if(agendaPassagens.get(b).getDestino().equals("Fortaleza")){
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }else{
                    Random r= new Random();
                    agendaPassagens.get(b).setIdVoo(r.toString().substring(18));
                }
            } 
        }
     }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit4MouseClicked

    private void btnverVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMouseEntered
        setColor(btnverVendas);
    }//GEN-LAST:event_btnverVendasMouseEntered

    private void btnSaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMouseEntered
        setColor(btnSai);
    }//GEN-LAST:event_btnSaiMouseEntered

    private void btnGerar2ViaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMouseEntered
        setColor(btnGerar2Via);
    }//GEN-LAST:event_btnGerar2ViaMouseEntered

    private void btnverVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMouseExited
        resetColor(btnverVendas);
    }//GEN-LAST:event_btnverVendasMouseExited

    private void btnSaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMouseExited
        resetColor(btnSai);
    }//GEN-LAST:event_btnSaiMouseExited

    private void btnGerar2ViaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMouseExited
        resetColor(btnGerar2Via);
    }//GEN-LAST:event_btnGerar2ViaMouseExited

    private void txtOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigemActionPerformed

    }//GEN-LAST:event_txtOrigemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*
                
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                */
                new AppInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JIconConta;
    private javax.swing.JPanel PainelBoasVindas;
    private javax.swing.JPanel PainelCheckIn;
    private javax.swing.JPanel PainelConta;
    private javax.swing.JPanel PainelNovidades;
    private javax.swing.JPanel PainelRepresentante;
    private javax.swing.JPanel PainelTOTAL;
    private javax.swing.JPanel PainelTelas;
    private javax.swing.JPanel PainelVenderPassagem;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JPanel btnExit2;
    private javax.swing.JPanel btnExit3;
    private javax.swing.JPanel btnExit4;
    private javax.swing.JPanel btnExit5;
    private javax.swing.JPanel btnGerar2Via;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel btnSai;
    private javax.swing.JPanel btnverVendas;
    private javax.swing.JLabel iconeGerar;
    private javax.swing.JLabel iconeVendas;
    private javax.swing.JLabel iconesai;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JLabel jIconCheckIn;
    private javax.swing.JLabel jIconNovidades;
    private javax.swing.JLabel jIconRepresentante;
    private javax.swing.JLabel jIconVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSepData;
    private javax.swing.JSeparator jSepDestino;
    private javax.swing.JSeparator jSepIdDoVoo;
    private javax.swing.JSeparator jSepOrigem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jSubtitulo;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jlblCheckIn;
    private javax.swing.JLabel jlblConta;
    private javax.swing.JLabel jlblEquipeAzul;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblExit1;
    private javax.swing.JLabel jlblExit2;
    private javax.swing.JLabel jlblExit3;
    private javax.swing.JLabel jlblExit4;
    private javax.swing.JLabel jlblExit5;
    private javax.swing.JLabel jlblNovidades;
    private javax.swing.JLabel jlblRepresentante;
    private javax.swing.JLabel jlblVender;
    private javax.swing.JLabel lblArthur;
    private javax.swing.JLabel lblBemvindo;
    private javax.swing.JLabel lblDanielli;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblIdDoVoo;
    private javax.swing.JLabel lblImagemLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNovidades;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblThayza;
    private javax.swing.JLabel nomeGerar;
    private javax.swing.JLabel nomesai;
    private javax.swing.JLabel nomevendas;
    private javax.swing.JPanel pCheckIn;
    private javax.swing.JPanel pCheckInDir;
    private javax.swing.JPanel pCheckInEsq;
    private javax.swing.JPanel pCompradePassagem;
    private javax.swing.JPanel pConta;
    private javax.swing.JPanel pContaDir;
    private javax.swing.JPanel pContaEsq;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pNovidade;
    private javax.swing.JPanel pNovidadesDir;
    private javax.swing.JPanel pNovidadesEsq;
    private javax.swing.JPanel pRepresentante;
    private javax.swing.JPanel pSelecaoPassagem;
    private javax.swing.JPanel pVender;
    private javax.swing.JPanel pVenderPassagemDir;
    private javax.swing.JPanel pVenderPassagemEsq;
    private javax.swing.JPanel painelCheckIn;
    private javax.swing.JPanel painelConta;
    private javax.swing.JPanel painelNovidades;
    private javax.swing.JPanel painelVenderPassagem;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIDVoo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 77, 128));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(SidePanel.getBackground());
    }
}
