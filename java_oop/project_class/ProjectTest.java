public class ProjectTest{
    public static void main (String[] args){
        Project testProject = new Project();
        testProject.setName("Bob");
        System.out.println(testProject.getName());
        testProject.setDescription("It's Bob.");
        System.out.println(testProject.getDescription());

        Project testProject2 = new Project("Fred");
        System.out.println(testProject2.getName());
        testProject2.setDescription("It's Fred.");
        System.out.println(testProject2.getDescription());

        Project testProject3 = new Project("Janet", "It's Janet.");
        System.out.println(testProject3.getName());
        System.out.println(testProject3.getDescription());
    }
}