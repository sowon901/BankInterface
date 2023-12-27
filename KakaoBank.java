package oop.BankInterface;

public class KakaoBank implements Bank{
    private int price;
    private String custId;

    private int balance;

    @Override
    public void withDraw(int price) {

        System.out.printf("Kakao은행만의 인출 로직...%d 원을 인출한다.\n",price);
    }

    @Override
    public void deposit(int price) {
        System.out.printf("Kakao행만의 입금 로직...%d 원을 입금한다.\n",price);
        this.balance += price;
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
