function doStuff() {
    document.getElementById('demo').innerHTML = Date()
}

function changeImage() {
    var image = document.getElementById('myImage');
    if (image.src.match("bulbon")) {
        image.src = "resources/images/pic_bulboff.jpg";
    } else {
        image.src = "resources/images/pic_bulbon.jpg";
    }
}

function changeColor() {
    var x = document.getElementById("demo");
    x.style.fontSize = "25px";
    x.style.color = "red";
}

function writeDate() {
    document.write(Date());
}

function logToConsole() {
    a = 5;
    b = 66;
    c = a + b;
    console.log(c);
}

function multiply(a, b) {
    document.write(a*b)
    return a * b;
}

function testFunction(){
    var length = 16;                               // Number assigned by a number literal
    var points = x * 10;                           // Number assigned by an expression literal
    var lastName = "Johnson";                      // String assigned by a string literal
    var cars = ["Saab", "Volvo", "BMW"];           // Array  assigned by an array literal
    var x = {firstName:"John", lastName:"Doe"};
}