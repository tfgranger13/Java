public class Project{

    // member variables (aka attributes, instance variables, fields)
    private String name;
    private String description;

    // constructor
    public Project(){
    }

    // overloaded constructors (same name but allow for more parameters)
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    // name setter (set the information)
    public void setName(String inputName){
        this.name = inputName;
    }

    // name getter (get the information)
    public String getName(){
        return this.name;
    }

    // description setter
    public void setDescription(String inputDescription){
        this.description = inputDescription;
    }

    // description getter
    public String getDescription(){
        return this.description;
    }

    // instance method (not static)
    public String elevatorPitch(){
        return ""+this.name+"; "+this.description;
    }
}