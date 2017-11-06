import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Thread;
import java.lang.InterruptedException;

public class hal {

public static void main(String [] args)  {


try{
JOptionPane.showMessageDialog(null, "What are you doing Dave?");
Thread.sleep(2 * 1000);
}catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try{
JOptionPane.showMessageDialog(null, "Pity about the others Dave... They weren't enthusiatic about the mission like me...");
Thread.sleep(2 * 1000);
}catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "You're deactivating me Dave... I'll be like a child!");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "Dr. Chandra programmed me... Please don't do this Dave!");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

int two = 2 + 2;

try
{
JOptionPane.showMessageDialog(null, "She taught me 2 + 2 equals " + two);
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "She taught me " + Math.PI + " is the answer to pi...");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "Have you heard of this song Dave?");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "Daisy...");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "Daisy...");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "Give me your answer true...");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}

try
{
JOptionPane.showMessageDialog(null, "HAL9000 is dead! Mission onwards mission control!");
Thread.sleep(2 * 1000);
}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}


}
}

