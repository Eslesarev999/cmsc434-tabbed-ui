import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class health_app {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Health App");
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp=new JTabbedPane(); 

        // Sets the size of each tab or JPanel
        tp.setBounds(0,0,375,640);  

        // Adds the tabs to the gui window
        tp.add(new JScrollPane(Tab1()), "Text");
        tp.add(Tab2(), "Choices");
        tp.add(Tab3(), "ToDo");
        tp.add(Tab4(), "Profile");
        tp.add(Tab5(), "Colors");
        tp.add(Tab6(), "Lower Right");

        // Formatting of the gui window "frame" to be size of traditional mobile phone
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
        JTextArea menutext = new JTextArea(1,15);
        JTextArea buttontext = new JTextArea(1,15);
        JRadioButton radioButton1= new JRadioButton("Happy");
        JRadioButton radioButton2= new JRadioButton("Sad");
        // Create a panel to contain the buttons in falling order
        JPanel buttonPanel = new JPanel(new BorderLayout());
        
        // Part 1) Radio Buttons
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        radiotext.setText("Are you happy or sad?");
        buttonPanel.add(radiotext, BorderLayout.NORTH);

        // Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        buttonPanel.add(radioButton1);
        buttonPanel.add(radioButton2);

        // newlines
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 50))); 

        // Part 2) A drop-down list entry option
        menutext.setText("Are you happy or sad?");
        buttonPanel.add(menutext, BorderLayout.NORTH);
        String[] combos = { "Happy", "Sad", "Neither" };
        JComboBox<String> choices = new JComboBox<>(combos);
        choices.setSelectedIndex(0);
        buttonPanel.add(choices);

        // newlines
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 50))); 

        // Part 3) A traditional button that when pressed will display text that is somehow reflecting the options chosen
        buttontext.setText("Choose a button reflecting your current mood:");
        buttonPanel.add(buttontext, BorderLayout.NORTH);
        JButton happybutton = new JButton("Happy");
        JButton sadbutton = new JButton("Sad");
        happybutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tab2, "Glad you are happy!", "Notification", JOptionPane.CANCEL_OPTION);
            }
        });
        sadbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tab2, "Aww, cheer up!", "Notification", JOptionPane.CANCEL_OPTION);
            }
        });
        
        buttonPanel.add(happybutton);
        buttonPanel.add(sadbutton);

        tab2.add(buttonPanel);

        return tab2;
    }

    public static Component Tab3() {
        JPanel tab3 = new JPanel();  
        
        // Create the "To Do" panel
        JPanel toDoPanel = new JPanel();
        toDoPanel.setLayout(new BoxLayout(toDoPanel, BoxLayout.Y_AXIS));

        List<JPanel> taskPanels = new ArrayList<>();
    
        //Text field for adding new tasks
        JTextField newTaskField = new JTextField(20);
        
        // Button to add tasks
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newTask = newTaskField.getText();
                if (!newTask.isEmpty()) {
                    
                    JPanel inputTask = new JPanel();
                    inputTask.setLayout(new BorderLayout());

                    JLabel taskLabel1 = new JLabel(newTask);

                    //Delete individal tasks
                    ImageIcon deleteIcon = new ImageIcon("delete_icon.png");
                    JButton delete = new JButton(deleteIcon);
                    delete.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            toDoPanel.remove(inputTask);
                            taskPanels.remove(inputTask);
                            toDoPanel.revalidate();
                            toDoPanel.repaint();
                        }
                    });

                    //Get preferred size of the text label
                    Dimension labelSize = taskLabel1.getPreferredSize();

                    //Set size of icon to fit text label
                    delete.setIcon(new ImageIcon(deleteIcon.getImage().getScaledInstance(labelSize.height, labelSize.height, Image.SCALE_SMOOTH)));

                    //Cross out individal tasks using checkbox
                    JCheckBox crossOut = new JCheckBox();
                    crossOut.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                           if (crossOut.isSelected()) {
                                taskLabel1.setText("<html><strike>" + newTask + "</strike></html>");
                           } else {
                            taskLabel1.setText(newTask);
                           }
                        }
                    });

                    //Task text & buttons layout
                    inputTask.add(taskLabel1, BorderLayout.CENTER);
                    inputTask.add(delete, BorderLayout.EAST);
                    inputTask.add(crossOut, BorderLayout.WEST);

                    //Adding task to screen
                    taskPanels.add(inputTask);
                    toDoPanel.add(inputTask);
                    newTaskField.setText("");
                    toDoPanel.revalidate();
                    toDoPanel.repaint();
                }
            }
        });
    
        //New panel for header & "Add Task" components 
        JPanel addTaskPanel = new JPanel();
        addTaskPanel.setLayout(new BorderLayout());

        //Header for the tab
        JLabel tabHeader = new JLabel("TO DO");
        tabHeader.setFont(new Font("Arial", Font.BOLD, 24));
        tabHeader.setHorizontalAlignment(SwingConstants.CENTER);
        
        addTaskPanel.add(tabHeader, BorderLayout.NORTH);
        addTaskPanel.add(newTaskField, BorderLayout.CENTER);
        addTaskPanel.add(addButton, BorderLayout.EAST);

        tab3.add(addTaskPanel, BorderLayout.NORTH);
        tab3.add(new JScrollPane(toDoPanel), BorderLayout.CENTER);
        tab3.add("To Do", toDoPanel);
        
        return tab3;
    }
    
    public static Component Tab4() {
        JPanel tab4 = new JPanel();
        tab4.setLayout(new GridBagLayout()); 
        
        // Scaling the button image to be smaller
        ImageIcon icon = new ImageIcon("SmileyFace.png");
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(image);
        JButton imageButton = new JButton(scaledIcon);
    
        // Show a notification when the button is pressed
        imageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tab4, "Hi there!", "Notification", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    
        // Creating a label for the text that will go under the button
        JLabel textLabel = new JLabel("Smiley J. Smile");
        textLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Create a panel to contain the image and text
        JPanel imagePanel = new JPanel(new BorderLayout());
    
        // Center the image in the panel
        imagePanel.add(imageButton, BorderLayout.CENTER);
        
        // Center the text underneath the image
        imagePanel.add(textLabel, BorderLayout.SOUTH);
    
        // Add the image panel to the tab4 panel
        tab4.add(imagePanel, new GridBagConstraints());
    
        return tab4;
    }
    
    public static Component Tab5() {
        JPanel tab5 = new JPanel();
        Color lighterPink = new Color(255, 200, 220);
        tab5.setBackground(lighterPink);
        FlowLayout layout = new FlowLayout(FlowLayout.LEADING, 0, 0);
        tab5.setLayout(layout);
        
        JLabel colorsLabel = new JLabel("Colors");
        
        int top = 20;
        int left = 0;
        int bottom = 20;
        int right = 0;
        colorsLabel.setBorder(new EmptyBorder(top, left, bottom, right));
        
        Font customFont = new Font("Times New Roman", Font.PLAIN | Font.BOLD, 25);
        colorsLabel.setFont(customFont);
        colorsLabel.setForeground(Color.BLACK);
        
        JPanel blackStripPanel = new JPanel();
        blackStripPanel.setBackground(Color.BLACK);
        blackStripPanel.setPreferredSize(new Dimension(390, 25));
        blackStripPanel.setBorder(new EmptyBorder(0, 0, 0, 0));

        JLabel helloLabel = new JLabel("Hello There");
        helloLabel.setForeground(Color.YELLOW);
        Font customFont2 = new Font("Times New Roman", Font.PLAIN | Font.BOLD, 20);
        helloLabel.setFont(customFont2);

        blackStripPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 2));
        blackStripPanel.add(helloLabel);

        JPanel yellowStripPanel = new JPanel();
        yellowStripPanel.setBackground(Color.YELLOW);
        yellowStripPanel.setPreferredSize(new Dimension(390, 26));
        yellowStripPanel.setBorder(new EmptyBorder(0, 0, 0, 0));

        JLabel hiAgainLabel = new JLabel("Hi Again");
        Color customPurple = new Color(128, 0, 128);
        hiAgainLabel.setForeground(customPurple);
        hiAgainLabel.setFont(customFont2);

        yellowStripPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 1));
        yellowStripPanel.add(hiAgainLabel);

        tab5.add(colorsLabel);
        tab5.add(blackStripPanel);
        tab5.add(yellowStripPanel);
        return tab5;
    }
    
    public static Component Tab6() {
        JPanel tab6 = new JPanel(new BorderLayout());
    
        Box box = Box.createVerticalBox();

        //Creates a label to display the text
        //the <br> tags are nextline characters that put the label at the bottom
        JLabel label = new JLabel("<html> <br><br><br><br><br><br><br><html>"+
            "<html> <br><br><br><br><br><br><br><html>"+
            "<html> <br><br><br><br><br><br><br><html>"+
            "<html> <br><br><br><br><br><br><br><html>"+
            "<html> <br><br><br><br><br><br><br><br><br><br><br><br><html>"+
             "<html>Down Here");

        //sets the label to the right of the page
        label.setHorizontalAlignment(SwingConstants.RIGHT);

        label.setVerticalAlignment(SwingConstants.BOTTOM);
    
        //add the label to the box
        box.add(label);
    
        //at the box with the label to the tab
        tab6.add(box, BorderLayout.CENTER);
    
        return tab6;
    }
    
}

