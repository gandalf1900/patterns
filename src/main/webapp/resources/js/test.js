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