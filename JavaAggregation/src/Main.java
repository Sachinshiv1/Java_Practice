public class Main {
    public static void main(String[] args) {
        Address add = new Address(20,390022,"Sama","Vadodara","Gujarat","India");
        Employee emp = new Employee(121,200000,"Sachin",add);
        System.out.println("\nEmployee Name = "+emp.Name+"\nEmployee ID = "+emp.EmpId+ """
                """+"\nEmployee Salary = "+emp.Salary);
        System.out.println("Employee Address = "+add.HouseNo+", "+add.Street+", "+add.PinCode+", "+ """
                """ +add.City+", "+add.State+", "+add.Country);
    }
}
class Employee{
    int EmpId,Salary;
    String Name;
    Address add;
    Employee(int x,int y,String z,Address a){
        EmpId = x; Salary = y; Name = z; add = a;}
}
class Address{
    int HouseNo,PinCode;
    String Street,City,State,Country;
    Address(int a,int b,String p,String q,String r,String s){
        HouseNo = a; PinCode = b; Street = p;
        City = q; State = r; Country = s;
    }
}