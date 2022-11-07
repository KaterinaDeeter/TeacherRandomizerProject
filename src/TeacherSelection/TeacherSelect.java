package TeacherSelection;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TeacherSelect
{
    private String schoolName;
    private String schoolLevel;
    private String teacher;
    private int grade;
    Random generator = new Random();

    public TeacherSelect()
    {
        schoolName = "undefined";
        grade = 0;
        schoolLevel = "undefined";
        teacher = "undefined";
    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }
    private void setSchoolandGradeLevel() //I removed middle and high school here, because this will exclusively be STEM focused
    {
        if (isElementaryTypeA())
        {
            grade = generator.nextInt(7); //K-6
        }
        else if(isElementaryTypeB())
        {
            grade = generator.nextInt(6); //K-5
        }
        else if(schoolName.equals("Kyrene de las Manitas Innovation Academy"))
        {
        }
        else if (schoolName.equals("Kyrene Traditional Academy"))
        {
        }
    }

    private boolean isElementaryTypeA()
    {
        if (schoolName.equals("Red Mountain Ranch Elementary") || schoolName.equals("Franklin at Alma Elementary School"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean isElementaryTypeB()
    {
        if (schoolName.equals("Andersen Elementary") || schoolName.equals("Kyrene de la Mariposa Computer Science Academy") ||
            schoolName.equals("Kyrene de los Niños"))
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public void teacherGenerator() //ADD to this one as we continue
    {
        if(schoolName.equals("Red Mountain Ranch Elementary"))
        {
            redMountainRanchTeacherSelector();
        }
        else if(schoolName.equals("Franklin at Alma Elementary School"))
        {
            franklinAtAlmaTeacherSelector();
        }
        else if(schoolName.equals("Andersen Elementary"))
        {
            andersonElementaryTeacherSelector();
        }
        else if(schoolName.equals("Kyrene de la Mariposa Computer Science Academy"))
        {
            kdlMCSAElementaryTeacherSelector();
        }
        else if (schoolName.equals("Kyrene de los Niños"))
        {
            kyreneDeLosNinosElementaryTeacherSelector();
        }
    }
    private void redMountainRanchTeacherSelector() //DONE
    {
        if (grade == 0) //Done
        {
            String[] teacherArray = {"Alysha Freza", "Gretchen Rodeffer", "Nicole McBrien"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if (grade == 1) //Done
        {
            String[] teacherArray = {"Sabrina Hill", "Ashlea Bowden", "Janet Smolka"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));

        }
        else if (grade == 2) //Done
        {
            String[] teacherArray = {"Hannah Saunders", "Krista Fox", "Kaitlyn Moister"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if (grade == 3) //Done
        {
            String[] teacherArray = {"Kelly Argos", "Mackenzi Kugler", "Wendy Hall"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if (grade == 4) //Done
        {
            String[] teacherArray = {"Melissa Mashore", "Jennifer Bagnasco"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 5) //Done
        {
            String[] teacherArray = {"Dana Moore", "Beth Garcia"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 6) //Done
        {
            String[] teacherArray = {"Ms. Gardner", "Mr.Gibson" , "Mrs.Lewis"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
    }
    private void franklinAtAlmaTeacherSelector() //DONE
    {
        if (grade == 0)
        {
            String[] teacherArray = {"Merrie Ehrke", "Camilla Moore", "Grace Plyler"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if (grade == 1)
        {
            String[] teacherArray = {"Laila Raether", "Monessa Clinkenbeard"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));

        }
        else if (grade == 2)
        {
            String[] teacherArray = {"Jennifer Gummow", "Theresa Wilmes"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 3)
        {
            String[] teacherArray = {"Lisa Myers", "Patricia Traughber"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 4)
        {
            String[] teacherArray = {"Brittney Asamane", "Carol Reed"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 5)
        {
            String[] teacherArray = {"Dee Averyt", "Marissa Fenton"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if (grade == 6)
        {
            String[] teacherArray = {"Lisa Beavers", "Melissa Standage"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
    }
    private void andersonElementaryTeacherSelector() //Done
    {
        if (grade == 0)
        {
            String[] teacherArray = {"Miss Crawford", "Mrs. Padilla", "Mrs.Wagner"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 1)
        {
            String[] teacherArray = {"Mrs. Ball", "Mrs. Chandler", "Mrs. Quinn"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 2)
        {
            String[] teacherArray = {"Ms. Casillas", "Ms. Green", "Mrs. Wilson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 3)
        {
            String[] teacherArray = {"Miss Jaffe", "Mrs. Miller", "Mrs. Richardson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 4)
        {
            String[] teacherArray = {"Ms. Coady", "Miss Dow", "Mrs. Marlar"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 5)
        {
            String[] teacherArray = {"Mrs. Dougherty", "Mrs. McClain", " Mrs. Williams"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }

    }
    private void kdlMCSAElementaryTeacherSelector() // Done
    {
        if (grade == 0)
        {
            String[] teacherArray = {"Ms. Adrian", "Ms. Rees", "Ms. Sanson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 1)
        {
            String[] teacherArray = {"Ms. Gallagher", "Ms. Scheitlin", "Ms.Wilson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 2)
        {
            String[] teacherArray = {"Ms. Feeley", "Mrs. Harshfield", "Mrs. Jennewein"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 3)
        {
            String[] teacherArray = {"Ms. Bustamante", "Mrs. Montiel", "Mrs. Russo"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 4)
        {
            String[] teacherArray = {"Mrs. Ballatore", "Ms. Barber", "Mrs. Johnson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 5)
        {
            String[] teacherArray = {"Mrs. Languren", "Ms. Smith", "Ms. Stupica"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
    }
    private void kyreneDeLosNinosElementaryTeacherSelector() //DONE
    {
        if (grade == 0)
        {
            String[] teacherArray = {"Mrs. Long", "Mrs. Lychock", "Ms. Martin"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 1)
        {
            String[] teacherArray = {"Mrs. Perzan", "Mrs. Pfeffer", "Mrs. Morin"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 2)
        {
            String[] teacherArray = {"Ms. Holzer", "Mrs. Tomayo", "Mrs. Zino"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 3)
        {
            String[] teacherArray = {"Mrs. Montero", "Ms. Rodriguez", "Mrs. Dansby"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
        else if(grade == 4)
        {
            String[] teacherArray = {"Ms. Grunloh", "Ms. MacInness"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(2));
        }
        else if(grade == 5)
        {
            String[] teacherArray = {"Ms. Rios", "Ms. Kirby", "Mrs. Wilson"};
            List<String> teacherList = Arrays.asList(teacherArray);
            teacher = teacherList.get(generator.nextInt(3));
        }
    }

}

//else if (grade == 5)
//        {
//        String[] teacherArray = {"", ""};
//        List<String> teacherList = Arrays.asList(teacherArray);
//        teacher = teacherList.get(generator.nextInt());
//        }

    //Take a school from dropdown
    //Then based on which level it is (Elem, Middle, High), will generate a grade
    //Then based on the grade it selects will randomize a specific teacher
    /* So What Do We Need Now:
     * This class will take school value from the panel-- and with it run it through the available levels
     * There will be a method that takes the school option (go through each one in the dropdown) and if it
     * one of the certain options in each if/else statement, it will set the variable of level
     * The level is Elem, Middle, High. Based on this it will randomize a grade (except for high school)
     * In the high school format I want to pick STEM specific topics. Based on the grade and school it will then
     * randomize a teacher.
     *
     */


