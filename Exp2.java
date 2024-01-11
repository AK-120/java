import java.io.*;
class CEMarks
{
int rno, fm, sm, am, ce;
String name;
void setValues(int r, String n, int f, int s, int a)
{
rno = r;
name = n;
fm = f;
sm = s;
am = a;
}
void calculate()
{
ce = fm + sm + am;
}
void print()
{
System.out.println(rno+ "\t\t" + name + "\t\t" + ce);
}
}
public class Exp2
{
public static void main(String arg[]) throws IOException
{
CEMarks cem[] = new CEMarks[100];
int r, f, s, a, i, n;
String nam;
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader b = new BufferedReader(in);
System.out.println("Enter total number of students");
n = Integer.parseInt(b.readLine());
for(i=0; i<n; i++)
{
System.out.println("Enter Register number, Name, Formaive Assessment Mark, Summative Assessment Mark, Attendance Mark");
r = Integer.parseInt(b.readLine());
nam = b.readLine();
f = Integer.parseInt(b.readLine());
s = Integer.parseInt(b.readLine());
a = Integer.parseInt(b.readLine());
cem[i] = new CEMarks();
cem[i].setValues(r, nam, f, s, a);
cem[i].calculate();
}
System.out.println("\n CE Mark List \n");
System.out.println("Register No \t Name \t\tCE Mark");
for(i=0; i<n; i++)
cem[i].print();
}
}