package TeacherSelection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TeacherRandomizerPanel extends JPanel
{
    private JLabel intro;
    private JLabel results;
//    private JButton fullRandom;
    private JComboBox<String> schoolSelect;
    private String[] schoolStrings = {"Mesa High School", "Red Mountain Ranch Elementary", "Andersen Elementary" ,
            "Kyrene Traditional Academy", "Highland Junor High", "Kyrene de las Manitas Innovation Academy",
            "Hamilton High", "Anderson Junior High", "Arizona College Prep High School", "Kino Junior High",
            "Kyrene de la Mariposa Computer Science Academy", "Chandler High School",
            "Franklin at Alma Elementary School", "Tempe High School", "Desert Vista High School",
            "Desert Ridge High School", "Kyrene de los Niños", "Gilbert High School", "Perry High School"};
    String selection;
    ButtonListener listener = new ButtonListener();
    TeacherSelect selector = new TeacherSelect();

    public TeacherRandomizerPanel()
    {
        intro = new JLabel("Welcome, select an option");
        add(intro);

//        fullRandom = new JButton("Fully Randomized");
//        fullRandom.addActionListener(listener);
//        add(fullRandom);

        schoolSelect = new JComboBox<>(schoolStrings);
        schoolSelect.addActionListener(listener);
        add(schoolSelect);

        results = new JLabel("Hello");
        add(results);

        setBackground(Color.pink);
        setPreferredSize(new Dimension(500, 500));
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
//            if (event.getSource() == fullRandom)
//            {
//                results.setText("Yee Haw");
//            }
            //else
            if (event.getSource() == schoolSelect)
            {
                selection = (String) schoolSelect.getSelectedItem();
                results.setText(selection);
                selector.setSchoolName(selection);
            }
        }
    }
}
