let bankaccount = function(accountNumber, accountHolder, balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}

function deposit(account, amount) {
    account.balance = account.balance + amount;
    console.log("Deposited " + amount + ". New balance is: " + account.balance);
}
function withdraw(account, amount) {
    if(amount > account.balance) {
        console.log("Insufficient balance! withdrawl failed.");
    } else {
        account.balance = account.balance - amount;
        console.log("Withdrew " + amount + ". New balance is: " + account.balance);
    }
}
function balanceInquiry(account) {
    console.log("Current balance is: " + account.balance);
}
let myAccount = new bankaccount("123456789", "saurabh", 1000);
deposit(myAccount, 500);
withdraw(myAccount, 200);
balanceInquiry(myAccount);
