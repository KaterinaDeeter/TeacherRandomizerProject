package SchoolSelection;

import java.io.*;

public class DistrictSelectDriver
{
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "SchoolOptions.txt";
        //PrintWriter outFile = new PrintWriter(fileName);
        DistrictSelect test = new DistrictSelect();
        for(int i = 0; i <= 20; i++)
        {
            test.setFullSelection();
            test.listSelecreator();
            System.out.println(test);
            //outFile.println(test);
            //outFile.println();
        }
        //outFile.close();
    }
}
