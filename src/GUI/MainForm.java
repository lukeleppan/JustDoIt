/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MANAGER.Validator;
import MANAGER.HashPassword;
import MANAGER.UserManager;
import java.awt.CardLayout;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Luke Leppan
 */
public class MainForm extends javax.swing.JFrame {

  /**
   * Creates new form MainForm
   */
  CardLayout cardLayout;

  public MainForm() {
    initComponents();

    this.setLocationRelativeTo(null);
    cardLayout = (CardLayout) (MainPanel.getLayout());
  }

  private int calcPassScore(String password) {
    int score = 0;

    //Calc Score
    Pattern upperRegex = Pattern.compile("[A-Z]");
    Pattern lowerRegex = Pattern.compile("[a-z]");
    Pattern numberRegex = Pattern.compile("[0-9]");
    Pattern specialRegex = Pattern.compile(".[!,@,#,$,%,^,&,*,?,_,~,-,£,(,)]");
    int minLength = 8;

    Matcher matcher1 = upperRegex.matcher(password);
    if (matcher1.find()) {
      score++;
    }

    Matcher matcher2 = lowerRegex.matcher(password);
    if (matcher2.find()) {
      score++;
    }

    Matcher matcher3 = numberRegex.matcher(password);
    if (matcher3.find()) {
      score++;
    }

    Matcher matcher4 = specialRegex.matcher(password);
    if (matcher4.find()) {
      score++;
    }

    if (score < 3) {
      score--;
    }

    if (password.length() > minLength) {
      score += Math.floor((password.length() - minLength) / 2);
    }

    if (password.length() < minLength) {
      score = 0;
    }

    return score;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    MainPanel = new javax.swing.JPanel();
    InitialPanel = new javax.swing.JPanel();
    InitTitlePNL = new javax.swing.JPanel();
    Welcome1Text = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    SignUpButton = new javax.swing.JButton();
    SignInButtonPNL = new javax.swing.JButton();
    RegisterPanel = new javax.swing.JPanel();
    RegPNL = new javax.swing.JPanel();
    UsernameText1 = new javax.swing.JLabel();
    UsernameFieldRegPNL = new javax.swing.JTextField();
    UsernameText3 = new javax.swing.JLabel();
    EmailField = new javax.swing.JTextField();
    UsernameText4 = new javax.swing.JLabel();
    UsernameText5 = new javax.swing.JLabel();
    SurnameField = new javax.swing.JTextField();
    FirstNameField = new javax.swing.JTextField();
    UsernameText6 = new javax.swing.JLabel();
    UsernameText7 = new javax.swing.JLabel();
    DOBPicker = new org.jdesktop.swingx.JXDatePicker();
    PasswordFieldRegPNL = new javax.swing.JPasswordField();
    SignUpButtonRegPNL = new javax.swing.JButton();
    ErrorTextRegPNL = new javax.swing.JLabel();
    LoginInsteadButtonRegPNL = new javax.swing.JButton();
    UsernameText8 = new javax.swing.JLabel();
    RepeatedPasswordField = new javax.swing.JPasswordField();
    PasswordStrength = new javax.swing.JProgressBar();
    PassStrengthText = new javax.swing.JLabel();
    LoginPanel = new javax.swing.JPanel();
    LogPNL = new javax.swing.JPanel();
    SignInButtonLogPNL = new javax.swing.JButton();
    UsernameText = new javax.swing.JLabel();
    UsernameField = new javax.swing.JTextField();
    UsernameText2 = new javax.swing.JLabel();
    PasswordField = new javax.swing.JPasswordField();
    ErrorText = new javax.swing.JLabel();
    SignUpInsteadButtonLogPNL = new javax.swing.JButton();
    ProjectView = new javax.swing.JScrollPane();
    MenuBar = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Just Do It");
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setResizable(false);

    MainPanel.setLayout(new java.awt.CardLayout());

    Welcome1Text.setFont(new java.awt.Font("Fredoka One", 1, 36)); // NOI18N
    Welcome1Text.setText("Just Do It");

    jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jLabel1.setText("Project Manager");

    javax.swing.GroupLayout InitTitlePNLLayout = new javax.swing.GroupLayout(InitTitlePNL);
    InitTitlePNL.setLayout(InitTitlePNLLayout);
    InitTitlePNLLayout.setHorizontalGroup(
      InitTitlePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InitTitlePNLLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Welcome1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(94, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InitTitlePNLLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(47, 47, 47))
    );
    InitTitlePNLLayout.setVerticalGroup(
      InitTitlePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InitTitlePNLLayout.createSequentialGroup()
        .addComponent(Welcome1Text)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addContainerGap())
    );

