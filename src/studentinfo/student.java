
package studentinfo;


public class student {
    private String Name;
    private String  Dep;
    private int SID;
    
    public student(String Name,String Dep,int SID){
        this.Name=Name;
        this.Dep=Dep;
        this.SID=SID;
    }
    public student (String Name,String Dep){
        this(Name,Dep,0);
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    
    
    
  public void display(){
      System.out.println("Name: "+getName());
      
  }
    
    
    
    
    
    
    
    
    
}
