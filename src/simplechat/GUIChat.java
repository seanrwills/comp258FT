package simplechat;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class GUIChat extends javax.swing.JFrame implements ChatIF {

   //public GUIStart guiStart;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        scrollbar3 = new java.awt.Scrollbar();
        scrollbar4 = new java.awt.Scrollbar();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        fileChooser = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextChat = new javax.swing.JTextField();
        jPanelUsers = new javax.swing.JPanel();
        jLblUsers = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUsers = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstRooms = new javax.swing.JList();
        jBtnSend = new javax.swing.JButton();
        jBtnUpload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuItemChangeUserName = new javax.swing.JMenuItem();
        jMenuMessaging = new javax.swing.JMenu();
        jMenuItemPrivateMessage = new javax.swing.JMenuItem();
        jMenuItemPingChatroom = new javax.swing.JMenuItem();
        jMenuItemPingContact = new javax.swing.JMenuItem();
        jMenuRoom = new javax.swing.JMenu();
        jMenuItemLeave = new javax.swing.JMenuItem();
        jMenuItemNewRoom = new javax.swing.JMenuItem();
        jMenuItemJoinRoom = new javax.swing.JMenuItem();
        jMenuSend = new javax.swing.JMenu();
        jMenuItemBroadcast = new javax.swing.JMenuItem();
        jMenuItemPicture = new javax.swing.JMenuItem();
        jMenuItemFile = new javax.swing.JMenuItem();
        jMenuItemContact = new javax.swing.JMenuItem();
        jMenuItemMyIP = new javax.swing.JMenuItem();
        jMenuItemDicPic = new javax.swing.JMenuItem();
        jMenuItemCoordinates = new javax.swing.JMenuItem();
        jMenuEmoji = new javax.swing.JMenu();
        jMenuItemSendEmoji = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        fileChooser.setDialogTitle("BIS Messenger FIle Upload");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextChat.setToolTipText("Enter message here");
        jTextChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChatActionPerformed(evt);
            }
        });

        jLblUsers.setText("Users");

        lstUsers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstUsers);

        jLabel1.setText("Rooms");

        lstRooms.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstRooms);

        javax.swing.GroupLayout jPanelUsersLayout = new javax.swing.GroupLayout(jPanelUsers);
        jPanelUsers.setLayout(jPanelUsersLayout);
        jPanelUsersLayout.setHorizontalGroup(
            jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsersLayout.createSequentialGroup()
                .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanelUsersLayout.createSequentialGroup()
                        .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUsersLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLblUsers))
                            .addGroup(jPanelUsersLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelUsersLayout.setVerticalGroup(
            jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jBtnSend.setText("Send");
        jBtnSend.setToolTipText("");
        jBtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSendActionPerformed(evt);
            }
        });

        jBtnUpload.setBackground(new java.awt.Color(151, 0, 204));
        jBtnUpload.setForeground(new java.awt.Color(255, 255, 255));
        jBtnUpload.setText("Upload File");
        jBtnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUploadActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jMenuBar.setBackground(new java.awt.Color(151, 0, 204));
        jMenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar.setForeground(new java.awt.Color(102, 51, 255));

        jMenuFile.setForeground(new java.awt.Color(255, 255, 255));
        jMenuFile.setText("File");
        jMenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileActionPerformed(evt);
            }
        });

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemExit);

        jMenuItemChangeUserName.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemChangeUserName.setText("Change User Name");
        jMenuItemChangeUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChangeUserNameActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemChangeUserName);

        jMenuBar.add(jMenuFile);

        jMenuMessaging.setForeground(new java.awt.Color(255, 255, 255));
        jMenuMessaging.setText("Messaging");

        jMenuItemPrivateMessage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPrivateMessage.setText("Private Message");
        jMenuMessaging.add(jMenuItemPrivateMessage);

        jMenuItemPingChatroom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPingChatroom.setText("Ping Chat Room");
        jMenuItemPingChatroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPingChatroomActionPerformed(evt);
            }
        });
        jMenuMessaging.add(jMenuItemPingChatroom);

        jMenuItemPingContact.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPingContact.setText("Ping Contact");
        jMenuItemPingContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPingContactActionPerformed(evt);
            }
        });
        jMenuMessaging.add(jMenuItemPingContact);

        jMenuBar.add(jMenuMessaging);

        jMenuRoom.setForeground(new java.awt.Color(255, 255, 255));
        jMenuRoom.setText("Room");

        jMenuItemLeave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLeave.setText("Leave Room");
        jMenuItemLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLeaveActionPerformed(evt);
            }
        });
        jMenuRoom.add(jMenuItemLeave);

        jMenuItemNewRoom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNewRoom.setText("New Room");
        jMenuItemNewRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewRoomActionPerformed(evt);
            }
        });
        jMenuRoom.add(jMenuItemNewRoom);

        jMenuItemJoinRoom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemJoinRoom.setText("Join Room");
        jMenuItemJoinRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJoinRoomActionPerformed(evt);
            }
        });
        jMenuRoom.add(jMenuItemJoinRoom);

        jMenuBar.add(jMenuRoom);

        jMenuSend.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSend.setText("Send");

        jMenuItemBroadcast.setText("Broadcast");
        jMenuSend.add(jMenuItemBroadcast);

        jMenuItemPicture.setText("Picture");
        jMenuSend.add(jMenuItemPicture);

        jMenuItemFile.setText("File");
        jMenuSend.add(jMenuItemFile);

        jMenuItemContact.setText("Contact");
        jMenuSend.add(jMenuItemContact);

        jMenuItemMyIP.setText("My IP");
        jMenuSend.add(jMenuItemMyIP);

        jMenuItemDicPic.setText("Dick Pic");
        jMenuItemDicPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDicPicActionPerformed(evt);
            }
        });
        jMenuSend.add(jMenuItemDicPic);

        jMenuItemCoordinates.setText("Coordinates");
        jMenuSend.add(jMenuItemCoordinates);

        jMenuBar.add(jMenuSend);

        jMenuEmoji.setForeground(new java.awt.Color(255, 255, 255));
        jMenuEmoji.setText("Emoji");

        jMenuItemSendEmoji.setText("Send Emoji");
        jMenuEmoji.add(jMenuItemSendEmoji);

        jMenuBar.add(jMenuEmoji);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextChat)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSend)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jBtnUpload)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSend)
                    .addComponent(jBtnUpload))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextChatActionPerformed

    private void jMenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileActionPerformed
     
    }//GEN-LAST:event_jMenuFileActionPerformed

    private void jMenuItemLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLeaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLeaveActionPerformed

    private void jBtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSendActionPerformed
        send(jTextChat.getText()+"\n");
    }//GEN-LAST:event_jBtnSendActionPerformed
