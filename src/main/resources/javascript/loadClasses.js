// Function for loading all the car classes
function loadClasses() {
    var brandId = document.getElementById("carBrand").value;
    fetch('/classes?brandId=' + brandId)
        .then(response => response.json())
        .then(data => {
            var classSelect = document.getElementById("carClass");
            classSelect.innerHTML = '<option value="">Select Class</option>';
            data.forEach(cls => {
                var option = document.createElement("option");
                option.value = cls.id;
                option.text = cls.name;
                classSelect.appendChild(option);
            });
        });
}