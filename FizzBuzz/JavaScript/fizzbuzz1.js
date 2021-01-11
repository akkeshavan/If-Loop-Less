/* classic fizzBuzz logic as seen from about 1000 interviews
    fizzBuzz(num){
        if( num % 3=== 0 && num % 5=== 0)
            return "FizzBuzz";
        else if(num%3 ===0 )
            return "Fizz"
        else if(num%3 ===0 )
            return "Buzz"
        else
            return num.toString()
    }
*/

const isDivisibleBy = (value) => (num) => num % value === 0;

const fizzesAndBuzzes = [
  { output: 'Fizz', when: isDivisibleBy(3) },
  { output: 'Buzz', when: isDivisibleBy(5) },
];

const fizzBuzz = (num) => {
  return fizzesAndBuzzes.filter(criterion => criterion.when(num))
    .map(criterion => criterion.output)
    .reduce((prev,cur)=>prev+cur, '');
}

const calcFizzBuzz = (num) => {
  console.log(`${num}: ${fizzBuzz(num)}`)
};

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15];

numbers.forEach(calcFizzBuzz);

/*
    New conditions such as if divisible by 7 then print Boom can be added very simply
    by adding to the fizzesAndBuzzes structure
    
    { output: 'Boom', when: isDivisibleBy(7) }
*/
