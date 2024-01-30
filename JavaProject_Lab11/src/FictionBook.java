import java.time.Year;
public class FictionBook implements Author,Book{
	private String author_name;
 	private String email;
 	private String title;
 	private int publicYear;
 	
 	FictionBook(String title,int publicYear){
	this.title = title;
	this.publicYear = publicYear;
 	}
 	
 	public void setAuthorName(String name) {
 		this.author_name = name;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	@Override
 	public String getFirstName() {
 		return author_name.substring(0,author_name.indexOf(' ')).toUpperCase();
 	}
 	@Override
 	public String getLastName() {
 		return author_name.substring(author_name.indexOf(' ')+1,author_name.indexOf(' ')+2).toUpperCase();
 	}
 	@Override
 	public boolean checkEmail() {
 			if(email.endsWith("hotmail.com")||email.endsWith("windowslive.com")) {
 				return true;
 			}
 			else return false;
 	}
 	@Override
 	public String getTitle() {
 		return this.title;
 	}
 	@Override
	public int totalPublicYear() {
 		return Year.now().getValue()-publicYear ;
	}
 	public boolean checkFormatName() {
 		if(author_name.startsWith(getFirstName())&&author_name.endsWith(getLastName())) {
 			return true;
 		}else{
 			return false;
 		}
 	}
 	public String toString() {
 		return title+" write by "+getLastName()+"."+getFirstName()+"("+email+")"+"\nPublished for "+totalPublicYear()+" years.";
 	}
 	
}
