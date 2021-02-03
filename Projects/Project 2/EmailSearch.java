package learnjava;


public class EmailSearch {

		String emails[]= {"anmol.mandara@hcl.com", "anmol.mandara@gmail.com","anmol.mandara@yahoo.com","anmol.mandara@microsoft.com","anmol.mandara@apple.com"};
		
		public boolean Search(String m) {
			for(String em : emails) {
				if(em.equals(m)) {
					return true;
				}
			}
		return false;

		}

}
