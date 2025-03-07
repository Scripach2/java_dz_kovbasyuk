import static java.lang.Math.abs;

public class finalExam {
    public static void main(String[] args) {
        Account deb = new SimpleAccount();
        Account cred = new CreditAccount(500);
        deb.add(400); //пополнение счета
        deb.add(-100); //ошибка пополнения счет
        deb.pay(100); //оплата
        cred.pay(100); //оплата
        cred.add(100); //пополнение счета
        cred.transfer(deb, 125); // перевод с кредита на дебит
        deb.transfer(cred, 50); // перевод с дебита на кредит
        System.out.println(deb.getBalance()); // 400 - 100 + 125 - 50 = 375
        System.out.println(cred.getBalance()); // -100 + 100 -125 + 50 = -75
    }

    public abstract static class Account {
        long accountSum;

        boolean add(long amount) {
            return true;
        }

        boolean pay(long amount) {
            return true;
        }

        boolean transfer(Account account, long amount) {
            return true;
        }

        long getBalance() {
            return accountSum;
        }
    }

    public static class SimpleAccount extends Account {

        @Override
        boolean add(long amount) {
            if (amount <= 0) {
                return false;
            } else {
                accountSum += amount;
                return true;
            }
        }

        @Override
        boolean pay(long amount) {
            if (amount <= 0) {
                return false;
            }
            else if (amount > accountSum) {
                return false;
            } else {
                accountSum -= amount;
                return true;
            }
        }

        @Override
        boolean transfer(Account account, long amount) {
            if (amount > accountSum) {
                return false;
            } else {
                account.accountSum += amount;
                this.accountSum -= amount;
                return true;
            }
        }
    }

    public static class CreditAccount extends Account {

        long accountLimit;

        public CreditAccount(long lim) {
            if (lim <= 0) {
                this.accountLimit = 0;
            }
            else this.accountLimit = lim;
        }

        @Override
        boolean add(long amount) {
            if (amount <= 0) {
                return false;
            } else if (amount >= abs(accountSum)) {
                accountSum += amount;
                return true;
            }
            else return false;
        }

        @Override
        boolean pay(long amount) {
            if (amount <= 0) {
                return false;
            }
            else if (amount > accountLimit + accountSum) {
                return false;
            } else {
                accountSum -= amount;
                return true;
            }
        }

        @Override
        boolean transfer(Account account, long amount) {
            if (amount <= 0) {
                return false;
            }
            else if (amount >  accountLimit + accountSum) {
                return false;
            } else {
                account.accountSum += amount;
                this.accountSum -= amount;
                return true;
            }
        }
    }
}
