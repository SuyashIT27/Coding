console.log("This is lecture 5.");
//Function are the reusable block of statemnt design to perform the specific task.
//Function Defination
/*function functionName(){
    //Do some work
}
*/
//Function Call
//functionName();

//Function to print my info.
/*function myDetails(){
    let data={
        name:"Suyash Verma",
        age:21,
        gender:"Male",
        current_doing:"B Tech",
    }
    console.log(data);
}
myDetails(); //Invoke */

//Try to remove the repetion of the same code
//passing parameter
/*function parameter(name){//name is parameter
    console.log(name);
}
parameter("Suyash Verma");//It is argument*/

//Q-Function to creat the sum of two number?
/*function sum(a,b){
    let c=a+b;
    console.log(`the sum is ${c}.`);
}
sum(25,56);*/

//Return sattement ke baad ka code run nahi hota hai.
//Function variable are local variable of function.

//Arrow Function:-Compact way of writing a function
/*const arrowFunction=(a,b)=>{
    //Block of code
}*/
//Sum of two using arrow
/*const sum=(a,b)=>{
    let c=a+b;
    console.log(c);
}*/

//forEach Loop In Arrays :-
//Array.forEach(callBackFunction)
//CallBackFunction : Here, it is a funaction to execute for each element in the array.
/*let arr=[1,2,3,4,5];
 arr.forEach(function printVal(val){
    console.log(val);
 })*/
//Q-w.a.p to count the number of vowel in the given string.
/*function vowel(str){
    count=0;
    for(const char of str){
        if(char=== "a"||char==="e"||char==="i"||char==="o"||char==="u"){
            count++;
        }
    }
    console.log(count);
}
vowel("Hello my name is suyash verma.");*/
//A callback is the function passed as an aggument to another function.
//forEach method
/*let arr=[1,2,3,4,5,6,7,8,9];
arr.forEach(function value(val,idxe,arr){
    console.log(val,idxe,arr);
})*/
/*A callabck funciton has 3 parameters varibale,index,array itself.
They are aslo called higher order function/method*/
//Q-w.a.p a program to print the square of a number i an an array.
/*arr=[1,2,3,4,5,6,7,8,9];
arr.forEach(function sqrt(num){
    const num1=num*num;
    console.log("the square of the number is "+num1);
})*/
//Some more array method
/*Map
it creats a new array with the result of some operation.The value its callback retuen are used to form new array.
*/
//arr.map(callbackFn(value,index,array))
/*let num=[1,2,3,4,5,6,7];
let newnum=num.map((val)=>{
    const sqrt=val*val;
    console.log(sqrt);
});*/
