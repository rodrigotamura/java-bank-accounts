# About

It is a practicing of OOP with Java language.

Basically when the program runs, it will ask for informations from one person for new client subscription, which can have many account numbers (working with aggregation concepts), and the user is allowed to withdraw / deposit amounts into each account and managing its balance.

## Business rules of this project

1. User can have one or many accounts;
2. User cannot withdraw more than he has in its account balance;
3. On new account, user can choose the type of the account:
>* Simple account: the deposited amount will not have bonus;
>* Flex account: the deposited amount will have bonus of 2x from deposited value;
>* Gold account: the deposited amount will have bonus of 3x from deposited value.

Sample:

```
Insert your name: Rodrigo
Insert your age: 33
Insert your document number: 12341
==============================
Type your agency code: 12341234
Type your account number: 343432
Which kind of account would you like?
- Type 1 for SIMPLE PLAN
- Type 2 for FLEX PLAN
- Type 3 for GOLD PLAN
Your choice (and press <enter> for confirmation): 2
Thanks Rodrigo! Your account has been opened successfully!
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 3
 --> Please, insert the amount you want to deposit (your current balance: 0.0): US$ 10.50
Do you want to confirm the deposit of US$ 10.5? [y/n]y
Depositing into account number 343432...
Deposit has made successfully! Current balance: 21.0
Deposit has made successfully! Your current balance: US$ 21.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 1
 --> Your current balance is US$ 21.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 2
 --> Please, insert the amount you want to withdraw (your current balance: 21.0): US$ 50
Do you want to confirm the deposit of US$ 50.0? [y/n]y
You do not have enough balance.
Your current balance is US$ 21.0
Deposit has made successfully! Your current balance: US$ 21.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 2
 --> Please, insert the amount you want to withdraw (your current balance: 21.0): US$ 


2
Do you want to confirm the deposit of US$ 2.0? [y/n]
y
Withdrawing from account number 343432...
Withdrawing has made successfully! Current balance: 19.0
Deposit has made successfully! Your current balance: US$ 19.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 2
 --> Please, insert the amount you want to withdraw (your current balance: 19.0): US$ 5
Do you want to confirm the deposit of US$ 5.0? [y/n]y
Withdrawing from account number 343432...
Withdrawing has made successfully! Current balance: 14.0
Deposit has made successfully! Your current balance: US$ 14.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 1
 --> Your current balance is US$ 14.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 3
 --> Please, insert the amount you want to deposit (your current balance: 14.0): US$ 1
Do you want to confirm the deposit of US$ 1.0? [y/n]y
Depositing into account number 343432...
Deposit has made successfully! Current balance: 16.0
Deposit has made successfully! Your current balance: US$ 16.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 1
 --> Your current balance is US$ 16.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 2
 --> Please, insert the amount you want to withdraw (your current balance: 16.0): US$ 15
Do you want to confirm the deposit of US$ 15.0? [y/n]y
Withdrawing from account number 343432...
Withdrawing has made successfully! Current balance: 1.0
Deposit has made successfully! Your current balance: US$ 1.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 1
 --> Your current balance is US$ 1.0
==============================
Please, choose an option:
Press 1 to to see your current balance
Press 2 for withdraw
Press 3 for new deposit
Press 0 to exit
Your answer: 0
Bye!
```