//This entire class and even package is solely for the purpose of finding which schools I am using so I can randomize
//teachers. I really didn't want to make a list of every single teacher in these four districts, and while the lengths
//in here may be a bit extreme, I feel it's a bit easier to just put in a select few teachers from predetermined values.
//I might even add a grade component in here.
package SchoolSelection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistrictSelect
{
    private List<String> districtOptions = new ArrayList<>();
    private List<String> schoolLevelOptions = new ArrayList<>();

    //Lists for various levels in the KUSD/TUHSD District
    private List<String> KUSDElementary = new ArrayList<>();
    private List<String> KUSDMiddle = new ArrayList<>();
    private List<String> TUHSD = new ArrayList<>();

    //Lists for various levels in the CUSD District
    private List<String> CUSDElementary = new ArrayList<>();
    private List<String> CUSDMiddle = new ArrayList<>();
    private List<String> CUSDHigh = new ArrayList<>();

    //Lists for various levels in the GUSD District
    private List<String> GUSDElementary = new ArrayList<>();
    private List<String> GUSDMiddle = new ArrayList<>();
    private List<String> GUSDHigh = new ArrayList<>();

    //Lists for various levels in the MUSD District
    private List<String> MUSDElementary = new ArrayList<>();
    private List<String> MUSDMiddle = new ArrayList<>();
    private List<String> MUSDHigh = new ArrayList<>();

    //Random later used for picking random items from the created lists
    private Random generator = new Random();

    //All the important values that will later be set
    private String districtChoice = "";
    private String levelChoice = "";
    private String fullSelection = "";
    private String schoolChoice = "";

    //Constructor. When called on it will create the list for district options and school level options so they can be
    //immediately called on right after.
    public DistrictSelect()
    {
        districtOptions.add("KUSD"); //TUHSD is only a high school option, and is considered Kyrene High
        districtOptions.add("CUSD");
        districtOptions.add("GUSD");
        districtOptions.add("MUSD");

        schoolLevelOptions.add("Elementary School");
        schoolLevelOptions.add("Middle School");
        schoolLevelOptions.add("High School");
    }

    //This picks a district at random and sets a String to which district will be used
    private void setDistrictChoice()
    {
        int districtNumber = generator.nextInt(districtOptions.size());
        districtChoice = districtOptions.get(districtNumber);
    }

    //This picks a level (elem, middle, high) at random and sets String to which level is selected
    private void setLevelChoice()
    {
        int levelNumber = generator.nextInt(schoolLevelOptions.size());
        levelChoice = schoolLevelOptions.get(levelNumber);
    }

    //Calls on previous two methods and sets FullSelection. This was for data collection purposes, and since has lost
    //its purpose because I just referenced the above in the toString. But it's helpful to run both of the above at once
    public void setFullSelection()
    {
        setDistrictChoice();
        setLevelChoice();
        fullSelection = districtChoice + " " +  levelChoice;
    }

    //This is a longer method and handles two main processes (I would have split it up, but I felt that was too redundant)
    //It takes the values from running setFullSelection() and narrows down the district and level options. From here it
    //creates the lists seen above and selects a random option from what it creates. Admittedly, I did it like this instead
    //of creating the full list in the constructor, because I was hoping to get this to run a little faster and not use
    //unecessary resources (if it never selects MUSD Elem, why should it even create such a long list?). I also like that
    //this just minimizes user control entirely. The whole point of this was to be as random as possible.
    public void listSelecreator() //RUN FULL SELECTION BEFORE USING THIS
    {
        if (districtChoice.equals("KUSD"))
        {
            if(levelChoice.equals("Elementary School"))
            {
                createKUSDElementary();
                randomizeKUSDElementary();
            }
            else if(levelChoice.equals("Middle School"))
            {
                createKUSDMiddle();
                randomizeKUSDMiddle();
            }
            else if(levelChoice.equals("High School"))
            {
                createTUHSD();
                randomizeTUHSD();
            }
        }
        else if (districtChoice.equals("CUSD"))
        {
            if(levelChoice.equals("Elementary School"))
            {
                createCUSDElementary();
                randomizeCUSDElementary();
            }
            else if(levelChoice.equals("Middle School"))
            {
                createCUSDMiddle();
                randomizeCUSDMiddle();
            }
            else if(levelChoice.equals("High School"))
            {
                createCUSDHigh();
                randomizeCUSDHigh();
            }
        }
        else if (districtChoice.equals("GUSD"))
        {
            if(levelChoice.equals("Elementary School"))
            {
                createGUSDElementary();
                randomizeGUSDElementary();
            }
            else if(levelChoice.equals("Middle School"))
            {
                createGUSDMiddle();
                randomizeGUSDMiddle();
            }
            else if(levelChoice.equals("High School"))
            {
                createGUSDHigh();
                randomizeGUSDHigh();
            }
        }
        else if (districtChoice.equals("MUSD"))
        {
            if(levelChoice.equals("Elementary School"))
            {
                createMUSDElementary();
                randomizeMUSDElementary();
            }
            else if(levelChoice.equals("Middle School"))
            {
                createMUSDMiddle();
                randomizeMUSDMiddle();
            }
            else if(levelChoice.equals("High School"))
            {
                createMUSDHigh();
                randomizeMUSDHigh();
            }
        }

    }

    //THE FOLLOWING CREATE methods are meant to assign and add all the schools into these lists. It is incredibly lengthy
    //and quite literally is just listname.add(""); over and over again...
    private void createKUSDElementary() //DONE
    {
        KUSDElementary.add("Kyrene de las Brisas (BRI)");
        KUSDElementary.add("Kyrene de los Cerritos Leadership Academy (CER)");
        KUSDElementary.add("Kyrene del Cielo (CIE)");
        KUSDElementary.add("Kyrene de la Colina (COL)");
        KUSDElementary.add("Kyrene de la Esperanza (ESP)");
        KUSDElementary.add("Kyrene de la Estrella (EST)");
        KUSDElementary.add("Kyrene de los Lagos Dual Language Academy (LAG)");
        KUSDElementary.add("Kyrene de las Lomas (LOM)");
        KUSDElementary.add("Kyrene de la Mariposa Computer Science Academy (MAR)");
        KUSDElementary.add("Kyrene del Milenio (MIL)");
        KUSDElementary.add("Kyrene de la Mirada Leadership Academy (MIR)");
        KUSDElementary.add("Kyrene Monte Vista (MON)");
        KUSDElementary.add("Kyrene de los Niños (NIN)");
        KUSDElementary.add("Kyrene del Norte Dual Language Academy (NOR)");
        KUSDElementary.add("Kyrene de la Paloma Arts Integration Academy (PAL)");
        KUSDElementary.add("Kyrene de la Sierra (SIE)");
        KUSDElementary.add("C.I. Waggoner (WAG)");
    }
    private void createKUSDMiddle() //DONE
    {
        KUSDMiddle.add("Kyrene Akimel A-al (AKI)");
        KUSDMiddle.add("Kyrene Altadeña (ALT)");
        KUSDMiddle.add("Kyrene Aprende (APR)");
        KUSDMiddle.add("Kyrene Centennial (CEN)");
        KUSDMiddle.add("Kyrene Middle School: IB Middle Years Programme (KYR)");
        KUSDMiddle.add("Kyrene de las Manitas Innovation Academy (MAN)");
        KUSDMiddle.add("Kyrene del Pueblo (PUE)");
        KUSDMiddle.add("Kyrene Digital Academy K-8 [KDA]");
        KUSDMiddle.add("Kyrene Traditional Academy K-8 [KTA]");
    }
    private void createTUHSD() //DONE
    {
        TUHSD.add("Corona Del Sol");
        TUHSD.add("Desert Vista");
        TUHSD.add("Marcos de Niza");
        TUHSD.add("McClintock");
        TUHSD.add("Mountain Pointe");
        TUHSD.add("Tempe High");
        TUHSD.add("Tempe Union Online");
    }

    private void createCUSDElementary() //DONE
    {
        CUSDElementary.add("Andersen Elementary");
        CUSDElementary.add("Auxier Elementary (CTA & Classic)");
        CUSDElementary.add("Basha Elementary");
        CUSDElementary.add("Bologna Elementary");
        CUSDElementary.add("Carlson Elementary (CTA & Classic)");
        CUSDElementary.add("Chandler Traditional Academy - Freedom Campus");
        CUSDElementary.add("Chandler Traditional Academy - Goodman Campus");
        CUSDElementary.add("Chandler Traditional Academy - Humphrey Campus");
        CUSDElementary.add("Chandler Traditional Academy - Independence Campus");
        CUSDElementary.add("Chandler Traditional Academy - Liberty Campus");
        CUSDElementary.add("Conley Elementary");
        CUSDElementary.add("Frye Elementary");
        CUSDElementary.add("Fulton Elementary");
        CUSDElementary.add("Galveston Elementary");
        CUSDElementary.add("Haley Elementary");
        CUSDElementary.add("Hancock Elementary");
        CUSDElementary.add("Hartford Sylvia Encinas Elementary");
        CUSDElementary.add("Hull Elementary");
        CUSDElementary.add("Jacobson Elementary");
        CUSDElementary.add("Knox Gifted Academy");
        CUSDElementary.add("Navarrete Elementary");
        CUSDElementary.add("Patterson Elementary (CTA & Classic)");
        CUSDElementary.add("Rice Elementary (CTA & Classic)");
        CUSDElementary.add("Riggs Elementary");
        CUSDElementary.add("Ryan Elementary");
        CUSDElementary.add("San Marcos Elementary");
        CUSDElementary.add("Sanborn Elementary");
        CUSDElementary.add("Santan Elementary");
        CUSDElementary.add("Shumway Leadership Academy");
        CUSDElementary.add("Tarwater Elementary");
        CUSDElementary.add("Weinberg Gifted Academy");
    }
    private void createCUSDMiddle() //DONE
    {
        CUSDMiddle.add("Andersen Junior High");
        CUSDMiddle.add("Arizona College Prep Middle School");
        CUSDMiddle.add("Bogle Junior High");
        CUSDMiddle.add("Payne Junior High");
        CUSDMiddle.add("Santan Junior High");
        CUSDMiddle.add("Willis Junior High");
    }
    private void createCUSDHigh() //DONE
    {
        CUSDHigh.add("Arizona College Prep High School");
        CUSDHigh.add("Basha High");
        CUSDHigh.add("Casteel High");
        CUSDHigh.add("Chandler High");
        CUSDHigh.add("Hamilton High");
        CUSDHigh.add("Perry High");
    }

    private void createGUSDElementary() //DONE
    {
        GUSDElementary.add("Ashland Ranch Elementary");
        GUSDElementary.add("Augusta Ranch Elementary");
        GUSDElementary.add("Boulder Creek Elementary");
        GUSDElementary.add("Burk Elementary School");
        GUSDElementary.add("Canyon Rim Elementary");
        GUSDElementary.add("Carol Rae Ranch Elementary");
        GUSDElementary.add("Finley Farms Elementary");
        GUSDElementary.add("Gilbert Elementary");
        GUSDElementary.add("Greenfield Elementary");
        GUSDElementary.add("Harris Elementary");
        GUSDElementary.add("Highland Park Elementary");
        GUSDElementary.add("Islands Elementary");
        GUSDElementary.add("Meridian Elementary");
        GUSDElementary.add("Mesquite Elementary");
        GUSDElementary.add("Neely Traditional Academy");
        GUSDElementary.add("Oak Tree Elementary");
        GUSDElementary.add("Patterson Elementary");
        GUSDElementary.add("Pioneer Elementary");
        GUSDElementary.add("Playa del Rey Elementary");
        GUSDElementary.add("Quartz Hill Elementary");
        GUSDElementary.add("Settler's Point Elementary");
        GUSDElementary.add("Sonoma Ranch Elementary");
        GUSDElementary.add("Spectrum Elementary");
        GUSDElementary.add("Superstition Springs Elementary");
        GUSDElementary.add("Towne Meadows Elementary");
        GUSDElementary.add("Val Vista Lakes Elementary");
    }
    private void createGUSDMiddle() //DONE
    {
        GUSDMiddle.add("Desert Ridge Junior High");
        GUSDMiddle.add("Gilbert Classical Academy – Junior High & High School");
        GUSDMiddle.add("Greenfield Junior High");
        GUSDMiddle.add("Highland Junior High");
        GUSDMiddle.add("Mesquite Junior High");
        GUSDMiddle.add("South Valley Junior High");
    }
    private void createGUSDHigh() //DONE
    {
        GUSDHigh.add("Campo Verde High");
        GUSDHigh.add("Canyon Valley School");
        GUSDHigh.add("Desert Ridge High");
        GUSDHigh.add("Gilbert Classical Academy – Junior High & High School");
        GUSDHigh.add("Gilbert High");
        GUSDHigh.add("Highland High");
        GUSDHigh.add("Mesquite High");

    }

    private void createMUSDElementary() //DONE
    {
        MUSDElementary.add("Adams");
        MUSDElementary.add("Brinton");
        MUSDElementary.add("Bush");
        MUSDElementary.add("Crismon");
        MUSDElementary.add("Edison");
        MUSDElementary.add("Eisenhower");
        MUSDElementary.add("Emerson");
        MUSDElementary.add("Entz");
        MUSDElementary.add("Falcon Hill");
        MUSDElementary.add("Field");
        MUSDElementary.add("Franklin at Alma");
        MUSDElementary.add("Franklin at Brimhall");
        MUSDElementary.add("Franklin East");
        MUSDElementary.add("Franklin West");
        MUSDElementary.add("Guerrero");
        MUSDElementary.add("Hale");
        MUSDElementary.add("Hermosa Vista");
        MUSDElementary.add("Highland Arts");
        MUSDElementary.add("Holmes");
        MUSDElementary.add("Hughes");
        MUSDElementary.add("Irving");
        MUSDElementary.add("Ishikawa");
        MUSDElementary.add("Jefferson");
        MUSDElementary.add("Johnson");
        MUSDElementary.add("Keller");
        MUSDElementary.add("Kerr");
        MUSDElementary.add("Las Sendas");
        MUSDElementary.add("Lehi");
        MUSDElementary.add("Lincoln");
        MUSDElementary.add("Lindbergh");
        MUSDElementary.add("Longfellow");
        MUSDElementary.add("Lowell");
        MUSDElementary.add("MacArthur");
        MUSDElementary.add("Madison");
        MUSDElementary.add("Mendoza");
        MUSDElementary.add("O'Connor");
        MUSDElementary.add("Patterson");
        MUSDElementary.add("Pomeroy");
        MUSDElementary.add("Porter");
        MUSDElementary.add("Red Mountain Ranch");
        MUSDElementary.add("Redbird");
        MUSDElementary.add("Robson");
        MUSDElementary.add("Roosevelt");
        MUSDElementary.add("Salk");
        MUSDElementary.add("Sirrine");
        MUSDElementary.add("Sousa");
        MUSDElementary.add("Stevenson");
        MUSDElementary.add("Summit Academy");
        MUSDElementary.add("Taft");
        MUSDElementary.add("Washington");
        MUSDElementary.add("Webster");
        MUSDElementary.add("Whitman");
        MUSDElementary.add("Whittier");
        MUSDElementary.add("Wilson");
        MUSDElementary.add("Zaharis");
    }
    private void createMUSDMiddle() //Done
    {
        MUSDMiddle.add("Carson");
        MUSDMiddle.add("Franklin Junior");
        MUSDMiddle.add("Fremont");
        MUSDMiddle.add("Kino");
        MUSDMiddle.add("Poston");
        MUSDMiddle.add("Rhodes");
        MUSDMiddle.add("Shepherd");
        MUSDMiddle.add("Smith");
        MUSDMiddle.add("Stapley");
        MUSDMiddle.add("Summit Academy");
        MUSDMiddle.add("Taylor");
    }
    private void createMUSDHigh() //DONE
    {
        MUSDHigh.add("Dobson");
        MUSDHigh.add("Mesa High");
        MUSDHigh.add("Mountain View");
        MUSDHigh.add("Red Mountain");
        MUSDHigh.add("Skyline");
        MUSDHigh.add("Westwood");
    }

    //When called on, these will take a random element from the list and set it to school choice.
    private void randomizeKUSDElementary()
    {
        int a = generator.nextInt(KUSDElementary.size());
        schoolChoice = KUSDElementary.get(a);
    }
    private void randomizeKUSDMiddle()
    {
        int a = generator.nextInt(KUSDMiddle.size());
        schoolChoice = KUSDMiddle.get(a);
    }
    private void randomizeTUHSD()
    {
        int a = generator.nextInt(TUHSD.size());
        schoolChoice = TUHSD.get(a);
    }

    private void randomizeCUSDElementary()
    {
        int a = generator.nextInt(CUSDElementary.size());
        schoolChoice = CUSDElementary.get(a);
    }
    private void randomizeCUSDMiddle()
    {
        int a = generator.nextInt(CUSDMiddle.size());
        schoolChoice = CUSDMiddle.get(a);
    }
    private void randomizeCUSDHigh()
    {
        int a = generator.nextInt(CUSDHigh.size());
        schoolChoice = CUSDHigh.get(a);
    }

    private void randomizeGUSDElementary()
    {
        int a = generator.nextInt(GUSDElementary.size());
        schoolChoice = GUSDElementary.get(a);
    }
    private void randomizeGUSDMiddle()
    {
        int a = generator.nextInt(GUSDMiddle.size());
        schoolChoice = GUSDMiddle.get(a);
    }
    private void randomizeGUSDHigh()
    {
        int a = generator.nextInt(GUSDHigh.size());
        schoolChoice = GUSDHigh.get(a);
    }

    private void randomizeMUSDElementary()
    {
        int a = generator.nextInt(MUSDElementary.size());
        schoolChoice = MUSDElementary.get(a);
    }
    private void randomizeMUSDMiddle()
    {
        int a = generator.nextInt(MUSDMiddle.size());
        schoolChoice = MUSDMiddle.get(a);
    }
    private void randomizeMUSDHigh()
    {
        int a = generator.nextInt(MUSDHigh.size());
        schoolChoice = MUSDHigh.get(a);
    }

    //The only information that truly matters :). This returns the district, the school level, and the school itself.
    public String toString()
    {
        return "The district is: " + districtChoice + "\nThe level is: " + levelChoice + "\nThe school is: " + schoolChoice;
    }
}
