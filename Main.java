package com.company;

public class Main {

    public static void main(String[] args) {
	int account = 2_000_000_000;
	System.out.println("account: " + account);
	int transfer = 500_000_000;
	System.out.println("transfer: " + transfer);
	int plus_updated_account = account + transfer;
	System.out.println("plus_updated_account: " + plus_updated_account);
    }
}
