public class number {
    String name;
    String number;

    public number(String n1, String n2) {
            name=n1;
            number=n2;
    }
    public number (String n1){
        name=n1;
        number="모르겠음";
    }
    public static void main(String[] args) {
        
        number myNumber = new number(" 서효빈 ", "01032468820");
        System.out.println(myNumber.name+":  "+myNumber.number);

        number Number = new number(" 서효빈 ");
        System.out.println(Number.name+":  "+Number.number);
    }
}
