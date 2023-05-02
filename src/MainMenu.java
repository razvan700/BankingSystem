import javax.swing.*;

public class MainMenu extends JFrame {
    private JPanel mainPanel;
    private JComboBox comboBox1;

    public MainMenu() {
        // set up frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(mainPanel); // add mainPanel to the content pane

        // pack and display frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();

        menu.setSize(1920,1080);
        menu.setVisible(true);
    }
}