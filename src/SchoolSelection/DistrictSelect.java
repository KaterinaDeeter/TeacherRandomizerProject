package SchoolSelection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistrictSelect
{
    private List<String> districtOptions = new ArrayList<>();
    private List<String> schoolTypeOptions = new ArrayList<>();

    private List<String> KUSDElementary = new ArrayList<>();
    private List<String> KUSDMiddle = new ArrayList<>();
    private List<String> TUHSD = new ArrayList<>();

    List<String> CUSDElementary = new ArrayList<>();
    List<String> CUSDMiddle = new ArrayList<>();
    List<String> CUSDHigh = new ArrayList<>();

    List<String> GUSDElementary = new ArrayList<>();
    List<String> GUSDMiddle = new ArrayList<>();
    List<String> GUSDHigh = new ArrayList<>();

    List<String> MUSDElementary = new ArrayList<>();
    List<String> MUSDMiddle = new ArrayList<>();
    List<String> MUSDHigh = new ArrayList<>();

    private Random generator = new Random();
    private String districtChoice = "";
    private String levelChoice = "";
    public String schoolChoice = "";
    private String fullSelection = "";

    //Randomize a district and set a value to that. Then if district == x, run randomizer for specific school type,
    public DistrictSelect()
    {
        districtOptions.add("KUSD"); //TUHSD is only a high school option, and is considered Kyrene High
        districtOptions.add("CUSD");
        districtOptions.add("GUSD");
        districtOptions.add("MUSD");

        schoolTypeOptions.add("Elementary School");
        schoolTypeOptions.add("Middle School");
        schoolTypeOptions.add("High School");
    }

    private void setDistrictChoice()
    {
        int a = generator.nextInt(districtOptions.size());
        districtChoice = districtOptions.get(a);
    }

    private void setLevelChoice()
    {
        int a = generator.nextInt(schoolTypeOptions.size());
        levelChoice = schoolTypeOptions.get(a);
    }

    public void setFullSelection()
    {
        setDistrictChoice();
        setLevelChoice();
        fullSelection = districtChoice + " " +  levelChoice;
    }

    public String getFullSelection() //This is for data tracking purposes
    {
        return fullSelection;
    }

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

    public String getSchoolChoice()
    {
        return schoolChoice;
    }

    public String toString()
    {
        return "The district is: " + districtChoice + "\nThe level is: " + levelChoice + "\nThe school is: " + schoolChoice;
    }
}