    SignUpButton.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    SignUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/icons8-add-user-male-24.png"))); // NOI18N
    SignUpButton.setText("Sign up");
    SignUpButton.setToolTipText("Click To Sign up");
    SignUpButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SignUpButtonActionPerformed(evt);
      }
    });

    SignInButtonPNL.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    SignInButtonPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/icons8-login-rounded-26.png"))); // NOI18N
    SignInButtonPNL.setText("Sign in");
    SignInButtonPNL.setToolTipText("Click To Sign in");
    SignInButtonPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SignInButtonPNLActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SignInButtonPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(73, 73, 73))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(SignInButtonPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 16, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout InitialPanelLayout = new javax.swing.GroupLayout(InitialPanel);
    InitialPanel.setLayout(InitialPanelLayout);
    InitialPanelLayout.setHorizontalGroup(
      InitialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InitialPanelLayout.createSequentialGroup()
        .addContainerGap(241, Short.MAX_VALUE)
        .addGroup(InitialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(InitialPanelLayout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(15, 15, 15))
          .addComponent(InitTitlePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(219, 219, 219))
    );
    InitialPanelLayout.setVerticalGroup(
      InitialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InitialPanelLayout.createSequentialGroup()
        .addGap(148, 148, 148)
        .addComponent(InitTitlePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(191, Short.MAX_VALUE))
    );

    MainPanel.add(InitialPanel, "InitialPanel");

    RegPNL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign Up", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 20))); // NOI18N
    RegPNL.setNextFocusableComponent(UsernameFieldRegPNL);

    UsernameText1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText1.setLabelFor(UsernameField);
    UsernameText1.setText("Username");

    UsernameFieldRegPNL.setNextFocusableComponent(EmailField);

    UsernameText3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText3.setLabelFor(EmailField);
    UsernameText3.setText("Email");

    EmailField.setNextFocusableComponent(DOBPicker);

    UsernameText4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText4.setLabelFor(PasswordFieldRegPNL);
    UsernameText4.setText("Password");

    UsernameText5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText5.setLabelFor(SurnameField);
    UsernameText5.setText("Surname");

    SurnameField.setNextFocusableComponent(UsernameFieldRegPNL);

    FirstNameField.setNextFocusableComponent(SurnameField);

    UsernameText6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText6.setLabelFor(FirstNameField);
    UsernameText6.setText("First Name");

    UsernameText7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText7.setLabelFor(DOBPicker);
    UsernameText7.setText("Date Of Birth");

    DOBPicker.setNextFocusableComponent(PasswordFieldRegPNL);

    PasswordFieldRegPNL.setNextFocusableComponent(RepeatedPasswordField);
    PasswordFieldRegPNL.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        PasswordFieldRegPNLMouseClicked(evt);
      }
    });
    PasswordFieldRegPNL.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
      }
      public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
        PasswordFieldRegPNLInputMethodTextChanged(evt);
      }
    });
    PasswordFieldRegPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        PasswordFieldRegPNLActionPerformed(evt);
      }
    });
    PasswordFieldRegPNL.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        PasswordFieldRegPNLPropertyChange(evt);
      }
    });
    PasswordFieldRegPNL.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        PasswordFieldRegPNLKeyPressed(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        PasswordFieldRegPNLKeyTyped(evt);
      }
    });

    SignUpButtonRegPNL.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    SignUpButtonRegPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/icons8-add-user-male-24.png"))); // NOI18N
    SignUpButtonRegPNL.setText("Sign up");
    SignUpButtonRegPNL.setToolTipText("Click To Sign up");
    SignUpButtonRegPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SignUpButtonRegPNLActionPerformed(evt);
      }
    });

    ErrorTextRegPNL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ErrorTextRegPNL.setForeground(new java.awt.Color(255, 0, 51));
    ErrorTextRegPNL.setAutoscrolls(true);
    ErrorTextRegPNL.setFocusable(false);

    LoginInsteadButtonRegPNL.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    LoginInsteadButtonRegPNL.setText("Login Instead");
    LoginInsteadButtonRegPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginInsteadButtonRegPNLActionPerformed(evt);
      }
    });

    UsernameText8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText8.setLabelFor(RepeatedPasswordField);
    UsernameText8.setText("Confirm Password");

    RepeatedPasswordField.setNextFocusableComponent(SignUpButtonRegPNL);
    RepeatedPasswordField.setOpaque(false);

    PassStrengthText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    PassStrengthText.setLabelFor(PasswordStrength);
    PassStrengthText.setText("Password Strength");

    javax.swing.GroupLayout RegPNLLayout = new javax.swing.GroupLayout(RegPNL);
    RegPNL.setLayout(RegPNLLayout);
    RegPNLLayout.setHorizontalGroup(
      RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(RegPNLLayout.createSequentialGroup()
        .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addGap(147, 147, 147)
            .addComponent(LoginInsteadButtonRegPNL)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(SignUpButtonRegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(ErrorTextRegPNL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(RegPNLLayout.createSequentialGroup()
                .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(UsernameText3)
                  .addComponent(UsernameText1)
                  .addComponent(UsernameText5)
                  .addComponent(UsernameText6)
                  .addComponent(UsernameFieldRegPNL)
                  .addComponent(SurnameField)
                  .addComponent(FirstNameField)
                  .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsernameText8)
                    .addComponent(UsernameText4)
                    .addComponent(UsernameText7)
                    .addComponent(DOBPicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordFieldRegPNL)
                    .addComponent(RepeatedPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(PasswordStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(PassStrengthText))))))
        .addContainerGap(45, Short.MAX_VALUE))
    );
    RegPNLLayout.setVerticalGroup(
      RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(RegPNLLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addComponent(UsernameText6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(UsernameText5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(UsernameText1))
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addComponent(UsernameText7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(DOBPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(UsernameText4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(PasswordFieldRegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(PassStrengthText)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addComponent(UsernameFieldRegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(UsernameText3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(RegPNLLayout.createSequentialGroup()
            .addComponent(PasswordStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UsernameText8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(RepeatedPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(ErrorTextRegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(RegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(LoginInsteadButtonRegPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SignUpButtonRegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(32, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
    RegisterPanel.setLayout(RegisterPanelLayout);
    RegisterPanelLayout.setHorizontalGroup(
      RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
        .addContainerGap(99, Short.MAX_VALUE)
        .addComponent(RegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(92, 92, 92))
    );
    RegisterPanelLayout.setVerticalGroup(
      RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(RegisterPanelLayout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(RegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );

    MainPanel.add(RegisterPanel, "RegisterPanel");

    LogPNL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign In", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 20))); // NOI18N

    SignInButtonLogPNL.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    SignInButtonLogPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/icons8-login-rounded-26.png"))); // NOI18N
    SignInButtonLogPNL.setText("Sign in");
    SignInButtonLogPNL.setToolTipText("Click To Sign in");
    SignInButtonLogPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SignInButtonLogPNLActionPerformed(evt);
      }
    });

    UsernameText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText.setText("Username");

    UsernameText2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
    UsernameText2.setText("Password");

    ErrorText.setForeground(new java.awt.Color(255, 0, 51));

    SignUpInsteadButtonLogPNL.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
    SignUpInsteadButtonLogPNL.setText("Sign Up Instead");
    SignUpInsteadButtonLogPNL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SignUpInsteadButtonLogPNLActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout LogPNLLayout = new javax.swing.GroupLayout(LogPNL);
    LogPNL.setLayout(LogPNLLayout);
    LogPNLLayout.setHorizontalGroup(
      LogPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LogPNLLayout.createSequentialGroup()
        .addGap(86, 86, 86)
        .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogPNLLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(LogPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(PasswordField)
          .addComponent(UsernameField)
          .addGroup(LogPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(LogPNLLayout.createSequentialGroup()
              .addComponent(SignUpInsteadButtonLogPNL)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(SignInButtonLogPNL))
            .addComponent(UsernameText2, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsernameText, javax.swing.GroupLayout.Alignment.LEADING)))
        .addGap(39, 39, 39))
    );
    LogPNLLayout.setVerticalGroup(
      LogPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LogPNLLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(UsernameText)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(UsernameText2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(LogPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(SignInButtonLogPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SignUpInsteadButtonLogPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(266, 266, 266)
        .addComponent(ErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
    LoginPanel.setLayout(LoginPanelLayout);
    LoginPanelLayout.setHorizontalGroup(
      LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LoginPanelLayout.createSequentialGroup()
        .addGap(182, 182, 182)
        .addComponent(LogPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(226, Short.MAX_VALUE))
    );
    LoginPanelLayout.setVerticalGroup(
      LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LoginPanelLayout.createSequentialGroup()
        .addGap(75, 75, 75)
        .addComponent(LogPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(193, Short.MAX_VALUE))
    );

    MainPanel.add(LoginPanel, "LoginPanel");
    MainPanel.add(ProjectView, "ProjectView");

    jMenu1.setText("File");
    MenuBar.add(jMenu1);

    jMenu2.setText("Edit");
    MenuBar.add(jMenu2);

    setJMenuBar(MenuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
    cardLayout.show(MainPanel, "RegisterPanel");
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void SignInButtonPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonPNLActionPerformed
    cardLayout.show(MainPanel, "LoginPanel");
    }//GEN-LAST:event_SignInButtonPNLActionPerformed

        private void SignInButtonLogPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonLogPNLActionPerformed
    // TODO
        }//GEN-LAST:event_SignInButtonLogPNLActionPerformed

        private void SignUpInsteadButtonLogPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpInsteadButtonLogPNLActionPerformed
    cardLayout.show(MainPanel, "RegisterPanel");
        }//GEN-LAST:event_SignUpInsteadButtonLogPNLActionPerformed

        private void SignUpButtonRegPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonRegPNLActionPerformed
    ErrorTextRegPNL.setText("");
    String firstname = FirstNameField.getText();
    String surname = SurnameField.getText();
    String username = UsernameFieldRegPNL.getText();
    String email = EmailField.getText();
    Date DOB = DOBPicker.getDate();
    char[] password = PasswordFieldRegPNL.getPassword();
    char[] repeatPassword = RepeatedPasswordField.getPassword();

    char[] tempPassword = PasswordFieldRegPNL.getPassword();
    String passwordStr = "";

    for (int i = 0; i < tempPassword.length; i++) {
      passwordStr = passwordStr + tempPassword[i];
    }

    int passScore = calcPassScore(passwordStr);

    Validator validator = new Validator(firstname, surname, username, email, DOB, password, repeatPassword, passScore);
    String errorText = "";

    UserManager userManager = new UserManager();

    if (!validator.validateFirstname()) {
      errorText = "Please Enter your First Name.";
    } else if (!validator.validateFirstnameLength()) {
      errorText = "First Name is too long. Must be 100 or less characters.";
    } else if (!validator.validateSurname()) {
      errorText = "Please Enter your Surname.";
    } else if (!validator.validateSurnameLength()) {
      errorText = "Surname is too long. Must be 100 or less characters.";
    } else if (!validator.validateUsername()) {
      errorText = "Username does not follow correct format. Check the help for more information.";
    } else if (!validator.validateUsernameLength()) {
      errorText = "Username is too long. Must be 25 or less characters.";
    } else if (!validator.validateEmail()) {
      errorText = "Not a valid Email";
    } else if (!validator.validateEmailLength()) {
      errorText = "Email is too long. Must be 255 or less characters.";
    } else if (!validator.validateDOB()) {
      errorText = "Please Select your date of Birth.";
    } else if (!validator.validateDOBLogic()) {
      errorText = "Date of birth is in the future.";
    } else if (!validator.validatePasswordMatch()) {
      errorText = "Passwords do not match.";
    } else if (!validator.validatePasswordLength()) {
      errorText = "Password is too short. Must be greater than 8 characters.";
    } else if (!validator.validatePasswordStrength()) {
      errorText = "Your password is not strong enough. Try adding numbers or special charaters.";
    } else if (userManager.CheckForUser(username)) {
      errorText = "Username is already taken.";
    }

    ErrorTextRegPNL.setText(errorText);

        }//GEN-LAST:event_SignUpButtonRegPNLActionPerformed

        private void LoginInsteadButtonRegPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginInsteadButtonRegPNLActionPerformed
    cardLayout.show(MainPanel, "LoginPanel");
        }//GEN-LAST:event_LoginInsteadButtonRegPNLActionPerformed

  private void PasswordFieldRegPNLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_PasswordFieldRegPNLMouseClicked

  private void PasswordFieldRegPNLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLKeyTyped
    char[] tempPassword = PasswordFieldRegPNL.getPassword();
    String password = "";

    for (int i = 0; i < tempPassword.length; i++) {
      password = password + tempPassword[i];
    }

    password = password + evt.getKeyChar();

    int score = calcPassScore(password);

    if (score == 0) {
      PasswordStrength.setValue(5);
    } else if (score < 3) {
      PasswordStrength.setValue(20);
    } else if (score < 4) {
      PasswordStrength.setValue(50);
    } else if (score < 6) {
      PasswordStrength.setValue(70);
    } else {
      PasswordStrength.setValue(100);
    }

  }//GEN-LAST:event_PasswordFieldRegPNLKeyTyped

  private void PasswordFieldRegPNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_PasswordFieldRegPNLActionPerformed

  private void PasswordFieldRegPNLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLKeyPressed

  }//GEN-LAST:event_PasswordFieldRegPNLKeyPressed

  private void PasswordFieldRegPNLInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLInputMethodTextChanged

  }//GEN-LAST:event_PasswordFieldRegPNLInputMethodTextChanged

  private void PasswordFieldRegPNLPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PasswordFieldRegPNLPropertyChange

  }//GEN-LAST:event_PasswordFieldRegPNLPropertyChange

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
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.jdesktop.swingx.JXDatePicker DOBPicker;
  private javax.swing.JTextField EmailField;
  private javax.swing.JLabel ErrorText;
  private javax.swing.JLabel ErrorTextRegPNL;
  private javax.swing.JTextField FirstNameField;
  private javax.swing.JPanel InitTitlePNL;
  private javax.swing.JPanel InitialPanel;
  private javax.swing.JPanel LogPNL;
  private javax.swing.JButton LoginInsteadButtonRegPNL;
  private javax.swing.JPanel LoginPanel;
  private javax.swing.JPanel MainPanel;
  private javax.swing.JMenuBar MenuBar;
  private javax.swing.JLabel PassStrengthText;
  private javax.swing.JPasswordField PasswordField;
  private javax.swing.JPasswordField PasswordFieldRegPNL;
  private javax.swing.JProgressBar PasswordStrength;
  private javax.swing.JScrollPane ProjectView;
  private javax.swing.JPanel RegPNL;
  private javax.swing.JPanel RegisterPanel;
  private javax.swing.JPasswordField RepeatedPasswordField;
  private javax.swing.JButton SignInButtonLogPNL;
  private javax.swing.JButton SignInButtonPNL;
  private javax.swing.JButton SignUpButton;
  private javax.swing.JButton SignUpButtonRegPNL;
  private javax.swing.JButton SignUpInsteadButtonLogPNL;
  private javax.swing.JTextField SurnameField;
  private javax.swing.JTextField UsernameField;
  private javax.swing.JTextField UsernameFieldRegPNL;
  private javax.swing.JLabel UsernameText;
  private javax.swing.JLabel UsernameText1;
  private javax.swing.JLabel UsernameText2;
  private javax.swing.JLabel UsernameText3;
  private javax.swing.JLabel UsernameText4;
  private javax.swing.JLabel UsernameText5;
  private javax.swing.JLabel UsernameText6;
  private javax.swing.JLabel UsernameText7;
  private javax.swing.JLabel UsernameText8;
  private javax.swing.JLabel Welcome1Text;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JPanel jPanel3;
  // End of variables declaration//GEN-END:variables
}
