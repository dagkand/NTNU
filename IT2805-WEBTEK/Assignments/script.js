//console.log("hello world")

const range = document.getElementById("range")
const output = document.getElementById("output")


function changeValue() {
    console.log(range.value)
    const value = range.value
    const tekst = "Verdien er: "
    output.innerText = tekst + value

}

range.addEventListener("change", changeValue)