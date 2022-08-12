


public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(new Parent("21007466","Rick","P3"));
		System.out.println("Manage Parents account");
		Helper.line(80, "=");
       System.out.println("1. View students information");
        System.out.println("2. delete parent details");
        System.out.println("3. add parent details");
       int suboption = Helper.readInt("Enter an option > ");
       if (suboption == 1) { //Verified
          viewAllParent(parentList);
	        }
       else if (suboption == 2) {
    	  Parent newParent=inputParent() ;
    	  C206_CaseStudy.addParent(parentList,newParent);
    	  
        }
       else {
    	   doDelete (parentList);
       }
			
	}
	public static String retrieveAllParent(ArrayList<Parent> parentList) {
		String output="";
		for (int i = 0; i < parentList.size(); i++) {
			String id=parentList.get(i).getID();
			String name=parentList.get(i).getApptDate();
			output += String.format("%-5s %-10s\n", parentList.get(i).getID(),
					parentList.get(i).getApptDate());
			
		}
		return output;
	}
	public static void doView(ArrayList<Parent> parentList) {

		String output = String.format("%-5s %-10s\n", "ID", "NAME");
		output+=retrieveAllParent(pList);
		System.out.println(output);
	}

	public static Parent inputParent() {
		String id = Helper.readString("Enter ID > ");
		String name = Helper.readString("Enter name > ");
		Parent newParent = new Parent(id, name);
		return newParent;
	}

	public static void addParent(ArrayList<Parent> parentList, Parent newParent) {
		parentList.add(newParent);

	}
	public static void doDelete(ArrayList<Parent> parentList) {
		String id = Helper.readString("Enter ID > ");
		for (int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i).getID().equals(id)) {
				parentList.remove(i);
				System.out.println("Deleted Successfully!");
			} else {
				System.out.println("Invalid Appointment ID");
			}
		}
	}
	
		
	}


