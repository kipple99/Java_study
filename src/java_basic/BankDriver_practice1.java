public class BankDriver_practice1 {
    public static void main(String[] args) {
        // 사람 선언
        Person_practice1 p1 = new Person_practice1();
        p1.name = "김신의";
        p1.age = 28;
        p1.cashAmount = 30000;


        // 은행 계좌 생성
        BankAccount_practice1 a1 = new BankAccount_practice1();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;

        // 3 - 4. write code here
        Person_practice1 p2 = new Person_practice1();
        p2.name = "BTS";
        p2.age = 28;

        BankAccount_practice1 a2 = new BankAccount_practice1();
        p2.cashAmount = 100000;
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));
    }
}
