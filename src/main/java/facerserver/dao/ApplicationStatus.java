package facerserver.dao;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
 
@Entity

public class ApplicationStatus {

	
	   @Id
	   private String Application;
	   @Column
	   private String Status;
	   @Column
	   private String StatusDate;
	   
	public String getApplication() {
		return Application;
	}
	public void setApplication(String application) {
		Application = application;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getStatusDate() {
		return StatusDate;
	}
	public void setStatusDate(String statusDate) {
		StatusDate = statusDate;
	}

}
