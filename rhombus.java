class rhombus
{
public static void main(String[] args)
{
System.out.print("\n\n");
int n=5, n2=9;
for(int i=1;i<=n;i++)
{  
  for(int j=1;j<=n-i;j++)
  {
    System.out.print("   ");    
  }
  for(int j=n-i+1;j<=n;j++)
  {
    System.out.print(" * ");   
       
  }


  

//side half

for(int j=6;j<=n2;j++)
{
  System.out.print(" * ");
}
n2--;
System.out.print("\n\n");
}



//main end
}
}