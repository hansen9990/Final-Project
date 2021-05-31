import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame{
    public MainMenu(){
        setTitle("Boba-Cool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        //setSize(200,200);

        JPanel paneljudul = new JPanel(new BorderLayout());
        paneljudul.setPreferredSize(new Dimension(500, 100));
        //paneljudul.setBackground(Color.red);


        JPanel panelbutton = new JPanel(new GridLayout(0,1,20,20));
        panelbutton.setPreferredSize(new Dimension(500 , 300));
        //panelbutton.setBackground(Color.blue);


        JButton insert = new JButton();
        insert.setText("Insert");
        insert.setPreferredSize(new Dimension(150 , 75));
        insert.setFocusable(false);
        insert.setFont(new Font(null,Font.BOLD, 38));
        panelbutton.add(insert);

        JButton view = new JButton();
        view.setText("view");
        view.setPreferredSize(new Dimension(150 , 75));
        view.setFocusable(false);
        view.setFont(new Font(null,Font.BOLD, 38));
        panelbutton.add(view);

        JButton delete = new JButton();
        delete.setText("delete");
        delete.setPreferredSize(new Dimension(150 , 75));
        delete.setFocusable(false);
        delete.setFont(new Font(null,Font.BOLD, 38));
        panelbutton.add(delete);

        JButton update = new JButton();
        update.setText("update");
        update.setPreferredSize(new Dimension(150 , 75));
        update.setFocusable(false);
        update.setFont(new Font(null,Font.BOLD, 38));
        panelbutton.add(update);



        JLabel label = new JLabel();
        label.setText("Boba Cool");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font(null,Font.BOLD, 24));
        paneljudul.add(label);
        
        add(paneljudul,BorderLayout.NORTH);
        add(panelbutton, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
 
}