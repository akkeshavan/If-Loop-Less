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

 // This is amore classic Javascript version


 
const isMultipleOf3 = function(num){
    return num%3===0;
};
const isMultipleOf5 = function(num){
    return num%5 ===0;
}

const fizzBuzzString=(isTrue, resultStr)=>{
const resultMap ={
    true : resultStr,
    false : ''
};

return resultMap[isTrue];
} 

const fizz = function(num){ 
        return fizzBuzzString(isMultipleOf3(num), "Fizz");
}
const buzz =function(num){
    return fizzBuzzString(isMultipleOf5(num), "Buzz");
}

const getFinalResult = function (str,num) {
const resultMap ={
    true : num.toString(),
    false : str
};
//surprised that this works, and object's key is supposed by a string!! works in Node.js
// if it doesnt  this can be replaced by
// const resultMap = new Map();
// resultMap.set ... etc and  return resultMap.get 
// Same for the function fizzBuzzString(), above 
return resultMap[str === ""];
}

const fizzBuzzFunctions = [fizz, buzz];
const fizzBuzz = function(num){
const result= fizzBuzzFunctions.map(fn=>fn(num))
                               .reduce((prev,cur)=>prev+cur);
return getFinalResult(result,num);
} 


console.log(fizzBuzz(1));
console.log(fizzBuzz(3));
console.log(fizzBuzz(5));
console.log(fizzBuzz(15));

/*
    New conditions such as if divisible by 7 then print Boom can be added very simply
    const isMultipleOf7=  function(num){
        return num%7===0;
    }
    const boom = function{
        fizzBuzzString(isMultipleOf7(num), "Boom");
    }
    and adding the new boom function to the array
        const fizzBuzzFunctions = [fizz, buzz , boom];
     now for 7 it will print Boom, for 21 it will print FizzBoom for 35 it will print BuzzBoom and for 105 it will print 
    FizzBuzzBoom.
    Try it out.
*/