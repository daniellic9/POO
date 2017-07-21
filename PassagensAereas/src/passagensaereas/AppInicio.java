/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author arthur
 */
public class AppInicio extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AppInicio() {

        initComponents();
        
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
        PainelConta = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        jlblExit1 = new javax.swing.JLabel();
        PainelCheckIn = new javax.swing.JPanel();
        btnExit2 = new javax.swing.JPanel();
        jlblExit2 = new javax.swing.JLabel();
        PainelVenderPassagem = new javax.swing.JPanel();
        btnExit3 = new javax.swing.JPanel();
        jlblExit3 = new javax.swing.JLabel();
        PainelNovidades = new javax.swing.JPanel();
        btnExit4 = new javax.swing.JPanel();
        jlblExit4 = new javax.swing.JLabel();
        PainelRepresentante = new javax.swing.JPanel();
        btnExit5 = new javax.swing.JPanel();
        jlblExit5 = new javax.swing.JLabel();
        jlblEquipeAzul = new javax.swing.JLabel();
        lblArthur = new javax.swing.JLabel();
        lblDanielli = new javax.swing.JLabel();
        lblThayza = new javax.swing.JLabel();

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
        jTitulo.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Baleia Filled-100.png")); // NOI18N
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

        JIconConta.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Menu de usuário masculino-32.png")); // NOI18N
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

        jIconCheckIn.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Informação de sistema-32.png")); // NOI18N
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

        jIconNovidades.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Add List-32.png")); // NOI18N
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

        jIconVender.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Banco-32.png")); // NOI18N
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

        jIconRepresentante.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Suporte on-line-32.png")); // NOI18N
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
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Janela do avião aberta-96.png")); // NOI18N
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

        PainelTelas.add(PainelConta, "card2");

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
            .addComponent(jlblExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelCheckIn.add(btnExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        PainelTelas.add(PainelCheckIn, "card2");

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
            .addComponent(jlblExit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelVenderPassagem.add(btnExit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        PainelTelas.add(PainelVenderPassagem, "card2");

        PainelNovidades.setBackground(new java.awt.Color(0, 77, 128));
        PainelNovidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit4.setBackground(PainelBoasVindas.getBackground());

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
            .addComponent(jlblExit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelNovidades.add(btnExit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        PainelTelas.add(PainelNovidades, "card2");

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
            .addComponent(jlblExit5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelRepresentante.add(btnExit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        jlblEquipeAzul.setFont(new java.awt.Font("TeX Gyre DejaVu Math", 0, 48)); // NOI18N
        jlblEquipeAzul.setForeground(new java.awt.Color(254, 254, 254));
        jlblEquipeAzul.setIcon(new javax.swing.ImageIcon("/home/arthur/GitHub/POOTrab/POO/PassagensAereas/build/classes/UI_ICons/icons8-Chamada em conferência Filled-100.png")); // NOI18N
        jlblEquipeAzul.setText("Equipe Orca");
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
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JPanel btnExit2;
    private javax.swing.JPanel btnExit3;
    private javax.swing.JPanel btnExit4;
    private javax.swing.JPanel btnExit5;
    private javax.swing.JLabel jIconCheckIn;
    private javax.swing.JLabel jIconNovidades;
    private javax.swing.JLabel jIconRepresentante;
    private javax.swing.JLabel jIconVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jSubtitulo;
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
    private javax.swing.JLabel lblDanielli;
    private javax.swing.JLabel lblThayza;
    private javax.swing.JPanel pCheckIn;
    private javax.swing.JPanel pConta;
    private javax.swing.JPanel pNovidade;
    private javax.swing.JPanel pRepresentante;
    private javax.swing.JPanel pVender;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 77, 128));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(SidePanel.getBackground());
    }
}
