/* The Document Object Model(DOM) is an application
 programming interface(API) for manipulating HTML documents.*/

/*The DOM provide functions that allow you to add
 remove,and madify parts of hte documents effectively.*/

/*The DOM represents an HTML documents as a tree of Nodes.*/

//getElement is only applicable on the document it can be
/*ById,ByClass,ByElement,ByTag */
//Ex-
let msg = document.getElementById("message");
console.log(msg.innerText);

//if no id is found then it will return null.

/*Query selector() method allows you to select the element that 
 matches one or more CSS selectors.*/
//Ex-
let hello = document.querySelector(".query");
console.log(hello);
//All give all the elements.

//Traversing of the elements.
//This is travering from child to parent
let txt = document.querySelector(".query");
console.log("This is travering from child to parent");
console.log(txt.parentElement);

//This is traversing from parent to child
let txt1 = document.querySelector(".firstClass");
console.log(txt1.firstChild); //This will return #text
console.log(txt1.firstElementChild); //This will retun first element.
console.log(txt1.lastElementChild);//This will retun last element.
console.log(txt1.childNodes);//This will return all the elements.
//If space will remove only give elements no  "text".