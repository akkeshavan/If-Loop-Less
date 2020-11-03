# If-Loop-Less
Programming without IFs and LOOPS

This series explores the  ways in which IF ELSE-IF chains and Loops can be avoided.

Why?

"If Statements" are evil. They can be nested and nested to create what is  known as the 'ladder to hell'. This make sthe code hard to test. There are functional programming techniques that allow one to avoid if statements and loops to a large degree.


The folder GroupBy contains the code written in various languages for grouping cart items by category and creating sub-totals.

For example: ( Java) , the same example is used thought in the Groupby Example

Given a shopping cart with some items ( which have a "category" field) create a list grouped by the category with sub_totals. for example:

 

INPUT

Category: Veggies	Item: Onions	Units: 2	Unit Price: 100.0	Amount: 200.0

Category: Dairy Prod	Item: Milk	Units: 4	Unit Price: 60.0	Amount: 240.0

Category: Snacks	Item: Biscuits	Units: 2	Unit Price: 20.0	Amount: 40.0

Category: Snacks	Item: Chips	Units: 3	Unit Price: 40.0	Amount: 120.0

Category: Veggies	Item: Tomatoes	Units: 1	Unit Price: 60.0	Amount: 60.0

Category: Snacks	Item: Chocolate	Units: 1	Unit Price: 50.0	Amount: 50.0

 

 

OUTPUT:

 

Category: Dairy Prod

	Item: Milk	Units: 4	Unit Price: 60.0	Amount: 240.0

 

Sub-Total: 240.0

Category: Veggies

	Item: Onions	Units: 2	Unit Price: 100.0	Amount: 200.0

	Item: Tomatoes	Units: 1	Unit Price: 60.0	Amount: 60.0

 

Sub-Total: 260.0

Category: Snacks

	Item: Biscuits	Units: 2	Unit Price: 20.0	Amount: 40.0

	Item: Chips	Units: 3	Unit Price: 40.0	Amount: 120.0

	Item: Chocolate	Units: 1	Unit Price: 50.0	Amount: 50.0

 

Sub-Total: 210.0

 
The rules for all languages are as follows

1. No If Statements, or ternary expressions allowed.
2. no loops allowed ( if arrays or streams have foreach, even that is not allowed except for the final printing) 
3. No builtin "GroupBy" or similar functions on collections allowed.
4. Everything else is allowed, hashmaps, sets whatever

 Have fun!!
 All are welcome to add their own example. They must be language indepenedent in the sense one should be able to use it in typed languages like Java or synamically typed ones like Javascript.