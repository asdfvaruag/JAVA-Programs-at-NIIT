public  class Account {

    float interest=2.5f;
    public long autoGeneratednumber() {
        return (long) (Math.random() * 1000000000000L);
    }

    double balance=5000;
        String name;
        String status;
        long account;
        double amount;


        public String transferrFund(double amount, Account source, Account target) {
            if (!source.status.equals("Active")) {
                return "Account not found";
            } else if (amount <= 0) {
                return "Transfer amount should more then 0";
            } else if (amount > source.balance) {
                return "Low balance";
            }
            source.balance = source.balance - amount;
            target.balance = target.balance + amount;
            return amount + " Tranfered from " + source.account + " To " + target.account;
        }

        public String withdraw(double amount, Account source) {
            if (!source.status.equals("Active")) {
                return "Account not found";
            } else if (amount <= 0) {
                return "Withdraw amount should more then 0";
            } else if (amount > source.balance) {
                return "Low balance";
            }
            source.balance = source.balance - amount;
            return amount + " Dedited from " + source.account;
        }

        public String deposit(double amount, Account source) {
            if (!source.status.equals("Active")) {
                return "Account not found";
            } else if (amount <= 0) {
                return "Deposit amount should more then 0";
            }

            source.balance = source.balance - amount;
            return amount + " Credited to " + source.account;
        }

        public void checkBalance(Account source) {
            System.out.println("Your Account balance : " + source.balance);
        }



}
