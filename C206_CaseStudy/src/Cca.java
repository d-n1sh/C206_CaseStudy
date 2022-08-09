public class Cca {
	private String title;
	private String description;
	private String classSize;
	private String day;
	private String time;
	private String venue;
	private String name;


	public Cca(String title, String description, String classSize, String day, String time, String venue, String name) {
		super();
		this.title = title;
		this.description = description;
		this.classSize = classSize;
		this.day = day;
		this.time = time;
		this.venue = venue;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getClassSize() {
		return classSize;
	}
	
	public void setClassSize(String classSize) {
		this.classSize = classSize;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getVenue() {
		return venue;
	}
	
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
}

