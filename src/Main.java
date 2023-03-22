import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");


        JLabel label = new JLabel("welcome to login page");



        JTextField username = new JTextField("Enter username");
        JTextField address = new JTextField("Enter Address");
        JButton loginBtn = new JButton("login");
        String[] country = {"Nepal", " china","usa","australia"};
        JComboBox comboBox = new JComboBox(country);



        username.setBounds(10,40,200,50);
        address.setBounds(10,90,200,50);
        loginBtn.setBounds(10,130,200,50);
        label.setBounds(10,20,200,20);
        comboBox.setBounds(10,200,200,50);




        frame.add(username);
        frame.add(address);
        frame.add(loginBtn);
        frame.add(label);
        frame.add(comboBox);


        //frame work here
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}