public class Person{
    private  String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String setLastName(String lastName){
        return this.lastName = lastName;
    }

    public int setAge(int age) {
        if(this.age > 100 && this.age < 0){
            this.age = 0;
        }
       
        return this.age = age;
        
    }

    public boolean isTeen(){
        if(age > 12 || age < 20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if(firstName.isEmpty()){
            return lastName;
        }
        else if(lastName.isEmpty()){
            return firstName;
        }
        else{
            return firstName + " " + lastName;
        }

    }

    
}

