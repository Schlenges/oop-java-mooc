package clicker.ui;

import javax.swing.SwingUtilities;
import clicker.applicationlogic.*;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new PersonalCalculator());
        SwingUtilities.invokeLater(ui);
    }
}
