import javax.swing.*;

class main{
  public static void main(String []args){
    JFrame frm=new JFrame("Login");
    frm.setVisible(true);
    frm.setSize(700,500);
    frm.setLayout(null);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label1=new JLabel("Welcome to Ethical Hacking Lab");
    label1.setVisible(true);
    label1.setBounds(250, 50, 200, 20);
    frm.add(label1);

    JLabel label2=new JLabel("Username");
    label2.setVisible(true);
    label2.setBounds(250, 150, 100, 20);
    frm.add(label2);

    JTextField text1=new JTextField();
    text1.setVisible(true);
    text1.setBounds(320, 150, 100, 20);
    frm.add(text1);

    JLabel label3=new JLabel("Password");
    label3.setVisible(true);
    label3.setBounds(250, 200, 100, 20);
    frm.add(label3);

    JTextField text2=new JTextField();
    text2.setVisible(true);
    text2.setBounds(320, 200, 100, 20);
    frm.add(text2);

    JButton btn=new JButton("Login");
    btn.setVisible(true);
    btn.setBounds(270,250,100,20);
    frm.add(btn);

    JLabel label4=new JLabel("");
    label4.setVisible(true);
    label4.setBounds(220, 300, 250, 40);
    frm.add(label4);

    btn.addActionListener(e->{
      
      String user=text1.getText();
      String password=text2.getText();

      if(user.equals("admin")&& password.equals("admin")){
        label4.setText("Congratulations, Login Successfully!");
      }
      else{
        label4.setText("Sorry, Try Again!");
      }
    });
  }
}
