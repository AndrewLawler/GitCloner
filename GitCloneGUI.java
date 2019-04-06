import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class GitCloneGUI extends JFrame implements ActionListener {

    private JLabel inputRepo;
    private JLabel inputID;

    private JLabel Output;
    private JLabel NameOfFile;

    private JTextField repoField;
    private JTextField IDField;

    private JButton button;
    private GitClone obj;

    private void buildGUI() {

        this.setTitle("Rotate");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 170, 500, 300);
        this.setVisible(true);

        setLayout(null);

        NameOfFile = new JLabel("Git Cloner");
        NameOfFile.setFont(new Font("Sans-Serif", Font.PLAIN, 30));
        NameOfFile.setForeground(Color.WHITE);

        inputRepo = new JLabel("Enter repo name: ");
        inputRepo.setForeground(Color.WHITE);
        repoField = new JTextField(20);
        repoField.setToolTipText("eg: React-Todo");

        inputID = new JLabel("Enter GitHub ID: ");
        inputID.setForeground(Color.WHITE);
        IDField = new JTextField(15);
        IDField.setToolTipText("eg: 'AndrewLawler' ");

        button = new JButton("Clone");
        button.addActionListener(this);

        Output = new JLabel("");
        Output.setVisible(false);
        Output.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
        Output.setForeground(Color.WHITE);

        button.setEnabled(true);

        // add the components to the frame
        add(NameOfFile);
        add(inputID);
        add(IDField);
        add(inputRepo);
        add(repoField);
        add(button);
        add(Output);

        // position the components and size them
        NameOfFile.setBounds(175, 20, 300, 40);

        inputID.setBounds(10, 70, 200, 40);
        IDField.setBounds(140, 70, 200, 40);

        inputRepo.setBounds(10, 120, 200, 40);
        repoField.setBounds(140, 120, 200, 40);

        button.setBounds(175, 170, 120, 30);
        Output.setBounds(176, 210, 400, 40);

    }

    public GitCloneGUI() {
        buildGUI();
        obj = new GitClone();
    }

    public void buttonInput() {

        String Repo = repoField.getText();
        String GitID = IDField.getText();

        if (Repo.length() > 0 && GitID.length() > 0) {
            try {
                obj.call(GitID, Repo);
                Output.setText(" Completed!");
            } catch (Exception e) {
            }
        } else {
            Output.setText("Wrong Input!");
        }
        Output.setVisible(true);

    }

    public void actionPerformed(ActionEvent eActionEvent) {
        buttonInput();
    }

    public static void Colours(JFrame frame) {
        frame.getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        GitCloneGUI frame = new GitCloneGUI();
        Colours(frame);
    }

}
