class Sample
{
int a;
Sample(Sample s){a=s.a+2;}
Sample(int x)
{
a=x;
}
void put(float p,int ...x)
{
for(int c:x)
System.out.println(c);
}
public static void main(String args[])
{
Sample s=new Sample(1);
Sample s2=s;
s.put(1,2,3,4);
s2.put(2,3);

}
}
