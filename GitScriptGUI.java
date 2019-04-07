import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class GitScriptGUI extends JFrame implements ActionListener {

    private JLabel Output;
    private JLabel NameOfFile;
    private JButton button;
    private Git obj;

    private void buildGUI() {

        this.setTitle("GitScript");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 170, 500, 300);
        this.setVisible(true);

        setLayout(null);

        NameOfFile = new JLabel("Git Script");
        NameOfFile.setFont(new Font("Sans-Serif", Font.PLAIN, 30));
        NameOfFile.setForeground(Color.WHITE);

        button = new JButton("Clone");
        button.addActionListener(this);

        Output = new JLabel("");
        Output.setVisible(false);
        Output.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
        Output.setForeground(Color.WHITE);

        button.setEnabled(true);

        // add the components to the frame
        add(NameOfFile);
        add(button);
        add(Output);

        // position the components and size them
        NameOfFile.setBounds(175, 20, 300, 40);
        button.setBounds(175, 80, 120, 30);
        Output.setBounds(176, 120, 400, 40);

    }

    public GitScriptGUI() {
        buildGUI();
        obj = new GitScript();
    }

    public void buttonInput() {

        try {
            obj.call("GitID", "Repo");
            Output.setVisible(true);
            Output.setText(" Working . . .");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            Output.setText(" Completed!");
        } catch (Exception e) {
        }
        Output.setVisible(true);

    }

    public void actionPerformed(ActionEvent eActionEvent) {
        buttonInput();
    }

    public static void Colours(JFrame frame) {
        frame.getContentPane().setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        GitScriptGUI frame = new GitScriptGUI();
        Colours(frame);
    }

}
