package com.company;

abstract class Bank{

    public abstract void getBalance();

}

class Bank_A extends Bank{

    public void getBalance()
    {
        System.out.println("Balance of bank A = $100");
    }

}

class Bank_B extends Bank{

    public void getBalance()
    {
        System.out.println("Balance of bank B= $150");
    }

}

class Bank_C extends Bank{

    public void getBalance()
    {
        System.out.println("Balance of bank C = $200");
    }

}

class Main{

    public static void main(String[] args){

        Bank_A b1 = new Bank_A();

        b1.getBalance();

        Bank_B b2 = new Bank_B();

        b2.getBalance();

        Bank_C b3 = new Bank_C();

        b3.getBalance();

    }
}

