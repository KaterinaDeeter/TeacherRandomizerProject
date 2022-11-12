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
    private void setSchoolandGradeLevel() //I removed middle and high school here, because those will exclusively be STEM focused
    {
        if (isElementaryTypeA())
        {
            grade = generator.nextInt(7); //K-6
        }
        else if(isElementaryTypeB())
        {
            grade = generator.nextInt(6); //K-5
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
        setSchoolandGradeLevel();
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
        else if (schoolName.equals("Highland Junior High"))
        {
            highlandJuniorHighTeacherSelector();
        }
        else if (schoolName.equals("Anderson Junior High"))
        {
            andersenJuniorHighTeacherSelector();
        }
        else if (schoolName.equals("Kino Junior High"))
        {
            kinoJuniorHighTeacherSelector();
        }
        else if (schoolName.equals("Mesa High School"))
        {
            mesaHighTeacherSelector();
        }
        else if (schoolName.equals("Hamilton High"))
        {
            hamiltonHighTeacherSelector();
        }
        else if (schoolName.equals("Arizona College Prep High School"))
        {
            ACPTeacherSelector();
        }
        else if (schoolName.equals("Chandler High School"))
        {
            chandlerHighTeacherSelector();
        }
        else if (schoolName.equals("Tempe High School"))
        {
            tempeHighTeacherSelector();
        }
        else if (schoolName.equals("Desert Vista High School"))
        {
            desertVistaTeacherSelector();
        }
        else if (schoolName.equals("Desert Ridge High School"))
        {
            desertRidgeTeacherSelector();
        }
        else if (schoolName.equals("Gilbert High School"))
        {
            gilbertHighTeacherSelector();
        }
        else if (schoolName.equals("Perry High School"))
        {
            perryHighTeacherSelector();
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
    private void highlandJuniorHighTeacherSelector() //Email Format: myfirstname.mylastname@gilbertschools.net
    {
        String[] teacherArray = {"Tonya Almanza", "Lisa Chu", "Elisabeth Crowell", "Shannon Deaton", "Susan Ferguson",
                "Crystal Francom", "Amanda Harris", "Sheila Killam", "Dionne Leesley", "Allie Pudvah"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(10));
    }
    private void andersenJuniorHighTeacherSelector()
    {
        String[] teacherArray = {"Ms. Johanna Tuggay", "Mr. Jonathan Pacheco", "Mr. Jose Ramirez", "Ms. Kim Phillips",
                "Ms. Kristin Miller", "Mrs. Krysta Carlstrom", "Mrs. Margaret Sullivan", "Suzannah Ogden",
                "Mrs. Vidya Balasubramaniam", "Ms. Unruh"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(10));
    }
    private void kinoJuniorHighTeacherSelector()
    {
        String[] teacherArray = {"Mrs. Nancy Parra-Quinlan", "Miguel Albanez","Jessica Butcher", "Terri Clements",
                "Karin Lingle", "Shaela Offord", "Kimberly Renfrow", "Sierra Rhinehart", "Morgan Smith",
                "Keiko Yanagihara", "Chase Anderson", "James Burton", "Julie Macdonald", "Hilary Marcacci",
                "Katie Shotwell", "Cindy Wong"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(16));
    }
    private void mesaHighTeacherSelector()
    {
        String[] teacherArray = {"Amanda Grimes", "Barrus, Amber ", "Bates, Briana", "Chrisman, William", "Conn, Tina",
                "Curtis, Jarad", "Dagenais, Kasey", "Feldhausen, Ivy", "Fender, Diane", "Goodman, Melissa", "Graff, Heather",
                "Harris, Kaylie", "Horton, Andrew", "Isaac, David", "Landrum, Amy", "Law, Doug", "Norris, Audrey",
                "Osuna, Luis", "Rozsa, Andrea", "Schaufelberger, Keri", "Weston, Katelyn", "Williams, CC", "Kirk Hatch",
                "Carl Bandura", "Jennifer Brierton", "Amanda Cherry", "Tiffany Christian", "Elizabeth Fife", "Terry Govert",
                "Terry Graf", "Sarah Grant", "T.J. Hagen", "Daniel Hood", "Becky Johnson", "John Jung", "Tami Kashiwada",
                "Mike Madril", "Gareth Roberts", "Janet Robinson", "Jenny Robinson", "Jessica Rowse", "Meredith Schulte"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(42));
    }
    private void hamiltonHighTeacherSelector()
    {
        String[] teacherArray = {"ANDERSON, ED", "BITHI, RABIA", "BURKHART, ANDREW", "BUTLER, DANA", "CASTILLO, JOANNA",
                "CREEK, KRISTEN", "DEWALD, CHELSEA", "HOWARD, JULIE", "KLINE, JESSICA", "MAAG, MO", "MONAHAN, MATTHEW",
                "NALL, JULIE", "NIELSEN, TOM", "O'NEILL, KIM", "RALL, ASHLEY", "RING, JAMES", "STOLTENBERG, STEVE",
                "SUTARIA, ANJU", "TROTTI, ELIZABETH",  "WEEKS, CHARLES", "Mitchell,Tricia", "Polus, Kim", "Sears, Brian",
                "Weidenbach, Carina", "Finstad, Valerie", "Canfield, Kayla","Berkshire, Dawn", "Fajardo, Gabe",
                "Michael Peterson", "Jyoti Nair", "Hale, Taylor", "Loutzenheiser, Sara", "Nipar, Debbie",
                "Loutzenheiser, Sara", "Delgadillo, Zach", "Sheldon, Jessica", "Watkins, James","Crane Thomas",
                "Clark, Jim", "Welch, Kevin", "Mark Jordan", "Bonnie Zhu"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(43));
    }
    private void ACPTeacherSelector()
    {
        String[] teacherArray = {"Abel, Zeke", "Anderson, Melody", "Archer, Andrea", "Bernier Malayna",
                "Engelstad, Cheryl", "Fought Karyn", "Fraser Connor", "Gaston, Kristin", "Hoang, Lynn",
                "Mrs. Sharmin Khan", "Larsen, Megan", "Lull, Melissa", "May, Craig", "Mohr Nicole", "Montano, Robert",
                "Nath, Rachna", "Pavlak, Charlie", "Pollak, Andrew", "Sawyer Tyler", "Sims, Cristi", "Spruell Kenneth",
                "Suriyan, Patchi Rani", "Tang, Lei", "Whitmyer, Larry"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(24));
    }
    private void chandlerHighTeacherSelector()
    {
        String[] teacherArray = {"Amy Andrews", "Dan Beck", "Donna Bond", "Keli Bridinger", "Chaylee Chan",
                "Russell Davis", "Russ Good", "Savannah Hull", "Kirticia Jarrett", "Deanna Martin", "Roger Murdock",
                "Katie Nash", "Charles Osterberg", "Tami Pantel", "Lauren Perri", "Mary Ploense", "Jeff Tallman",
                "Zachary Thiel", "Heather Walterson", "Terrance Woody", "Mr. Robison", "Lira, Brittney",
                "Esparza, Julio", "Eldredge, Brian", "Taylor, Dan", "Goldstein, Emily", "Helt, Laura", "Jacobson, Nancy",
                "Harris, Michael", "Huffman, Michelle", "Callaway, Meghan", "Quintana, Katie", "Graybill, Summer",
                "Morado, Jaime", "Raymond, Andy", "Matheson, Kendall", "Croswhite, Kagen", "Froehlich, Zach",
                "Peplinski, Kristin", "Curry, Laura", "Zarling, Nicole", "Greenough, Patricia", "Leonard, Angela",
                "Berry, McKenna", "Logan, Travis", "Crane, Bryan"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(46));
    }
    private void tempeHighTeacherSelector()
    {
        String[] teacherArray = {"Amber Struthers", "Lucy Baluha", "Kellen Castillo", "Oscar Felix Angulo",
                "Dan Hockenbraugh", "Karla Meinen", "Kathy Melvin", "Darlene Periconi", "Katie Sanchez",
                "Terri Schneider", "Benjamin Schwartz", "Brenda Shaffer", "Teresa Ventoza", "Lei Yu", "Marcela Campbell",
                "Ariana Gowda", "Stephanie Milam-Edwards", "Jeremy Kachorsky", "Haven Guyer", "Aimee Quinn",
                "Carmen Robles", "Candice Reeve", "Amber Struthers", "Alex Yoo"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(24));
    }
    private void desertVistaTeacherSelector()
    {
        String[] teacherArray = {"Pete Manigold", "Rick Schapler", "Jeremy Williams", "Adrian Boyarsky", "Cody Brassfield",
                "Holly Fraser", "Leah Dompier", "Deonne Douglass", "Trent Elliot", "Stacey Forget", "Gerry Foster",
                "Kris Gorovitz", "Mike France", "Megan Ressler", "Meg Larsen", "Jeanne Scanlan", "Stacy Gibson",
                "Chris Tyler", "Sarah Mauel", "Erin Abner", "Elaine Bentley", "Mark Byrne-Quinn", "Kathleen Byrnes",
                "Julia Cisneros", "Amanda Cogswell", "John Cook", "Lorena Groenveld", "JP Plencer", "Darly Evans",
                "Steve Felling", "David Gonzalez", "Pete Rupp", "Adam Scalettar", "Sonya Spohn", "Bob Upham",
                "Bill Walton", "Joanna Wilson" };
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(37));
    }
    private void desertRidgeTeacherSelector()
    {
        String[] teacherArray = {"Robert Brandl", "Denise Cantu", "Azita Dehkordi", "Dickerson, David", "Jacqueline Edwards",
                "Frost, Jeffrey", "Harden, Wendi", "Shawn Hardina", "Harling, Robert", "Jensen, Marlow", "Jernigan, Robert",
                "Martinez, Toni", "Christopher Mattix", "Wendy McQuilkin", "Nicholas Miritello", "Missall, Holly",
                "Emily Nelson", "Ozdoba, Robert", "Rodriguez, Jordan", "Rumer, Colleen", "Saidler, Janis",
                "Schutkowski, Samantha", "Sherrill, Justin", "Stafford Gregory", "Steinkemper, Nicholas", "Wines, Richard"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(26));
    }
    private void gilbertHighTeacherSelector()
    {
        String[] teacherArray = {"Backer, Jennifer", "Beck-White, Alyssa", "Bird, Taylor", "Buchheit, Keira",
                "Capersino, Dominic", "Caserio, Jay", "Gallegos, Joan", "Garcia, Elizabeth", "Gray, Meghan",
                "Hayward, Wes", "Hoffland, Troy", "Jones, Aaron", "Jorgensen, Lynn", "Kyle Kuechle", "Lambert, Lisa",
                "Maag, Quenton", "Brianna McDowell", "Lisa Pettit", "Polinko, Angela", "Pottenger, Christine",
                "Powell, Katherine", "Scott, Bryan", "Smith, Nicole", "Sullivan, Mark", "Erin Wagner", "Sherry Yu"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(26));
    }
    private void perryHighTeacherSelector()
    {
        String[] teacherArray = {"Dahlem, Brian", "Aitken, Sarah", "Bernier, Laynee", "Carrasco, Stephanie",
                "Castillo, Keith", "Celaya, Cristina", "Celaya, Veronica", "Chesley, Julie", "Figueroa, Angella",
                "Giaramita, Dorothy", "Hahn, Myrna", "Hammond, Darrel", "Kelley, Suzanne", "Lu, Melissa", "Mach, Ashley",
                "Moon, Linda", "Plunk, David", "Ridenour, Becky", "Rothery, Tom", "Rupp, Erin", "Samour, Sienna",
                "Smith, Brittney", "Taylor, Kortney", "Trollope, Heidi", "Bell, Jerry", "Fireng, Brian", "Flores, David",
                "Fortune, Billie", "Gorton, Sandra", "Hall, Caroline", "Hawkins, Stephanie", "Heitmann, Mary",
                "Hutchinson, Karen", "Iannarelli, Anthony", "Idleman, Bryan", "Irion, Jerry", "Johnson, Heather",
                "Kennedy, Nicole", "Kenyon Jill", "Stoner, Jacob"};
        List<String> teacherList = Arrays.asList(teacherArray);
        teacher = teacherList.get(generator.nextInt(40));
    }

    public String getTeacher()
    {
        return teacher;
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


