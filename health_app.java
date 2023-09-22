import javax.swing.*;
import java.awt.*;

public class health_app {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Health App");
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp=new JTabbedPane(); 

        // Sets the size of each tab or JPanel
        tp.setBounds(0,0,375,667);  

        // Adds the tabs to the gui window
        tp.add(new JScrollPane(Tab1()), "Text");
        tp.add(Tab2(), "Choices");
        tp.add(Tab3(), "ToDo");
        tp.add(Tab4(), "Profile");
        tp.add(Tab5(), "Colors");
        tp.add(Tab6(), "Lower Right");

        // Formatting of the gui window "frame"
        frame.add(tp);  
        frame.setSize(375, 667);  
        frame.setLayout(null);  
        frame.setVisible(true);  
    
    } 
    
    public static Component Tab1() {
        JPanel tab1=new JPanel();  
        JTextArea outputTextArea = new JTextArea(5, 20);

        outputTextArea.setText(
            "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
            "Vestibulum vitae velit eu elit tempus cursus. \n" +
            "Nulla facilisi. \n" +
            "Sed sagittis dui id ligula vehicula, eu tempus  \n" +
            "Nunc at aliquam nulla. \n" +
            "Etiam at turpis sit amet nulla hendrerit blandit. \n" +
            "Sed a eros vitae est tincidunt vehicula vel at purus. \n" +
            "Nunc ut ligula in libero fringilla mattis vel a est. \n" +
            "Praesent dignissim velit sit amet libero semper, \n" +
            "Suspendisse in sapien a libero volutpat  \n" +
            "Donec consequat tellus et neque vestibulum  \n" +
            "Fusce ultricies ligula id ligula venenat \n" +
            "Cras vel sapien eget urna dignissim venena\n" +
            "Donec consequat tellus et neque vestibul\n" +
            "Fusce ultricies ligula id ligula venen\n " +
            "Cras vel sapien eget urna dignissim \n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
            "Vestibulum vitae velit eu elit tempus cursus. \n" +
            "Nulla facilisi. \n" +
            "Sed sagittis dui id ligula vehicula, eu tempus  \n" +
            "Nunc at aliquam nulla. \n" +
            "Etiam at turpis sit amet nulla hendrerit blandit. \n" +
            "Sed a eros vitae est tincidunt vehicula vel at purus. \n" +
            "Nunc ut ligula in libero fringilla mattis vel a est. \n" +
            "Praesent dignissim velit sit amet libero semper, \n" +
            "Suspendisse in sapien a libero volutpat  \n" +
            "Donec consequat tellus et neque vestibulum  \n" +
            "Fusce ultricies ligula id ligula venenat \n" +
            "Cras vel sapien eget urna dignissim venena\n" +
            "Donec consequat tellus et neque vestibul\n" +
            "Fusce ultricies ligula id ligula venen\n " +
            "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
            "Vestibulum vitae velit eu elit tempus cursus. \n" +
            "Nulla facilisi. \n" +
            "Sed sagittis dui id ligula vehicula, eu tempus  \n" +
            "Nunc at aliquam nulla. \n" +
            "Etiam at turpis sit amet nulla hendrerit blandit. \n" +
            "Sed a eros vitae est tincidunt vehicula vel at purus. \n" +
            "Nunc ut ligula in libero fringilla mattis vel a est. \n" +
            "Praesent dignissim velit sit amet libero semper, \n" +
            "Suspendisse in sapien a libero volutpat  \n" +
            "Donec consequat tellus et neque vestibulum  \n" +
            "Fusce ultricies ligula id ligula venenat \n" +
            "Cras vel sapien eget urna dignissim venena\n" +
            "Donec consequat tellus et neque vestibul\n" +
            "Fusce ultricies ligula id ligula venen\n "
        );
        
        return tab1.add(outputTextArea);
    }

    public static Component Tab2() {
        JPanel tab2 = new JPanel();  
        JTextArea radiotext = new JTextArea(1,15);
        JRadioButton radioButton1= new JRadioButton("Happy");
        JRadioButton radioButton2= new JRadioButton("Sad");

        radiotext.setText("Are you happy or sad?");

        tab2.add(radiotext);
        tab2.add(radioButton1);
        tab2.add(radioButton2);

        return tab2;
    }
    public static Component Tab3() {
        JPanel tab3=new JPanel();  
        // content of tab
        return tab3;
    }
    public static Component Tab4() {
        JPanel tab4=new JPanel();  
        // content of tab
        return tab4;
    }
    public static Component Tab5() {
        JPanel tab5=new JPanel();  
        // content of tab
        return tab5;
    }
    public static Component Tab6() {
        JPanel tab6=new JPanel();  
        // content of tab
        return tab6;
    }

    
}

