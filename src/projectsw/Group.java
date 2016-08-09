package projectsw;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class Group {

    //public String name;
    //public Researcher members;
    //public Researcher creator;
    private String  title;
    public Integer meetingTime;
    private String Creator;
    private String description;
    private String GroupName;
    GroupController obj=new GroupController();
    Scanner cin=new Scanner(System.in);

    public Group(String title, Integer meetingTime, String Creator, String description, String GroupName) {
        this.title = title;
        this.meetingTime = meetingTime;
        this.Creator = Creator;
        this.description = description;
        this.GroupName = GroupName;
    }

    Group() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void EnterGroubDataToDelete() throws SQLException{
        Researcher re=new Researcher();
        String password;
        Creator=cin.next();//d l mfrood tygii mn 
        GroupName=cin.next();
        password=cin.next();
       obj.DeletResearchGroup( Creator, GroupName, password);
    }
    
    public void EnterGroubDataToEdite() throws SQLException{
        GroupName=cin.next();
        title=cin.next();
        meetingTime=cin.nextInt();
        Creator=cin.next();
        description=cin.next();
        obj.updateGroup( title, description, meetingTime, GroupName);
    }
    
    public void EnterDataToCreate() throws SQLException{
        GroupName=cin.next();
        title=cin.next();
        meetingTime=cin.nextInt();
        Creator=cin.next();
        description=cin.next();
        Creator=cin.next();
        Group g=new Group(title, meetingTime, Creator, description, GroupName);
        obj.CreatGroup( g);
    }
    public String getCreator() {
        return Creator;
    }
 

    public Integer getMeetingTime() {
        return meetingTime;
    }

    public String getDescription() {
        return description;
    }


   
    public String getGroupName() {
        return GroupName;
    }

   
    public void setCreator(String creator) {
        this.Creator = creator;
    }

    public void setMeetingTime(Integer meetingTime) {
        this.meetingTime = meetingTime;
    }

   
    

}