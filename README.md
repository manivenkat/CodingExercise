CodingExercise
==============
PROBLEM: SALES TAXES
INPUT:
Input 1: 1 book at 12.49 1 music CD at 14.99 1 chocolate bar at 0.85
Input 2: 1 imported box of chocolates at 10.00 1 imported bottle of perfume at 47.50
Input 3: 1 imported bottle of perfume at 27.99 1 bottle of perfume at 18.99 1 packet of headache pills at 9.75 1 box of imported chocolates at 11.25
OUTPUT
Output 1: 1 book : 12.49 1 music CD: 16.49 1 chocolate bar: 0.85 Sales Taxes: 1.50 Total: 29.83
Output 2: 1 imported box of chocolates: 10.50 1 imported bottle of perfume: 54.65 Sales Taxes: 7.65 Total: 65.15
Output 3: 1 imported bottle of perfume: 32.19 1 bottle of perfume: 20.89 1 packet of headache pills: 9.75 1 imported box of chocolates: 11.85 Sales Taxes: 6.70 Total: 74.68

Used Java as the programming language.
Input has been hardcoded into the unit test and output is provided by ReceiptOutput. Strategy pattern was used to calculate sales tax and imported tax. Product Factory is used to create product entity ( product entity is abstract class) . TaxableProduct interface and its implementation is used to perform intermediate calculations like product price and its tax, product price with exemption , consolidated product price(sub total). Order and OrderEntry will provide order details to the receipt for output.
Further improvement can be made by using BigDecimal ( Currency class for abstraction) to calculate tax and total.  As of now I did the calculations using double/float (not perfect for precisions) .

Testcases is in the test folder . TestSalesTax is the JUnit test case for the correctness of the program  which validates the outputs for the provided test data.
