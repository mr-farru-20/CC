import java.net.*;
import java.io.*;
class SP
{
public static void main(String args[])
{
try
{
ServerSocket ss = new ServerSocket(8001);
System.out.println("Server Started...............");
Socket s = ss.accept();
DataInputStream in = new DataInputStream(s.getInputStream()); int x= in.readInt();
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
int y = x/2;
if(x ==1 || x ==2 || x ==3)
{
dout.writeUTF(x + "is Prime");
System.exit(0);
}
for(int i=2; i<=y; i++)
{
if(x%i != 0)
{
dout.writeUTF(x + " is Prime");
}
else
{
dout.writeUTF(x + " is not Prime");
}
}
}
catch(Exception e)
{
System.out.println(e.toString());
}
}
}