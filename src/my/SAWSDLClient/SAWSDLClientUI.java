package my.SAWSDLClient;

import com.opsware.client.*;
import com.opsware.common.NotFoundException;
import com.opsware.fido.AuthorizationException;
import com.opsware.server.*;
import com.opsware.search.*;
import java.rmi.RemoteException;


public class SAWSDLClientUI extends javax.swing.JFrame {
   
   
    public SAWSDLClientUI() {
        
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        coreServer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        agent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        exitBtn = new javax.swing.JButton();
        generateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Automation Agent Check");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));

        jLabel3.setText("SA Core Server:");

        coreServer.setText("<hostname of SA server>");
        coreServer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setText("Username:");

        userName.setText("<username>");
        userName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setText("Password:");
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel8.setText("Server Name:");

        agent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Results:");

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.setViewportView(textArea);

        jLabel10.setText("Port:");

        port.setText("443");
        port.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coreServer, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(164, Short.MAX_VALUE))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coreServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(coreServer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(userName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(agent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(port, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(reset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Server Automation RMI Client");

        jLabel1.setText("Specify arguments for Server Automation agent check");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/SAWSDLClient/gear_blue.png"))); // NOI18N
        jLabel4.setOpaque(true);

        jLayeredPane3.setBackground(new java.awt.Color(255, 255, 255));

        exitBtn.setText("Close");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        generateBtn.setText("Generate");
        generateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateBtnMouseClicked(evt);
            }
        });
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/SAWSDLClient/help.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 30));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearBtn)
                .addGap(14, 14, 14)
                .addComponent(exitBtn)
                .addGap(14, 14, 14))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn)
                    .addComponent(generateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn)))
        );
        jLayeredPane3.setLayer(exitBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(generateBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(clearBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jLayeredPane3)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
         coreServer.setText("");
         port.setText("");
         userName.setText("");
         password.setText("");
         agent.setText("");
         textArea.setText("");
    }                                        

    
    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
       // printOutput();
        textArea.setText("");
        Thread thread;
        thread = new Thread(new Runnable() {
            @Override
            public void run(){
                try {                  
                   letsrun();
                    
                }
                catch (Exception e) {
                    e.printStackTrace(); }
                
            }
        });
        thread.start();
        
       
        
    }                                           
    
    
     private void letsrun()  throws RemoteException {
        String coreSA     = coreServer.getText();
        String user       = userName.getText();
        String strPassword = new String(password.getPassword());
        String target     = agent.getText();
        int portNumber =  Integer.parseInt(port.getText());
        ServerService serverSvc;
        
        if(target.equals("")) {
              
              textArea.append("ERROR: Please enter at least one server name. Partial, single or comma separated host values are supported.!!!");
        }
        else {
              textArea.append("Searching Server Automation Database ....Please wait.....");
              textArea.append("\n");
              try 
                {
                    // Connect to the chat client
                    OpswareClient.connect("https", coreSA, (short)portNumber, user, strPassword, true);
                    
                    // Get the handle to the required service.
                    serverSvc = (ServerService)OpswareClient.getService(ServerService.class);
                    
                    // Construct a search filter to search for all managed
                    // servers with a hostname that contains the target string
                    // specified in the agent field or comma seperated hosts.

                     if(target.contains(",")) {
                                String hosts[] = target.split("\\,");
                                for (String host : hosts) {
                                    String filterExpr = "ServerVO.hostname CONTAINS " + host;
                                    Filter filter = new Filter("device",filterExpr);
                                    // Get references to the servers that match the search filter.
                                    ServerRef[] serverRefs = serverSvc.findServerRefs(filter);
                                    //System.out.println(Arrays.toString(serverRefs));

                                    if (serverRefs.length == 0) {
                                        textArea.append("\n" + "No matching servers found for " + host );
                                    }
                                    // Get the value objects for the server references.
                                    ServerVO[] serverVOs = serverSvc.getServerVOs(serverRefs);
                                    //System.out.println(Arrays.toString(serverVOs));

                                    OpswareClient.disconnect();

                                    // Iterate through the server value objects and print some attributes.
                                    for (ServerVO serverVO : serverVOs) {
                                        System.out.println("  " + serverVO.getName());
                                        textArea.append("\n" + serverVO.getName());
                                        textArea.append("\n" + serverVO.getManagementIP());
                                        textArea.append("\n" + serverVO.getOsVersion());
                                        textArea.append("\n" + serverVO.getState());
                                        textArea.append("\n" + serverVO.getOpswLifecycle());
                                        textArea.append("\n");
                                    }
                                }
                     }
                     else {
                                    String filterExpr = "ServerVO.hostname CONTAINS " + target;
                                    Filter filter = new Filter("device",filterExpr);
                                    // Get references to the servers that match the search filter.
                                    ServerRef[] serverRefs = serverSvc.findServerRefs(filter);
                                    //System.out.println(Arrays.toString(serverRefs));

                                    if (serverRefs.length == 0) {
                                        textArea.append("No matching servers found.");
                                    }
                                    // Get the value objects for the server references.
                                    ServerVO[] serverVOs = serverSvc.getServerVOs(serverRefs);
                                    //System.out.println(Arrays.toString(serverVOs));



                                    // Iterate through the server value objects and print some attributes.
                                    for (ServerVO serverVO : serverVOs) {
                                        System.out.println("  " + serverVO.getName());
                                        textArea.append("\n" + serverVO.getName());
                                        textArea.append("\n" + serverVO.getManagementIP());
                                        textArea.append("\n" + serverVO.getOsVersion());
                                        textArea.append("\n" + serverVO.getState());
                                        textArea.append("\n" + serverVO.getOpswLifecycle());
                                        textArea.append("\n");
                                    }
                             }
                     
                }
                catch (RemoteException | AuthorizationException | SearchException | NotFoundException e) {
                    textArea.append("ERROR: Problem validating credentials!!!");
                    System.out.println(e.getMessage());
                }
                
        }
        
        OpswareClient.disconnect();
    }  
         
     
    
    private void portActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void generateBtnMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
          agent.setText("");
    }                                     

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
            java.util.logging.Logger.getLogger(SAWSDLClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SAWSDLClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SAWSDLClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SAWSDLClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SAWSDLClientUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField agent;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField coreServer;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton generateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField port;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField userName;
    // End of variables declaration                   
}
