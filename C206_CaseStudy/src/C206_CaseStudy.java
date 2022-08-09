import java.util.ArrayList;
//
public class C206_CaseStudy {

	private static final int OPTION_STAFF = 2;
	private static final int OPTION_PARENT = 1;
	private static final int OPTION_STUDENT = 3;
	
	private static final int OPTION_VIEW = 1;
	private static final int OPTION_ADD = 2;
	private static final int OPTION_DELETE = 3;
	
	private static final int OPTION_QUIT = 5;
	public static void main(String[] args) {

		ArrayList<Cca> ccaList = new ArrayList<Cca>();

		ccaList.add(new Cca("little league soccer","Mini soccer competition!","30","Tuesday","3pm-4pm","Field","Mr Akmal"));
		ccaList.add(new Cca("LEGO expert","Build to satisfaction!","40","Wednesday","3:30pm-4:30pm","Activity Rooms","Mr Andy"));
		ccaList.add(new Cca("dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX"));
		ccaList.add(new Cca("bakery","Baking your dream cake!","30","Tuesday","4pm-5pm","F&B","Mr Tim"));
		ccaList.add(new Cca("jewellery making","Create something fancy!","20","Tuesday","2:30pm-3:30pm","Library","Ms Stanley"));
		
		int option = 0;

		while (option != OPTION_QUIT) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_STAFF) {
					C206_CaseStudy.setHeader("STAFF");				
					C206_CaseStudy.setHeader("OPTIONS");
					System.out.println("1. View CCA");
					System.out.println("2. Add CCA");
					System.out.println("3. Delete CCA");
				
					int optionCCA = Helper.readInt("Enter option to either view/add/delete > ");

					// View all cca
					if (optionCCA == OPTION_VIEW) {
						C206_CaseStudy.viewAllCca(ccaList);

					// Add cca
					} else if (optionCCA == OPTION_ADD) {
						Cca add = inputCca();
						C206_CaseStudy.addCca(ccaList, add);
						System.out.println("CCA added");
						
					} else if (optionCCA == OPTION_DELETE) {
						String title = Helper.readString("Enter CCA title to delete > ");
						C206_CaseStudy.deleteCCA(ccaList, title);
						System.out.println("CCA deleted");

					} else {
						System.out.println("Invalid option");
					}

			} else if (option == OPTION_PARENT) {
				// Add a cca
				C206_CaseStudy.setHeader("PARENTS");			
				C206_CaseStudy.setHeader("CATEGORY");
				System.out.println("1. ");
				System.out.println("2. ");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == OPTION_EDIT) {
					// Edit a cca
					Cca item = inputCca();
					ResourceCentre.addCamcorder(camcorderList, cc);
					System.out.println("Camcorder added");

				} else if (itemType == OPTION_RETURN) {
					// Add a Chromebook
					Chromebook cb = inputChromebook();
					ResourceCentre.addChromebook(chromebookList, cb);
					System.out.println("Chromebook added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Loan item
				ResourceCentre.setHeader("LOAN");			
				ResourceCentre.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					ResourceCentre.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					ResourceCentre.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				// Return item
				ResourceCentre.setHeader("RETURN");				
				ResourceCentre.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
					ResourceCentre.returnCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Return Chromebook
					ResourceCentre.returnChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	//================================= Option 1 View CCA (CRUD- Read) =================================
	public static String retrieveAllCca(ArrayList<Cca> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(),ccaList.get(i).getClassSize(),
					ccaList.get(i).getDay(),ccaList.get(i).getTime(),ccaList.get(i).getVenue(),ccaList.get(i).getName());
		}
		return output;
	}
	public static void viewAllCca(ArrayList<Cca> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s\n", "ASSET TAG", "DESCRIPTION",
				"AVAILABLE", "DUE DATE","OPTICAL ZOOM");
		 output += retrieveAllCca(ccaList);
		System.out.println(output);
	}

	//================================= Option 2 Add CCA (CRUD - Create) =================================
	public static Cca inputCca() {
		Cca add = null;
		
		String title = Helper.readString("Enter CCA title > ");
		String description = Helper.readString("Enter CCA description > ");
		String classSize = Helper.readString("Enter class size > ");
		String day = Helper.readString("Enter CCA day > ");
		String time = Helper.readString("Enter CCA time > ");
		String venue = Helper.readString("Enter CCA venue > ");
		String name = Helper.readString("Enter teacher-in-charge > ");

		add = new Cca(title, description, classSize, day, time, venue, name);
		return add;
		
	}
	public static void addCca(ArrayList<Cca> ccaList, Cca add) {
		
		ccaList.add(add);
		
	}
	
	//================================= Option 3 Delete CCA (CRUD - Update) =================================
	public static boolean deleteCCA(ArrayList<Cca> ccaList, String title) {
		
		boolean isDeleted = false;

		for (int i = 0; i < ccaList.size(); i++) {
			if (title.equalsIgnoreCase(ccaList.get(i).getTitle())) {
				
				ccaList.remove(i);
				
				isDeleted = true;
				
			}
		}
		return isDeleted;
	}
	public static void loanCamcorder(ArrayList<Camcorder> camcorderList) {
		ResourceCentre.viewAllCamcorder(camcorderList);
		String tag = Helper.readString("Enter asset tag > ");
		String due = Helper.readString("Enter due date > ");
		Boolean isLoaned =doLoanCamcorder(camcorderList, tag, due);
		if (isLoaned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Camcorder " + tag + " loaned out");
		}
	}
	
	public static boolean doLoanChromebook(ArrayList<Chromebook> chromebookList, String tag, String dueDate) {
		// write your code here
		boolean isLoaned = false;

		for (int i = 0; i < chromebookList.size(); i++) {
			if (tag.equalsIgnoreCase(chromebookList.get(i).getAssetTag())
					&& chromebookList.get(i).getIsAvailable() == true) {
				
				chromebookList.get(i).setIsAvailable(false);
				chromebookList.get(i).setDueDate(dueDate);
				
				isLoaned = true;
				
			}
		}
		return isLoaned;
	}
	public static void loanChromebook(ArrayList<Chromebook> chromebookList) {
		// write your code here
		ResourceCentre.viewAllChromebook(chromebookList);
		String tag = Helper.readString("Enter asset tag > ");
		String due = Helper.readString("Enter due date > ");
		Boolean isLoaned = doLoanChromebook(chromebookList, tag, due);
		if (isLoaned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Chromebook " + tag + " loaned out");
		}
		
	}
	
	//================================= Option 4 Return an item (CRUD - Update)=================================
	public static boolean doReturnCamcorder(ArrayList<Camcorder> camcorderList,String tag) {
		boolean isReturned = false;

		for (int i = 0; i < camcorderList.size(); i++) {
			String assetTag = camcorderList.get(i).getAssetTag();
			if (tag.equalsIgnoreCase(assetTag)
					&& camcorderList.get(i).getIsAvailable() == false) {
				camcorderList.get(i).setIsAvailable(true);
				camcorderList.get(i).setDueDate("");
				isReturned = true;
				
			}
		}
		return isReturned;
		
	}
	public static void returnCamcorder(ArrayList<Camcorder> camcorderList) {
		ResourceCentre.viewAllCamcorder(camcorderList);
		String tag = Helper.readString("Enter asset tag > ");
		Boolean isReturned = doReturnCamcorder(camcorderList, tag);
		
		if (isReturned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Camcorder " + tag + " returned");
		}
	}

	public static boolean doReturnChromebook(ArrayList<Chromebook> chromebookList,String tag){
		boolean isReturned = false;
		// write your code here
		for (int i = 0; i < chromebookList.size(); i++) {
			String assetTag = chromebookList.get(i).getAssetTag();
			if (tag.equalsIgnoreCase(assetTag)
					&& chromebookList.get(i).getIsAvailable() == false) {
				chromebookList.get(i).setIsAvailable(true);
				chromebookList.get(i).setDueDate("");
				isReturned = true;
				
			}
		}
		return isReturned;
		
	}
	public static void returnChromebook(ArrayList<Chromebook> chromebookList) {
		// write your code here
		ResourceCentre.viewAllChromebook(chromebookList);
		String tag = Helper.readString("Enter asset tag > ");
		Boolean isReturned = doReturnChromebook(chromebookList, tag);
		
		if (isReturned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Chromebook" + tag + " returned");
		}
	}

}