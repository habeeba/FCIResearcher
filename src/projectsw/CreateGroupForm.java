package projectsw;

import java.awt.TextField;
import java.util.Vector;

public class CreateGroupForm {
    private String  title;

  private String description;
  private String GroupName;
  private String Creator;
  public Vector  myHomePage;
  public GroupPageForm myGroupPageForm;
 
  

  
    public String getCreator() {
        return Creator;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
 
    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

  public Boolean submit() {
  return null;
  }

}