class Employee{
    
    // Attribute 
    private String id;
    private String name;
    private Double salary;
    
    //Static Attribue 
    static int minSalary=12000;

    //Default Constructor
    public Employee(){
            System.out.println("I'm Employee");
    }
    public Employee(String name,Double salary){
        this.name=name;
        this.salary=salary;
        displayEmployee();
    } 

    //Method
    public void setID(String id){
         this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void displayEmployee(){

            System.out.println("Name = "+this.name);
            System.out.println("Salary = "+this.salary);
    }

    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }

    public void bonus(){
        System.out.println("Show Bonus Employee");
    }
}