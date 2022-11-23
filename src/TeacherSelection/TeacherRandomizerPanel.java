/*
 * Admittedly, this is completely unneccessary. I just wanted to play around with this since this was something I didn't
 * really know how to do with programming before my class, and having recently discussed it, I just wanted some practice
 * with buttons. Especially because I'm working on designing the website for this project that will have a lot of
 * user interaction. While that's going to be in javascript, similar concpets apply with the button and the action listeners/events.
 *
 * In retrospect, it would have been a lot easier to just automate this process and have it give me a file of teachers (much
 * like I did with the district select project above).
 */
package TeacherSelection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TeacherRandomizerPanel extends JPanel
{
    private JLabel intro;
    private JLabel results;
    private JComboBox<String> schoolSelect;
    private String[] schoolStrings = {"Red Mountain Ranch Elementary", "Andersen Elementary", "Franklin at Alma Elementary School",
            "Kyrene de la Mariposa Computer Science Academy", "Anderson Junior High", "Highland Junior High",
            "Kino Junior High", "Arizona College Prep High School", "Chandler High School", "Desert Ridge High School",
            "Desert Vista High School", "Gilbert High School", "Hamilton High", "Mesa High School", "Perry High School",
            "Tempe High School"};
    String selection;
    ButtonListener listener = new ButtonListener();
    TeacherSelect selector = new TeacherSelect();

    public TeacherRandomizerPanel()
    {
        intro = new JLabel("Welcome, select an option");
        add(intro);

        //Option box for the user. Allows them to select school
        schoolSelect = new JComboBox<>(schoolStrings);
        schoolSelect.addActionListener(listener); //later allows for the dropdown to actually have an effect.
        add(schoolSelect);

        results = new JLabel("Hello");
        add(results);

        setBackground(Color.pink);
        setPreferredSize(new Dimension(500, 500));
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //Once user selects school within drop down, it sets the school name for the teacherselect.
            // Then it goes through the process of getting a teacher, next displaying it to the user.
            if (event.getSource() == schoolSelect) {
                selection = (String) schoolSelect.getSelectedItem();
                selector.setSchoolName(selection);
                selector.teacherGenerator();
                results.setText(selector.getTeacher());

            }
        }
    }
}
