import java.util.*;
public class HashTable {
		private int size; 
		private int div_prime_number; 
		public int[] hash; 
		private int totalProbe_fill = 0;
		private int totalProbe_search = 0;
		
		
		public HashTable (int size, int div_prime) {
			this.size = size; 
			this.div_prime_number = div_prime;
			this.hash = new int[size]; 
			
		}
		
		private void put_data(int auid) {
			Scanner sc = new Scanner(System.in); 
			int length = String.valueOf(auid).length();
			while (length != 5) {
				System.out.println("You entered an incorrect AU ID.  Try again");
				auid = sc.nextInt(); 
				length = String.valueOf(auid).length();
			}
			int key = auid%this.div_prime_number;
			while (this.hash[key] != 0) {
				key+=1;
				this.totalProbe_fill += 1; 
				
			}
			hash[key] = auid; 
			
		}
		
		public void get_data(int auid) {
			int key = auid%this.div_prime_number;
			int location = key;
			while (location < this.size) {
				if (this.hash[location] == auid) {
					System.out.println("Found key at location " + location);
					return;
				}
				else
					location += 1;
				this.totalProbe_search +=1; 
					
			}
			System.out.println("Did not find key");
			
			
		}
		
		public void fillTable() {
			Random random = new Random(); 
			for(int i = 0; i<25; i++) {
				int auid_num = random.nextInt(90000) + 10000;
				this.put_data(auid_num);
			}	
			System.out.println("25 entries added");
		}
		
		public int getNumRecords() {
			int numRecords = 0;
			for (int x : this.hash) {
				if (x != 0)
					numRecords += 1;
			}
			return numRecords;
		}
		
		public int getSize() {
			return this.size;
		}
		
		public int getDivPrime() {
			return this.div_prime_number;
		}
		
		public void getAverageProbing_fill() {
			double averageProbe= (double)this.totalProbe_fill / (double)this.getNumRecords();
			System.out.println("The average probing per item to create hash table was " + averageProbe);
		}
		
		public void getAverageProbing_search() {
			double averageProbe = (double)this.totalProbe_search/ 3.0; 
			System.out.println("The average probing per item to search the hash table was " + averageProbe);
		}
}
