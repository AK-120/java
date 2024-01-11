import java.io.*;
class Distance
{
int m, cm;
void setValues(int mtr, int cmtr)
{
m = mtr;
cm = cmtr;
}
int getMeter()
{
return(m);
}
int getCentiMeter()
{
return(cm);
}
}
public class Exp1
{
public static void main(String arg[]) throws IOException
{
Distance d1, d2, d3;
int m, c;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
d1 = new Distance();
d2 = new Distance();
d3 = new Distance();
System.out.println("Enter first distance in meters and centimeters");
m = Integer.parseInt(br.readLine());
c = Integer.parseInt(br.readLine());
d1.setValues(m, c);
System.out.println("Enter second distance in meters and centimeters");
m = Integer.parseInt(br.readLine());
c = Integer.parseInt(br.readLine());
d2.setValues(m, c);
m = d1.getMeter() + d2.getMeter();
c = d1.getCentiMeter() + d2.getCentiMeter();
if (c >=100)
{
m++;
c = c % 100;
}
d3.setValues(m, c);
System.out.println("Sum of distances is:"+ d3.getMeter() +" Meter "+
d3.getCentiMeter() + " Centi Meter");
}
}