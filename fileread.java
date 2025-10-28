import java.io.*;

public class fileread 
{
    public static void main(String[] args) 
{
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
     )
 {
            String line;
            System.out.println("Content of input file:");
            while ((line = reader.readLine()) != null) 
{
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content has been written to " + outputFilePath);
        } 
        catch (IOException e) 
{
            e.printStackTrace();
        }
    }
}
