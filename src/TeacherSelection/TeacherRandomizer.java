package TeacherSelection;

import javax.swing.JFrame;
public class TeacherRandomizer
{
    public static void main(String[] args)
    {
        //Create frame and panel
        JFrame frame = new JFrame("Teacher Randomizer");
        TeacherRandomizerPanel panel = new TeacherRandomizerPanel();

        //set frame behavior
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //place panel in frame
        frame.getContentPane().add(panel);

        //format frame and make available/visible
        frame.pack();
        frame.setVisible(true);
    }
}
