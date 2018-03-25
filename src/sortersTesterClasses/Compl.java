package sortersTesterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.AbstractMaxValueSorter;

public class Compl {
	private int value;
	
	public Compl(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return value + "";
	}
	
	public static void main(String[] args) {
		Compl[] entero = new Compl[20];
		for(int i=0; i<entero.length; i++)
			entero[i] = new Compl(i);
		BubbleSortSorter<Compl> aS = new BubbleSortSorter<>();
		Comparator<Compl> cmp = null;
		aS.sort(entero, cmp);
	}
}
