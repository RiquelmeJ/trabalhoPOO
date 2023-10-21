/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import classes.Adocao;
import classes.Animal;
import classes.Associado;
import classes.Evento;
import classes.Financeiro;
import classes.Voluntario;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Softex
 */
public class FrameTelaInicial extends javax.swing.JFrame {
    private static ArrayList<Animal> animais = new ArrayList<>();
    private static ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private static ArrayList<Evento> eventos = new ArrayList<>();
    private static ArrayList<Associado> associados = new ArrayList<>();
    private static ArrayList<Adocao> adocoes = new ArrayList<>();
    private static Financeiro fluxo = new Financeiro();
        

    /**
     * Creates new form FrameTelaInicial
     * @param associados
     * @param adocoes
     */
    public FrameTelaInicial(ArrayList<Animal> animais, ArrayList<Voluntario> voluntarios, Financeiro fluxo, ArrayList<Evento> eventos, ArrayList<Adocao> adocoes, ArrayList<Associado> associados) {
        this.animais = animais;
        this.voluntarios = voluntarios;
        this.fluxo = fluxo;
        this.adocoes = adocoes;
        this.associados = associados;
        this.eventos = eventos;
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCadastrarAnimal = new javax.swing.JMenuItem();
        btnListaAnimais = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnAssociados = new javax.swing.JMenuItem();
        btnAdocao = new javax.swing.JMenuItem();
        btnVoluntario = new javax.swing.JMenu();
        btnCadastraVoluntario = new javax.swing.JMenuItem();
        btnGerenciaVoluntario = new javax.swing.JMenuItem();
        btnFinanceiro = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Juazeiro do Norte, 2023");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BACHARELADO EM CIÊNCIA DA COMPUTAÇÃO");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UNIVERSIDADE FEDERAL DO CARIRI");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DISCIPLINA: Programação Orientada à Objetos");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALUNOS: Riquelme Jatay Ribeiro Scarcela Bezerra, Karla Mikaelly");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Paz de Almeida e Helen Christine Turbano e Silva");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PROFESSOR: Dorgival Pereira");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sistema de Gestão");

        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setName("mnuPrincipal"); // NOI18N

        jMenu1.setText("Animais");

        btnCadastrarAnimal.setText("Novo animal");
        btnCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAnimalActionPerformed(evt);
            }
        });
        jMenu1.add(btnCadastrarAnimal);

        btnListaAnimais.setText("Gerenciar animais");
        btnListaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAnimaisActionPerformed(evt);
            }
        });
        jMenu1.add(btnListaAnimais);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Adoções e Associados");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        btnAssociados.setText("Gerenciar associados");
        btnAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociadosActionPerformed(evt);
            }
        });
        jMenu3.add(btnAssociados);

        btnAdocao.setText("Gerenciar adoções");
        btnAdocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdocaoActionPerformed(evt);
            }
        });
        jMenu3.add(btnAdocao);

        jMenuBar1.add(jMenu3);

        btnVoluntario.setText("Voluntários");

        btnCadastraVoluntario.setText("Novo voluntário");
        btnCadastraVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraVoluntarioActionPerformed(evt);
            }
        });
        btnVoluntario.add(btnCadastraVoluntario);

        btnGerenciaVoluntario.setText("Gerenciar voluntários");
        btnGerenciaVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciaVoluntarioActionPerformed(evt);
            }
        });
        btnVoluntario.add(btnGerenciaVoluntario);

        jMenuBar1.add(btnVoluntario);

        btnFinanceiro.setText("Financeiro");
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Abrir controle financeiro");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btnFinanceiro.add(jMenuItem5);

        jMenuBar1.add(btnFinanceiro);

        jMenu2.setText("Agenda");

        jMenuItem1.setText("Abrir agenda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatório");

        jMenuItem2.setText("Gerar relatório");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addGap(0, 396, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAnimalActionPerformed
        FrameCadastroAnimal frame = new FrameCadastroAnimal(animais);
        frame.setVisible(true);
    }//GEN-LAST:event_btnCadastrarAnimalActionPerformed

    private void btnListaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAnimaisActionPerformed
        FrameListaAnimais frame = new FrameListaAnimais(animais);
        frame.setVisible(true);
    }//GEN-LAST:event_btnListaAnimaisActionPerformed

    private void btnCadastraVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraVoluntarioActionPerformed
       FrameCadastroVoluntario frame = new FrameCadastroVoluntario(voluntarios);
       frame.setVisible(true);
    }//GEN-LAST:event_btnCadastraVoluntarioActionPerformed

    private void btnGerenciaVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciaVoluntarioActionPerformed
        FrameListaVoluntarios frame = new FrameListaVoluntarios(voluntarios);
        frame.setVisible(true);
    }//GEN-LAST:event_btnGerenciaVoluntarioActionPerformed

    private void btnAdocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdocaoActionPerformed
        if ((animais.isEmpty())/* || (associados.isEmpty())*/){
            JOptionPane.showMessageDialog(rootPane,"É necessário ao menos um animal\ne um associado.");
        }else {
            FrameInicialAdocao frame = new FrameInicialAdocao(animais, associados, adocoes);
            frame.setVisible(true);
        }    }//GEN-LAST:event_btnAdocaoActionPerformed

    private void btnAssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociadosActionPerformed
        FrameAssociados frame = new FrameAssociados(associados);
        frame.setVisible(true);
    }//GEN-LAST:event_btnAssociadosActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed

    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrameFluxoCaixa frame = new FrameFluxoCaixa(fluxo);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (voluntarios.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"É necessário ao menos um voluntário.");
        }else {
            FrameAgendaEventos frame = new FrameAgendaEventos(eventos, voluntarios);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrameRelatorio frame = new FrameRelatorio(voluntarios, associados, adocoes, animais);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTelaInicial(animais, voluntarios, fluxo, eventos, adocoes, associados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAdocao;
    private javax.swing.JMenuItem btnAssociados;
    private javax.swing.JMenuItem btnCadastraVoluntario;
    private javax.swing.JMenuItem btnCadastrarAnimal;
    private javax.swing.JMenu btnFinanceiro;
    private javax.swing.JMenuItem btnGerenciaVoluntario;
    private javax.swing.JMenuItem btnListaAnimais;
    private javax.swing.JMenu btnVoluntario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
