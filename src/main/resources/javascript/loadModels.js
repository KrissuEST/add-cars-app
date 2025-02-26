// Function for loading all the car models
function loadModels() {
    var classId = document.getElementById("carClass").value;
    fetch('/models?classId=' + classId)
        .then(response => response.json())
        .then(data => {
            var modelSelect = document.getElementById("carModel");
            modelSelect.innerHTML = '<option value="">Select Model</option>';
            data.forEach(model => {
                var option = document.createElement("option");
                option.value = model.id;
                option.text = model.name;
                modelSelect.appendChild(option);
            });
        });
}