
var questionIndex = 0;
var questionContainers = document.querySelectorAll(".question-container");
var buttonContainer = document.getElementById("button-container");
var previousButton = document.getElementById("previous-btn");
var nextButton = document.getElementById("next-btn");
var questions = [];

function displayQuestion(index) {
// Set the current question index
    questionIndex = index;
    // Remove any previously displayed questions
    questionContainers.forEach(container => container.innerHTML = "");

// Create a new question element
    var question = document.createElement("div");
    question.classList.add("question");
    question.classList.add("show");

// Add the question text
    var questionText = document.createElement("h2");
    questionText.innerHTML = questions[index].question;
    question.appendChild(questionText);

// Add the answer options
    var answerOptions = document.createElement("div");
    questions[index].answerOptions.forEach(answer => {
        var label = document.createElement("label");
        var input = document.createElement("input");
        input.type = "radio";
        input.name = "answer";
        input.value = answer;
        label.appendChild(input);
        label.innerHTML += answer;
        answerOptions.appendChild(label);
    });
    question.appendChild(answerOptions);

// Add the question to the container
    questionContainers[0].appendChild(question);
}

function handlePrevious() {
    if (questionIndex > 0) {
        displayQuestion(questionIndex - 1);
    }
}

function handleNext() {
    if (questionIndex < questions.length - 1) {
        displayQuestion(questionIndex + 1);
    }
}

// Make an AJAX request to retrieve the quiz data
fetch('/api/questions')
    .then(response => response.json())
    .then(data => {
        questions = data;
// Display the first question
        displayQuestion(0);
    })
    .catch(error => {
        console.error('Error fetching questions:', error);
    });

// Attach event listeners to the buttons
previousButton.addEventListener("click", handlePrevious);
nextButton.addEventListener("click", handleNext);