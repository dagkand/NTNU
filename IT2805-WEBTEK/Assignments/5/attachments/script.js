/* Part 2 */
console.log('PART 2')

for (var i = 1; i <= 20; i++) {
	console.log(i);
//for loop containing the start, end, and the increments between them, then print i.
}
	
/* Part 3 */
console.log('PART 3')

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
//for loop that starts at zero and ends at the length of the constant numbers.
	for (var  i = 0; i<=numbers.length; i++) {
	if (i%5 == 0) {
		if(i%3 == 0) {
		console.log("Eplekake");
		}
	//if the number both leaves zero when divided by 5 and 3 it prints eplekake
	}
	else if (i%5 == 0) {
		console.log("Kake");
	}
	//if the number leaves zero when divided by 5 it prints kake
	else if (i%3 == 0) {
		console.log("Eple");
	}
	//if the number leaves zero when divided by 3 it prints eple
	else{
		console.log(i);
	}
	//if not any of the earlier statements are true it prints just the number.
	}
/* Part 4 */
const title = document.getElementById("title");
	title.innerText = "Hello, Javascript";

/* Part 5 */
function changeDisplay() {
	document.getElementById("magic").style.display = "none";
	//document.getElementById("magic").setAttribute("class", "magic1");
}

function changeVisibility() {
	document.getElementById("magic").style.visibility = "hidden";
	document.getElementById("magic").style.display = "block";
	//document.getElementById("magic").setAttribute("class", "magic2");
}

function reset() {
	document.getElementById("magic").style.visibility = "visible";
	document.getElementById("magic").style.display = "block";
	//document.getElementById("magic").setAttribute("class", "reset");
}

/* Part 6 */
const technologies = [
    'HTML5',
    'CSS3',
    'JavaScript',
    'Python',
    'Java',
    'AJAX',
    'JSON',
    'React',
    'Angular',
    'Bootstrap',
    'Node.js'
];
function addIndex() {
	for (var  i = 0; i<=technologies.length; i++) {
		console.log(
}
}
