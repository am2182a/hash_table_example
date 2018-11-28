import java.util.Random;
public class Main {
	
	
	
	public static void main(String[] args) {
		//Hash Table is filled with random numbers to make it easier for me, so the table must be accessed in this case to request data
		HashTable auid_35 = new HashTable(35,31); 
		System.out.println("HASH TABLE : SIZE 35");
		System.out.println("---------------------");
		auid_35.fillTable();
		auid_35.getAverageProbing_fill(); 
		auid_35.get_data(auid_35.hash[2]);
		auid_35.get_data(auid_35.hash[6]);
		auid_35.get_data(auid_35.hash[8]);
		auid_35.get_data(65482);
		System.out.println();
		HashTable auid_50 = new HashTable(50,47);
		System.out.println("HASH TABLE : SIZE 50");
		System.out.println("---------------------");
		auid_50.fillTable();
		auid_50.getAverageProbing_fill(); 
		auid_50.get_data(auid_50.hash[2]);
		auid_50.get_data(auid_50.hash[6]);
		auid_50.get_data(auid_50.hash[8]);
		auid_50.get_data(65482);
	}

}
