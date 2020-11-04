
//fizzBuzz without theuse of if-statements
//v2 where common code has been abstracted
void main(){
  print(fizzBuzz(1));
  print(fizzBuzz(3));
  print(fizzBuzz(5));
  print(fizzBuzz(15));

 
} 

String fizzBuzzString(bool isTrue, String resultStr){
    Map<bool,String> result = new Map();
    result[true] = resultStr;
    result[false] ='';
    return result[isTrue];

}

bool isMultipleOf(int num, int x){
  return num%x == 0;
}
 
 String  Fizz ( int num){
     return fizzBuzzString(isMultipleOf(num,3), "Fizz");

 }

 String  Buzz( int num){
   return fizzBuzzString(isMultipleOf(num,5), "Buzz");

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