import java.io.*;
import java.util.Scanner;
class copy
{
public static void main(String args[]) throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the source file");
String sfile = sc.next();
System.out.println("enter the destination file");
String dfile = sc.next();
FileReader fin = new FileReader(sfile);
FileWriter fout = new FileWriter(dfile,true);
int c;
while ((c = fin.read())!=-1)
{
fout.write(c);
}
System.out.println("file copied");
{
fin.close();
fout.close();
}
}
}
