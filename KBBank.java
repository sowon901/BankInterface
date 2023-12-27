package oop.BankInterface;

public class KBBank implements Bank{
    private int price;
    private String custId;
    private int balance;
    
    KBBank(){}
    
    @Override
    public void withDraw(int price) {

        System.out.print("KB은행만의 인출 로직...");

        if(price<Bank.MAX_INTEGER) System.out.println(price + "원 인출한다.");
        else System.out.println(price + "원 인출 실패");
    }

    @Override
    public void deposit(int price) {
        this.balance += price;
        System.out.printf("KB은행만의 입금 로직...%d 원을 입금한다.\n",price);
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
