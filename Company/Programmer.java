class Programmer extends Employee{

    //overloading method
    public void skill(){
            System.out.println("No Skill");
    }
    public void skill(String...language){
            for(int i=0;i<language.length;i++){
                System.out.println("Skill = "+language[i]);
            }
    }
    public void bonus(){
            System.out.println("Bonus = 10%");
    }
}