import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class Medium1 {
    public class Medium1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JLabel statusLabel2;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH = 800;
    private int HEIGHT = 700;


    public Medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium1 swingControlDemo = new Medium1();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        //menu at top
        //cut = new JMenuItem("cut");
        //copy = new JMenuItem("copy");
        //paste = new JMenuItem("paste");
        //selectAll = new JMenuItem("selectAll");
        //cut.addActionListener(this);
        //copy.addActionListener(this);
        //paste.addActionListener(this);
        //selectAll.addActionListener(this);

        //mb = new JMenuBar();
        //file = new JMenu("File");
       // edit = new JMenu("Edit");
       // help = new JMenu("Help");
        //edit.add(cut);
        //edit.add(copy);
        //edit.add(paste);
        //edit.add(selectAll);
        //mb.add(file);
        //mb.add(edit);
        //mb.add(help);
        //end menu at top

       // ta = new JTextArea();
        //ta.setBounds(50, 5, WIDTH - 100, HEIGHT - 50);
       // mainFrame.add(mb);  //add menu bar
       // mainFrame.add(ta);//add typing area
        //mainFrame.setJMenuBar(mb); //set menu bar

        statusLabel = new JLabel("Label 1", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel2 = new JLabel("Label 2", JLabel.CENTER);
        statusLabel2.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3)); //set the layout of the pannel

//        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton okButton = new JButton("button 2");
        JButton submitButton = new JButton("button 4");
        JButton cancelButton = new JButton("button 5");
        JButton myButton = new JButton("button 1");
        JButton helloButton = new JButton("button 3");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("button 4");
        cancelButton.setActionCommand("button 5");
        myButton.setActionCommand("button 1");
        myButton.setActionCommand("button 3");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        myButton.addActionListener(new ButtonClickListener());
        helloButton.addActionListener(new ButtonClickListener());

        //mainFrame.add(okButton, BorderLayout.EAST);
       // mainFrame.add(submitButton,BorderLayout.CENTER);
        //mainFrame.add(cancelButton,BorderLayout.WEST);
       mainFrame.add(myButton,BorderLayout.NORTH);
        mainFrame.add(helloButton,BorderLayout.SOUTH);

        controlPanel.add(okButton);
        controlPanel.add(statusLabel);
        controlPanel.add(submitButton);
        controlPanel.add(statusLabel2);
        controlPanel.add(cancelButton);
        mainFrame.add(controlPanel,BorderLayout.CENTER);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else if (command.equals("Cate!")) {
                statusLabel.setText("Cate! Button clicked");
            } else if (command.equals("hello")) {
                statusLabel.setText("hello! Button clicked");
            } else{
                statusLabel.setText("Cancel Button clicked.");

            }
        }
    }
}