//Upload button click event
    private void jBtnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUploadActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        String fileLocation = fileChooser.getSelectedFile().toString();
        String destination = JOptionPane.showInputDialog("Enter receiver name:");
            send("#receiveFile "+fileLocation+" "+destination);
            
        }
    }//GEN-LAST:event_jBtnUploadActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        client.sendCommandToServer("#quit");
        client.quit();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
            client.sendCommandToServer("#quit");
            client.quit();
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemNewRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewRoomActionPerformed
       
           String roomName = JOptionPane.showInputDialog("Enter new room name:");
            client.sendCommandToServer("#join " + roomName);
    }//GEN-LAST:event_jMenuItemNewRoomActionPerformed

    private void jMenuItemJoinRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJoinRoomActionPerformed
        
        String roomName = JOptionPane.showInputDialog("Enter room name to join:");
        client.sendCommandToServer("#join " + roomName);
    }//GEN-LAST:event_jMenuItemJoinRoomActionPerformed

    private void jMenuItemChangeUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChangeUserNameActionPerformed
        String newUserName = JOptionPane.showInputDialog("Enter new user name:");
        client.sendCommandToServer("#setUser " + newUserName);
    }//GEN-LAST:event_jMenuItemChangeUserNameActionPerformed

    private void jMenuItemPingChatroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPingChatroomActionPerformed
       
        client.sendCommandToServer("#ping");

        
    }//GEN-LAST:event_jMenuItemPingChatroomActionPerformed

    private void jMenuItemDicPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDicPicActionPerformed
        JOptionPane.showMessageDialog(null, "You're selfish and disgusting", "Put that away!", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(rootPane, evt);
    }//GEN-LAST:event_jMenuItemDicPicActionPerformed

    private void jMenuItemPingContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPingContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPingContactActionPerformed


    final public static int DEFAULT_PORT = 5555;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JFileChooser fileChooser;
    javax.swing.JButton jBtnSend;
    javax.swing.JButton jBtnUpload;
    javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLblUsers;
    javax.swing.JList jList1;
    javax.swing.JMenuBar jMenuBar;
    javax.swing.JMenu jMenuEmoji;
    javax.swing.JMenu jMenuFile;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JMenuItem jMenuItemBroadcast;
    javax.swing.JMenuItem jMenuItemChangeUserName;
    javax.swing.JMenuItem jMenuItemContact;
    javax.swing.JMenuItem jMenuItemCoordinates;
    javax.swing.JMenuItem jMenuItemDicPic;
    javax.swing.JMenuItem jMenuItemExit;
    javax.swing.JMenuItem jMenuItemFile;
    javax.swing.JMenuItem jMenuItemJoinRoom;
    javax.swing.JMenuItem jMenuItemLeave;
    javax.swing.JMenuItem jMenuItemMyIP;
    javax.swing.JMenuItem jMenuItemNewRoom;
    javax.swing.JMenuItem jMenuItemPicture;
    javax.swing.JMenuItem jMenuItemPingChatroom;
    javax.swing.JMenuItem jMenuItemPingContact;
    javax.swing.JMenuItem jMenuItemPrivateMessage;
    javax.swing.JMenuItem jMenuItemSendEmoji;
    javax.swing.JMenu jMenuMessaging;
    javax.swing.JMenu jMenuRoom;
    javax.swing.JMenu jMenuSend;
    javax.swing.JPanel jPanelUsers;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JTextField jTextChat;
    javax.swing.JList lstRooms;
    javax.swing.JList lstUsers;
    java.awt.Scrollbar scrollbar3;
    java.awt.Scrollbar scrollbar4;
    javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
    private ChatClient client;
 
    
    public GUIChat() {
        initComponents();
    }

    public GUIChat(String host, int port, String user){
        initComponents();
        setVisible(true);
        

        try 
        {
            client = new ChatClient(host, port, this, user);
        } 
        catch(IOException exception) 
        {
            System.out.println("Error: Can't setup connection!"
                + " Terminating client.");
            System.exit(1);
        }
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        String host = "";
        int port = 0;
        String user = "";
        //String host = JOptionPane.showInputDialog("Enter Ip Address of Server");
        //The port number
        
        try
        {
            user = JOptionPane.showInputDialog("Enter user name: ");
        }
        catch(Exception e)
        {
            user = args[2];
            e.printStackTrace();
        }
        
        try
        {
            host = "127.0.0.1";
        }
        catch(Exception e)
        {
           e.printStackTrace(); 
        }
                
        try
        {
            port = 5555;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
//        try {
//            host = args[0];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            host ="localhost";
//        }
//        
//        try {
//            port = Integer.parseInt(args[1]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            port=DEFAULT_PORT;
//        }
//        
//        try {
//            user = args[2];
//        } catch (Exception e) {
//            user = "guest";
//        }

        GUIChat gc = new GUIChat(host, port, user);
        
        gc.setTitle("BIS Messenger        User: "+user+"           Room: ");
    }
   
    @Override
    public void display(String message) {
        textArea.insert(message, 0);
    }
    
    public void displayUserList(String[] userList) {
        
        DefaultListModel model = new DefaultListModel();
        for(int i=0; i< userList.length;i++){
            model.addElement(userList[i]);
            System.out.println("Adding users " +userList[i]);
        }
        
        
        System.out.println("Adding users");
        lstUsers.setModel(model);
        
    }
    
    public void displayRoomList(String[] roomList) {
        
        DefaultListModel model = new DefaultListModel();
        for(int i=0; i< roomList.length;i++){
            if(!model.contains(roomList[i])){
                model.addElement(roomList[i]);
                System.out.println("Adding users " +roomList[i]);
            }  
        }

        System.out.println("Adding users");
        lstRooms.setModel(model); 
    }
    
    public void send(String msg){
        client.handleMessageFromClientUI(msg);
    }
  
}
