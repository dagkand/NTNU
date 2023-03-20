var tasks = [];
//tasks['key'] = "testing";
//console.log(tasks);

//make a new variable with the element li
var checkbox = document.createElement("input");
//make a new variable with the element input
checkbox.type = "checkbox";
//make the type of input into a checkbox to get it
var completed = 0
var total = 0



function addTask() {
    //if there is no input from the user there will be an alert to write in the input first
    if (document.getElementById("todo").value == "") {
        alert("Write something in the input to add task")
    }

    else {
        const text = document.getElementById("todo");
        const submit = document.getElementById("submit");
        const activities = document.getElementById("activities");
        //make constants for the ids in the HTML
         var li = document.createElement("li");

            li.appendChild(checkbox)
            //into the existing li variable we append the checkbox
            li.innerHTML += text.value
            //the inner HTML of we add the value of the users input
            activities.prepend(li);
            //we prepent into the activities output to make each added element appear at the top instead of the bottom 
            //where it would go if we just used .append
            console.log(li)
            addTotal();

            //make dictionray with tasks and date added.
            var today = new Date();
            var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
            //making variable to put into the value of the dictionary, get hours, minutes and seconds of time added.
            tasks.push({
                key: text.value,
                value: time
            });
            //turn the list to array containing a key which is the todo that gets added and a value which is the time added.
            console.log(tasks)
    }

}

//make line through checked elements
activities.addEventListener("click", (event) => {
    if (event.target.parentElement.classList.contains("line_through")){
        removeDone()
        //runs funtion
        event.target.parentElement.classList.remove("line_through");
        //if there is a line through the text already, remove it.
    }
    else {
        addDone()
        event.target.parentElement.classList.add("line_through");
        //if there is not a line through the text add it
    }

});

function addTotal(){
    total += 1
    completed += 0
    document.getElementById("completed").innerHTML = completed  + "/" + total
    // addTask starts this function, when button is clicked a task gets added to total
}

function addDone(){
    total += 0
    completed += 1
    document.getElementById("completed").innerHTML = completed + "/" + total
    //when a task is checked it will add to completed id in the text.
}

function removeDone(){
    total += 0
    completed -= 1
    document.getElementById("completed").innerHTML = completed + "/" + total
    //when the checkbox gets unchecked it will subtract from the completed variable.
}