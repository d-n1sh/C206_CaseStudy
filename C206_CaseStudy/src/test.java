import java.util.ArrayList;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Timothy
 * Student ID: 21011275
 * Class: W64N
 * Date/Time created: Friday 12-08-2022 20:54
 */

/**
 * @author 21011275
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Categorymenu() {
	       C206_CaseStudy.setHeader("Maintaining parent accounts");
	       System.out.println("1. Add Parent");
	       System.out.println("2. View Parent");
	       System.out.println("3. Delete Parent");
	       System.out.println("4. Quit");
	       Helper.line(80, "-");
	     }
	  //add categories account
	  public static Categories inputCCAcategories() {
	   
	      String catName = Helper.readString("Enter category name > ");


	      Categories Category = new Categories(catName);
	      return Category;
	       
	     }
	  public static void addParent(ArrayList<Categories> categoryList, Categories Category) {
	       
	       categoryList.add(Category);
	     }
	  //view categories account
	  public static String retrieveAllCategories(ArrayList<Categories> categoryList) {
	   String output = "";
	   for (int i = 0; i < categoryList.size(); i++) {

	          output += String.format("%-15s \n",
	           
	           categoryList.get(i).getCatName());

	        }
	        return output;
	      }
	  public static void viewAllParent(ArrayList<Categories> categoryList) {
	       C206_CaseStudy.setHeader("PARENT LIST");
	       String output = String.format("%-15s \n");
	       output += retrieveAllCategories(categoryList);
	       System.out.println(output);
	     }
	  
	  public static void deleteAllParent(ArrayList<Categories> categoryList) {
	   String output = String.format("%-15s \n");
	   output += retrieveAllCategories(categoryList);
	      System.out.println(output);
	  }

}
