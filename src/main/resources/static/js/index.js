window.onscroll = function () { this.addShadowToHeader() };

var header = document.getElementById("headerButtons");

var sticky = 80;

function addShadowToHeader() {
    if (window.pageYOffset > sticky)
    header.classList.add("sticky")
    else
        header.classList.remove("sticky");
}
