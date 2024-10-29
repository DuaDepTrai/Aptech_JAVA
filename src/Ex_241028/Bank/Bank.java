package Ex_241028.Bank;

import java.util.Scanner;

public class Bank {
    private int nextAccount = 0; // Chỉ số tài khoản tiếp theo
    private static final int maximumAccounts = 100; // Số tài khoản tối đa
    private int nextAccountNumber = 1000; // Số tài khoản tiếp theo được gán
    private Account[] accounts; // Mảng chứa thông tin tài khoản

    // Constructor
    public Bank() {
        accounts = new Account[maximumAccounts]; // Khởi tạo mảng tài khoản
    }

    // Phương thức tạo tài khoản mới
    void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Opening Balance: ");
        double openingBalance = scanner.nextDouble();

        try {
            if (openingBalance < 0) {
                throw new IllegalArgumentException("Opening balance cannot be negative.");
            }
            if (openingBalance < 100) {
                throw new IllegalArgumentException("Opening balance must be at least $100.");
            }
            // Tạo tài khoản mới
            Account newAccount = new Account(customerName, nextAccountNumber, openingBalance, "2024-10-30");
            accounts[nextAccount] = newAccount; // Lưu tài khoản vào mảng
            displayAccountDetails(newAccount); // Hiển thị chi tiết tài khoản
            nextAccount++;
            nextAccountNumber++;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Phương thức rút tiền
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Nhập số tiền cần rút: ");
        double amount = scanner.nextDouble();

        try {
            if (accountNumber <= 0) {
                throw new IllegalArgumentException("Số tài khoản phải dương.");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Số tiền rút phải dương.");
            }
            if (nextAccount == 0) {
                throw new IllegalStateException("Không có tài khoản nào để rút.");
            }

            // Tìm tài khoản theo số tài khoản
            Account acc = findAccount(accountNumber);
            if (acc != null) {
                if (amount > acc.getAccountBalance()) {
                    throw new InsufficientFundsException(acc.getAccountBalance());
                }
                // Cập nhật số dư tài khoản
                acc.setAccountBalance(acc.getAccountBalance() - amount);
                System.out.println("Rút tiền thành công!");
                displayAccountDetails(acc); // Hiển thị thông tin tài khoản
            } else {
                throw new Exception("Số tài khoản không tồn tại.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức gửi tiền
    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Nhập số tiền gửi vào: ");
        double amount = scanner.nextDouble();

        try {
            if (accountNumber <= 0) {
                throw new IllegalArgumentException("Số tài khoản phải dương.");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Số tiền gửi phải dương.");
            }

            // Tìm tài khoản theo số tài khoản
            Account acc = findAccount(accountNumber);
            if (acc != null) {
                // Cập nhật số dư tài khoản
                acc.setAccountBalance(acc.getAccountBalance() + amount);
                System.out.println("Gửi tiền thành công!");
                displayAccountDetails(acc); // Hiển thị thông tin tài khoản
            } else {
                throw new Exception("Số tài khoản không tồn tại.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức hiển thị thông tin tài khoản
    void displayAccountDetails(Account acc) {
        System.out.println("Chi tiết tài khoản:");
        System.out.println("Tên khách hàng: " + acc.getCustomerName());
        System.out.println("Số tài khoản: " + acc.getAccountNumber());
        System.out.println("Số dư tài khoản: " + acc.getAccountBalance());
        System.out.println("Ngày tạo tài khoản: " + acc.getCreatedDate());
    }

    // Phương thức tìm tài khoản theo số tài khoản
    private Account findAccount(int accountNumber) {
        for (int i = 0; i < nextAccount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null; // Không tìm thấy tài khoản
    }
}
