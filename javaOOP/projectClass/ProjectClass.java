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

  public String getProjectName(){
    return this.name;
  }

  public void setProjectName(String projectName){
    this.name = projectName;
  }

  public String getProjectDesc(){
    return this.description;
  }

  public String setProjectDesc(String projectDesc){
    this.description = projectDesc;
  }

  public void setInitialCost(double initialCost){
    this.initialCost = initialCost;
  }


  public String elevatorPitch(){

    return this.name + " " + this.description;

  }

}