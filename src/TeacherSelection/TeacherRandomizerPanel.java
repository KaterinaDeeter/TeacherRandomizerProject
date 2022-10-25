package TeacherSelection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TeacherRandomizerPanel extends JPanel
{
    private JLabel intro;
    private JLabel results;
    private JButton fullRandom;
    private JComboBox<String> gradeSelect;
    private String[] gradeStrings = {"K", "1st" , "2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th", "12th"};
    String selection;
    ButtonListener listener = new ButtonListener();

    public TeacherRandomizerPanel()
    {
        intro = new JLabel("Welcome, select an option");
        add(intro);

        fullRandom = new JButton("Fully Randomized");
        fullRandom.addActionListener(listener);
        add(fullRandom);

        gradeSelect = new JComboBox<>(gradeStrings);
        gradeSelect.addActionListener(listener);
        add(gradeSelect);

        results = new JLabel("Hello");
        add(results);

        setBackground(Color.pink);
        setPreferredSize(new Dimension(500, 500));
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            if (event.getSource() == fullRandom)
            {
                results.setText("Yee Haw");
            }
            else if (event.getSource() == gradeSelect)
            {
                selection = (String) gradeSelect.getSelectedItem();
                results.setText(selection);
            }
        }
    }
}
