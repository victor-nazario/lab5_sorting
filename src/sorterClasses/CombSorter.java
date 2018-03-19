package sorterClasses;

public class CombSorter<E> extends AbstractMaxValueSorter{

	
	public CombSorter() {
		super("   Comb Sorter");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		for (int j=0; j < i; j++) 
			if (cmp.compare(arr[j], arr[j+1]) > 0)
				super.swapArrayElements(j, j+1);
		
	}
	
	

}
