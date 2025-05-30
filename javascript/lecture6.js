//<script> tag connects HTML with JS.
//Consol.dir is used to print the properties and method of the document.
//DOM ( document object meodel)
//it is the way to access the html in the javascript.
//Wrting javascript at the end gives the benifit to use dom feature.
console.dir(document.head);
//give the element by id .
let heading = document.getElementById("test");
console.log(heading);
// give element by class.
let headings = document.getElementsByClassName("test1");
console.log(headings);
//give element by tag.
let heading2 = document.getElementsByTagName("h2");
//Query Selector
let heading3 = document.querySelector("h1");
console.dir(heading3);
//to print 1st element
let heading4 = document.querySelectorAll("h1");
console.dir(heading4);
//All matching element.
//To print the first child
let heading5 = document.body.firstChild;
console.log(heading5);
//Using query selector
let heading6 = document.querySelector("div").children;
console.dir(heading6);
//innerText give only text and innerHTML also give the tags of the html.
//using innerHTML you can change the html tag at the run time.

//PROPERTIES
//1-tagName-return the tag for the element.
//2-innerText-return the text content of the element and all its children.
//3-innerHTML-retuen the plain text or HTML content intthe element. (here we can change the html tags during runtime.)
//4-textContent-return the textual content even for hidden elements.
