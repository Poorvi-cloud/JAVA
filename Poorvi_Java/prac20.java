import java.util.Scanner;  
class stack 
{      
int top=-1,n=10;      
int a[]=new int[n];      
void push() 
{          
if (top==(n-1))  
{ 
System.out.println("Overflow");  
}          
else 
{  
System.out.print("Enter data:");              
Scanner sc=new Scanner(System.in);  
int i=sc.nextInt();              
top=top+1;  
a[top]=i;  
System.out.println("Element Inserted!");  
}  
}  
void pop() 
{          
 if (top==-1)  
{  
 System.out.println("Underflow");  
}          
else 
{              
top=top-1;  
System.out.println("Deleted!");  
}  
}  
void display() 
{  
System.out.println("Items are:");          
for (int i = top; i>=0; i--)   
{              
System.out.print(a[i]+"  ");  
}  
}  
}  
public class prac20
{  
public static void main(String[] args)  
{          
int a;  
Scanner sc=new Scanner(System.in);          
stack s=new stack(); System.out.println("1) Push");  
System.out.println("2) Pop");  
System.out.println("3) Display");    
System.out.println("4) Exit");          
do  
{  
 System.out.print("Enter your choice:");  
a=sc.nextInt();              
switch(a)  
{                  
case 1:  
s.push();                      
break;  
case 2:  
s.pop();                      
break;    
case 3:  
s.display();                      
break;                  
case 4:                      
break;                  
default:  
System.out.println("Invalid Input");                      
break; 
}  
}  
while (a!=4);    
sc.close();  
}  
}