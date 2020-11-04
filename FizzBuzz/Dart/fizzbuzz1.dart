 

void main(){
  print(fizzBuzz(1));
  print(fizzBuzz(3));
  print(fizzBuzz(5));
  print(fizzBuzz(15));

 
} 

 


  

 
 String  Fizz ( int num){
    Map<bool,String> result = new Map();
    result[true] = "Fizz";
    result[false] ='';
    bool isMultipleOf3 =  num%3 == 0; 
     
    return result[isMultipleOf3];

 }

 String  Buzz( int num){
    Map<bool,String> result = new Map();
    result[true] = "Buzz";
    result[false] ='';
    bool isMultipleOf5 =  (num % 5 == 0); 

    return result[isMultipleOf5];

 }

 String fizzBuzz(int num){
   String result = Fizz(num)+ Buzz(num);
   return getFinalResult(result,num);
 }

String getFinalResult(String str, int num){
  Map<bool, String> result = new Map();
  result[true] = num.toString();
  result[false] =str;
  return result [str ==''];

}