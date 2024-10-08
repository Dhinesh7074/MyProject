package pc_remote;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
/*

I think you're a bit happy now.Fine, you'll have to note that the maximum time that you can make your PC wait for shutdown is 10 years, if you want more than that..... nothing, simply go send a feedback to Microsoft about it, they can do if they wish to, but have a valid reason for the claim ;)

More..

r.exec("shutdown -l"); for logging off, you can also add timer for it, as usual. If you wish to abort system being shutdown then, r.exec("shutdown -a"); this prevents your system from being shutdown.

To turn off PC without warning, then r.exec("shutdown -s -p");

To hibernate a PC, then r.exec("shutdown -h"); you can also use timer for this, not only for this, for any shutdown related operation you want to perform, you can use this option.*/

public class PC_Remote extends JFrame implements ActionListener
{
    JPanel panel=new JPanel();
    JButton jb;
    Date date,date1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Desktop desktop = Desktop.getDesktop();
    SimpleDateFormat sdf=new SimpleDateFormat();
    JLabel label=new JLabel("Prepared by A.M.Dhinesh...");
    
    PC_Remote()
    {
        super("Project on a Computer Remote");
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
       // panel.setForeground(Color.BLACK);
        add(panel);
        setSize(500, 580);
        setVisible(true);
        setResizable(false);
        add_Component();
        
    }
  
    void add_Component()
    {
        date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String s=sdf.format(date);
        jb=new JButton(s);
        jb.setBounds(40, 50, 130, 70);
        panel.add(jb);
        add(panel);
        
        
        b1=new JButton("C-Drive");
        b1.addActionListener(this);
        b1.setBounds(180, 50, 130, 70);
        panel.add(b1);
        add(panel);
        
        b2=new JButton("D-Drive");
        b2.addActionListener(this);
        b2.setBounds(320, 50, 135, 70);
        panel.add(b2);
        add(panel);
        
        b3=new JButton("E-Drive");
        b3.addActionListener(this);
        b3.setBounds(40, 140, 130, 70);
        panel.add(b3);
        add(panel);
        
        b4=new JButton("F-Drive");
        b4.addActionListener(this);
        b4.setBounds(180, 140, 130, 70);
        panel.add(b4);
        add(panel);
        
        b5=new JButton("G-Drive");
        b5.addActionListener(this);
        b5.setBounds(320, 140, 135, 70);
        panel.add(b5);
        add(panel);
        
        b6=new JButton("Re-start");
        b6.addActionListener(this);
        b6.setBounds(40, 230, 130, 70);
        panel.add(b6);
        add(panel);
        
        b7=new JButton("Shut-down");
        b7.addActionListener(this);
        b7.setBounds(180, 230, 130, 70);
        panel.add(b7);
        add(panel);
        
        date1=new Date();
        SimpleDateFormat sdf2=new SimpleDateFormat("hh/MMMM/YYYY");
        String s3=sdf2.format(date1);
        b8=new JButton(s3);
        b8.addActionListener(this);
        b8.setBounds(320,230, 135, 70);
        panel.add(b8);
        add(panel);
        
        b9=new JButton("SHUT-DOWN PC SETTING TIME");
        b9.addActionListener(this);
        b9.setBounds(40, 310, 415, 70);
        panel.add(b9);
        add(panel);
        
        b10=new JButton("RE-START PC SETTING TIME");
        b10.addActionListener(this);
        b10.setBounds(40, 390, 415, 70);
        panel.add(b10);
        add(panel);
        
        label.setBounds(140, 480, 400, 70);
        panel.add(label);
        add(panel);
        
        
        
        
    }
    public static void main(String args[])
    {
        PC_Remote ob1=new PC_Remote();
        
    }
 
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            try{
                
                File dirToOpen = new File("C:");
                desktop.open(dirToOpen);
                
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }
        }
        if(e.getSource()==b2)
        {
            try{
                File fd=new File("D:");
                desktop.open(fd);
                
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive D");
            }
        }
       if(e.getSource()==b3)
        {
            try{
                File fe=new File("E:");
                desktop.open(fe);
                
            }
            catch(Exception e3)
            {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive E");
            }
        } 
       if(e.getSource()==b4)
        {
            try{
                File ff=new File("F:");
                desktop.open(ff);
                
            }
            catch(Exception e4)
            {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive F");
            }
        } 
       if(e.getSource()==b5)
        {
            try{
                File fg=new File("G:");
                desktop.open(fg);
                
            }
            catch(Exception e5)
            {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive G");
            }
        } 
       if(e.getSource()==b6)
       {
           try{
               
               Runtime rt=Runtime.getRuntime();
               Process proc=rt.exec("shutdown -r -t 1");
               
           }
           catch(Exception e6)
           {
               JOptionPane.showMessageDialog(null, "Not Valid!!!");
           }
       }
       if(e.getSource()==b7)
       {
           try{
               
               Runtime rt=Runtime.getRuntime();
               Process proc=rt.exec("shutdown -s -t 1");
               
           }
           catch(Exception e6)
           {
               JOptionPane.showMessageDialog(null, "Not Valid!!!");
           }
       }
        if(e.getSource()==b7)
       {
           try{
               
               Runtime rt=Runtime.getRuntime();
               Process proc=rt.exec("shutdown -s -t");
               
           }
           catch(Exception e6)
           {
               JOptionPane.showMessageDialog(null, "Not Valid!!!");
           }
       }
       if(e.getSource()==b9)
       {
           shut_down ob=new shut_down();
           dispose();
           
       }
       if(e.getSource()==b10)
       {
           re_start ob=new re_start();
           dispose();        
       }      
    }   
}



