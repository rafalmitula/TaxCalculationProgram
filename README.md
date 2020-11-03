# tax calculation program 

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Description](#description)
* [Inspiration](#inspiration)


## General info

This is a console application which calculates the amount of 23% tax. User can choose between two options: the gross price and the net price. Moreover this applications shows separently the net amount, the gross amount and the tax amount.

## Technologies 
* Java 13

## Description 
### class Main{}

Firstly **Scanner scanner** scans the input data from the user. 

![Scanner scanner](./img/scanner.png)

The person who wants to calculate the tax can choose 3 options: 
* **case 1->** Calculate the 23% tax from the net price
* **case 2->** Calculate the the 23% tax from the gross price
* **case 3->** Terminate the program

All mentioned options are located in **switch(userChoice)**. The **userChoice** is defined as **int = 0;** to make sure that apllication will work correctly. Switch has also a **default** option to protect from the user’s invalid number input. If user inputs the wrong number, he wiil receive a message and he will have an opprtunity to do this again by **scanner.nextInt();**.

![Switch](./img/switch.png)

The **switch(userChoice)** is also in **try/catch** block to catch the exception if user inputs invalid data (becuase the default protects only from incorrect number input). If the user inputs the incorrect data he will receive a message and  he will have a chance to do this again by **scanner.next();**.

![try/catch](./img/try-catch-edit.png)

The **boolean shouldContinue** serves to continue the **while(shouldContinue)** loop and to terminates the application when user will choose 
**case 3** in **switch** ->  **shouldContinue=false;**.


![while&boolean](./img/while.png)



Above the **while** loop aside from mentioned **Scanner scanner** and  **boolean shouldContinue** there is also **Methods metody**.
The **Methods metody** run new methods, which are located in **Methods class** in pl.rafamitula package.


![methods](./img/methods.png)

### class Methods{}

In  this application in **class Methods{}** there are two methods: **calculateNetto()** and **calculateBrutto()**.

The **calculateNetto()** method runs when user chooses **case 1** in **switch(userChoice)** in **main(String[] args)** method.  

![calculateNetto in switch](./img/metody.calculateNetto.png)

In this method **Scanner scnNetto** scans input data from the user, calculate and display: the net amount – **double amountCn**, the tax amount- **double amountVatCn**, the gross amount - **double amountBruttoCn**. What is more, in this method the mentioned doubles (**amountCn**, **amountVatCn**, **amountBruttoCn**) are rounded to 2 decimal places.

![calculateNetto](./img/calculatenetto1 (1).png)

The whole **calculateNetto()** method is in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and **calculateNetto()** method, so when he inputs wrong number or data, he will have opportunity to enter the data again.

![calculateNetto-try/catch](./img/Calculatenetto1-trycatch.png)

The **calculateBrutto()** method runs when user chooses **case 2** in **switch(userChoice)** in **main(String[] args)** method.  

![calculateBrutto in switch](./img/metody.CalculateBrutto.png)

In this method **Scanner scnBrutto** scans input data from the user, calculate and display: the net amount – **double amountCb**, the tax amount- **double amountVatCb**, the gross amount - **double amountBruttoCb**. What is more, in this method the mentioned doubles (**amountCn**, **amountVatCn**, **amountBruttoCn**) are rounded to 2 decimal places.

![calculateBrutto](./img/calculateBrutto-1.png)

The whole **calculateBrutto()** method is in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and calculateBrutto() method, so when he inputs wrong number or data, he will have opportunity to enter the data again.

![calculateBrutto-try/catch](./img/CalculateBrutto1-try-catch.png)

## Inspiration

The **while** loop with the **boolean shouldContinue** and the **swithch(userChoice)** is inspired by the YouTube channel „Jak nauczyć się programowania” - video „Java- podstawy w 2h”. (https://www.youtube.com/watch?v=6G19kFcVXTo)


