const students = ["Ama", "Kofi", "Yaw"];
const scores = [85, 72, 48];

function getGrade(score) {
    if (score >= 80) return "A";
    if (score >= 70) return "B";
    if (score >= 60) return "C";
    if (score >= 50) return "D";
    return "F";
}

function runGradingSystem() {
    const output = document.getElementById("results");

    if (!output) {
        alert("Error: The results section is missing from index.html.");
        return;
    }

    let total = 0;
    let highestIndex = 0;
    let html = "<h2>Student Results</h2>";

    for (let i = 0; i < scores.length; i++) {
        total += scores[i];

        if (scores[i] > scores[highestIndex]) {
            highestIndex = i;
        }

        html += `
            <p>
                <strong>${students[i]}</strong>:
                ${scores[i]} marks —
                Grade ${getGrade(scores[i])}
            </p>
        `;
    }

    const average = total / scores.length;

    html += `
        <hr>
        <p><strong>Average:</strong> ${average.toFixed(2)}</p>
        <p><strong>Highest:</strong> ${students[highestIndex]}
        (${scores[highestIndex]} marks)</p>
    `;

    output.innerHTML = html;
}

document.addEventListener("DOMContentLoaded", function () {
    const button = document.getElementById("runButton");

    if (button) {
        button.addEventListener("click", runGradingSystem);
    }
});
    }
}