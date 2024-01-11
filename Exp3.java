import java.io.*;
class Time
{
int h,m,s;
void setTime(int hh, int mm, int ss)
{
h=hh;
m=mm;
s=ss;
}
Time add(Time x)
{
int hr=0, mt=0, sc;
Time y=new Time();
sc = s + x.s;
if (sc >=60)
{
mt++;
sc%=60;
}
mt += m + x.m;
if(mt >= 60)
{
hr++;
mt%=60;
}
hr += h + x.h;
if(hr >= 24) hr=0;
y.setTime(hr, mt, sc);
return(y);
}
void display()
{
System.out.println(h+":"+m+":"+s);
}
}
public class Exp3
{
public static void main(String arg[]) throws IOException
{
Time t1, t2, t3;
int h,m,s;
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader b = new BufferedReader(in);
System.out.println("Enter first time in hour, minutes and seconds");
h=Integer.parseInt(b.readLine());
m=Integer.parseInt(b.readLine());
s=Integer.parseInt(b.readLine());
t1=new Time();
t1.setTime(h, m, s);
System.out.println("Enter second time in hour, minutes and seconds");
h=Integer.parseInt(b.readLine());
m=Integer.parseInt(b.readLine());
s=Integer.parseInt(b.readLine());
t2=new Time();
t2.setTime(h, m, s);
t3 = t1.add(t2);
System.out.print("First time: ");
t1.display();
System.out.print("Second time: ");
t2.display();
System.out.print("Sum of time: ");
t3.display();
}
}