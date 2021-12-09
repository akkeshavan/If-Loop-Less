# If-Loop-Less
Programming without IFs and LOOPS

This series explores the ways in which IF ELSE-IF chains and Loops can be avoided.

Why?

"If Statements" are evil. They can be nested, nested, and nested again, to create what is  known as the 'ladder to hell'. This makes the code hard to test. There are functional programming techniques that allow one to avoid if statements and loops to a large degree.
(( There has been some flame about about my statement that "If statements are evil". Please go right down to this readme to see why.) :))

## Fizzbuzz

The folder  contains veersions of this classic interview question "FizzBuzz":
Usually the core logic of the fizzBuzz for a number is written as follows:

fizzBuzz(num){

        if( num % 3=== 0 && num % 5=== 0)
            return "FizzBuzz";
        else if(num%5 ===0 )
            return "Fizz"
        else if(num%3 ===0 )
            return "Buzz"
        else
            return num.toString()
    }

IF-LESS versions have been created in :
	1.  Dart -  fizzbuzz1 -simple code fizzbuzz2 : "code with some common code that has been abstracted
	2. Javascript :  This is very functional abstrcation and has no IF-statement.


## GroupBY 

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

## Why "IF_STATEMENTS" are EVIL?

In the 80's it was common for C programmers to use GOTO statements, even though in 1968 Djikstra had called the "evil". Djisjkstra did not call them because evil beacues it was evil- but because of a mathematical reason, mainly related to to proof of correctness. So why did these C programmers use GOTO statements? Because  it provided them with a neat way of releasing all the resources in a single point at the end of a function. for Example:

 foo(){
     int* blah = malloc();
     int result.


     int file = open()
     if (error{
         result =null;
         goto finally;
     }
     elseif {
         do whatever crap
         result = some correct result
         goto finally;
         }

 finally:
    release memory
    close files
    return result;


 }

 Admmitedly, this use case was a good one to argue against, especially in an era before execeptions. But one good use case did NOT make Djikstra's statement any less valid. For every one use case, there are million other abuse cases. I had heard a lot of heated defense of the GOTO statement during that period.

Today, it is the same case with IF Statements ( not IF expressions).
1. if statements encourage creation of nested blocks  ( the famous ladder to hell)
2. they encourage ad hoc extension of code within the statement blocks, where a fututed developer may add another 50 lines of  nested code. And as this continues, one gets a function that is 1000 lines code with if-elseif-else ladder to hell. Even today, in the age of advanced static code analysers, this is common where the code has evolvled over a few years and (mis)handled by several developers.
3.The biggest objection however, is that if- elseif -else statements do not evaluate to expressions. so one cannot reason about them and hence formal proof of correctness are difficult, especially when used with mutable variables. There for functional languages like Scala and Erlang that use if-expressions-- the evaluate to a value. Similary, Pattern matchers also use match/switch expressions ( even C# supports them now and they are cool). They can be reasoned about.

There is NO reason to use them to write programs:
           Use : maps
           Use : if expresions ( ternary expressions without creating a ladder)

I would accept IF Statements only in the case where a compiler enforces:
    1. a single line of code  in the associate block
    2. no nesting

That is it.




