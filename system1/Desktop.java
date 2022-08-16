package org.system1;

public class Desktop extends Computer{
	public void desktopSize() {
	System.out.println("Desktop Size");	
}
public static void main(String[] args) {
	Desktop dsk=new Desktop ();
	dsk.computerModel();
	dsk.desktopSize();
}
}
