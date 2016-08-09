package projectsw;

import java.sql.SQLException;

public class GroupController {

    public GroupPageForm myGroupPageForm;
    GroupDAO obj=new GroupDAO();
    ResearcherDAO obj2=new ResearcherDAO();
  //  public Group 1;
   // public GroupDAO 1;
    
    public void DeletResearchGroup(String Creator,String GroupName,String password) throws SQLException{
         if(GroupName!=""){
            String Result=obj.selectSpecificGroup(GroupName);
            boolean checkName=false;
            checkName = obj2.selectResearcher(password, GroupName);
            if(GroupName==Result &&checkName==true){
                obj.removeGroup(GroupName);
                System.out.println("Done");
            }
            else System.out.println("Enter right info");
        }
        else System.out.println("you should enter the Groub name");
        
    }

 public void updateGroup(String title,String description,int meetingTime,String GName) throws SQLException{
     if(GName!=""||GName!=null){
         if(title==null && meetingTime!=0 && description!=null&& title!="" && description!="" && meetingTime>=0){
         obj.editRGroup(GName, description, title);
         }
     }else System.out.println("please Enter groubename");
     
 }
 
 public void CreatGroup(Group g) throws SQLException{
     String GName=g.getGroupName();
     String check=obj.selectSpecificGroup(GName);
     if(check==null){
         obj.addGroup(g);
     }
     else System.out.println("there is an group with the same name");
     
 }
 
  public void viewAll() throws SQLException{
      obj.view_avelable_groub();
  }
  
  public void changeMeetingTime(Integer newTime) {
      
  }

  public void changeName(String newName) {
  }

  public void addMember(Researcher member) {
  }

  public void deleteMember(Researcher member) {
  }

}