import java.util.*;
import java.io.*;

public class test{
    public static void main(String[]args){
	Warrior b= new Warrior("tom");
	System.out.println(b.getHealth());
	b.usePotion();
	System.out.println(b.getHealth());
    }
}
