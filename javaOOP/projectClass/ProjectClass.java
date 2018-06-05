public class ProjectClass{
  private String name;
  private String description;
  private double initialCost;
  private float cost;

  public Project(){

  }

  public Project(String name){
    this.name = name;
  }
  
  public ProjectClass(String name, String description){
    this.name = name;
    this.description = description;
  }

  public string getProjectName(){
    return this.name;
  }

  public void setProjectName(String projectName){
    this.name = projectName;
  }

  public string getProjectDesc(){
    return this.description;
  }

  public string setProjectDesc(String projectDesc){
    this.description = projectDesc;
  }

  public void setInitialCost(double initialCost){
    this.initialCost = initialCost;
  }


  public String elevatorPitch(){

    return this.name + " " + this.description;

  }

}